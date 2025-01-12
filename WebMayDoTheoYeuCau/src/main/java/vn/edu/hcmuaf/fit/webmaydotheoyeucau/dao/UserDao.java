package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import org.jdbi.v3.core.Handle;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Supplier;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;


import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Map;
import java.util.Properties;

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

    public User getUserById(int id) {
        String sql = "SELECT * FROM users WHERE id = :id";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql)
                    .bind("id", id)  // Gắn giá trị tham số id vào câu SQL
                    .mapToBean(User.class)  // Ánh xạ kết quả vào đối tượng User
                    .findOne()  // Lấy một kết quả
                    .orElse(null); // Trả về null nếu không tìm thấy
        });
    }

//    // Kiểm tra mật khẩu so với mật khẩu đã mã hóa
//    public boolean checkPassword(String plainPassword, String hashedPassword) {
//        if (!hashedPassword.startsWith("$2a$") && !hashedPassword.startsWith("$2b$")) {
//            throw new IllegalArgumentException("Mật khẩu không hợp lệ");
//        }
//        return BCrypt.checkpw(plainPassword, hashedPassword);
//    }

    public boolean checkPassword(String plainPassword, String hashedPassword) {
        // So sánh mật khẩu người dùng nhập vào với mật khẩu đã mã hóa trong DB
        return BCrypt.checkpw(plainPassword, hashedPassword);
    }


    public User checkUser(String email, String pass) {
        String sql = "SELECT * FROM users WHERE gmail = :email";
        return dbConnect.get().withHandle(handle -> {
            // Truy vấn cơ sở dữ liệu để lấy thông tin người dùng từ email
            List<User> users = handle.createQuery(sql)
                    .bind("email", email)
                    .mapToBean(User.class)
                    .list();

            // Kiểm tra nếu tìm thấy người dùng
            if (!users.isEmpty()) {
                User user = users.get(0);

                // So sánh mật khẩu người dùng nhập vào với mật khẩu đã mã hóa trong cơ sở dữ liệu
                if (BCrypt.checkpw(pass, user.getPassword())) {
                    return user;  // Trả về đối tượng User nếu mật khẩu khớp
                }
            }
            return null;  // Trả về null nếu không tìm thấy người dùng hoặc mật khẩu sai
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

    public boolean updateProfile(User user, int id) {
        String sql = "UPDATE users SET fullName = ?, gmail = ?, phone = ?, address = ?, avatar = ? WHERE id = ?";

        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind(0, user.getFullName())  // Bind fullName
                        .bind(1, user.getGmail())     // Bind email
                        .bind(2, user.getPhone())     // Bind phone
                        .bind(3, user.getAddress())   // Bind address
                        .bind(4, user.getAvatar())    // Bind avatar
                        .bind(5, id)       // Bind the user ID for WHERE clause
                        .execute() > 0               // If the update was successful, return true
        );
    }

    public boolean deleteUserById(String userId) {
        String sql = "DELETE FROM users WHERE id = ?";

        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind(0, userId) // Bind user ID vào câu lệnh DELETE
                        .execute() > 0   // Kiểm tra nếu ít nhất một dòng bị ảnh hưởng
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

        // Mã hóa mật khẩu trước khi lưu
        String hashedPassword = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());

        return dbConnect.get().withHandle(handle -> {
            return handle.createUpdate(sql)
                    .bind(0, user.getAvatar())  // Liên kết giá trị avatar
                    .bind(1, hashedPassword)    // Liên kết mật khẩu đã mã hóa
                    .bind(2, user.getFullName()) // Liên kết tên đầy đủ
                    .bind(3, user.getGmail())    // Liên kết email
                    .bind(4, user.getPhone())    // Liên kết số điện thoại
                    .bind(5, user.getAddress())  // Liên kết địa chỉ
                    .bind(6, user.getNotificationCheck()) // Liên kết thông báo
                    .bind(7, user.getRole())     // Liên kết vai trò người dùng
                    .execute() > 0; // Thực thi câu lệnh và kiểm tra xem có dòng nào bị ảnh hưởng (thêm thành công)
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

    public void sendResetPasswordLink(String email) {
        // Kiểm tra xem email có null hoặc rỗng không
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email không thể là null hoặc rỗng");
        }

        // Kiểm tra email có hợp lệ không
        try {
            InternetAddress.parse(email); // Kiểm tra nếu email hợp lệ
        } catch (AddressException e) {
            throw new IllegalArgumentException("Email không hợp lệ: " + email);
        }

        // Thay thế bằng giá trị tĩnh nếu biến môi trường không có giá trị
        final String fromEmail = "nhannghialai@gmail.com";  // Thay bằng email của bạn
        final String password = "xpna sqpq sefp dfix";  // Thay bằng mật khẩu email của bạn

        // Kiểm tra xem các thông tin này có hợp lệ không
        if (fromEmail == null || fromEmail.isEmpty()) {
            throw new IllegalArgumentException("Email gửi không thể là null hoặc rỗng");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Mật khẩu không thể là null hoặc rỗng");
        }

        String host = "smtp.gmail.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            String resetLink = "http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/resetPassword.jsp?email=" + email;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Đặt lại mật khẩu của bạn");
            message.setText("Vui lòng nhấp vào liên kết sau để đặt lại mật khẩu của bạn: " + resetLink);
            Transport.send(message);
            System.out.println("Email đã được gửi thành công");
        } catch (MessagingException e) {
            e.printStackTrace();
            throw new RuntimeException("Không thể gửi email reset mật khẩu", e);
        }
    }


//    // Cập nhật mật khẩu người dùng
//    public boolean updatePassword(String email, String newPassword) {
//        String sql = "UPDATE users SET password = ? WHERE gmail = ?";
//        String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());
//
//        return dbConnect.get().withHandle(handle -> {
//            return handle.createUpdate(sql)
//                    .bind(0, hashedPassword)
//                    .bind(1, email)
//                    .execute() > 0;
//        });
//    }
public boolean updatePassword(String email, String hashedNewPassword) {
    String sql = "UPDATE users SET password = :password WHERE gmail = :email";
    return dbConnect.get().withHandle(handle -> {
        int rowsUpdated = handle.createUpdate(sql)
                .bind("password", hashedNewPassword)
                .bind("email", email)
                .execute();
        return rowsUpdated > 0;
    });
}



    public User getUserByEmail(String email) {
        String sql = "SELECT * FROM users WHERE gmail = :email";
        return dbConnect.get().withHandle(handle -> {
            List<User> users = handle.createQuery(sql)
                    .bind("email", email)
                    .mapToBean(User.class)
                    .list();
            return users.isEmpty() ? null : users.get(0);
        });
    }




    public static void main(String[] args) {
        // Tạo đối tượng UserDao
        UserDao userDao = new UserDao();

        // Email mà bạn muốn gửi liên kết reset mật khẩu
        String email = "22130185@st.hcmuaf.edu.vn";

        // Gửi email reset mật khẩu
        userDao.sendResetPasswordLink(email);
        System.out.println("Đã gửi liên kết đặt lại mật khẩu tới email: " + email);
    }
}



