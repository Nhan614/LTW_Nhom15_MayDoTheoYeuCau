package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

public class AuthService {
//    public boolean checkLogin(String email, String pass){
//        UserDao udao= new UserDao();
//        User u = udao.findUsername(email);
//        if(u==null)  return false;
//        return pass.equals(u.getPassword());
//    }

    public User checkLogin(String email, String passWord) {
        UserDao uDao = new UserDao();

        User user = uDao.listUser.get(email);

        if (user != null) {
            if (user.getPassword().equals(passWord)) {
                user.setPassword(null);
                return user;
            }
        }
        return null;
    }
}

