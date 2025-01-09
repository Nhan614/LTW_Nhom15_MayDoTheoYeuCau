<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quên mật khẩu - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/forgotPassword.css">
    <link rel="stylesheet" href="resources/css/style.css">
</head>

<body>

    <!-- header -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>
    <!-- Trang Forgot Password -->
    <div id="sec1">
        <div class="security-note">
            <span>
                Vì lý do bảo mật, chúng tôi KHÔNG lưu trữ mật khẩu của bạn. Vì vậy, hãy yên tâm rằng chúng tôi sẽ không
                bao giờ gửi lại mật khẩu của bạn qua email.

            </span>
        </div>
    </div>


    <div class="password-reset">
        <div class="container">
            <div class="password-reset-wrapper">
                <h1 class="reset-header">Quên mật khẩu?</h1>
                <p class="reset-description">Nhập email của bạn và chúng tôi sẽ gửi cho bạn hướng dẫn để đặt lại mật khẩu.</p>
                <!-- Form gửi email -->

                <form action="Fogotpassword" method="post">
                    <div class="email-input-group">
                        <label for="email" class="email-label">VUI LÒNG NHẬP EMAIL CỦA BẠN</label>
                        <div class="email-input-box">
                            <i class="fa-solid fa-envelope email-icon"></i>
                            <input type="email" id="email" name="email" class="email-input" placeholder="Email"  required>
                        </div>
                    </div>
                    <button type="submit" class="reset-button">Đặt lại mật khẩu</button>
                </form>


                <%-- Hiển thị thông báo nếu có --%>
                <%
                    String successMessage = (String) request.getAttribute("successMessage");
                    String errorMessage = (String) request.getAttribute("errorMessage");
                %>

                <%-- Hiển thị thông báo thành công --%>
                <% if (successMessage != null) { %>

                    <div  style="margin-top: 10px; color: #0f5132">
                    <%= successMessage %>
                </div>
                <% } %>

                <%-- Hiển thị thông báo lỗi --%>
                <% if (errorMessage != null) { %>
                <div  style="margin-top: 10px; color: red">
                    <%= errorMessage %>
                </div>
                <% } %>



                <div class="auth-links">
                    <a href="login.jsp#login-form" class="login-link">Đăng nhập</a>
                    <a href="login.jsp#signup-form" class="register-link">Đăng ký</a>
                </div>
            </div>
        </div>
    </div>




    <!-- footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/forgotPassword.js"></script>
    <script src="resources/js/backtotop.js"></script>

</body>


</html>