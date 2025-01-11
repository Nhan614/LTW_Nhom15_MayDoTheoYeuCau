package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;

import java.io.IOException;

@WebServlet(name = "Fogotpassword", value = "/Fogotpassword")
public class Fogotpassword extends HttpServlet {

    private UserDao userDao = new UserDao();  // Khởi tạo đối tượng UserDao để tương tác với cơ sở dữ liệu

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Bạn có thể trả về trang quên mật khẩu (forgotPassword.jsp) trong phương thức GET
        request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");  // Lấy email người dùng nhập

        if (userDao.isEmailExist(email)) {
            // Gửi email reset mật khẩu
            userDao.sendResetPasswordLink(email);


            // Thêm thông báo thành công
            request.setAttribute("successMessage", "Đã gửi liên kết đặt lại mật khẩu đến email của bạn. Vui lòng kiểm tra hộp thư đến.");
            request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
        } else {
            // Thêm thông báo lỗi
            request.setAttribute("errorMessage", "Email không tồn tại trong hệ thống.");
            request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
        }
    }
}
