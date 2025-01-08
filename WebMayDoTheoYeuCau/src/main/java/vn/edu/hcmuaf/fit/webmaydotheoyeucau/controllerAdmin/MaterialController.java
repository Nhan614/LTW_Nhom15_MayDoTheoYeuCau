package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Material;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.MaterialService;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

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
        // Set response content type to JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        try {
            // Đọc JSON từ request body
            StringBuilder jsonBuffer = new StringBuilder();
            String line;
            try (BufferedReader reader = request.getReader()) {
                while ((line = reader.readLine()) != null) {
                    jsonBuffer.append(line);
                }
            }
            String json = jsonBuffer.toString();

            // Chuyển JSON thành đối tượng Material
            Gson gson = new Gson();
            Material newMaterial = gson.fromJson(json, Material.class);

            // Gọi service để thêm vật liệu vào DB
            MaterialService materialService = new MaterialService();
            boolean isAdded = materialService.addMaterial(newMaterial);

            // Trả về response
            JsonObject jsonResponse = new JsonObject();
            if (isAdded) {
                jsonResponse.addProperty("message", "Thêm vật liệu thành công");
                response.setStatus(HttpServletResponse.SC_OK);
            } else {
                jsonResponse.addProperty("message", "Thêm vật liệu thất bại");
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            }
            response.getWriter().write(gson.toJson(jsonResponse));
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"message\": \"Invalid JSON format\"}");
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"message\": \"Error processing request: " + e.getMessage() + "\"}");
        }
    }

}