package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.AuthService;

import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet(name = "LoginController", value = "/login")
//public class LoginController extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        HttpSession session = request.getSession();
//
//        // Section: Kiểm tra trạng thái đăng nhập
//        if (session.getAttribute("auth") == null) {
//            request.getRequestDispatcher("/login.jsp").forward(request, response);
//        } else {
//            response.sendRedirect("home.jsp");
//        }
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        // Section: Thu thập dữ liệu từ form
//        String email = request.getParameter("email");
//        String pass = request.getParameter("pass");
//
//        // Section: Xử lý đăng nhập với AuthService
//        AuthService service = new AuthService();
//        User user = service.checkLogin(email, pass);
//
//        // Section: Phân quyền và chuyển hướng
//        if (user != null) {
//            HttpSession session = request.getSession();
//            session.setAttribute("auth", user);
//
//            if (user.getRole() == 1) { // Admin
//                request.getRequestDispatcher("admin.jsp").forward(request, response);
//            } else { // User thông thường
//                request.getRequestDispatcher("home.jsp").forward(request, response);
//            }
//        } else {
//            // Section: Thông báo lỗi nếu đăng nhập không thành công
//            request.setAttribute("error", "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin.");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }
//    }
//}

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        // Kiểm tra trạng thái đăng nhập
        if (session.getAttribute("auth") == null) {
            // Nếu chưa đăng nhập, chuyển đến trang đăng nhập
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        } else {
            // Nếu đã đăng nhập, chuyển hướng đến trang chủ
            response.sendRedirect("home.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Lấy dữ liệu từ form đăng nhập
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String confirmPassword = request.getParameter("confirmPassword");

        // Debug: In ra mật khẩu và xác minh mật khẩu
        System.out.println("Password: " + pass);
        System.out.println("Confirm Password: " + confirmPassword);

        // Kiểm tra xem mật khẩu và xác minh mật khẩu có khớp không
        if (!pass.trim().equals(confirmPassword.trim())) {
            request.setAttribute("error", "Mật khẩu xác minh không khớp");
            request.getRequestDispatcher("login.jsp").forward(request, response);
            return;
        }

        // Khởi tạo UserDao để kiểm tra đăng nhập
        UserDao userDao = new UserDao();
        User user = (User) userDao.checkUser(email, pass);  // Phương thức checkUser đã kiểm tra mật khẩu mã hóa

        // Kiểm tra kết quả đăng nhập
        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("auth", user); // Lưu thông tin người dùng vào session

            // Nếu người dùng là Admin (role == 1)
            if (user.getRole() == 1) {
                response.sendRedirect("admin.jsp");
            } else {
                // Nếu người dùng là User thông thường (role != 1)
                response.sendRedirect("home.jsp");
            }
        } else {
            // Nếu đăng nhập không thành công, hiển thị thông báo lỗi
            request.setAttribute("error", "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin.");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}