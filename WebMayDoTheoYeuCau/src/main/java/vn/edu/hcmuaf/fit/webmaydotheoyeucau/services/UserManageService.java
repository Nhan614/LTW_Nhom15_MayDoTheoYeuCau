package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.CategoryDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.util.List;

public class UserManageService {

    private UserDao userDao;
    public UserManageService() {
        userDao = new UserDao();
    }
    public List<User> getUserForAdmin() {
        return userDao.getUsersForAdmin();
    }

    public boolean updateUser(User user) {
        UserDao user1 = new UserDao();
        return user1.updateUser(user);
    }

    public static void main(String[] args) {
        UserManageService userManageService = new UserManageService();
        List<User> users = userManageService.getUserForAdmin();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
