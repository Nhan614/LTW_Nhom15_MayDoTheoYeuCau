package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import org.jdbi.v3.core.Handle;
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

    public List<User> checkUser(String gmail, String password) {
        String sql = "SELECT * FROM users WHERE gmail = :gmail AND password = :password";

        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).bind("gmail", gmail).bind("password", password).mapToBean(User.class).list();
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


    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.updateUser(new User(2, "ff", "Nghia11", "n@nlu.com", "111111", "la", 0, 1)));
    }
}
