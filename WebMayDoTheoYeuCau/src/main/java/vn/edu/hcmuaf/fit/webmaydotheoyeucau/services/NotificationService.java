package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.NotificationDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Notification;

import java.util.List;

public class NotificationService {
    private NotificationDao notificationDao;

    public NotificationService() {
        notificationDao = new NotificationDao();
    }

    public boolean addNotification(Notification notification) {
        return notificationDao.addNotification(notification);
    }

    public List<Notification> getAllNotifications() {
        return notificationDao.getAllNotifications();
    }
}
