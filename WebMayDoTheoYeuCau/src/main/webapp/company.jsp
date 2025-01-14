<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dữ Liệu Công Ty - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

    <style>
        .company h1 {
            font-size: 40px;
            font-weight: bold;
            color: #151515;
            text-align: center;
            margin: 60px;
        }

        .company-info {
            margin: 30px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 8px;
            max-width: 1000px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.3);
        }

        .company-info h4 {
            font-size: 24px;
            font-weight: bold;
            margin-top: 20px;
            color: #090909;
        }

        .company-info p {
            font-size: 16px;
            color: #555;
            margin-bottom: 20px;
            line-height: 1.8;
            text-align: justify;
        }

        .company-info strong {
            font-weight: bold;
            color: #555;
        }

        .company-info ul {
            list-style-type: none;
            padding-left: 0;
            margin-bottom: 40px;
            text-align: left;
        }

        .company-info ul li {
            font-size: 16px;
            margin-bottom: 15px;
            line-height: 1.7;
            position: relative;
            padding-left: 25px;
        }

        .company-info ul li:before {
            content: "•";
            color: #1e3d58;
            font-size: 24px;
            position: absolute;
            left: 0;
            top: 0;
        }

        .company-info .culture p {
            margin-top: 20px;
        }

        .company-info h4+p {
            font-size: 16px;
            color: #444;
            margin-bottom: 20px;
        }

        .company-info a {
            color: #007BFF;
            text-decoration: none;
        }

        .company-info a:hover {
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
    <!--lam viec voi chung toi  -->


    <div class="container">
        <div class="company">
            <h1>Dữ Liệu Công Ty</h1>
            <div class="company-info">
                <h4>Công Ty TNHH Thời Trang THREEN TAILORED</h4>
                <ul>

                    <li><strong>Website:</strong> <a href="http://127.0.0.1:5500/home.html">www.threentailord.com</a></li>
                    <li><strong>Email:</strong> <a href="threentailored@gmail.com">threentailored@gmail.com</a></li>
                    <li><strong>Hotline:</strong>028 6261 8888</li>
                </ul>

                <h4>Thông Tin Đăng Ký Doanh Nghiệp</h4>
                <p><strong>Mã số thuế (MST):</strong> 0101234567</p>
                <p><strong>Số ĐKKD:</strong> 0101234567 cấp ngày 01/01/2024 tại Sở Kế hoạch và Đầu tư TP. Hồ Chí Minh
                </p>

                <h4>Địa Chỉ Công Ty</h4>
                <p><strong>Địa chỉ trụ sở chính:</strong> Số 10, đường Nguyễn Văn Cừ, Quận 1, TP. Hồ Chí Minh, Việt Nam
                </p>
                <p><strong>Chi nhánh:</strong></p>
                <ul>
                    <li><strong>Hà Nội:</strong> Số 25, đường Lê Văn Lương, Quận Cầu Giấy, TP. Hà Nội, Việt Nam</li>
                    <li><strong>Đà Nẵng:</strong> Số 50, đường Nguyễn Hoàng, Quận Hải Châu, TP. Đà Nẵng, Việt Nam</li>
                </ul>

                <h4>Giới Thiệu Về Công Ty</h4>
                <p>Công Ty TNHH Thời Trang THREEN TAILORED chuyên cung cấp các dịch vụ đặt may theo yêu cầu, thiết kế và sản
                    xuất
                    trang
                    phục cao cấp cho cá nhân và doanh nghiệp. Với đội ngũ thiết kế tài năng và nhà máy sản xuất đạt tiêu
                    chuẩn quốc tế, chúng tôi cam kết mang lại sản phẩm hoàn hảo, vừa vặn với từng khách hàng.</p>
                <p>Chúng tôi cung cấp các dịch vụ may đo cho các dòng sản phẩm như áo sơ mi, vest, váy, quần âu, đồng
                    phục
                    doanh nghiệp và trang phục sự kiện. Mỗi sản phẩm đều được chế tác từ chất liệu vải cao cấp, giúp
                    khách
                    hàng tự tin và thoải mái trong mọi hoàn cảnh.</p>

                <h4>Các Dịch Vụ Cung Cấp</h4>
                <ul>
                    <li><strong>May đo riêng:</strong> Dịch vụ may đo theo yêu cầu, từ chất liệu, kiểu dáng cho đến chi
                        tiết
                        hoàn thiện.</li>
                    <li><strong>Đồng phục công ty:</strong> Thiết kế và may đo đồng phục công ty chuyên nghiệp, thể hiện
                        phong cách và bản sắc doanh nghiệp.</li>
                    <li><strong>Trang phục sự kiện:</strong> May đo và thiết kế trang phục cho các sự kiện đặc biệt, từ
                        hội
                        nghị, hội thảo đến tiệc cưới, sự kiện lớn.</li>
                    <li><strong>Sửa chữa, điều chỉnh trang phục:</strong> Dịch vụ sửa chữa, điều chỉnh trang phục đã có
                        để
                        phù hợp hơn với nhu cầu sử dụng.</li>
                </ul>

                <h4>Cam Kết Chất Lượng</h4>
                <p>Với tiêu chí "Chất Lượng Là Tôn Chỉ", chúng tôi luôn lựa chọn những chất liệu vải tốt nhất và áp dụng
                    quy
                    trình may đo chính xác để sản phẩm không chỉ đẹp mà còn bền lâu. Đội ngũ nhân viên của THREEN TAILORED
                    luôn
                    đặt sự hài lòng của khách hàng lên hàng đầu, đảm bảo mỗi sản phẩm đều đáp ứng các yêu cầu về thiết
                    kế,
                    chất liệu và sự vừa vặn.</p>

                <h4>Tầm Nhìn và Sứ Mệnh</h4>
                <p><strong>Tầm nhìn:</strong> Trở thành thương hiệu may đo hàng đầu tại Việt Nam và quốc tế, mang đến
                    những
                    sản phẩm thời trang tinh tế, chất lượng cho mọi khách hàng.</p>
                <p><strong>Sứ mệnh:</strong> Mang đến cho khách hàng những trải nghiệm thời trang đẳng cấp, thể hiện
                    phong
                    cách cá nhân và sự tự tin trong mọi hoạt động.</p>

                <h4>Thông Tin Liên Hệ</h4>
                <p>Để biết thêm chi tiết về các dịch vụ và sản phẩm của chúng tôi, vui lòng liên hệ qua các kênh sau:
                </p>
                <ul>
                    <li><strong>Điện thoại:</strong> 028 6261 8888</li>
                    <li><strong>Facebook:</strong> <a href="https://facebook.com/THREEN TAILORED">THREEN TAILORED</a></li>
                    <li><strong>Twitter:</strong> THREEN TAILORED_vn</li>
                    <li><strong>YouTube:</strong> <a href="https://www.youtube.com/THREEN TAILORED">THREEN TAILORED-fashion</a>
                    </li>
                </ul>
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