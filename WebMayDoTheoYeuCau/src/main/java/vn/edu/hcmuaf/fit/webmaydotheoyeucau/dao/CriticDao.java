package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Critic;

import java.util.List;

public class CriticDao {
    DBConnect dbConnect;

    // Constructor
    public CriticDao() {
        dbConnect = new DBConnect();
    }

    // Lấy tất cả liên hệ
    public List<Critic> getAllCritic() {
        String sql = "SELECT * FROM critics";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(Critic.class).list();
        });
    }

    // Thêm liên hệ mới
    public boolean addCritic(Critic critic) {
        String sql = "INSERT INTO critics (name, email, message) " +
                "VALUES (?, ?, ?)";

        return dbConnect.get().withHandle(handle -> {
            int rowsAffected = handle.createUpdate(sql)
                    .bind(0, critic.getName())
                    .bind(1, critic.getEmail())
                    .bind(2, critic.getMessage())
                    .execute();

            return rowsAffected > 0;
        });
    }
    // Xóa liên hệ
    public boolean deleteCritic(int id) {
        String sql = "DELETE FROM critics WHERE id = :id";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("id", id)
                        .execute() > 0);
    }

    public Critic getCriticByID(int id) {
        String sql = "SELECT * FROM critics where id = :id";
        return dbConnect.get().withHandle(handle ->{
            return handle.createQuery(sql).bind("id", id).mapToBean(Critic.class).list().get(0);
        });
    }

    public static void main(String[] args) {
        Critic critic = new Critic(2, "hello", "alo clsdsa", "Nghia");
        CriticDao criticDao = new CriticDao();
        System.out.println(criticDao.getAllCritic());
    }
}
