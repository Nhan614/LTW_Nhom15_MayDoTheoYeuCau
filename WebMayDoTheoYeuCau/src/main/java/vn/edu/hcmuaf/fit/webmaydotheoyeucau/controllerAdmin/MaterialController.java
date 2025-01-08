package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Material;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.MaterialService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "MaterialController", value = "/materialController")
public class MaterialController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy danh sách Material từ database
        MaterialService materialService = new MaterialService();
        List<Material> materials = materialService.getMaterial();

        // Set response content type là JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Chuyển danh sách Material sang JSON
        Gson gson = new Gson();
        String materialJson = gson.toJson(materials);

        // Ghi JSON vào output stream
        response.getWriter().write(materialJson);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

}