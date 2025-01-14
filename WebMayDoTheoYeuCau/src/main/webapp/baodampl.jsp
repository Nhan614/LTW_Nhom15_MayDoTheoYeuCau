<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bảo đảm pháp lý - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

    <style>
        .product-warranty {
            background-color: #f9f9f9;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            font-family: Arial, sans-serif;
            margin: 20px auto;
            width: 80%;
            max-width: 1200px;
        }

        .warranty h1 {
            font-size: 40px;
            font-weight: bold;
            color: #151515;
            text-align: center;
            margin: 60px;

        }

        .product-warranty .warranty-afk h4 {
            font-size: 24px;
            font-weight: bold;
            color: #1a73e8;
            margin-bottom: 40px;
            text-align: center;
        }

        .product-warranty .warranty-afk p {
            font-size: 16px;
            line-height: 1.6;
            color: #444;
            margin-bottom: 12px;
            text-align: justify;
        }

        .product-warranty .warranty-afk ul {
            list-style-type: disc;
            margin-left: 20px;
            color: #444;
            text-align: left;
        }

        .product-warranty .warranty-afk ul li {
            font-size: 16px;
            margin-bottom: 10px;
        }

        .product-warranty .warranty-afk a {
            color: #1a73e8;
            text-decoration: none;
        }

        .product-warranty .warranty-afk a:hover {
            text-decoration: underline;
        }

        .product-warranty .warranty-afk strong {
            font-weight: bold;
            color: #333;
        }

        .product-warranty .warranty-afk h4,
        .product-warranty .warranty-afk p {
            margin-top: 0;
            margin-bottom: 15px;
        }

        .product-warranty .warranty-afk p:last-of-type {
            margin-bottom: 0;
        }



        .product-warranty .warranty-afk ul li {
            color: #d9534f;
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
        <div class="warranty">
            <h1>Bảo đảm pháp lý</h1>

            <div class="product-warranty">
                <div class="warranty-afk">

                    <h4>Đảm Bảo Phù Hợp Pháp Lý và Quyền Lợi Người Tiêu Dùng</h4>

                    <p>Sản phẩm được bán qua Website này hoàn toàn tuân thủ theo quy định pháp luật hiện hành. Người Bán
                        tôn
                        trọng và bảo vệ quyền lợi của người tiêu dùng theo bảo hành pháp lý của EU và chịu trách nhiệm
                        về
                        bất kỳ
                        khiếm khuyết nào xuất hiện trong vòng hai năm kể từ ngày giao hàng, theo luật pháp Việt Nam.
                        Quyền
                        bảo
                        hành pháp lý này chỉ áp dụng cho trường hợp Khách Hàng là cá nhân mua sản phẩm cho mục đích sử
                        dụng
                        cá
                        nhân.</p>

                    <p>Để sản phẩm được coi là phù hợp với pháp luật, sản phẩm cần phải:</p>
                    <ul>
                        <li>Đúng như mô tả của Người Bán và có các đặc tính của hàng hóa mà Người Bán đã cung cấp như
                            mẫu
                            hoặc
                            mẫu thử cho Khách Hàng;</li>
                        <li>Phù hợp với mục đích cụ thể mà Khách Hàng yêu cầu và đã thông báo cho Người Bán vào thời
                            điểm ký
                            kết
                            hợp đồng và được Người Bán chấp nhận;</li>
                        <li>Phù hợp với mục đích sử dụng của các sản phẩm cùng loại;</li>
                        <li>Hiển thị chất lượng và hiệu suất như những sản phẩm cùng loại mà Khách Hàng có thể kỳ vọng,
                            dựa
                            trên
                            bản chất của sản phẩm và các tuyên bố công khai về các đặc tính cụ thể của sản phẩm do Người
                            Bán,
                            nhà sản xuất hoặc đại lý của họ đưa ra, đặc biệt trong quảng cáo hoặc trên nhãn mác.</li>
                    </ul>

                    <p>Những khiếm khuyết sau đây không được coi là "thiếu phù hợp":</p>
                    <ul>
                        <li>Sở thích cá nhân về sự thoải mái khi mặc trang phục;</li>
                        <li>Thiệt hại do cắt, cháy, cắt hình, chất lỏng hoặc vết bẩn do tác động của Khách Hàng;</li>
                        <li>Hư hỏng tự nhiên do quá trình sử dụng;</li>
                        <li>Mất cúc áo ở phần khóa;</li>
                        <li>Gãy kéo trong quá trình sử dụng do sự cố cơ học.</li>
                    </ul>

                    <p>Theo luật pháp Việt Nam, Khách Hàng sẽ mất quyền khiếu nại nếu Người Bán không nhận được thông
                        báo về
                        khiếm khuyết trong vòng hai tháng kể từ ngày phát hiện ra khiếm khuyết đó. Để thông báo khiếm
                        khuyết,
                        Khách Hàng vui lòng gửi thông báo bằng văn bản tới địa chỉ: <strong> Số 10, đường Nguyễn Văn Cừ,
                            Quận 1, TP. Hồ Chí Minh, Việt Nam</strong> hoặc qua email: <a
                            href="threentailored@gmail.com">threentailored@gmail.com</a>.</p>

                    <p>Trong mọi trường hợp, trừ khi có bằng chứng chứng minh khác, nếu khiếm khuyết xuất hiện trong
                        vòng
                        sáu
                        tháng kể từ ngày giao hàng, sẽ giả định rằng khiếm khuyết đó đã tồn tại từ ngày giao hàng.</p>

                    <p>Để được hưởng quyền bảo hành pháp lý, Khách Hàng cần cung cấp chứng từ chứng minh việc giao hàng
                        của
                        sản
                        phẩm, như hóa đơn mua hàng hoặc bất kỳ tài liệu nào khác chứng minh ngày mua (ví dụ: sao kê thẻ
                        tín
                        dụng) và ngày giao hàng.</p>

                    <p>Trong trường hợp sản phẩm không phù hợp, Khách Hàng có thể yêu cầu Người Bán sửa chữa sản phẩm
                        miễn
                        phí.
                        Nếu việc sửa chữa là không thể thực hiện hoặc quá tốn kém, Khách Hàng có thể yêu cầu giảm giá
                        hoặc
                        hủy
                        bỏ hợp đồng.</p>

                    <p>Người Bán sẽ trả lời Khách Hàng trong vòng bảy ngày kể từ ngày nhận được yêu cầu, thông báo về
                        việc
                        có
                        thể thực hiện yêu cầu hay không, hoặc lý do tại sao không thể thực hiện.</p>

                    <p>Trong trường hợp Người Bán chấp nhận yêu cầu của Khách Hàng, Người Bán sẽ chỉ định phương thức
                        gửi
                        hoặc
                        trả lại sản phẩm và thời gian sản phẩm bị lỗi phải được trả lại hoặc thay thế mà không phát sinh
                        chi
                        phí
                        cho Khách Hàng.</p>

                    <p>Trong trường hợp sửa chữa hoặc thay thế sản phẩm là không thể hoặc quá tốn kém, hoặc nếu Người
                        Bán
                        không
                        thực hiện việc sửa chữa hoặc thay thế trong thời gian quy định, hoặc nếu việc sửa chữa hoặc thay
                        thế
                        trước đó gây bất tiện lớn cho Khách Hàng, Người Bán có thể yêu cầu giảm giá hoặc hủy bỏ hợp đồng
                        theo
                        quyết định của mình. Khách Hàng không có quyền hủy bỏ hợp đồng nếu khiếm khuyết là không đáng
                        kể.
                    </p>

                    <p>Trong trường hợp Người Bán đồng ý yêu cầu của Khách Hàng, họ sẽ chỉ định mức giảm giá hoặc phương
                        thức
                        trả lại sản phẩm để hoàn lại toàn bộ giá bán theo yêu cầu của Khách Hàng.</p>
                </div>
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
    <script src="resources/js/backtotop.js"></script>
    <script src="resources/js/search.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
</body>


</html>