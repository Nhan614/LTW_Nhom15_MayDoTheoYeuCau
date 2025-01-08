package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import java.util.List;

public class ProductDao {
    private DBConnect dbConnect;

    // Constructor
    public ProductDao() {
        this.dbConnect = new DBConnect();
    }

    // Lấy danh sách tất cả sản phẩm
    public static List<Product> getAllProducts() {
        String sql = "SELECT * FROM products";
        return dbConnect.get().withHandle(handle ->
                handle.createQuery(sql)
                        .mapToBean(Product.class)
                        .list()
        );
    }

    // Lấy sản phẩm theo ID
    public Product getProductById(int productId) {
        String sql = "SELECT * FROM products WHERE id = :productId";
        return dbConnect.get().withHandle(handle ->
                handle.createQuery(sql)
                        .bind("productId", productId)
                        .mapToBean(Product.class)
                        .findOne()
                        .orElse(null)
        );
    }

    // Thêm mới sản phẩm
    public boolean addProduct(Product product) {
        String sql = "INSERT INTO products (productName, price, image, state, description, checkCollection, categoryID) " +
                "VALUES (:productName, :price, :image, :state, :description, :checkCollection, :categoryID)";
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
                            .execute()
            );
            return rowsInserted > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Cập nhật sản phẩm
    public boolean updateProduct(Product product) {
        String sql = "UPDATE products SET productName = :productName, price = :price, image = :image, " +
                "state = :state, description = :description, checkCollection = :checkCollection, categoryID = :categoryID " +
                "WHERE id = :id";
        return dbConnect.get().withHandle(handle ->
                handle.createUpdate(sql)
                        .bind("productName", product.getProductName())
                        .bind("price", product.getPrice())
                        .bind("image", product.getImage())
                        .bind("state", product.getState())
                        .bind("description", product.getDescription())
                        .bind("checkCollection", product.isCheckCollection())
                        .bind("categoryID", product.getCategoryID())
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

    // Test các chức năng chính
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

        // Test thêm sản phẩm mới
        Product newProduct = new Product(0, "Áo polo", 200000, "image.jpg", true, "Mô tả sản phẩm", true, 1);
        boolean isAdded = productDao.addProduct(newProduct);
        System.out.println("Thêm sản phẩm mới: " + isAdded);

        // Test lấy danh sách sản phẩm
        List<Product> products = productDao.getAllProducts();
        System.out.println("Danh sách sản phẩm:");
        products.forEach(System.out::println);

        // Test lấy sản phẩm theo ID
        Product product = productDao.getProductById(1);
        System.out.println("Sản phẩm có ID 1: " + product);

        // Test cập nhật sản phẩm
        if (product != null) {
            product.setPrice(250000); // Thay đổi giá
            boolean isUpdated = productDao.updateProduct(product);
            System.out.println("Cập nhật sản phẩm: " + isUpdated);
        }

        // Test xóa sản phẩm
        boolean isDeleted = productDao.deleteProduct(2);
        System.out.println("Xóa sản phẩm có ID 2: " + isDeleted);
    }
}
