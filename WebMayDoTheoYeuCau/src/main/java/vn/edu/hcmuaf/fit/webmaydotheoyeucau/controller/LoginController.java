package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.AuthService;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        String email = request.getParameter("email");
//        String pass = request.getParameter("pass");
//        out.println("<p>email: " + email + "</p>");
//        out.println("<p>Password: " + pass + "</p>");
//        String email= request.getParameter("email");
//        String pass= request.getParameter("pass");
//        AuthService service = new AuthService();
//        if(service.checkLogin(email,pass)) {
//            response.sendRedirect("home.jsp");
//        }else{
//            request.setAttribute("error","Dang Nhap Khong Thanh Cong");
//            request.getRequestDispatcher("login.jsp").forward(request,response);
//        }
    }

}
