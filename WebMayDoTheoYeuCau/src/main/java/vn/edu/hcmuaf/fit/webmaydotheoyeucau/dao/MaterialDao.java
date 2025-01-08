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
    public boolean addMaterial(Material material) {
        String sql = "INSERT INTO materials (name, season, description, image, quantity, state, matCategory, price) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        // Thực hiện câu lệnh INSERT vào cơ sở dữ liệu
        return dbConnect.get().withHandle(handle -> {
            int rowsAffected = handle.createUpdate(sql)
                    .bind(0, material.getName())  // Gắn giá trị cho tham số thứ nhất (name)
                    .bind(1, material.getSeason())  // Gắn giá trị cho tham số thứ hai (season)
                    .bind(2, material.getDescription())  // Gắn giá trị cho tham số thứ ba (description)
                    .bind(3, material.getImage())  // Gắn giá trị cho tham số thứ tư (image)
                    .bind(4, material.getQuantity())  // Gắn giá trị cho tham số thứ năm (quantity)
                    .bind(5, material.getState())  // Gắn giá trị cho tham số thứ sáu (state)
                    .bind(6, material.getMatCategory())  // Gắn giá trị cho tham số thứ bảy (matCategory)
                    .bind(7, material.getPrice())  // Gắn giá trị cho tham số thứ tám (price)
                    .execute();  // Thực thi câu lệnh INSERT

            // Nếu có ít nhất một dòng bị ảnh hưởng, trả về true (thêm thành công)
            return rowsAffected > 0;
        });
    }

    public static void main(String[] args) {
        MaterialDao materialDao = new MaterialDao();
        System.out.println(materialDao.getAllMaterial());
    }
}
