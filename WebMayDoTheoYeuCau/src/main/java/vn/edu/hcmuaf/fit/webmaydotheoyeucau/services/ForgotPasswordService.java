package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.UserDao;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;


public class ForgotPasswordService {
    private UserDao userDao;

    public ForgotPasswordService() {
        this.userDao = new UserDao();
    }

    public boolean sendResetPasswordLink(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email không thể là null hoặc rỗng");
        }

        if (!userDao.isEmailExist(email)) {
            throw new IllegalArgumentException("Email không tồn tại trong hệ thống.");
        }

        final String fromEmail = "nhannghialai@gmail.com";  // Thay bằng email của bạn
        final String password = "xpna sqpq sefp dfix";  // Thay bằng mật khẩu email của bạn

        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            String resetLink = "http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/layLaiMatKhau.jsp?email=" + email;
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Đặt lại mật khẩu của bạn");
            message.setText("Vui lòng nhấp vào liên kết sau để đặt lại mật khẩu của bạn: " + resetLink);
            Transport.send(message);
            return true; // Đã gửi email thành công
        } catch (MessagingException e) {
            e.printStackTrace();
            return false; // Gửi email thất bại
        }
    }
}