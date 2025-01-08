package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Material;

import java.util.List;

public class MaterialDao {
    DBConnect dbConnect ;
    public MaterialDao() {
        dbConnect = new DBConnect();
    }
    public List<Material> getAllMaterial() {
        String sql = "select * from materials";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(Material.class).list();
        });
    }

    public static void main(String[] args) {
        MaterialDao materialDao = new MaterialDao();
        System.out.println(materialDao.getAllMaterial());
    }
}
