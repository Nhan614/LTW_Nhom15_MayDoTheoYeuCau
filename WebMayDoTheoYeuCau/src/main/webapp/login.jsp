
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign up - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/signup.css">
    <link rel="stylesheet" href="resources/css/style.css">


    <style>
        .error-message {
            color: white;
            padding: 0 ;
            font-size: 11px;
            font-weight: bold;
            margin-bottom: 0;
            margin-top: 5px;
        }
        .wrapper .form-box.register{
            right: 0;
            padding: 0 30px 10px 70px;
            /* display: none;   */
            pointer-events: none;
        }
    </style>
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

    <!----------------- login------------ -->
    <div class="signup">
        <div class="container">
            <div class="wrapper">
                <span class="bg-animate"></span>
                <span class="bg-animate2"></span>


                <div class="form-box login" id="login-form">
                    <h2 class="animation" style="--i:0; --j:11">Đăng nhập</h2>

<%--                    <%--%>
<%--                        String error= (String) request.getAttribute("error");--%>
<%--                        String email= request.getParameter("email");--%>
<%--                        if(error==null) error = "";--%>
<%--                        if(email==null) email = "";--%>
<%--                    %>--%>
<%--&lt;%&ndash;                    <p><%= error %></p>&ndash;%&gt;--%>
<%--                    <p class="error-message"><%= error %></p>--%>

<%--                    <%--%>
<%--                        String loginError = (String) request.getAttribute("error");--%>
<%--                        String email = request.getParameter("email");--%>
<%--                        if (email == null) email = "";--%>
<%--                    %>--%>


                    <%
                        String loginError = (String) session.getAttribute("loginError");
                        String email = (String) session.getAttribute("email");
                        if (email == null) email = "";
                        if (loginError != null) {
                    %>
                    <p class="error-message"><%= loginError %></p>
                    <%
                            session.removeAttribute("loginError");
                            session.removeAttribute("email");
                        }
                    %>

                    <form action="login" method="post">
                        <div class="input-box animation" style="--i:1; --j:12">
                            <input type="text" id="email" value="<%= email%>" name="email" required>
                            <label>Email:</label>
                            <i class="fa-solid fa-user"></i>

<%--//                            <% if (loginError != null && loginError.contains("email")) { %>--%>
<%--//                            <p class="error-message"><%= loginError %></p>--%>
<%--//                            <% } %>--%>
                        </div>

                        <div class="input-box animation" style="--i:2; --j:13">
                            <input type="password" id="pass" name="pass" required>
                            <label>Mật khẩu:</label>
                            <i class="fa-solid fa-lock"></i>

<%--                            <% if (loginError != null && loginError.contains("pass")) { %>--%>
<%--                            <p class="error-message"><%= loginError %></p>--%>
<%--                            <% } %>--%>
                        </div>
                        <div class="forgot-password animation" style="--i:3;--j:14">
                            <p><a href="forgotPassword.jsp" class="password-link">Bạn quên mật khẩu?</a></p>
                        </div>
                        <button type="submit" class="btn animation"
                                style="--i:4; --j:15">Đăng nhập </button>
                        <div class="logreg-link animation" style="--i:5; --j:16">
                            <p>Bạn chưa có tài khoản? <a href="#" class="register-link">Đăng ký</a></p>

                        </div>

                        <div class="social-login animation" style="--i:6; --j:17">

                            <div class="social-icons">
                                <a href="https://www.facebook.com/" class="facebook">
                                    <i class="fa-brands fa-facebook"></i>
                                </a>
                                <a href="https://accounts.google.com/v3/signin/identifier?btmpl=mobile_tier2&hl=vi&ifkv=AcMMx-dQ3dmF8saNwEe_mUVV2mJlv-pLRFpjQkY7qUj6eNgCHa_DfAzFxgRU70vPIcKAtXuh1jjeUQ&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1763089054%3A1732624929726221&ddm=1"
                                    class="google">
                                    <i class="fa-brands fa-google"></i>
                                </a>
                                <a href="https://x.com/i/flow/login" class="twitter">
                                    <i class="fa-brands fa-x-twitter"></i>
                                </a>
                                <a href="https://www.instagram.com/" class="instagram">
                                    <i class="fa-brands fa-instagram"></i>
                                </a>
                            </div>
                        </div>

                    </form>

                </div>
                <div class="info-text login">
                    <h2 class="animation" style="--i:0; --j:11">Chào mừng trở lại!</h2>
                    <p class="animation" style="--i:1;--j:12">Nhập thông tin của bạn và bắt đầu hành trình với chúng tôi
                    </p>
                </div>

                <!-- sign up------- -->

                <div class="form-box register" id="signup-form">
                    <h2 class="animation" style="--i:17; --j:0">Đăng ký</h2>

<%--                    <%--%>
<%--                        String gmail = (String) request.getAttribute("gmail");--%>
<%--                        String fullname = (String) request.getAttribute("fullname");--%>
<%--                        String password = (String) request.getAttribute("password");--%>
<%--                        String emailExist = (String) request.getAttribute("emailExist");--%>

<%--                        gmail = (gmail == null ? "" : gmail);--%>
<%--                        fullname = (fullname == null ? "" : fullname);--%>
<%--                        password = (password == null ? "" : password);--%>
<%--                        emailExist = (emailExist == null ? "" : emailExist);--%>
<%--                    %>--%>
                    <%
                        String signupError = (String) request.getAttribute("error");
                        String fullname = request.getParameter("fullName");
                        String gmail = request.getParameter("gmailRe");
                        if (fullname == null) fullname = "";
                        if (gmail == null) gmail = "";
                    %>

                    <% if (signupError != null && !signupError.isEmpty()) { %>
                    <p class="error-message"><%= signupError %></p>
                    <% } %>


                    <form action="signupController" method="POST">
                        <div class="input-box animation" style="--i:18; --j:1">
                            <input type="text"  id="fullName" name="fullName" value="<%=fullname%>" required>
                            <label>Tên:</label>
                            <i class="fa-solid fa-user"></i>


<%--//                            <% if (signupError != null && signupError.contains("fullname")) { %>--%>
<%--//                            <p class="error-message"><%= signupError %></p>--%>
<%--//                            <% } %>--%>
                        </div>
                        <div class="input-box animation" style="--i:19; --j:2">
                            <input type="text" id="gmailRe" name="gmailRe" value="<%=gmail%>" required>
                            <label>E-mail:</label>
                            <i class="fa-solid fa-envelope"></i>

<%--//                            <% if (signupError != null && signupError.contains("email")) { %>--%>
<%--//                            <p class="error-message"><%= signupError %></p>--%>
<%--//                            <% } %>--%>

                        </div>

                        <div class="input-box animation" style="--i:20; --j:3">
                            <input type="password" id="passwordRe" name="passwordRe" value="<%=gmail%>" required>
                            <label>Mật khẩu:</label>
                            <i class="fa-solid fa-lock"></i>


<%--//                            <% if (signupError != null && signupError.contains("password")) { %>--%>
<%--//                            <p class="error-message"><%= signupError %></p>--%>
<%--//                            <% } %>--%>
                        </div>
                        <div class="input-box animation" style="--i:21; --j:4">
                            <input type="password" id="confirmPasswordRe" name="confirmPasswordRe" required>
                            <label>Xác minh mật khẩu:</label>


<%--//                            <% if (signupError != null && signupError.contains("confirmPassword")) { %>--%>
<%--//                            <p class="error-message"><%= signupError %></p>--%>
<%--//                            <% } %>--%>
                        </div>

                        <button type="submit" class="btn animation" style="--i:22; --j:5">Đăng ký </button>
                        <div class="logreg-link animation" style="--i:23; --j:6">
                            <p>Bạn đã có tài khoản? <a href="#" class="login-link">Đăng nhập</a></p>

                        </div>
                    </form>



                </div>

                <div class="info-text register">
                    <h2 class="animation" style="--i:17; --j:0">Xin chào bạn</h2>
                    <p class="animation" style="--i:18; --j:1">Hãy đăng ký tài khoản để bắt đầu trải nghiệm dịch vụ ngay
                        hôm nay!</p>
                </div>
            </div>

        </div>
    </div>

    <!-- Footer -->
    <div id="footer"> <%@include file="resources/data/footer.jsp"%> </div>


<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/signup.js"></script>
    <script src="resources/js/backtotop.js"></script>

</body>


</html>