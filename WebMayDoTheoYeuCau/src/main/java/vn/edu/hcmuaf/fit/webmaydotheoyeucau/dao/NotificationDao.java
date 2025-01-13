package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Notification;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import java.util.List;

public class NotificationDao {
    private DBConnect dbConnect;

    public NotificationDao() {
        dbConnect = new DBConnect();
    }

    // Lưu thông báo vào cơ sở dữ liệu
    public boolean addNotification(Notification notification) {
        String sql = "INSERT INTO notifications (title, detail, style, userID) VALUES (:title, :detail, :style, :userID)";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("title", notification.getTitle())
                        .bind("detail", notification.getDetail())
                        .bind("style", notification.getStyle())
                        .bind("userID", notification.getUserID())
                        .execute() > 0
        );
    }

    // Lấy danh sách tất cả thông báo
    public List<Notification> getAllNotifications() {
        String sql = "SELECT * FROM notifications ORDER BY createTime DESC";
        return dbConnect.get().withHandle(handle ->
                handle.createQuery(sql).mapToBean(Notification.class).list()
        );
    }
}
