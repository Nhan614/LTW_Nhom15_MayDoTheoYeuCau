<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    
</head>
<body>
<div id="footer">
    <!-- back-to-top -->
    <a href="#" class="contact-btn shadow" onclick="toggleContactMenu(event)">
        <i class="fa-regular fa-comment-dots"></i>
        <span class="contact-text">Liên Hệ</span>
    </a>
    <div class="contact-menu">
        <div class="contact-item-ak">
            <a href="https://www.facebook.com/"><i class="fa-brands fa-facebook"></i></a> Facebook
        </div>
        <div class="contact-item-ak">
            <a href="contactUs.jsp"><i class="fa-solid fa-envelope"></i></a> Email
        </div>
        <div class="contact-item-ak">
            <a href="https://x.com/i/flow/login"><i class="fa-brands fa-x-twitter"></i></a> Twitter
        </div>
        <div class="contact-item-ak">
            <a href="https://www.instagram.com/"><i class="fa-brands fa-instagram"></i> Instagram</a>

        </div>
    </div>

    <a href="#" class="back-to-top">
        <i class="fa-solid fa-arrow-up"></i>
    </a>

    <footer class="footer text-center py-4">
        <div class="footer-container">

            <!-- Customer Service Section -->
            <div class="footer-section">
                <h3>Dịch vụ khách hàng</h3>
                <ul>
                    <li><a href="cauhoitg.jsp">Câu hỏi thường gặp</a></li>
                    <li><a href="baodampl.jsp">Bảo đảm pháp lý</a></li>
                    <li><a href="trahang.jsp">Chính sách trả hàng</a></li>
                    <li><a href="vanchuyen.jsp">Thông tin vận chuyển</a></li>
                </ul>
            </div>

            <!-- Corporate Section -->
            <div class="footer-section">
                <h3>Doanh nghiệp</h3>
                <ul>
                    <li><a href="aboutUs.jsp">Về chúng tôi</a></li>
                    <li><a href="hoptac.jsp">Hợp tác với chúng tôi</a></li>
                    <li><a href="company.jsp">Dữ liệu công ty</a></li>
                    <li><a href="blog.jsp">Tin Tức</a></li>
                </ul>
            </div>

            <!-- Find Us On Section -->
            <div class="footer-section">
                <h3>Tìm chúng tôi trên</h3>
                <div class="social-icons">
                    <a href="https://www.facebook.com/"><i class="fab fa-facebook"></i></a>
                    <a href="https://x.com/i/flow/login"><i class="fa-brands fa-x-twitter"></i></a>
                    <a href="https://www.instagram.com/"><i class="fa-brands fa-instagram"></i></a>
                </div>
            </div>

            <!-- Newsletter Signup Section -->
            <div class="footer-section">
                <h3>Đăng ký nhận thông báo của chúng tôi</h3>
                <form class="newsletter-form">
                    <input type="email" placeholder="Nhập email của bạn" required>
                    <button type="submit">Đăng ký</button>
                </form>
            </div>
        </div>
        <div class="container">
            <p>&copy; 2024 Cửa hàng may vest theo yêu cầu. Mọi quyền được bảo lưu.</p>
            <ul class="list-inline">
                <li class="list-inline-item"><a href="baomat.jsp">Chính sách bảo mật</a></li>
                <li class="list-inline-item"><a href="dieukhoan.jsp">Điều khoản và điều kiện</a></li>
                <li class="list-inline-item"><a href="contactUs.jsp">Liên hệ với chúng tôi</a></li>
            </ul>
        </div>
    </footer>
</div>
</body>
</html>