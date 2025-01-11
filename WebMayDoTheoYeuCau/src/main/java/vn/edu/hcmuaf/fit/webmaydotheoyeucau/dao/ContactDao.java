package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Contact;

import java.util.List;

public class ContactDao {
    DBConnect dbConnect;

    // Constructor
    public ContactDao() {
        dbConnect = new DBConnect();
    }

    // Lấy tất cả liên hệ
    public List<Contact> getAllContacts() {
        String sql = "SELECT * FROM contacts";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(Contact.class).list();
        });
    }

    // Thêm liên hệ mới
    public boolean addContact(Contact contact) {
        String sql = "INSERT INTO contacts (name, email, message, status) " +
                "VALUES (?, ?, ?, ?)";

        return dbConnect.get().withHandle(handle -> {
            int rowsAffected = handle.createUpdate(sql)
                    .bind(0, contact.getName())
                    .bind(1, contact.getEmail())
                    .bind(2, contact.getMessage())
                    .bind(3, contact.getStatus())
                    .execute();

            return rowsAffected > 0;
        });
    }

    // Cập nhật thông tin liên hệ
    public boolean updateContact(Contact contact) {
        String sql = "UPDATE contacts SET status = :status, response = :response, responseBy = :responseBy WHERE id = :id\n";

        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("id", contact.getId())
                        .bind("status", contact.getStatus())  // Trạng thái là int
                        .bind("response", contact.getResponse()) // Phản hồi của quản trị viên
                        .bind("responseBy", contact.getResponseBy()) // Người phản hồi
                        .execute() > 0);
    }

    // Xóa liên hệ
    public boolean deleteContact(int id) {
        String sql = "DELETE FROM contacts WHERE id = :id";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("id", id)
                        .execute() > 0);
    }

    public Contact getContactByID(int id) {
        String sql = "SELECT * FROM contacts where id = :id";
            return dbConnect.get().withHandle(handle ->{
                return handle.createQuery(sql).bind("id", id).mapToBean(Contact.class).list().get(0);
            });
    }

    public static void main(String[] args) {
        Contact contact = new Contact(2, 2, "alo clsdsa", "Nghia");
        ContactDao contactDao = new ContactDao();
        System.out.println(contactDao.updateContact(contact));
        System.out.println(contactDao.getAllContacts());
    }
}
