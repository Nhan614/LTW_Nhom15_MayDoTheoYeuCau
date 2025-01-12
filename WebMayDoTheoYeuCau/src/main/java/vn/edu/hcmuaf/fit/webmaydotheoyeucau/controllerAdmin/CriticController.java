package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Contact;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Critic;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ContactService;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.CriticService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CriticController", value = "/CriticController")
public class CriticController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Lấy giá trị tham số "id"
            String idParam = request.getParameter("id");
            CriticService criticService = new CriticService();

            if (idParam == null || idParam.isEmpty()) {
                // Trả về tất cả dữ liệu nếu không có id
                List<Critic> critic = criticService.getAllCritic();
                sendJsonResponse(response, critic);
            } else {
                // Trả về dữ liệu của liên hệ cụ thể nếu có id
                int id = Integer.parseInt(idParam);
                Critic critic = criticService.getCriticById(id);
                if (critic == null) {
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    response.getWriter().write("{\"message\":\"Liên hệ không tồn tại.\"}");
                } else {
                    sendJsonResponse(response, critic);
                }
            }
        } catch (Exception e) {
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"message\":\"Đã xảy ra lỗi trong quá trình xử lý.\"}");
            e.printStackTrace();
        }
    }

    private void sendJsonResponse(HttpServletResponse response, Object data) throws IOException {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(data));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        try {
            // Kiểm tra các tham số đầu vào
            if (name != null && !name.isEmpty() && email != null && !email.isEmpty() && message != null && !message.isEmpty()) {
                Contact contact = new Contact( name, email, message,0);
                ContactService contactService = new ContactService();
                boolean success = contactService.addContact(contact);
                if (success) {
                    // Trả về phản hồi JSON thành công
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");
                    response.getWriter().write("{\"message\":\"Đã gửi thông tin liên hệ thành công.\"}");
                } else {
                    // Trả về phản hồi JSON thông báo lỗi
                    response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                    response.getWriter().write("{\"message\":\"Không thể lưu thông tin liên hệ.\"}");
                }
            } else {
                // Trả về phản hồi JSON nếu thiếu thông tin
                response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                response.getWriter().write("{\"message\":\"Vui lòng cung cấp đầy đủ thông tin.\"}");
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Trả về phản hồi JSON khi có lỗi hệ thống
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"message\":\"xảy ra lỗi trong quá trình xử lý.\"}");
        }
    }


}
