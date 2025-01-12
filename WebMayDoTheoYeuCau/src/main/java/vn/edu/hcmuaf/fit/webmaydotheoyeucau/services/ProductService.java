package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.ProductDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import java.util.ArrayList;
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

    public List<Product> getProductsByCategoryId(int categoryId) {
        List<Product> list = new ArrayList<Product>();
        productDao.getProductByCategoryId(categoryId).forEach((key,value) -> {
            list.add(value);
        });
        return list;
    }
    public List<Product> getTopProductsByCategoryId(int categoryId, int limit) {
        List<Product> list = new ArrayList<Product>();
        productDao.getProductByCategoryId(categoryId).forEach((key,value) -> {
            list.add(value);
        });
        return list;
    }

    // Thêm mới sản phẩm
//    public boolean addProduct(Product product) {
//        return productDao.addProduct(product);
//    }
//
//    // Cập nhật sản phẩm
//    public boolean updateProduct(Product product) {
//        return productDao.updateProduct(product);
//    }

    // Xóa sản phẩm
    public boolean deleteProduct(int productId) {
        return productDao.deleteProduct(productId);
    }

    // Lấy danh sách sản phẩm theo categoryID




    public static void main(String[] args) {
        ProductService productService = new ProductService();
        System.out.println(productService.getTopProductsByCategoryId(5, 10));
    }
}
