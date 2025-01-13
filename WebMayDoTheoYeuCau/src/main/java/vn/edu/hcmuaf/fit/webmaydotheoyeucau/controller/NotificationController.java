package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controller;
import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Material;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Notification;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Product;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.MaterialService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.NotificationService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ProductService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "NotificationController", value = "/admin/notifications")
public class NotificationController extends HttpServlet {
    private NotificationService notificationService;

    @Override
    public void init() {
        notificationService = new NotificationService();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String title = request.getParameter("title");
        String detail = request.getParameter("detail");
        String style = request.getParameter("style");
        String userIDParam = request.getParameter("userID");

        try {
            int userID = Integer.parseInt(userIDParam);

            Notification notification = new Notification(title, detail, style, userID);
            boolean success = notificationService.addNotification(notification);

            response.setContentType("application/json");
            response.getWriter().write("{\"success\":" + success + "}");
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"error\":\"Invalid user ID\"}");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Notification> notifications = notificationService.getAllNotifications();

        response.setContentType("application/json");
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(notifications));
    }
}
