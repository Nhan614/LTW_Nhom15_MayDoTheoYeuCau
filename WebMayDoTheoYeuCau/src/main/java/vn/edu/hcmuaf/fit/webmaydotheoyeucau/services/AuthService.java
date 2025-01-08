package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.util.ArrayList;
import java.util.List;

//public class AuthService {
//
//
//    public User checkLogin(String email, String pass) {
//        UserDao uDao = new UserDao();
//        List<User> listuser = uDao.checkUser(email, pass);
//        if (listuser.size() > 0) {
//            return listuser.get(0);
//        }
//        return null;
//
//    }
//
//    public static void main(String[] args) {
//        AuthService authService = new AuthService();
//        User user = authService.checkLogin("admin@gmail.com", "1234");
//        System.out.println(user);
//    }
//}

public class AuthService {



    public User checkLogin(String email, String pass) {
        UserDao uDao = new UserDao();
        User user = (User) uDao.checkUser(email, pass); // Phương thức này trả về 1 User chứ không phải List<User>
        if (user != null) {
            // Kiểm tra mật khẩu mã hóa
            if (BCrypt.checkpw(pass, user.getPassword())) {
                return user;
            }
        }
        return null; // Trả về null nếu không tìm thấy người dùng hoặc mật khẩu sai
    }

    public boolean checkPassword(String plainPassword, String hashedPassword) {
        if (!hashedPassword.startsWith("$2a$") && !hashedPassword.startsWith("$2b$")) {
            throw new IllegalArgumentException("Invalid password format");
        }
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

    public static void main(String[] args) {
        AuthService authService = new AuthService();
        User user = authService.checkLogin("admin@gmail.com", "1234");
        if (user != null) {
            System.out.println("Đăng nhập thành công: " + user);
        } else {
            System.out.println("Đăng nhập thất bại");
        }
    }
}
