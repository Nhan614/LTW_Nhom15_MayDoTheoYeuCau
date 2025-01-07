package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.CategoriesService;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "/categories", value = "/categories")
public class CategoriesController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy danh sách các danh mục từ cơ sở dữ liệu (thông qua DAO)
        CategoriesService categoryDao = new CategoriesService();  // Giả sử bạn có CategoryDAO
        List<CategoryModel> categories = categoryDao.getAllCategories();  // Lấy danh sách category từ DB

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
    }

    public static void main(String[] args) {
        CategoriesService categoryDao = new CategoriesService();  // Giả sử bạn có CategoryDAO
        List<CategoryModel> categories = categoryDao.getAllCategories();  // Lấy danh sách category từ DB
        System.out.println(categories);
    }
}