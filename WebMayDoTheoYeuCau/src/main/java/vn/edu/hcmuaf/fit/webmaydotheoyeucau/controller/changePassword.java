package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.PassWordService;

import java.io.IOException;

@WebServlet("/changePassword")
public class changePassword extends HttpServlet {

private UserDao userDao;

    @Override
    public void init() {
        // Khởi tạo UserDao để sử dụng trong servlet
        userDao = new UserDao();
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String currentPassword = request.getParameter("currentPassword");
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");

        if (newPassword == null || confirmPassword == null) {
            request.setAttribute("error", "Vui lòng nhập tất cả các trường.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            request.setAttribute("error", "Mật khẩu mới và xác nhận mật khẩu phải trùng khớp.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            response.sendRedirect("login.jsp");
            return;
        }

        if (!BCrypt.checkpw(currentPassword, user.getPassword())) {
            request.setAttribute("error", "Mật khẩu hiện tại không chính xác.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        String hashedNewPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

        boolean isPasswordUpdated = userDao.updatePassword(user.getGmail(), hashedNewPassword);

        if (isPasswordUpdated) {
            request.getSession().setAttribute("user", user); // Giữ người dùng đăng nhập
            request.setAttribute("success", "Mật khẩu đã được thay đổi thành công.");
            response.sendRedirect("profile.jsp");
        } else {
            request.setAttribute("error", "Có lỗi xảy ra khi thay đổi mật khẩu.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
        }
    }
}