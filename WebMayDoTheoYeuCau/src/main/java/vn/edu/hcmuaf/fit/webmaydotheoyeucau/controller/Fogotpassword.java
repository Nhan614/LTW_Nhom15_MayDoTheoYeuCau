package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ForgotPasswordService;


import java.io.IOException;

@WebServlet(name = "Fogotpassword", value = "/Fogotpassword")
public class Fogotpassword extends HttpServlet {

private ForgotPasswordService forgotPasswordService = new ForgotPasswordService(); // Sử dụng ForgotPasswordService

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        try {
            boolean success = forgotPasswordService.sendResetPasswordLink(email);
            if (success) {
                request.setAttribute("successMessage", "Đã gửi liên kết đặt lại mật khẩu đến email của bạn. Vui lòng kiểm tra hộp thư đến.");
            } else {
                request.setAttribute("errorMessage", "Có lỗi xảy ra khi gửi email.");
            }
        } catch (IllegalArgumentException e) {
            request.setAttribute("errorMessage", e.getMessage());
        }

        request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
    }
}