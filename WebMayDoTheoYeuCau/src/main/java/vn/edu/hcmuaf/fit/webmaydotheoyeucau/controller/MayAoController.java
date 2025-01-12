package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProductService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "MayAoController", value = "/MayAoController")
public class MayAoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ProductService productService = new ProductService();
        Product product = productService.getProductById(id);
        request.setAttribute("products", product);
        String categoryName = product.getCategoryName();

        if (categoryName.equalsIgnoreCase("Vest")) {
            List<String> list = product.getProductMaterials();
            request.setAttribute("fabric", list.get(0));
//            request.setAttribute("collar", list.get(1));
//            request.setAttribute("pocket", list.get(2));
//            request.setAttribute("button", list.get(3));
            request.getRequestDispatcher("mayAo.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}