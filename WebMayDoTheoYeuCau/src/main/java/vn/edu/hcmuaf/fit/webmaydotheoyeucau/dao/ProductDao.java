package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import java.util.List;

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
    public Product getProductById(int productId) {
        String sql = "SELECT * FROM products WHERE id = :productId";
        return dbConnect.get().withHandle(handle ->
                handle.createQuery(sql)
                        .bind("productId", productId)
                        .mapToBean(Product.class)
                        .findOne() // Trả về Optional
                        .orElse(null) // Nếu không có thì trả về null
        );
    }

    // Thêm mới sản phẩm
    public boolean addProduct(Product product) {
        String sql = "INSERT INTO products (productName, price, image, state, description, checkCollection, categoryID, maker, season) " +
                "VALUES (:productName, :price, :image, :state, :description, :checkCollection, :categoryID, :maker, :season)";
        try {
            int rowsInserted = dbConnect.get().withHandle(handle ->
                    handle.createUpdate(sql)
                            .bind("productName", product.getProductName())
                            .bind("price", product.getPrice())
                            .bind("image", product.getImage())
                            .bind("state", product.getState())
                            .bind("description", product.getDescription())
                            .bind("checkCollection", product.isCheckCollection())
                            .bind("categoryID", product.getCategoryID())
                            .bind("maker", product.getMaker())
                            .bind("season", product.getSeason())
                            .execute()
            );
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

//update product
    public boolean updateProduct(Product product) {
        String sql = "UPDATE products SET productName = :productName, price = :price, image = :image, " +
                "state = :state, description = :description, checkCollection = :checkCollection, " +
                "categoryID = :categoryID, maker = :maker, season = :season WHERE id = :id";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("productName", product.getProductName())
                        .bind("price", product.getPrice())
                        .bind("image", product.getImage())
                        .bind("state", product.getState())
                        .bind("description", product.getDescription())
                        .bind("checkCollection", product.isCheckCollection())
                        .bind("categoryID", product.getCategoryID())
                        .bind("maker", product.getMaker())
                        .bind("season", product.getSeason())
                        .bind("id", product.getId())
                        .execute() > 0
        );
    }

    // Xóa sản phẩm
    public boolean deleteProduct(int productId) {
        String sql = "DELETE FROM products WHERE id = :id";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("id", productId)
                        .execute() > 0
        );
    }
    public List<Product> getProductsByCategoryId(int categoryId) {
        String sql = "SELECT * FROM products WHERE categoryID = :categoryID";
        return dbConnect.get().withHandle(handle ->
                handle.createQuery(sql)
                        .bind("categoryID", categoryId)
                        .mapToBean(Product.class)
                        .list()
        );
    }


    public static void main(String[] args) {
            ProductDao productDao = new ProductDao();
            List<Product> products = productDao.getAllProducts();
            products.forEach(System.out::println);
    }
}
