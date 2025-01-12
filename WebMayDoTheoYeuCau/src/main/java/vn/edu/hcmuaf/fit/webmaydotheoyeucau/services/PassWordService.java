package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

public class PassWordService {

    private UserDao userDao;

    public PassWordService() {
        this.userDao = new UserDao();
    }

    /**
     * Đổi mật khẩu của người dùng
     *
     * @param email           Email của người dùng
     * @param currentPassword Mật khẩu hiện tại
     * @param newPassword     Mật khẩu mới
     * @return true nếu đổi mật khẩu thành công, ngược lại false
     */
    public boolean changePassword(String email, String currentPassword, String newPassword, String confirmPassword) {
        // Xác minh người dùng có tồn tại với email không
        User user = userDao.getUserByEmail(email);
        if (user == null) {
            System.out.println("Người dùng không tồn tại với email: " + email);
            return false;
        }

        // Kiểm tra mật khẩu hiện tại có đúng không
        if (!BCrypt.checkpw(currentPassword, user.getPassword())) { // Đảm bảo dùng BCrypt để kiểm tra mật khẩu
            System.out.println("Mật khẩu hiện tại không đúng");
            return false;
        }

        // Kiểm tra mật khẩu mới có hợp lệ không (có thể thêm kiểm tra độ dài, ký tự đặc biệt, v.v.)
        if (newPassword == null || newPassword.length() < 6) {
            System.out.println("Mật khẩu mới phải có ít nhất 6 ký tự");
            return false;
        }

        // Kiểm tra nếu mật khẩu mới và xác nhận mật khẩu không trùng khớp
        if (newPassword == null || confirmPassword == null) {
            System.out.println("Mật khẩu mới và xác nhận mật khẩu không thể là rỗng");
            return false;
        }

        if (!newPassword.equals(confirmPassword)) {
            System.out.println("Mật khẩu mới và xác nhận mật khẩu không khớp");
            return false;
        }

        // Mã hóa mật khẩu mới
        String hashedNewPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

        // Cập nhật mật khẩu mới
        boolean isPasswordUpdated = userDao.updatePassword(email, hashedNewPassword);

        if (isPasswordUpdated) {
            System.out.println("Mật khẩu đã được thay đổi thành công.");
            return true;
        } else {
            System.out.println("Có lỗi khi thay đổi mật khẩu.");
            return false;
        }
    }
}