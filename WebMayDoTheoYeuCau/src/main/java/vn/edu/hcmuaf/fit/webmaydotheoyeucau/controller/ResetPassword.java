package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.io.IOException;

@WebServlet(name = "ResetPassword", value = "/ResetPassword")
public class ResetPassword extends HttpServlet {

    private UserDao userDao;

    @Override
    public void init() throws ServletException {
        userDao = new UserDao();  // Khởi tạo UserDao để truy cập cơ sở dữ liệu
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy email từ tham số trong URL
        String email = request.getParameter("email");

        // Kiểm tra xem email có tồn tại trong hệ thống không
        if (email != null && !email.isEmpty()) {
            // Kiểm tra trong cơ sở dữ liệu
            User user = userDao.getUserByEmail(email);
            if (user != null) {
                // Lưu email vào session hoặc truyền vào form
                request.getSession().setAttribute("email", email);
                // Hiển thị form nhập mật khẩu mới
                request.getRequestDispatcher("/layLaiMatKhau.jsp").forward(request, response);
            } else {
                // Nếu email không tồn tại, hiển thị thông báo lỗi
                request.setAttribute("errorMessage", "Email không hợp lệ. Vui lòng kiểm tra lại.");
                request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("errorMessage", "Liên kết không hợp lệ.");
            request.getRequestDispatcher("/forgotPassword.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy thông tin từ form
        String email = (String) request.getSession().getAttribute("email"); // Lấy email từ session
        String newPassword = request.getParameter("newPassword");
        String confirmPassword = request.getParameter("confirmPassword");

        // Kiểm tra email và mật khẩu mới
        if (email != null && !email.isEmpty() && newPassword != null && !newPassword.isEmpty() && confirmPassword != null && !confirmPassword.isEmpty()) {
            // Kiểm tra mật khẩu xác nhận
            if (!newPassword.equals(confirmPassword)) {
                request.setAttribute("errorMessage", "Mật khẩu xác nhận không khớp.");
                request.getRequestDispatcher("/layLaiMatKhau.jsp").forward(request, response);
                return;
            }

            // Kiểm tra trong cơ sở dữ liệu xem email có tồn tại không
            User user = userDao.getUserByEmail(email);
            if (user != null) {
                // Mã hóa mật khẩu mới
                String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

                // Cập nhật mật khẩu trong cơ sở dữ liệu
                user.setPassword(hashedPassword);
                boolean isUpdated = userDao.updateUser(user);

                if (isUpdated) {
                    request.setAttribute("successMessage", "Mật khẩu đã được cập nhật thành công.");
                    request.getRequestDispatcher("/login.jsp").forward(request, response); // Chuyển về trang login
                } else {
                    request.setAttribute("errorMessage", "Đã có lỗi xảy ra trong quá trình cập nhật mật khẩu.");
                    request.getRequestDispatcher("/layLaiMatKhau.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("errorMessage", "Email không tồn tại trong hệ thống.");
                request.getRequestDispatcher("/layLaiMatKhau.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("errorMessage", "Vui lòng điền đầy đủ thông tin.");
            request.getRequestDispatcher("/layLaiMatKhau.jsp").forward(request, response);
        }
    }
}
