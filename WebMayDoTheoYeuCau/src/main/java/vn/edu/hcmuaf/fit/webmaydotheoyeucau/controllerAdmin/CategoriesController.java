package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.CategoriesService;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "/categories", value = "/categories")
public class CategoriesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy danh sách các danh mục từ cơ sở dữ liệu (thông qua DAO)
        CategoriesService categoriesService = new CategoriesService();  // Giả sử bạn có CategoryDAO
        List<CategoryModel> categories = categoriesService.getAllCategories();  // Lấy danh sách category từ DB

        // Set response content type to JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Convert the list of categories to JSON using Gson
        Gson gson = new Gson();
        String categoriesJson = gson.toJson(categories);

        // Write the JSON to the response output stream
        response.getWriter().write(categoriesJson);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

            // Chuyển JSON thành đối tượng CategoryModel
            Gson gson = new Gson();
            CategoryModel newCategory = gson.fromJson(json, CategoryModel.class);

            // Gọi service để thêm category vào DB
            CategoriesService categoryService = new CategoriesService();
            boolean isAdded = categoryService.addCategory(newCategory);

            // Trả về response
            JsonObject jsonResponse = new JsonObject();
            if (isAdded) {
                jsonResponse.addProperty("message", "Thêm danh mục thành công");
                response.setStatus(HttpServletResponse.SC_OK);
            } else {
                jsonResponse.addProperty("message", "Thêm danh mục thất bại");
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

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

            // Chuyển JSON thành đối tượng CategoryModel
            Gson gson = new Gson();
            CategoryModel category = gson.fromJson(json, CategoryModel.class);

            // Gọi service để cập nhật danh mục
            CategoriesService categoryService = new CategoriesService();
            boolean isUpdated = categoryService.updateCategory(category);

            // Trả về response
            JsonObject jsonResponse = new JsonObject();
            if (isUpdated) {
                jsonResponse.addProperty("message", "Cập nhật thành công");
                response.setStatus(HttpServletResponse.SC_OK);
            } else {
                jsonResponse.addProperty("message", "Cập nhật thất bại");
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

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        try {
            // Lấy ID từ query string
            String idParam = request.getParameter("id");
            if (idParam == null || idParam.isEmpty()) {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.getWriter().write("{\"message\": \"Category ID is required\"}");
                return;
            }

            int categoryId = Integer.parseInt(idParam);

            // Gọi service để xóa danh mục
            CategoriesService categoryService = new CategoriesService();
            boolean isDeleted = categoryService.deleteCategory(categoryId);

            // Trả về kết quả
            if (isDeleted) {
                response.setStatus(HttpServletResponse.SC_OK);
                response.getWriter().write("{\"message\": \"Category deleted successfully\"}");
            } else {
                response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().write("{\"message\": \"Failed to delete category\"}");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"message\": \"Error: " + e.getMessage() + "\"}");
        }
    }


    public static void main(String[] args) {
        CategoriesService categoryDao = new CategoriesService();  // Giả sử bạn có CategoryDAO
        List<CategoryModel> categories = categoryDao.getAllCategories();  // Lấy danh sách category từ DB
        System.out.println(categories);
    }
}