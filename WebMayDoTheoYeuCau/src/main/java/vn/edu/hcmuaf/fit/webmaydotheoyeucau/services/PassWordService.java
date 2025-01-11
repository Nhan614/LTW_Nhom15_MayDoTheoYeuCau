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
    public boolean changePassword(String email, String currentPassword, String newPassword) {
        // Xác minh người dùng có tồn tại với email không
        User user = userDao.getUserByEmail(email);
        if (user == null) {
            System.out.println("Người dùng không tồn tại với email: " + email);
            return false;
        }

        // Kiểm tra mật khẩu hiện tại có đúng không
        if (!userDao.checkPassword(currentPassword, user.getPassword())) {
            System.out.println("Mật khẩu hiện tại không đúng");
            return false;
        }

        // Kiểm tra mật khẩu mới có hợp lệ không (có thể thêm kiểm tra độ dài, ký tự đặc biệt, v.v.)
        if (newPassword == null || newPassword.length() < 6) {
            System.out.println("Mật khẩu mới phải có ít nhất 6 ký tự");
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
//
//    public static void main(String[] args) {
//        // Khởi tạo đối tượng PassWordService
//        PassWordService passWordService = new PassWordService();
//
//        // Thông tin người dùng cần thay đổi mật khẩu
//        String email = "nam1@gmail.com";  // Thay bằng email người dùng cần test
//        String currentPassword = "1";  // Thay bằng mật khẩu hiện tại của người dùng
//        String newPassword = "123456";  // Thay bằng mật khẩu mới
//
//        // Gọi phương thức changePassword và kiểm tra kết quả
//        boolean isChanged = passWordService.changePassword(email, currentPassword, newPassword);
//
//        // In ra kết quả
//        if (isChanged) {
//            System.out.println("Mật khẩu đã được thay đổi thành công.");
//        } else {
//            System.out.println("Không thể thay đổi mật khẩu.");
//        }
//    }
//
}
