
package vn.edu.hcmuaf.fit.webmaydotheoyeucau.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailUtil {

    // Gửi email với liên kết reset mật khẩu
    public void sendResetPasswordLink(String email) {
        String host = "smtp.gmail.com";
        final String fromEmail = "nhannghialai@gmail.com";  // Thay bằng email của bạn
        final String password = "xpna sqpq sefp dfix";    // Thay bằng mật khẩu ứng dụng Gmail của bạn

        // Thiết lập các thuộc tính của SMTP server
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true"); // Bật STARTTLS cho Gmail

        // Tạo Session với thông tin đăng nhập của người gửi
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Tạo liên kết reset mật khẩu
            String resetLink = "http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/layLaiMatKhau.jsp";

            // Tạo đối tượng email
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));  // Người gửi
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email));  // Người nhận
            message.setSubject("Đặt lại mật khẩu của bạn");  // Tiêu đề email
            message.setText("Vui lòng nhấp vào liên kết sau để đặt lại mật khẩu của bạn: " + resetLink);  // Nội dung email

            // Gửi email
            Transport.send(message);
            System.out.println("Email đã được gửi thành công");

        } catch (MessagingException e) {
            System.out.println("Gửi email thất bại: " + e.getMessage());
            e.printStackTrace();  // In ra lỗi chi tiết để kiểm tra
        }
    }

    public static void main(String[] args) {
        EmailUtil emailUtil = new EmailUtil();
        emailUtil.sendResetPasswordLink("22130185@st.hcmuaf.edu.vn"); // Đảm bảo đây là email hợp lệ
    }
}
