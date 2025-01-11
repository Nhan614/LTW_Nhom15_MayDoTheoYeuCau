package vn.edu.hcmuaf.fit.webmaydotheoyeucau.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;

import java.io.IOException;

@WebFilter("/checkout.jsp")  // Chỉ áp dụng filter cho trang admin.jsp
public class CheckoutFillter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Khởi tạo nếu cần
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        HttpSession session = httpRequest.getSession();
        // Kiểm tra xem người dùng có đăng nhập hay không
        Object user = session.getAttribute("auth");

        if (user != null) {
            chain.doFilter(request, response); // Cho phép truy cập vào trang yêu cầu
        } else {
            // Thêm thông báo cần đăng nhập vào session
            session.setAttribute("loginMessage", "Bạn cần phải đăng nhập để thanh toán.");

            // Chuyển hướng đến trang đăng nhập
            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login.jsp");
        }
    }

    @Override
    public void destroy() {
        // Clean up nếu cần
    }
}
