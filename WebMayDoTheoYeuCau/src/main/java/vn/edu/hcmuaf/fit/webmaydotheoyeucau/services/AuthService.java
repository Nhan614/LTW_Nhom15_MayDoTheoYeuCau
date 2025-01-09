package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.util.ArrayList;
import java.util.List;


public class AuthService {

    // Kiểm tra đăng nhập với email và mật khẩu
    public User checkLogin(String email, String pass) throws Exception {
        UserDao uDao = new UserDao();
        User user = uDao.checkUser(email, pass);  // Phương thức này trả về một User, không phải List<User>
        if (user != null) {
            // Nếu user không null, tức là người dùng đã được tìm thấy
            return user;
        }
        return null; // Trả về null nếu không tìm thấy người dùng hoặc mật khẩu sai
    }

    // Kiểm tra mật khẩu so với mật khẩu đã mã hóa
    public boolean checkPassword(String plainPassword, String hashedPassword) {
        // Nếu mật khẩu đã mã hóa không bắt đầu bằng "$2a$" hoặc "$2b$", ném ra ngoại lệ
        if (!hashedPassword.startsWith("$2a$") && !hashedPassword.startsWith("$2b$")) {
            throw new IllegalArgumentException("Invalid password format");
        }
        return BCrypt.checkpw(plainPassword, hashedPassword);  // Kiểm tra mật khẩu
    }



    // Hàm main để kiểm tra chức năng đăng nhập
    public static void main(String[] args) throws Exception {
        AuthService authService = new AuthService();
        User user = authService.checkLogin("admin@gmail.com", "1234");  // Kiểm tra đăng nhập với email và mật khẩu

        if (user != null) {
            System.out.println("Đăng nhập thành công: " + user);  // In ra thông tin người dùng khi đăng nhập thành công
        } else {
            System.out.println("Đăng nhập thất bại");  // Thông báo khi đăng nhập thất bại
        }
    }
}
