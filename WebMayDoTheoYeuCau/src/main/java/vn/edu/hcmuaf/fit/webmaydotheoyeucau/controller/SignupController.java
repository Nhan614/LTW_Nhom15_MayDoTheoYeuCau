import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.mindrot.jbcrypt.BCrypt;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.io.IOException;

@WebServlet(name = "SignupController", value = "/signup")
public class SignupController extends HttpServlet {

    private UserDao userDao;

    @Override
    public void init() {
        userDao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullName = request.getParameter("fullName");
        String gmail = request.getParameter("gmail");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("confirmPassword");

        // Kiểm tra mật khẩu và xác minh mật khẩu có trùng khớp hay không
        if (!password.equals(confirmPassword)) {
            request.setAttribute("error", "Mật khẩu xác minh không khớp");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }

        // Kiểm tra email có tồn tại trong cơ sở dữ liệu không
        if (userDao.isEmailExist(gmail)) {
            request.setAttribute("error", "Email đã được sử dụng");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }
        // Mã hóa mật khẩu trước khi lưu
        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());

        // Tạo đối tượng User và thêm vào cơ sở dữ liệu
        User newUser = new User(0, "", hashedPassword, fullName, gmail, "", "", 0, 2); // Role 2 là người dùng bình thường
        boolean isSuccess = userDao.registerUser(newUser);

        if (isSuccess) {
            // Đăng nhập ngay sau khi đăng ký thành công
            HttpSession session = request.getSession();
            session.setAttribute("auth", newUser); // Tự động đăng nhập

            // Chuyển hướng đến trang chủ sau khi đăng ký thành công
            response.sendRedirect("home.jsp");
        } else {
            request.setAttribute("error", "Đăng ký không thành công. Vui lòng thử lại.");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
    }
}
