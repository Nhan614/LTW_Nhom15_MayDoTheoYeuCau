package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.AuthService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Section: Kiểm tra trạng thái đăng nhập
        if (session.getAttribute("auth") == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            response.sendRedirect("home.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Section: Thu thập dữ liệu từ form
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        // Section: Xử lý đăng nhập với AuthService
        AuthService service = new AuthService();
        User user = service.checkLogin(email, pass);

        // Section: Phân quyền và chuyển hướng
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("auth", user);

            if (user.getRole() == 1) { // Admin
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            } else { // User thông thường
                request.getRequestDispatcher("home.jsp").forward(request, response);
            }
        } else {
            // Section: Thông báo lỗi nếu đăng nhập không thành công
            request.setAttribute("error", "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
