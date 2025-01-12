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

        // Kiểm tra mật khẩu mới và xác nhận mật khẩu
        if (newPassword == null || newPassword.isEmpty() || newPassword.length() < 6) {
            request.setAttribute("error", "Mật khẩu mới phải có ít nhất 6 ký tự và không được để trống.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        if (confirmPassword == null || confirmPassword.isEmpty()) {
            request.setAttribute("error", "Vui lòng nhập xác nhận mật khẩu.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        if (!newPassword.equals(confirmPassword)) {
            request.setAttribute("error", "Mật khẩu mới và xác nhận mật khẩu phải trùng khớp.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        // Kiểm tra người dùng đã đăng nhập
        User user = (User) request.getSession().getAttribute("auth"); // Lấy thông tin user từ session
        if (user == null) {
            response.sendRedirect("login.jsp"); // Nếu chưa đăng nhập, chuyển đến trang đăng nhập
            return;
        }

        // Kiểm tra mật khẩu hiện tại
        if (!BCrypt.checkpw(currentPassword, user.getPassword())) {
            request.setAttribute("error", "Mật khẩu hiện tại không chính xác.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
            return;
        }

        // Mã hóa mật khẩu mới
        String hashedNewPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

        // Cập nhật mật khẩu mới vào cơ sở dữ liệu

        UserDao userDao = new UserDao();
        boolean isPasswordUpdated = userDao.updatePassword(user.getGmail(), hashedNewPassword);

        if (isPasswordUpdated) {
            // Cập nhật mật khẩu mới trong đối tượng user
            user.setPassword(hashedNewPassword);

            // Cập nhật lại thông tin người dùng trong session
            request.getSession().setAttribute("auth", user);

            // Thông báo thành công và chuyển hướng
            request.getSession().setAttribute("success", "Mật khẩu đã được thay đổi thành công.");
            response.sendRedirect("changePassword.jsp");
        } else {
            request.setAttribute("error", "Có lỗi xảy ra khi thay đổi mật khẩu.");
            request.getRequestDispatcher("changePassword.jsp").forward(request, response);
        }
    }
}
