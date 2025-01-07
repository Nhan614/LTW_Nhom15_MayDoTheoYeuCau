package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.AuthService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("auth") == null) {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email= request.getParameter("email");
        String pass= request.getParameter("pass");

        AuthService service = new AuthService();

        User user = service.checkLogin(email, pass);


        if (user != null) {
//            HttpSession session = request.getSession();
//            session.setAttribute("auth", user);
//
//            response.sendRedirect("./index.jsp");
            if (user.getRole() == 1) {
                request.getRequestDispatcher("admin.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("home.jsp").forward(request, response);
            }
        } else {
            request.setAttribute("error", "Dang Nhap Khong Thanh Cong");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }

}
