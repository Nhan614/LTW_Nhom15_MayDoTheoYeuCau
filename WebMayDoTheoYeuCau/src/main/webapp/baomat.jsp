<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bảo mật - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

    <style>
        .privacy h1 {
            font-size: 40px;
            font-weight: bold;
            color: #151515;
            text-align: center;
            margin: 60px;
        }

        .privacy-policy {
            margin: 30px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 8px;
            max-width: 1000px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.3);
        }

        .privacy-policy h4 {
            font-size: 24px;
            font-weight: bold;
            margin-top: 20px;
            color: #090909;
        }

        .privacy-policy p {
            font-size: 16px;
            color: #555;
            margin-bottom: 20px;
            line-height: 1.8;
            text-align: justify;
        }

        .privacy-policy strong {
            font-weight: bold;
            color: #555;
        }

        .privacy-policy ul {
            list-style-type: none;
            padding-left: 0;
            margin-bottom: 40px;
            text-align: left;
        }

        .privacy-policy ul li {
            font-size: 16px;
            margin-bottom: 15px;
            line-height: 1.7;
            position: relative;
            padding-left: 25px;
        }

        .privacy-policy ul li:before {
            content: "•";
            color: #1e3d58;
            font-size: 24px;
            position: absolute;
            left: 0;
            top: 0;
        }

        .privacy-policy .culture p {
            margin-top: 20px;
        }

        .privacy-policy h4+p {
            font-size: 16px;
            color: #444;
            margin-bottom: 20px;
        }

        .privacy-policy a {
            color: #007BFF;
            text-decoration: none;
        }

        .privacy-policy a:hover {
            text-decoration: underline;
        }

        /* bảo hành */
        .feature-box {
            background-color: #e0e0e0;
            border: 1px solid #d1d1d1;
            padding: 15px;
            display: flex;
            align-items: center;
            gap: 45px;
            justify-items: center;
            text-align: center;
            padding-left: 60px;
        }

        .feature-icon {
            font-size: 3rem;
            display: flex;
            justify-items: center;
            align-items: center;
            color: #333;
            padding-bottom: 5px;
        }

        .feature-text {
            text-align: center;
            margin-top: 15px;
        }

        .custom-container {
            margin: 0 auto;
        }

        .custom-row {
            display: flex;
            flex-wrap: wrap;
            margin-right: -15px;
            margin-left: -15px;
        }

        .custom-row>[class*="col-"] {
            padding-right: 1px;
            padding-left: 1px;
        }
    </style>


</head>

<body>
    <!-- Header -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

    <section id="sec1">
        <!--Top Bar-->
        <div class="top-bar text-center py-2">
            <a href="#">GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</a>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>
    </section>
    <div class="container">
        <div class="privacy">
            <h1>Chính Sách Bảo Mật</h1>

            <div class="privacy-policy">

                <h4>Thông Tin Chung Về Chính Sách Bảo Mật</h4>
                <p>
                    Chào mừng bạn đến với trang web chính thức của chúng tôi tại <a
                        href="http://127.0.0.1:5500/home.html">www.threentailored.com</a>
                    ("Trang Web").
                    Chúng tôi khuyến nghị bạn đọc kỹ Chính Sách Bảo Mật này. Chính sách này áp dụng mỗi khi bạn truy cập
                    vào
                    Trang Web
                    và sử dụng các dịch vụ mà chúng tôi cung cấp, dù bạn có thực hiện mua sắm hay không.
                </p>
                <p>
                    Khi bạn truy cập Trang Web hoặc gửi email thông qua mục "Liên Hệ" hoặc đến địa chỉ email được cung
                    cấp
                    trên Trang Web,
                    chúng tôi có thể thu thập và xử lý dữ liệu cá nhân liên quan đến bạn.
                </p>
                <p>
                    Chính sách này nhằm cung cấp thông tin rõ ràng, minh bạch về cách chúng tôi xử lý dữ liệu cá nhân
                    của
                    bạn, đồng thời
                    tuân thủ các quy định pháp luật Việt Nam về bảo vệ dữ liệu cá nhân.
                </p>
                <p>
                    Nếu bạn cần thêm thông tin hoặc có bất kỳ thắc mắc nào, vui lòng liên hệ với chúng tôi qua mục "Liên
                    Hệ"
                    trên Trang Web
                    và chọn lý do "Bảo Mật" để được hỗ trợ.
                </p>

                <h4>1. Đơn Vị Quản Lý Dữ Liệu</h4>
                <p>
                    <strong>Đơn vị quản lý dữ liệu</strong> là Công Ty TNHH Thương Hiệu Việt, có địa chỉ tại Số 10,
                    đường
                    Nguyễn Văn Cừ, Quận 1, TP. Hồ Chí Minh, Việt Nam, mã số thuế 0101234567. Công ty chịu trách nhiệm
                    xác định mục đích và phương thức
                    xử lý dữ liệu cá nhân của khách hàng.
                </p>

                <h4>2. Mục Đích Xử Lý Dữ Liệu và Cơ Sở Pháp Lý</h4>

                <p><strong>2.1. Thu Thập Dữ Liệu</strong></p>
                <p>
                    Chúng tôi thu thập dữ liệu cá nhân và các thông tin khác trực tiếp từ bạn trong quá trình:
                </p>
                <ul>
                    <li>Đăng ký tài khoản trực tuyến.</li>
                    <li>Tham gia các chương trình khuyến mãi hoặc ưu đãi đặc biệt.</li>
                    <li>Đặt hàng và thanh toán qua hệ thống thương mại điện tử trên Trang Web.</li>
                </ul>
                <p>
                    Dữ liệu được thu thập để đáp ứng các yêu cầu của bạn và chỉ được sử dụng trong phạm vi cho phép,
                    hoặc được chia sẻ với bên thứ ba khi cần thiết để cung cấp dịch vụ.
                </p>

                <p><strong>2.2. Mục Đích Xử Lý và Cơ Sở Pháp Lý</strong></p>
                <p>
                    Chúng tôi sử dụng dữ liệu cá nhân của bạn để:
                </p>
                <ul>
                    <li>
                        <strong>Cung cấp dịch vụ:</strong> Đăng ký tài khoản, truy cập các khu vực riêng, hoặc các tiện
                        ích khác.
                    </li>
                    <li>
                        <strong>Gửi bản tin:</strong> Cập nhật thông tin khuyến mãi, sản phẩm mới hoặc các sự kiện đặc
                        biệt qua email (nếu bạn đồng ý).
                    </li>
                    <li>
                        <strong>Hỗ trợ khách hàng:</strong> Giải quyết các thắc mắc liên quan đến sản phẩm và dịch vụ.
                    </li>
                    <li>
                        <strong>Hoàn tất giao dịch mua sắm:</strong> Thu thập thông tin như địa chỉ giao hàng, phương
                        thức thanh toán, và số điện thoại liên hệ.
                    </li>
                    <li>
                        <strong>Khắc phục sự cố:</strong> Xử lý các vấn đề kỹ thuật hoặc cải thiện trải nghiệm người
                        dùng trên Trang Web.
                    </li>
                    <li>
                        <strong>Phòng chống gian lận:</strong> Bảo vệ hệ thống và người dùng khỏi các hành vi trái phép
                        hoặc có hại.
                    </li>
                    <li>
                        <strong>Cá nhân hóa trải nghiệm:</strong> Lưu sản phẩm yêu thích vào giỏ hàng hoặc đề xuất sản
                        phẩm phù hợp với sở thích của bạn.
                    </li>
                    <li>
                        <strong>Hoạt động marketing:</strong>
                        <ul>
                            <li>Gửi thông tin quảng cáo, khuyến mãi qua email, tin nhắn, hoặc các phương tiện liên lạc
                                khác.
                            </li>
                            <li>Thực hiện khảo sát để nâng cao chất lượng dịch vụ và sản phẩm.</li>
                            <li>Phân tích hành vi người dùng để đề xuất các dịch vụ phù hợp với nhu cầu của bạn.</li>
                        </ul>
                    </li>
                </ul>
                <p>
                    Các hoạt động tiếp thị và phân tích sẽ chỉ được thực hiện khi có sự đồng ý của bạn.
                </p>

                <h4>Kết Luận</h4>
                <p>
                    Nếu bạn có bất kỳ thắc mắc nào về Chính Sách Bảo Mật, hoặc muốn rút lại sự đồng ý đã cung cấp, vui
                    lòng liên hệ với chúng tôi qua mục <a href="contactUs.jsp">"Liên Hệ"</a> trên Trang Web. Chúng tôi
                    luôn sẵn sàng hỗ trợ bạn.
                </p>
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

    <!-- js -->
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/search.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>

</body>


</html>