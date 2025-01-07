package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import org.jdbi.v3.core.Handle;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Supplier;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.HashMap;
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
    public List<User> checkUser(String gmail , String password) {
        String sql = "SELECT * FROM users WHERE gmail = :gmail AND password = :password";

        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).bind("gmail", gmail).bind("password", password).mapToBean(User.class).list();
        });
    }

//    public List<User> checkUser(String email, String password) {
//        String sql = "SELECT * FROM users WHERE email = :email AND password = :password";
//
//        try (Handle handle = dbConnect.get().open()) {
//            return handle.createQuery(sql)
//                    .bind("email", email)
//                    .bind("password", password)
//                    .mapToBean(User.class)
//                    .list();
//        } catch (Exception e) {
//            // Log the exception or handle accordingly
//            e.printStackTrace();
//            return Collections.emptyList();
//        }
//    }

    public static Map<String, User> listUser;

//    static {
//        try {
//            listUser = getAllUser();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }


//    public static Map<String, User> getAllUser() throws SQLException {
//        Map<String, User> users = new HashMap<>();
//        String sql = "select * from users";
//
//        DBConnect.get().withHandle(handle -> {
//            try (ResultSet rs = handle.getConnection().createStatement().executeQuery(sql)) {
//                while (rs.next()) {
//                User user = new User();
//                user.setUserID(rs.getInt("id"));
////                user.setUserName(rs.getString("userName"));
//                user.setPassword(rs.getString("password"));
//                user.setAvatar(rs.getString("avatar"));
//                user.setGmail(rs.getString("gmail"));
//                user.setFullName(rs.getString("fullName"));
//                user.setPhone(rs.getString("phone"));
//                user.setAddress(rs.getString("address"));
//                user.setNotificationCheck(rs.getBoolean("notificationCheck"));
//                user.setRole(rs.getInt("role"));
//                users.put(user.getFullName(), user);
//
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return users;
//
//        });
//        return users;
//    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.checkUser("admin@gmail.com", "1234"));
    }
}
