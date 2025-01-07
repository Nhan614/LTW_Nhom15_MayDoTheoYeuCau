package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.util.List;

public class AuthService {
//    public boolean checkLogin(String email, String pass){
//        UserDao udao= new UserDao();
//        User u = udao.findUsername(email);
//        if(u==null)  return false;
//        return pass.equals(u.getPassword());
//    }

    public User checkLogin(String email, String pass) {
        UserDao uDao = new UserDao();
        List<User> listuser = uDao.checkUser(email, pass);
        if (listuser.size() > 0) {
            return listuser.get(0);
        }
        return null;




    }

    public static void main(String[] args) {
        AuthService authService = new AuthService();
        User user = authService.checkLogin("admin@gmail.com", "1234");
        System.out.println(user);
    }
}

