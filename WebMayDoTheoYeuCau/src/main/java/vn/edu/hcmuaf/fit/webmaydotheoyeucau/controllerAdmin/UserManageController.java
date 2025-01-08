package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.CategoriesService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.UserManageService;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "UserManagerController", value = "/userManagerController")
public class UserManageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy danh sách các danh mục từ cơ sở dữ liệu (thông qua DAO)
        UserManageService userManageService = new UserManageService();  // Giả sử bạn có CategoryDAO
        List<User> users = userManageService.getUserForAdmin();  // Lấy danh sách category từ DB

        // Set response content type to JSON
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        // Convert the list of categories to JSON using Gson
        Gson gson = new Gson();
        String userJson = gson.toJson(users);

        // Write the JSON to the response output stream
        response.getWriter().write(userJson);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    RequestDispatcher rd = getServletContext().getRequestDispatcher("/login.jsp");

    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        try {
            // Read the JSON from the request body
            StringBuilder jsonBuffer = new StringBuilder();
            String line;
            try (BufferedReader reader = request.getReader()) {
                while ((line = reader.readLine()) != null) {
                    jsonBuffer.append(line);
                }
            }
            String json = jsonBuffer.toString();

            // Parse the JSON into a UserModel object
            Gson gson = new Gson();
            User user = gson.fromJson(json, User.class);
            // Call the service to update the user
            UserManageService userService = new UserManageService();
            boolean isUpdated = userService.updateUser(user);

            // Return response
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
            // Lấy `id` từ tham số URL
            String id = request.getParameter("id");

            if (id == null || id.isEmpty()) {
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.getWriter().write("{\"message\": \"ID người dùng không hợp lệ\"}");
                return;
            }

            // Gọi service để xóa người dùng
            UserManageService userService = new UserManageService();
            boolean isDeleted = userService.deleteUserById(id);

            // Trả về kết quả
            JsonObject jsonResponse = new JsonObject();
            if (isDeleted) {
                jsonResponse.addProperty("message", "Xóa người dùng thành công");
                response.setStatus(HttpServletResponse.SC_OK);
            } else {
                jsonResponse.addProperty("message", "Không tìm thấy người dùng");
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            }
            response.getWriter().write(jsonResponse.toString());
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"message\": \"Đã xảy ra lỗi: " + e.getMessage() + "\"}");
        }
    }

}