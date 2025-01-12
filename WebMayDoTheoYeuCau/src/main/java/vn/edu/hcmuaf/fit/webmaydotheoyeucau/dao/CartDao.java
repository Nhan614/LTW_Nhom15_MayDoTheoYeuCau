package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CartDao {
    DBConnect dbConnect;

    public CartDao() {
        this.dbConnect = new DBConnect();
    }

    public double getPriceByMaterials(String fabric, String collar, String pocket, String button) {
        String sql = "SELECT SUM(price) AS total_price FROM materials " +
                "WHERE name IN (?, ?, ?, ?)";

        return dbConnect.get().withHandle(handle -> {
            try (PreparedStatement stmt = handle.getConnection().prepareStatement(sql)) {
                stmt.setString(1, fabric);
                stmt.setString(2, collar);
                stmt.setString(3, pocket);
                stmt.setString(4, button);

                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        return rs.getDouble("total_price");
                    }
                }
            } catch (SQLException e) {
                System.err.println("Database error: " + e.getMessage());
            }
            return 0.0;
        });
    }
}
