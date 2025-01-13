package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProductService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CollectionController", value = "/collection")
public class CollectionController extends HttpServlet {
    private CollectionController collectionController;

    @Override
    public void init() {
        collectionController = new CollectionController();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService = new ProductService();
        // Xử lý cho collection.jsp
        List<Product> vests = productService.getTopProductsByCategoryId(1, 4); // Vest Công Sở
        List<Product> aoSoMi = productService.getTopProductsByCategoryId(6, 4); // Áo Sơ Mi
        List<Product> blazers = productService.getTopProductsByCategoryId(9, 4); // Blazer
        List<Product> quanAu = productService.getTopProductsByCategoryId(10, 4); // Quần Âu

        // Truyền danh sách sản phẩm vào request
        request.setAttribute("vests", vests);
        request.setAttribute("aoSoMi", aoSoMi);
        request.setAttribute("blazers", blazers);
        request.setAttribute("quanAu", quanAu);

        // Điều hướng đến collection.jsp
        request.getRequestDispatcher("collection.jsp").forward(request, response);

    }
}