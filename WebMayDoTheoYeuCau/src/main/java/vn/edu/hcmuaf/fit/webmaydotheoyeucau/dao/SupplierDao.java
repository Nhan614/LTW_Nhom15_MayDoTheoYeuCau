package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import org.jdbi.v3.core.Jdbi;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Supplier;

import java.util.List;


public class SupplierDao {
    DBConnect dbConnect;
    public SupplierDao() {
        dbConnect = new DBConnect();
    }
    public List<Supplier> getAllSuppliers() {
        String sql = "select * from supplier";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(Supplier.class).list();
        });
    }

    public static void main(String[] args) {
        SupplierDao supplierDao = new SupplierDao();
        System.out.println(supplierDao.getAllSuppliers());
    }
}
