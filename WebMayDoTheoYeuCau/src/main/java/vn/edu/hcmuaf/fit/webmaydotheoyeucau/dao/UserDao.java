package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Supplier;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao {
    DBConnect dbConnect;
    public UserDao() {
        dbConnect = new DBConnect();
    }
    public List<Supplier> getAllSuppliers() {
        String sql = "select * from supplier";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(Supplier.class).list();
        });
    }
}
