<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Điều Khoản - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

    <style>
        .terms h1 {
            font-size: 40px;
            font-weight: bold;
            color: #151515;
            text-align: center;
            margin: 60px;
        }

        .terms-and-conditions {
            margin: 30px auto;
            padding: 20px;
            background-color: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 8px;
            max-width: 1000px;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.3);
        }

        .terms-and-conditions h4 {
            font-size: 24px;
            font-weight: bold;
            margin-top: 20px;
            color: #090909;
        }

        .terms-and-conditions p {
            font-size: 16px;
            color: #555;
            margin-bottom: 20px;
            line-height: 1.8;
            text-align: justify;
        }

        .terms-and-conditions strong {
            font-weight: bold;
            color: #555;
        }

        .terms-and-conditions ul {
            list-style-type: none;
            padding-left: 0;
            margin-bottom: 40px;
            text-align: left;
        }

        .terms-and-conditions ul li {
            font-size: 16px;
            margin-bottom: 15px;
            line-height: 1.7;
            position: relative;
            padding-left: 25px;
        }

        .terms-and-conditions ul li:before {
            content: "•";
            color: #1e3d58;
            font-size: 24px;
            position: absolute;
            left: 0;
            top: 0;
        }

        .terms-and-conditions .culture p {
            margin-top: 20px;
        }

        .terms-and-conditions h4+p {
            font-size: 16px;
            color: #444;
            margin-bottom: 20px;
        }

        .terms-and-conditions a {
            color: #007BFF;
            text-decoration: none;
        }

        .terms-and-conditions a:hover {
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
        <div class="terms">
            <h1>Điều Khoản và Điều Kiện </h1>
            <div class="terms-and-conditions">

                <h4>1. ĐỊNH NGHĨA VÀ ĐỐI TƯỢNG CỦA HỢP ĐỒNG</h4>

                <p>1.1 Hợp đồng này (sau đây gọi là “Hợp Đồng”), là một hợp đồng từ xa, được điều chỉnh bởi Điều 50 của
                    Nghị
                    định 6 tháng 9 năm 2005, số 206 (“Luật Người Tiêu Dùng”). Hợp đồng này có đối tượng là việc bán các
                    sản
                    phẩm cá nhân giữa công ty <strong>[N3TAILORED]</strong>, <strong>[Tại số 10, đường Nguyễn Văn Cừ,
                        Quận
                        1, TP. Hồ Chí Minh, Việt Nam]</strong>, mã số thuế
                    <strong>[0101234567]</strong> (“N3TAILORED”) và khách hàng (gọi là “Khách Hàng A”). Hợp đồng sẽ được
                    coi
                    là đã ký kết khi Thương Hiệu chấp nhận đề nghị mua hàng của Khách Hàng qua điện thoại hoặc thông qua
                    trang web <a href="http://127.0.0.1:5500/home.html">www.n3tailored.com</a> và/hoặc các hệ thống bán
                    hàng
                    từ xa khác của Thương Hiệu,
                    theo các thủ tục được mô tả trong Điều 3 dưới đây.
                </p>

                <p>1.2 Các Điều Khoản Bán Hàng này (“Điều Khoản Bán Hàng”) và, đặc biệt là các thông tin liên quan đến
                    Điều
                    59 của Luật Người Tiêu Dùng, như đã cung cấp bởi Thương Hiệu trong quá trình bán hàng, được nhắc lại
                    qua
                    điện thoại cho Khách Hàng và có mặt trên trang web, sẽ có hiệu lực cho đến khi có bất kỳ sửa đổi và
                    bổ
                    sung nào của Thương Hiệu. Các sửa đổi và bổ sung này sẽ có hiệu lực từ ngày được thông báo công khai
                    và
                    sẽ áp dụng cho các giao dịch bán hàng kể từ ngày đó. Phiên bản mới nhất của Điều Khoản Bán Hàng sẽ
                    có
                    trên trang web.</p>

                <h4>2. GIÁ CẢ</h4>

                <p>2.1 Giá của các sản phẩm được hiển thị trong quá trình bán hàng, trên trang web và/hoặc qua các hệ
                    thống
                    bán hàng từ xa khác của Thương Hiệu bao gồm VAT và tất cả các loại thuế khác. Phí vận chuyển sẽ được
                    hiển thị trong quá trình mua hàng, trên trang web và/hoặc qua các hệ thống bán hàng từ xa khác của
                    Thương Hiệu.</p>

                <p>2.2 Giá của tất cả các sản phẩm được hiểu là đã bao gồm VAT và tất cả các loại thuế khác. Ngoài giá
                    sản
                    phẩm, có thể sẽ có thêm phí vận chuyển tùy thuộc vào địa chỉ của Khách Hàng.</p>

                <h4>3. PHƯƠNG THỨC MUA HÀNG VÀ THANH TOÁN</h4>

                <p>3.1 Hợp đồng sẽ được coi là đã hoàn tất khi Khách Hàng thanh toán và nhận được xác nhận đơn hàng từ
                    Thương Hiệu.</p>

                <p>3.2 Khách Hàng có quyền hủy hợp đồng trong vòng 24 giờ kể từ khi xác nhận đơn hàng và nhận lại toàn
                    bộ số
                    tiền đã thanh toán mà không bị phạt và không cần nêu lý do. Sau 24 giờ, việc hủy hợp đồng sẽ không
                    còn
                    khả thi vì quá trình sản xuất trang phục may đo đã bắt đầu.</p>

                <p>3.3 Khách Hàng có thể chọn một trong các phương thức thanh toán sau: thẻ tín dụng, thẻ trả trước,
                    Paypal,
                    chuyển khoản ngân hàng hoặc bất kỳ phương thức thanh toán nào mà Thương Hiệu chấp nhận trên trang
                    web
                    hoặc qua các chương trình bán hàng từ xa. Thương Hiệu không áp dụng phí hoa hồng cho bất kỳ phương
                    thức
                    thanh toán nào.</p>

                <p>3.4 Nếu Khách Hàng mua nhiều sản phẩm thuộc cùng một loại lần đầu tiên, Thương Hiệu sẽ chỉ tiến hành
                    may
                    đo một sản phẩm (sau khi nhận được xác nhận từ Khách Hàng) để đảm bảo rằng kích thước phù hợp. Sau
                    khi
                    Khách Hàng xác nhận sự phù hợp, Thương Hiệu sẽ tiếp tục may các sản phẩm còn lại.</p>

                <p>3.5 Việc tạo ra nhiều hồ sơ liên kết với một người và/hoặc các số đo cơ thể của người đó là không hợp
                    lệ.
                    Các hồ sơ vi phạm quy định này sẽ bị đình chỉ. Mọi yêu cầu hủy/hoàn tiền đối với các đơn hàng từ hồ
                    sơ
                    không hợp lệ sẽ bị từ chối. Nếu mã giảm giá đã được sử dụng cho các đơn hàng từ hồ sơ không hợp lệ,
                    Khách Hàng sẽ phải trả lại số tiền giảm giá đã áp dụng. Trong trường hợp không thanh toán, đơn hàng
                    sẽ
                    không được giao cho Khách Hàng.</p>

                <h4>4. VẬN CHUYỂN – KHIẾU NẠI</h4>

                <p>4.1 Thời gian cần thiết để sản xuất các sản phẩm may đo sẽ được thông báo tại thời điểm mua hàng.
                    Thương
                    Hiệu sẽ gửi sản phẩm đến địa chỉ mà Khách Hàng cung cấp trong vòng 35 ngày kể từ khi ký kết hợp
                    đồng*.
                    Trong suốt quá trình sản xuất, Khách Hàng có thể theo dõi trạng thái đơn hàng qua trang cá nhân của
                    mình
                    trên trang web (Tài Khoản-Đơn Hàng).</p>

                <p>* Ngày giao hàng có thể thay đổi tùy thuộc vào phương thức thanh toán và ngày xác nhận các số đo cơ
                    thể.
                    Vào các dịp lễ tết, có thể có sự chậm trễ do nhà máy đóng cửa. Thương Hiệu sẽ thông báo cho Khách
                    Hàng
                    về bất kỳ thay đổi nào qua email.</p>

                <p>4.2 Khi đơn hàng được gửi, Khách Hàng sẽ nhận được email thông báo, kèm theo số theo dõi để theo dõi
                    tiến
                    trình giao hàng.</p>

                <p>4.3 Nếu Khách Hàng không nhận được hàng hoặc giao hàng bị chậm mà không có thông báo, Khách Hàng có
                    thể
                    liên hệ với Dịch Vụ Khách Hàng qua các phương thức đã nêu trong phần "Hợp Đồng".</p>

                <p>4.4 Mỗi sản phẩm của Thương Hiệu đều được sản xuất theo quy trình không công nghiệp, do đó có thể
                    chấp
                    nhận sự sai lệch nhỏ (tối đa 1 cm) so với các số đo ban đầu.</p>

                <p>4.5 Thương Hiệu luôn đầu tư vào việc thể hiện hình ảnh sản phẩm một cách chân thực nhất có thể. Tuy
                    nhiên, do sự khác biệt về cách hiển thị hình ảnh trên các màn hình số và các yếu tố bên ngoài khác,
                    hình
                    ảnh sản phẩm trên mạng có thể không hoàn toàn chính xác. Khi thực hiện giao dịch, Khách Hàng đồng ý
                    với
                    khả năng có sự sai khác nhỏ này.</p>

                <p>4.6 Mọi khiếu nại có thể gửi đến địa chỉ: <strong>[ Số 10, đường Nguyễn Văn Cừ, Quận 1, TP. Hồ Chí
                        Minh, Việt Nam]</strong> – <strong>[0101234567]</strong>.</p>

                <h4>5. NGHĨA VỤ CỦA KHÁCH HÀNG</h4>

                <p>5.1 Khách Hàng cam kết và xác nhận rằng: (i) Khách Hàng là người tiêu dùng theo quy định của Luật
                    Người
                    Tiêu Dùng; (ii) Khách Hàng đã đủ tuổi theo quy định pháp luật; (iii) Các thông tin cung cấp để thực
                    hiện
                    hợp đồng là chính xác và đầy đủ.</p>

                <h4>6. QUYỀN HỦY HỢP ĐỒNG</h4>

                <p>6.1 Khách Hàng có quyền hủy hợp đồng mà không bị phạt và không cần giải thích lý do trong vòng 24 giờ
                    kể
                    từ khi xác nhận đơn hàng. Khách Hàng có thể thực hiện quyền hủy hợp đồng trong thời gian này qua
                    điện
                    thoại hoặc email thông báo ý định hủy hợp đồng. Sau khi sản xuất trang phục bắt đầu, việc hủy hợp
                    đồng
                    sẽ không còn khả thi.</p>

                <p>6.2 Theo quy định tại Điều 59, Khoản 2 của Luật Người Tiêu Dùng, Khách Hàng không có quyền hủy hợp
                    đồng
                    đối với các sản phẩm may đo. Tuy nhiên, Thương Hiệu có chính sách hoàn tiền nếu sản phẩm bị lỗi hoặc
                    không vừa vặn trong vòng 30 ngày kể từ ngày nhận hàng. Trong trường hợp này, Khách Hàng cần thực
                    hiện
                    như sau:</p>

                <ul>
                    <li>Tải mẫu đơn yêu cầu hoàn tiền từ phần “Thay Đổi và Hoàn Tiền” và gửi qua email hoặc thư chuyển
                        phát
                        nhanh kèm theo 3 ảnh chụp sản phẩm mặc vào (chụp từ trước, bên hông và sau lưng) để chứng minh
                        lỗi.
                    </li>
                    <li>Đơn khiếu nại sẽ được xem xét và phê duyệt bởi nhân viên của Thương Hiệu.</li>
                    <li>Sản phẩm cần được gửi lại trong bao bì gốc, gửi bằng phương thức có thể theo dõi, và gửi đến địa
                        chỉ
                        Thương Hiệu yêu cầu.</li>
                </ul>

                <p>6.3 Những sản phẩm không gửi theo hướng dẫn trên sẽ không được chấp nhận và sẽ được gửi lại cho Khách
                    Hàng mà không có hoàn tiền.</p>

                <p>6.4 Sản phẩm phải còn nguyên vẹn (chưa sử dụng...)</p>

                <h4>7. ĐIỀU KHOẢN PHÁP LÝ</h4>

                <p>7.1 Hợp đồng này được điều chỉnh bởi pháp luật Việt Nam.</p>

                <p>7.2 Mọi tranh chấp liên quan đến việc áp dụng, thực hiện, giải thích và vi phạm hợp đồng sẽ được giải
                    quyết tại tòa án của Việt Nam.</p>

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