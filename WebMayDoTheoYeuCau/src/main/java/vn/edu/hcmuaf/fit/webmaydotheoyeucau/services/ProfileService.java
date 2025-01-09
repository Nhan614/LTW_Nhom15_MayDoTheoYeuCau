package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

public class ProfileService {
    UserDao userDao;
    public ProfileService() {
        this.userDao = new UserDao();
    }

    public boolean updateProfile(User user, int id) {
        return userDao.updateProfile(user, id);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
