<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thông tin vận chuyển - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">


    <style>
        .shipping h1 {
            font-size: 40px;
            font-weight: bold;
            color: #151515;
            text-align: center;
            margin: 60px;
        }

        .shipping-policy {
            margin: 30px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 8px;
            max-width: 1000px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.3);
        }

        .shipping-policy h4 {
            font-size: 24px;
            color: #333;
            margin-bottom: 15px;
            font-weight: 600;
        }

        .shipping-policy p {
            font-size: 16px;
            color: #555;
            line-height: 1.6;
            margin-bottom: 12px;
        }

        .shipping-policy ul {
            list-style-type: none;
            padding-left: 0;
        }

        .shipping-policy ul li {
            font-size: 16px;
            color: #555;
            margin-bottom: 8px;
            padding-left: 20px;
            position: relative;
        }

        .shipping-policy ul li::before {
            content: "•";
            color: #007bff;
            position: absolute;
            left: 0;
            top: 0;
        }

        .shipping-policy ol {
            padding-left: 20px;
            margin-bottom: 20px;
        }

        .shipping-policy ol li {
            font-size: 16px;
            color: #555;
            margin-bottom: 10px;
        }

        .shipping-policy strong {
            color: #007bff;
        }

        .shipping-policy a {
            color: #007bff;
            text-decoration: none;
        }

        .shipping-policy a:hover {
            text-decoration: underline;
        }

        .shipping-policy p:last-of-type {
            font-size: 14px;
            color: #888;
            text-align: center;
            margin-top: 20px;
        }

        .shipping-policy .shipping-note {
            font-size: 16px;
            color: #d9534f;
            font-weight: bold;
            margin-top: 20px;
            text-align: center;
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
    <!--van chuyen  -->

    <div class="container">
        <div class="shipping">
            <h1>Thông tin vận chuyển</h1>
            <div class="shipping-policy">
                <h4>Chính Sách Giao Hàng</h4>
                <p>Khi hoàn tất thanh toán, đơn hàng sẽ được hệ thống tiếp nhận và xử lý. Sau khi sản phẩm hoàn thiện,
                    chúng
                    sẽ được giao trực tiếp đến địa chỉ mà khách hàng đã cung cấp.</p>

                <p>Thời gian giao hàng của chúng tôi dao động từ 3 đến 4 tuần, tùy thuộc vào tình trạng sẵn có của
                    nguyên
                    liệu và các yếu tố ngoài tầm kiểm soát của <strong>[THREEN TAILORED]</strong>. Chúng tôi không thể cam
                    kết chính xác thời gian giao hàng. Thời gian giao hàng cụ thể sẽ được thông báo ngay khi khách hàng
                    chọn
                    sản phẩm và các yêu cầu tùy chỉnh.</p>

                <h4>Làm thế nào để nhận hàng?</h4>
                <p><strong>[THREEN TAILORED]</strong> giao hàng đến mọi nơi trên thế giới trong vòng 35 ngày kể từ khi Xác
                    Nhận Đơn Hàng*, qua dịch vụ chuyển phát nhanh (DHL) đến địa chỉ mà khách hàng cung cấp khi mua hàng.
                </p>

                <p>Phí vận chuyển, bao gồm thuế nhập khẩu (nếu có), sẽ miễn phí đối với các đơn hàng có giá trị trên
                    3.500.000 VND.</p>

                <p>Sau khi gửi hàng, khách hàng sẽ nhận được một email thông báo về tên đơn vị vận chuyển và thông tin
                    để
                    theo dõi tình trạng giao hàng trực tuyến. Khách hàng có thể theo dõi quá trình giao hàng thông qua
                    trang
                    cá nhân của mình hoặc trên website của đơn vị vận chuyển.</p>

                <p>Kể từ thời điểm gửi hàng, giao hàng sẽ được thực hiện trong:</p>
                <ul>
                    <li><strong>1-5 ngày làm việc</strong> đối với các đơn hàng nội địa.</li>
                </ul>

                <h4>Xin Lưu Ý</h4>
                <p> Đôi khi đơn hàng có thể mất nhiều thời gian hơn một chút do thời gian vận
                    chuyển của bên chuyển phát nhanh, đặc biệt là đối với các đơn hàng quốc tế .</p>

                <p> Sẽ có sự chậm trễ khoảng 2 tuần khi đơn hàng được đặt vào tháng 1, do Tết
                    Nguyên đán. Trong trường hợp này, mọi thay đổi về thời gian giao hàng sẽ được thông báo qua email
                    cho
                    khách hàng.</p>
                <p> Ngày làm việc được tính từ Thứ Hai đến Thứ Sáu.</p>

                <p>*Thời gian giao hàng có thể thay đổi tùy thuộc vào phương thức thanh toán và ngày xác nhận số đo cơ
                    thể
                    của khách hàng. Trong trường hợp có ngày lễ, có thể có sự chậm trễ do việc tạm ngừng hoạt động của
                    các
                    nhà xưởng sản xuất. Mọi thay đổi về thời gian giao hàng sẽ được thông báo qua email cho khách hàng.
                </p>

                <h4>Tôi chưa nhận được đơn hàng, phải làm sao?</h4>
                <p>Nếu đơn hàng chưa được giao trong thời gian dự kiến và bạn chưa nhận được thông báo hoặc cập nhật nào
                    về
                    tình trạng đơn hàng, vui lòng thực hiện các bước sau:</p>
                <ol>
                    <li>Kiểm tra trạng thái đơn hàng qua tài khoản của bạn tại khu vực <strong>Tài Khoản > Đơn
                            Hàng</strong>.</li>
                    <li>Kiểm tra lại thông tin địa chỉ giao hàng.</li>
                    <li>Nếu trạng thái đơn hàng là "Đã gửi", vui lòng liên hệ với đơn vị vận chuyển
                        (<strong>DHL</strong>).
                    </li>
                    <li>Nếu đơn hàng bị giao thất bại, vui lòng liên hệ với DHL để yêu cầu hỗ trợ.</li>
                </ol>


                <p>Nếu bạn cần thêm sự hỗ trợ, đừng ngần ngại liên hệ với chúng tôi. Chúng tôi luôn sẵn sàng hỗ trợ bạn!
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
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>

</body>


</html>