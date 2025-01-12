<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" data-theme="light">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
        type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/contactUs.css">
    <link rel="stylesheet" href="resources/css/style.css">
</head>

<body>

    <!-- header -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

    <!-- section 1 -->
    <div id="sec1">
        <div class="top-bar text-center py-2">
            <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>
    </div>

    <!----------------- contact us------------ -->

    <div class="contact">
        <div class="left-col">
            <img class="logo" src="resources/images/contactus.webp" alt="Contact Us">
        </div>
        <div class="right-col">
            <h1 class="contact-heading">Liên hệ với chúng tôi</h1>
            <form id="contact-form" method="post" action="ContactsController">
                <!-- Họ và Tên -->
                <label class="label-contact" for="name">Họ tên</label>
                <input type="text" id="name" name="name" class="input-field" placeholder="Họ và tên đầy đủ của bạn" required>

                <!-- Email -->
                <label class="label-contact" for="email">Địa chỉ Email</label>
                <input type="email" id="email" name="email" class="input-field" placeholder="Địa chỉ Email của bạn" required>

                <!-- Tin nhắn -->
                <label class="label-contact" for="message">Tin nhắn</label>
                <textarea rows="6" class="textarea-field" placeholder="Tin nhắn của bạn" id="message" name="message" required></textarea>

                <!-- Nút Gửi -->
                <button type="submit" id="submit" class="submit-btn" name="submit">Gửi</button>
            </form>
        </div>
    </div>


    <!-- -----đia chi lien he---- -->
    <div class="total-container">
        <div class="contact-info">
            <div class="contact-item">
                <h2 class="contact-title"><i class="fas fa-phone-alt"></i>PHONE</h2>
                <p class="contact-detail">028 6261 8888</p>
                <!-- <p class="contact-detail">t2-t6 9.00-18.00</p> -->
            </div>
            <div class="divider"></div>
            <div class="contact-item">
                <h2 class="contact-title"><i class="fas fa-envelope"></i>EMAIL</h2>
                <p class="contact-detail">threentailored@gmail.com</p>
            </div>

            <div class="divider"></div>
            <div class="contact-item">
                <h2 class="contact-title"><i class="fab fa-facebook-f"></i>FACEBOOK</h2>
                <p class="contact-detail">Ghé thăm trang chúng tôi</p>
                <p class="contact-detail">THREENTAILORED</p>
            </div>
            <div class="divider"></div>
            <div class="contact-item">
                <h2 class="contact-title"><i class="fas fa-map-marker-alt"></i>ĐỊA CHỈ</h2>
                <p class="contact-detail"> Số 10,Nguyễn Văn Cừ </p>
                <p class="contact-detail">Quận 1 ,TP.HCM</p>
            </div>
        </div>
    </div>



    <!-- bảo hành -->
    <div class="custom-container">
        <div class="custom-row text-center">
            <!-- Feature 1 -->
            <div class="col-md-3">
                <div class="feature-box">
                    <div class="feature-icon">
                        <i class="fas fa-mug-hot"></i>
                    </div>
                    <div class="feature-text"> <!-- Thêm class bao quanh -->
                        <h5>Free trà và cafe</h5>
                        <p>Tại showroom</p>
                    </div>
                </div>
            </div>
            <!-- Feature 2 -->
            <div class="col-md-3 ">
                <div class="feature-box">
                    <div class="feature-icon">
                        <i class="fas fa-truck"></i>
                    </div>
                    <div class="feature-text"> <!-- Thêm class bao quanh -->
                        <h5>Giao hàng</h5>
                        <p>Free ship đơn >3.500k</p>
                    </div>
                </div>
            </div>
            <!-- Feature 3 -->
            <div class="col-md-3">
                <div class="feature-box">
                    <div class="feature-icon">
                        <i class="fa-solid fa-money-check-dollar"></i>
                    </div>
                    <div class="feature-text"> <!-- Thêm class bao quanh -->
                        <h5>Thanh toán</h5>
                        <p>Bảo mật an toàn</p>
                    </div>
                </div>
            </div>
            <!-- Feature 4 -->
            <div class="col-md-3">
                <div class="feature-box">
                    <div class="feature-icon">
                        <i class="fas fa-shield-alt"></i>
                    </div>
                    <div class="feature-text"> <!-- Thêm class bao quanh -->
                        <h5>Bảo hành</h5>
                        <p>Lên đến 180 ngày</p>
                    </div>
                </div>
            </div>
        </div>
    </div>


    <!-- Footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <script src="vendors/bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/contactUs.js"></script>
    <script src="resources/js/backtotop.js"></script>


</body>


</html>