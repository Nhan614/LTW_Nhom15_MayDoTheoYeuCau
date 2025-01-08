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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User user = (User) request.getSession().getAttribute("auth");
        int userId = user.getId();
        String image = request.getSession().getAttribute("username").toString();
        String fullName = request.getSession().getAttribute("name").toString();
        String gmail = request.getSession().getAttribute("email").toString();
        String phone = request.getSession().getAttribute("phone").toString();
        String address = request.getSession().getAttribute("address").toString();


        User user1 = new User(image, fullName, gmail, phone , address);

        ProfileService profileService = new ProfileService();
        profileService.updateProfile(user1, userId);

    }

}