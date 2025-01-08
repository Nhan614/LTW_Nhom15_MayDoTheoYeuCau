package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
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
        String fullName = request.getParameter("fullName");
        String gmail = request.getParameter("gmail");
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        // Check if user already exists
        if (userDao.checkUserExists(gmail)) {
            request.setAttribute("error", "Email đã tồn tại");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
            return;
        }

        // Create a new User object
        User newUser = new User();
        newUser.setFullName(fullName);
        newUser.setGmail(gmail);
        newUser.setPassword(password);
        newUser.setPhone(phone);
        newUser.setAddress(address);
        newUser.setRole(1); // Default role (can be changed later)

        // Add user to the database
        if (userDao.addUser(newUser)) {
            response.sendRedirect("login.jsp");
        } else {
            request.setAttribute("error", "Đăng ký thất bại, vui lòng thử lại!");
            request.getRequestDispatcher("signup.jsp").forward(request, response);
        }
    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("signup.jsp").forward(request, response);
    }
}
