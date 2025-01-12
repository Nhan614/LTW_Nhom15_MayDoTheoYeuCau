package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.util.EmailUtil;

public class RegisterEmailService {

    private UserDao userDao;

    public RegisterEmailService() {
        userDao = new UserDao();
    }

    // Kiểm tra xem email đã có trong cơ sở dữ liệu chưa
    public String registerEmail(String email) {
        // Kiểm tra xem email có tồn tại trong cơ sở dữ liệu không
        User user = userDao.getUserByEmail(email);

        if (user == null) {
            // Nếu không tìm thấy email trong cơ sở dữ liệu (tức là chưa có tài khoản)
            return "Email này chưa có tài khoản, vui lòng đăng ký tài khoản trước!";
        } else {
            // Nếu email đã có tài khoản trong cơ sở dữ liệu
            // Gửi thông báo đăng ký
            sendRegistrationNotification(email);
            return "Thông báo đăng ký đã được gửi tới email: " + email;
        }
    }

    // Gửi thông báo đăng ký thành công
    private void sendRegistrationNotification(String email) {
        String subject = "Thông báo đăng ký thành công";
        String body = "Chào bạn, đăng ký của bạn đã thành công!";
        EmailUtil.sendEmail(email, subject, body);
    }
}