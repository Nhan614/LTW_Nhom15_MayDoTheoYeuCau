package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.ProductDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import java.util.List;

public class ProductService {
    private ProductDao productDao;

    // Constructor
    public ProductService() {
        this.productDao = new ProductDao();
    }

    // Lấy tất cả sản phẩm
    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    // Lấy sản phẩm theo ID
    public Product getProductById(int productId) {
        return productDao.getProductById(productId);
    }

    // Thêm mới sản phẩm
    public boolean addProduct(Product product) {
        return productDao.addProduct(product);
    }

    // Cập nhật sản phẩm
    public boolean updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    // Xóa sản phẩm
    public boolean deleteProduct(int productId) {
        return productDao.deleteProduct(productId);
    }

    // Lấy danh sách sản phẩm theo categoryID
    public List<Product> getProductsByCategoryId(int categoryId) {
        return productDao.getAllProducts().stream()
                .filter(product -> product.getCategoryID() == categoryId)
                .toList();
    }

    public static void main(String[] args) {
        ProductService productService = new ProductService();

        // Test thêm sản phẩm mới
        Product newProduct = new Product(0, "Áo sơ mi", 300000, "shirt.jpg", true, "Mô tả áo sơ mi", true, 2);
        boolean isAdded = productService.addProduct(newProduct);
        System.out.println("Thêm sản phẩm mới: " + isAdded);

        // Test lấy tất cả sản phẩm
        List<Product> allProducts = productService.getAllProducts();
        System.out.println("Danh sách sản phẩm:");
        allProducts.forEach(System.out::println);

        // Test lấy sản phẩm theo ID
        Product product = productService.getProductById(1);
        System.out.println("Sản phẩm có ID 1: " + product);

        // Test cập nhật sản phẩm
        if (product != null) {
            product.setPrice(350000); // Thay đổi giá
            boolean isUpdated = productService.updateProduct(product);
            System.out.println("Cập nhật sản phẩm: " + isUpdated);
        }

        // Test xóa sản phẩm
        boolean isDeleted = productService.deleteProduct(3);
        System.out.println("Xóa sản phẩm có ID 3: " + isDeleted);

        // Test lấy sản phẩm theo categoryID
        List<Product> productsByCategory = productService.getProductsByCategoryId(2);
        System.out.println("Danh sách sản phẩm thuộc categoryID = 2:");
        productsByCategory.forEach(System.out::println);
    }
}
