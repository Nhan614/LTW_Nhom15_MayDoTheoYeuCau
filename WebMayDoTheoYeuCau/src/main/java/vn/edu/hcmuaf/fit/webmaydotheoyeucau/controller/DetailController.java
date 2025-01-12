package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProductService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "DetailController", value = "/product-detail")

public class DetailController extends HttpServlet{
    private ProductService productService;

    @Override
    public void init() throws ServletException {
        productService = new ProductService();
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy ID sản phẩm từ tham số request
        String productIdParam = request.getParameter("id");
        if (productIdParam == null || productIdParam.isEmpty()) {
            response.sendRedirect("products"); // Quay lại trang danh sách nếu không có ID
            return;
        }

        try {
            int productId = Integer.parseInt(productIdParam);

            // Lấy sản phẩm từ Service
            Product product = productService.getProductById(productId);

            if (product == null) {
                response.sendRedirect("products"); // Quay lại danh sách nếu không tìm thấy sản phẩm
                return;
            }

            // Truyền sản phẩm vào request
            request.setAttribute("product", product);
            System.out.println(product);
            // Điều hướng tới file JSP
            request.getRequestDispatcher("detail.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            response.sendRedirect("products"); // Xử lý lỗi nếu ID không hợp lệ
        }
    }
}
