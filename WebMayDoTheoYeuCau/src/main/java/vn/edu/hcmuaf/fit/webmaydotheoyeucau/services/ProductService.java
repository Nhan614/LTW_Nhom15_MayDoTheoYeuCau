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
        System.out.println(productService.getAllProducts());
    }
}
