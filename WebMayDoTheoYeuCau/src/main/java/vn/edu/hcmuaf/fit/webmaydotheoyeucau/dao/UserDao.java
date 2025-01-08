package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import org.jdbi.v3.core.Handle;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Supplier;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;


import java.util.List;
import java.util.Map;

public class UserDao {

    DBConnect dbConnect;

    public UserDao() {
        dbConnect = new DBConnect();

    }

    public List<User> getAllUsers() {
        String sql = "select * from users";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(User.class).list();
        });
    }

    // Kiểm tra mật khẩu so với mật khẩu đã mã hóa
    public boolean checkPassword(String plainPassword, String hashedPassword) {
        if (!hashedPassword.startsWith("$2a$") && !hashedPassword.startsWith("$2b$")) {
            throw new IllegalArgumentException("Mật khẩu không hợp lệ");
        }
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }

    // Kiểm tra đăng nhập với email và mật khẩu
    public User checkUser(String email, String pass) {
        String sql = "SELECT * FROM users WHERE gmail = :email";
        return dbConnect.get().withHandle(handle -> {
            List<User> users = handle.createQuery(sql)
                    .bind("email", email)
                    .mapToBean(User.class)
                    .list();

            if (!users.isEmpty()) {
                User user = users.get(0);
                if (BCrypt.checkpw(pass, user.getPassword())) { // Kiểm tra mật khẩu đã mã hóa
                    return user;
                }
            }
            return null; // Nếu không tìm thấy người dùng hoặc mật khẩu sai
        });
    }

    public boolean updateUser(User user) {
        String sql = "UPDATE users SET fullName = ?, gmail = ?, phone = ?, address = ?, avatar = ?, notificationCheck = ?, role = ? WHERE id = ?";

        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind(0, user.getFullName())  // Bind fullName
                        .bind(1, user.getGmail())     // Bind email
                        .bind(2, user.getPhone())     // Bind phone
                        .bind(3, user.getAddress())   // Bind address
                        .bind(4, user.getAvatar())    // Bind avatar
                        .bind(5, user.getNotificationCheck())  // Bind notificationCheck (boolean)
                        .bind(6, user.getRole())      // Bind role
                        .bind(7, user.getId())        // Bind the user ID for WHERE clause
                        .execute() > 0               // If the update was successful, return true
        );
    }


    public List<User> getUsersForAdmin() {
        String sql = "SELECT id, avatar, fullName, gmail, phone, address, notificationCheck, role FROM users";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql)
                    .mapToBean(User.class)  // Maps each row of the result set to a User object
                    .list();                // Collects the results in a list and returns it
        });
    }


    // Đăng ký người dùng mới (mã hóa mật khẩu)
    public boolean registerUser(User user) {
        String sql = "INSERT INTO users (avatar, password, fullName, gmail, phone, address, notificationCheck, role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt()); // Mã hóa mật khẩu trước khi lưu

        return dbConnect.get().withHandle(handle -> {
            return handle.createUpdate(sql)
                    .bind(0, user.getAvatar())
                    .bind(1, hashedPassword)
                    .bind(2, user.getFullName())
                    .bind(3, user.getGmail())
                    .bind(4, user.getPhone())
                    .bind(5, user.getAddress())
                    .bind(6, user.getNotificationCheck())
                    .bind(7, user.getRole())
                    .execute() > 0;
        });
    }

    // Kiểm tra xem email đã tồn tại chưa
    public boolean isEmailExist(String email) {
        String sql = "SELECT * FROM users WHERE gmail = :gmail";
        return dbConnect.get().withHandle(handle -> {
            return !handle.createQuery(sql)
                    .bind("gmail", email)
                    .mapToBean(User.class)
                    .list()
                    .isEmpty();
        });
    }

    // Kiểm tra quyền của người dùng (Admin)
    public boolean isAdmin(User user) {
        return user.getRole() == 1; // 1 là Admin
    }

//    public static void main(String[] args) {
//        UserDao userDao = new UserDao();
//        System.out.println(userDao.updateUser(new User(2, "ff", "Nghia11", "n@nlu.com", "111111", "la", 0, 1)));
//    }


    // Main để kiểm tra các chức năng
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        // Kiểm tra đăng ký người dùng mới
        User newUser = new User(0, "John Doe","123", "plainpassword", "john@example.com", "123456789", "123 Main St", 0, 2);
        boolean registrationSuccess = userDao.registerUser(newUser);

        if (registrationSuccess) {
            System.out.println("Đăng ký thành công");
        } else {
            System.out.println("Đăng ký không thành công");
        }

        // Kiểm tra đăng nhập người dùng với cả email và mật khẩu
        String gmail = "john@example.com";
        String password = "plainpassword";
        User loggedInUser = userDao.checkUser(gmail, password);

        if (loggedInUser != null) {
            System.out.println("Đăng nhập thành công: " + loggedInUser.getFullName());
        } else {
            System.out.println("Đăng nhập không thành công.");
        }
    }
}




}


