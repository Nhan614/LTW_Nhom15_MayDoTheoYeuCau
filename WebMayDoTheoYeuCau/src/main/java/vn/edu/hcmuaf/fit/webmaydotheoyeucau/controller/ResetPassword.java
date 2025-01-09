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
                // Hiển thị form nhập mật khẩu mới
                request.setAttribute("email", email);
                request.getRequestDispatcher("/resetPasswordForm.jsp").forward(request, response);
            } else {
                // Nếu email không tồn tại, hiển thị thông báo lỗi
                response.getWriter().write("Email không hợp lệ. Vui lòng kiểm tra lại.");
            }
        } else {
            response.getWriter().write("Liên kết không hợp lệ.");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy email và mật khẩu mới từ form
        String email = request.getParameter("email");
        String newPassword = request.getParameter("newPassword");

        // Kiểm tra email và mật khẩu mới
        if (email != null && !email.isEmpty() && newPassword != null && !newPassword.isEmpty()) {
            // Kiểm tra trong cơ sở dữ liệu xem email có tồn tại không
            User user = userDao.getUserByEmail(email);
            if (user != null) {
                // Mã hóa mật khẩu mới
                String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

                // Cập nhật mật khẩu trong cơ sở dữ liệu
                user.setPassword(hashedPassword);
                boolean isUpdated = userDao.updateUser(user);

                if (isUpdated) {
                    response.getWriter().write("Mật khẩu đã được cập nhật thành công.");
                } else {
                    response.getWriter().write("Đã có lỗi xảy ra trong quá trình cập nhật mật khẩu.");
                }
            } else {
                response.getWriter().write("Email không tồn tại trong hệ thống.");
            }
        } else {
            response.getWriter().write("Vui lòng điền đầy đủ thông tin.");
        }
    }
}