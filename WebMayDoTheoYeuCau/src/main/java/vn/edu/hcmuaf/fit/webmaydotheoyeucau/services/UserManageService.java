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
        return userDao.updateUser(user);
    }

    public boolean deleteUserById(String id) {
        try {
            // Gọi DAO để xóa người dùng trong cơ sở dữ liệu
            return userDao.deleteUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        UserManageService userManageService = new UserManageService();
        List<User> users = userManageService.getUserForAdmin();
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
