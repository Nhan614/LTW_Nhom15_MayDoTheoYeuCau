package vn.edu.hcmuaf.fit.webmaydotheoyeucau.controllerAdmin;

import com.google.gson.Gson;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Contact;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.util.EmailUtil;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.services.ContactService;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContactsController", value = "/ContactsController")
public class ContactsController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Lấy giá trị tham số "id"
            String idParam = request.getParameter("id");
            ContactService contactService = new ContactService();

            if (idParam == null || idParam.isEmpty()) {
                // Trả về tất cả dữ liệu nếu không có id
                List<Contact> contacts = contactService.getAllContacts();
                sendJsonResponse(response, contacts);
            } else {
                // Trả về dữ liệu của liên hệ cụ thể nếu có id
                int id = Integer.parseInt(idParam);
                Contact contact = contactService.getContactById(id);
                if (contact == null) {
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    response.getWriter().write("{\"message\":\"Liên hệ không tồn tại.\"}");
                } else {
                    sendJsonResponse(response, contact);
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
        String idParam = request.getParameter("id");
        String responseText = request.getParameter("response");
        System.out.println("da gui");

        try {
            int contactId = Integer.parseInt(idParam);
            ContactService contactService = new ContactService();
            Contact contact = contactService.getContactById(contactId);

            if (contact != null) {
                String subject = "Phản hồi từ THREEN TAILORED";
                String body = "Xin chào " + contact.getName() + ",\n\n" +
                        "Cảm ơn bạn đã liên hệ với chúng tôi.\n\n" +
                        "Phản hồi của chúng tôi:\n" +
                        responseText + "\n\n" +
                        "Trân trọng,\nĐội ngũ hỗ trợ.";

                new EmailUtil().reponeContact(contact.getEmail(), subject, body);

                HttpSession session = request.getSession();
                User authUser = (User) session.getAttribute("auth");

                contact.setStatus(2);
                contact.setResponse(responseText);
                contact.setResponseBy(authUser != null ? authUser.getFullName() : "Admin");
                contactService.updateContact(contact);

                response.setContentType("application/json");
                response.setCharacterEncoding("UTF-8");
                response.getWriter().write("{\"message\":\"Phản hồi đã được gửi thành công!\"}");
            } else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                response.getWriter().write("{\"message\":\"Contact not found.\"}");
            }
        } catch (NumberFormatException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"message\":\"Invalid contact ID.\"}");
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"message\":\"An error occurred while processing the request.\"}");
        }
    }
}
