package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

public class ResetPasswordService {
    private UserDao userDao;

    public ResetPasswordService() {
        // Khởi tạo UserDao khi đối tượng ResetPasswordService được tạo
        this.userDao = new UserDao();
    }

    // Cập nhật mật khẩu mới cho người dùng
    public boolean resetPassword(String email, String newPassword, String confirmPassword) {
        // Xác minh người dùng có tồn tại với email không
        User user = userDao.getUserByEmail(email);


        // Kiểm tra mật khẩu mới có hợp lệ không (có thể thêm kiểm tra độ dài, ký tự đặc biệt, v.v.)
        if (newPassword == null || newPassword.length() < 6) {
            System.err.println("Mật khẩu mới phải có ít nhất 6 ký tự");
            return false;
        }

        // Kiểm tra nếu mật khẩu mới và xác nhận mật khẩu không trùng khớp
        if (confirmPassword == null || !newPassword.equals(confirmPassword)) {
            System.err.println("Mật khẩu mới và xác nhận mật khẩu không khớp");
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
            System.err.println("Có lỗi khi thay đổi mật khẩu.");
            return false;
        }
    }
}

