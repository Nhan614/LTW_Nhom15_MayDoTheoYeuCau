package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDao {
    DBConnect dbConnect;

    public ProductDao() {

        this.dbConnect = new DBConnect();
    }

    // Lấy danh sách tất cả sản phẩm
    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM products";
        return dbConnect.get().withHandle(handle ->
                handle.createQuery(sql).mapToBean(Product.class).list()
        );
    }

    // Lấy sản phẩm theo ID
    public Product getProductById(int id) {
        Map<Integer, Product> map = new HashMap<Integer, Product>();
        String sql = "SELECT" +
                "   p.id AS id," +
                "   p.productName AS name," +
                "   p.price AS price," +
                "   p.image AS image," +
                "   p.state AS state," +
                "   p.description AS description," +
                "   p.checkCollection AS checkCollection," +
                "   c.categoryName AS categoryName," +
                "   m.name AS mName," +
                "   ps.partName AS psName," +
                "   ps.size AS psSize " +
                "FROM products p " +
                "JOIN categories c ON p.categoryID = c.id " +
                "JOIN productmaterials pm ON p.id = pm.productID " +
                "JOIN materials m ON pm.materialID = m.id " +
                "JOIN productpartsizes ps ON ps.productID = p.id " +
                "WHERE p.id = ?";
        return dbConnect.get().withHandle(handle -> {
            try {
                PreparedStatement preparedStatement = handle.getConnection().prepareStatement(sql);
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int proId = rs.getInt("id");
                    Product product = map.getOrDefault(proId, new Product());

                    product.setId(proId);
                    product.setProductName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setState(rs.getBoolean("state"));
                    product.setDescription(rs.getString("description"));
                    product.setCheckCollection(rs.getBoolean("checkCollection"));
                    product.setCategoryName(rs.getString("categoryName"));

                    String image = rs.getString("image");
                    String material = rs.getString("mName");
                    String partName = rs.getString("psName");
                    Double partSize = rs.getDouble("psSize");

                    product.setImage(image);
                    product.getPartSizes().put(partName, partSize);
                    if (!product.getProductMaterials().contains(material)) {
                        product.getProductMaterials().add(material);
                    }
                    map.put(proId, product);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return map.get(id);
        });
    }

    // Thêm mới sản phẩm
//    public boolean addProduct(Product product) {
//        String sql = "INSERT INTO products (productName, price, image, state, description, checkCollection, categoryID, maker, season) " +
//                "VALUES (:productName, :price, :image, :state, :description, :checkCollection, :categoryID, :maker, :season)";
//        try {
//            int rowsInserted = dbConnect.get().withHandle(handle ->
//                    handle.createUpdate(sql)
//                            .bind("productName", product.getProductName())
//                            .bind("price", product.getPrice())
//                            .bind("image", product.getImage())
//                            .bind("state", product.getState())
//                            .bind("description", product.getDescription())
//                            .bind("checkCollection", product.isCheckCollection())
//                            .bind("categoryID", product.getCategoryID())
//                            .bind("maker", product.getMaker())
//                            .bind("season", product.getSeason())
//                            .execute()
//            );
//            return rowsInserted > 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

//update product
//    public boolean updateProduct(Product product) {
//        String sql = "UPDATE products SET productName = :productName, price = :price, image = :image, " +
//                "state = :state, description = :description, checkCollection = :checkCollection, " +
//                "categoryID = :categoryID, maker = :maker, season = :season WHERE id = :id";
//        return dbConnect.get().withHandle(handle ->
//                handle.createUpdate(sql)
//                        .bind("productName", product.getProductName())
//                        .bind("price", product.getPrice())
//                        .bind("image", product.getImage())
//                        .bind("state", product.getState())
//                        .bind("description", product.getDescription())
//                        .bind("checkCollection", product.isCheckCollection())
//                        .bind("categoryID", product.getCategoryID())
//                        .bind("maker", product.getMaker())
//                        .bind("season", product.getSeason())
//                        .bind("id", product.getId())
//                        .execute() > 0
//        );
//    }

    // Xóa sản phẩm
    public boolean deleteProduct(int productId) {
        String sql = "DELETE FROM products WHERE id = :id";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("id", productId)
                        .execute() > 0
        );
    }

    public Map<Integer, Product> getTopProductsByCategoryId(int categoryId, int limit) {
        Map<Integer, Product> map = new HashMap<Integer, Product>();
        String sql = "SELECT" +
                "   p.id AS id," +
                "   p.productName AS name," +
                "   p.price AS price," +
                "   p.image AS image," +
                "   p.state AS state," +
                "   p.description AS description," +
                "   p.checkCollection AS checkCollection," +
                "   c.categoryName AS categoryName," +
                "   m.name AS mName," +
                "   ps.partName AS psName," +
                "   ps.size AS psSize " +
                "FROM products p " +
                "JOIN categories c ON p.categoryID = c.id " +
                "JOIN productmaterials pm ON p.id = pm.productID " +
                "JOIN materials m ON pm.materialID = m.id " +
                "JOIN productpartsizes ps ON ps.productID = p.id " +
                "WHERE c.id = ? " +
                "LIMIT ?";
        return dbConnect.get().withHandle(handle -> {
            try {
                PreparedStatement preparedStatement = handle.getConnection().prepareStatement(sql);
                preparedStatement.setInt(1, categoryId);
                preparedStatement.setInt(2, limit);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int proId = rs.getInt("id");
                    Product product = map.getOrDefault(proId, new Product());

                    product.setId(proId);
                    product.setProductName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setState(rs.getBoolean("state"));
                    product.setDescription(rs.getString("description"));
                    product.setCheckCollection(rs.getBoolean("checkCollection"));
                    product.setCategoryName(rs.getString("categoryName"));

                    String image = rs.getString("image");
                    String material = rs.getString("mName");
                    String partName = rs.getString("psName");
                    Double partSize = rs.getDouble("psSize");

                    product.setImage(image);
                    product.getPartSizes().put(partName, partSize);
                    if (!product.getProductMaterials().contains(material)) {
                        product.getProductMaterials().add(material);
                    }
                    map.put(proId, product);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return map;
        });
    }

    public Map<Integer, Product> getAll() {
        Map<Integer, Product> map = new HashMap<Integer, Product>();
        String sql = "SELECT" +
                "   p.id AS id," +
                "   p.productName AS name," +
                "   p.price AS price," +
                "   p.image AS image," +
                "   p.state AS state," +
                "   p.description AS description," +
                "   p.checkCollection AS checkCollection," +
                "   c.categoryName AS categoryName," +
                "   m.name AS mName," +
                "   ps.partName AS psName," +
                "   ps.size AS psSize " +
                "FROM products p " +
                "JOIN categories c ON p.categoryID = c.id " +
                "JOIN productmaterials pm ON p.id = pm.productID " +
                "JOIN materials m ON pm.materialID = m.id " +
                "JOIN productpartsizes ps ON ps.productID = p.id ";
        return dbConnect.get().withHandle(handle -> {
            try {
                PreparedStatement preparedStatement = handle.getConnection().prepareStatement(sql);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int proId = rs.getInt("id");
                    Product product = map.getOrDefault(proId, new Product());

                    product.setId(proId);
                    product.setProductName(rs.getString("name"));
                    product.setPrice(rs.getDouble("price"));
                    product.setState(rs.getBoolean("state"));
                    product.setDescription(rs.getString("description"));
                    product.setCheckCollection(rs.getBoolean("checkCollection"));
                    product.setCategoryName(rs.getString("categoryName"));

                    String image = rs.getString("image");
                    String material = rs.getString("mName");
                    String partName = rs.getString("psName");
                    Double partSize = rs.getDouble("psSize");

                    product.setImage(image);
                    product.getPartSizes().put(partName, partSize);
                    if (!product.getProductMaterials().contains(material)) {
                        product.getProductMaterials().add(material);
                    }
                    map.put(proId, product);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return map;
        });
    }

    public Map<Integer, Product> getProductByCategoryId(int categoryId) {
        Map<Integer, Product> map = new HashMap<>();
        String sql = "SELECT" +
                "   p.id AS id," +
                "   p.productName AS name," +
                "   p.price AS price," +
                "   p.image AS image," +
                "   p.state AS state," +
                "   p.description AS description," +
                "   p.checkCollection AS checkCollection," +
                "   c.categoryName AS categoryName," +
                "   m.name AS mName," +
                "   ps.partName AS psName," +
                "   ps.size AS psSize " +
                "FROM products p " +
                "JOIN categories c ON p.categoryID = c.id " +
                "JOIN productmaterials pm ON p.id = pm.productID " +
                "JOIN materials m ON pm.materialID = m.id " +
                "JOIN productpartsizes ps ON ps.productID = p.id " +
                "WHERE c.id = ?";

        return dbConnect.get().withHandle(handle -> {
            try {
                PreparedStatement preparedStatement = handle.getConnection().prepareStatement(sql);
                preparedStatement.setInt(1, categoryId);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    int proId = rs.getInt("id");

                    // Kiểm tra xem sản phẩm đã có trong map chưa
                    Product product = map.get(proId);
                    if (product == null) {
                        // Nếu chưa, tạo mới sản phẩm và lưu vào map
                        product = new Product();
                        product.setId(proId);
                        product.setProductName(rs.getString("name"));
                        product.setPrice(rs.getDouble("price"));
                        product.setState(rs.getBoolean("state"));
                        product.setDescription(rs.getString("description"));
                        product.setCheckCollection(rs.getBoolean("checkCollection"));
                        product.setCategoryName(rs.getString("categoryName"));
                        product.setImage(rs.getString("image"));

                        // Thêm sản phẩm vào map
                        map.put(proId, product);
                    }

                    // Cập nhật thêm các thông tin phụ (material, partName, partSize)
                    String material = rs.getString("mName");
                    String partName = rs.getString("psName");
                    Double partSize = rs.getDouble("psSize");

                    // Thêm kích thước và phần vào sản phẩm
                    product.getPartSizes().put(partName, partSize);

                    // Thêm vật liệu nếu chưa có
                    if (!product.getProductMaterials().contains(material)) {
                        product.getProductMaterials().add(material);
                    }
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return map;
        });
    }



    public static void main(String[] args) {
        ProductDao dao = new ProductDao();
        System.out.println(dao.getProductById(2));

        System.out.println(dao.getProductById(2));

        System.out.println(dao.getProductById(2));

        System.out.println(dao.getProductById(2));
    }

}
