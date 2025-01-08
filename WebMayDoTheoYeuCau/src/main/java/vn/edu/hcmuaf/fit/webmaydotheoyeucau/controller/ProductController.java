package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.ProductDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/products")
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDao ProductDao = new ProductDao();
        List<Product> products = vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.ProductDao.getAllProducts();

        request.setAttribute("products", products);
        request.getRequestDispatcher("/products.jsp").forward(request, response);
    }
}
