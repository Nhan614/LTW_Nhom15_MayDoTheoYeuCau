package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProfileService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.UserManageService;

import java.io.IOException;

@WebServlet(name = "ProfileEditController", value = "/profileEditController")
public class ProfileEditController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User authUser = (User) session.getAttribute("auth"); // Lấy user hiện tại từ session
        if (authUser == null) {
            response.sendRedirect("login.jsp");
            return;
        }
        ProfileService profileService = new ProfileService();

        // Lấy thông tin chi tiết người dùng từ database
        int userId = authUser.getId();
        User user = profileService.getUserById(userId);

        if (user != null) {
            // Đặt user vào request attribute
            request.setAttribute("user", user);
            // Chuyển tiếp đến trang JSP
            request.getRequestDispatcher("profile.jsp").forward(request, response);
        } else {
            // Nếu không tìm thấy, chuyển đến trang lỗi
            response.sendRedirect("error.jsp");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String userIdParam = request.getParameter("userId");
        int userId = Integer.parseInt(userIdParam);

        String image = request.getParameter("profileImageUrl");
        String fullName = request.getParameter("name");
        String gmail = request.getParameter("email");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        User user1 = new User(image, fullName, gmail, phone, address);

        ProfileService profileService = new ProfileService();
        profileService.updateProfile(user1, userId);

        User user = (User) request.getSession().getAttribute("auth"); // Lấy user hiện tại từ session

        if (user != null) {
            // Cập nhật thông tin trong đối tượng user
            user.setAvatar(image);
            user.setFullName(fullName);
            user.setGmail(gmail);
            user.setPhone(phone);
            user.setAddress(address);

            // Gọi service để cập nhật vào database
            profileService.updateProfile(user, user.getId());
        }

        response.sendRedirect("profile.jsp");

    }

}