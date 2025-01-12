package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Material;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.MaterialService;
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

        MaterialService materialService = new MaterialService();
        List<Material> materials = materialService.getMaterial();

        request.setAttribute("materials", materials);

        request.setAttribute("product", product);
        String categoryName = product.getCategoryName();

        if (categoryName.equalsIgnoreCase("Vest") || product.getCategoryName().equalsIgnoreCase("Ao")) {
            List<String> list = product.getProductMaterials();
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < materials.size(); j++) {
                    if (materials.get(j).getMatCategory().equalsIgnoreCase("Vai") && list.get(i).equalsIgnoreCase(materials.get(j).getName())) {
                        request.setAttribute("fabric", list.get(i));
                    }
                    ;
                    if (materials.get(j).getMatCategory().equalsIgnoreCase("Co") && list.get(i).equalsIgnoreCase(materials.get(j).getName())) {
                        request.setAttribute("collar", list.get(i));
                    }
                    ;
                    if (materials.get(j).getMatCategory().equalsIgnoreCase("Tui Ao") && list.get(i).equalsIgnoreCase(materials.get(j).getName())) {
                        request.setAttribute("pocket", list.get(i));
                    }
                    ;
                    if (materials.get(j).getMatCategory().equalsIgnoreCase("Nut Ao") && list.get(i).equalsIgnoreCase(materials.get(j).getName())) {
                        request.setAttribute("button", list.get(i));
                    }
                    ;
                }
            }
            request.getRequestDispatcher("mayAo.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}