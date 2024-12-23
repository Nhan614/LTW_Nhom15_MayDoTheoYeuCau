package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.util.HashMap;
import java.util.Map;

public class UserDao {
    static Map<String, User> data= new HashMap<>();
    static {
        data.put("nghia@gmail.com",new User("nghia@gmail.com","123","nghia@gmail.com"));
        data.put("nhan@gmail.com",new User("nhan@gmail.com","123","nhan@gmail.com"));
        data.put("user@gmail.com",new User("user@gmail.com","123","user@gmail.com"));


    }

    public User findUsername(String email) {
        return data.get(email);
    }
}
