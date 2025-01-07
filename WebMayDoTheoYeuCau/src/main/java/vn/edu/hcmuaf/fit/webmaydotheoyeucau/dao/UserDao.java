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
    public List<User> checkUser(String gmail , String password) {
        String sql = "SELECT * FROM users WHERE gmail = :gmail AND password = :password";

        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).bind("gmail", gmail).bind("password", password).mapToBean(User.class).list();
        });
    }




    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.checkUser("admin@gmail.com", "1234"));
    }
}
