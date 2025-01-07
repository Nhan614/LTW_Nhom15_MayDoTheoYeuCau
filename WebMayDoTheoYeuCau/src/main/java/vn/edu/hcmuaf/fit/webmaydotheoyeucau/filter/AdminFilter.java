package vn.edu.hcmuaf.fit.webmaydotheoyeucau.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.io.IOException;

//@WebFilter(filterName = "AdminFilter", urlPatterns = "/admin/*")
//public class AdminFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        Filter.super.init(filterConfig);
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//
//        HttpServletRequest request = (HttpServletRequest) re;
//        HttpServletResponse response = (HttpServletResponse) res;
//
//        HttpSession session = request.getSession(true);
//        User u = (User) session.getAttribute("auth");
//        if (u == null || u.getRole() > 1) {
//            response.sendRedirect("../login.jsp");
//            return;
//        }
//
//
//
//        chain.doFilter(request, response);
//    }
//
//
//    }
//
//    @Override
//    public void destroy() {
//        Filter.super.destroy();
//    }
//}
@WebFilter(filterName = "AdminFilter", urlPatterns = "/admin/*")
public class AdminFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override

    public void doFilter(ServletRequest re, ServletResponse res, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) re;
        HttpServletResponse response = (HttpServletResponse) res;

        HttpSession session = request.getSession(true);
        User u = (User) session.getAttribute("auth");
        if (u == null || u.getRole() > 1) {
            response.sendRedirect("login.jsp");
            return;
        }


        chain.doFilter(request, response);
    }
}