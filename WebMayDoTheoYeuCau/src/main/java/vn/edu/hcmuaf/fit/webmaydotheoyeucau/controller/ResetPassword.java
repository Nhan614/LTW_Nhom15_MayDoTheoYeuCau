package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ResetPasswordService;

import java.io.IOException;

@WebServlet(name = "ResetPassword", value = "/ResetPassword")
public class ResetPassword extends HttpServlet {

    private UserDao userDao;
    private ResetPasswordService resetPasswordService;

    @Override
    public void init() throws ServletException {
        userDao = new UserDao();  // Khởi tạo UserDao
        resetPasswordService = new ResetPasswordService();  // Khởi tạo ResetPasswordService
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy thông tin từ form
        String email = request.getParameter("email");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");



        if (newPassword == null || newPassword.isEmpty() || newPassword.length() < 6) {
            request.setAttribute("errorMessage", "Mật khẩu mới phải có ít nhất 6 ký tự và không được để trống.");
            request.getRequestDispatcher("layLaiMatKhau.jsp").forward(request, response);
            return;
        }

        if (confirmPassword == null || confirmPassword.isEmpty()) {
            request.setAttribute("errorMessage", "Vui lòng nhập xác nhận mật khẩu.");
            request.getRequestDispatcher("layLaiMatKhau.jsp").forward(request, response);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            request.setAttribute("errorMessage", "Mật khẩu mới và xác nhận mật khẩu phải trùng khớp.");
            request.getRequestDispatcher("layLaiMatKhau.jsp").forward(request, response);
            return;
        }



        // Mã hóa mật khẩu mới
        String hashedNewPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

//        // Cập nhật mật khẩu mới trong cơ sở dữ liệu
//        boolean isPasswordUpdated = userDao.updatePassword(email, hashedNewPassword);
//        if (isPasswordUpdated) {
//            // Cập nhật thành công
//            request.setAttribute("successMessage", "Mật khẩu đã được thay đổi thành công.");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        } else {
//            // Cập nhật thất bại
//            request.setAttribute("errorMessage", "Có lỗi xảy ra khi thay đổi mật khẩu.");
//            request.getRequestDispatcher("layLaiMatKhau.jsp").forward(request, response);
//        }
        try {
            boolean isPasswordUpdated = userDao.updatePassword(email, hashedNewPassword);
            if (isPasswordUpdated) {
                request.setAttribute("successMessage", "Mật khẩu đã được thay đổi thành công.");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                request.setAttribute("errorMessage", "Có lỗi xảy ra khi thay đổi mật khẩu.");
                request.getRequestDispatcher("layLaiMatKhau.jsp").forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();  // In lỗi ra console
            request.setAttribute("errorMessage", "Có lỗi hệ thống: " + e.getMessage());
            request.getRequestDispatcher("layLaiMatKhau.jsp").forward(request, response);
        }
    }
}