<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Câu hỏi thường gặp - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/footer/cauhoitg.css">


    <script>
        document.addEventListener('DOMContentLoaded', function () {
            var faqItems = document.querySelectorAll('.faq-item');
            faqItems.forEach(function (item) {
                item.addEventListener('click', function () {
                    var content = this.nextElementSibling;
                    if (content.style.display === 'block') {
                        content.style.display = 'none';
                    } else {
                        content.style.display = 'block';
                    }
                });
            });
        });
    </script>

</head>

<body>
    <!-- Header -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

    <section id="sec1">
        <!--Top Bar-->
        <div class="top-bar text-center py-2">
            <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>
    </section>

    <div class="header-afk">
        <img src="resources/images/faq.jpg" alt="Header Image" class="h-75">
        <div class="text-overlay">
            <h1>Chúng tôi có thể giúp gì?</h1>
            <p>Nếu bạn không thể tìm thấy câu trả lời, xin vui lòng liên hệ với chúng tôi.</p>
        </div>
    </div>
    <div class="container ">
        <div class="font-afk">
            <h1>Các câu hỏi thường gặp</h1>
        </div>
        <div class="afk-container">
            <div class="faq-item">
                <h2>Giới thiệu về THREEN TAILORED?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <p>
                <h4>Cách THREEN TAILORED Ra Đời? Gặp Gỡ Các Nhà Sáng Lập</h4>
                </p>
                <p>Truyền thống may đo thường gắn liền với tầng lớp thượng lưu và giới giàu có. Chính vì thế, các Nhà
                    Sáng Lập **THREEN TAILORED** — Trọng Nhân, Đức Nghĩa và Nhân Nghĩa — đã quyết tâm thay đổi điều này và ra
                    mắt một thương hiệu Việt, với mục tiêu mang đến những bộ trang phục may đo tùy chỉnh chất lượng cao,
                    nhưng với mức giá phải chăng cho các quý ông tại Việt Nam.</p>

                <p>Trước khi khởi nghiệp trong ngành may đo, cả Trọng Nhân, Đức Nghĩa và Nhân Nghĩa đều làm việc trong
                    các lĩnh vực tài chính và bất động sản. Trong quá trình làm việc, họ nhận ra một vấn đề chung: trang
                    phục may sẵn thường không vừa vặn, trong khi chi phí cho một bộ đồ may đo tùy chỉnh lại quá cao, lên
                    đến hàng chục triệu đồng. Họ nhận thấy rằng có một khoảng trống lớn trên thị trường, với nhu cầu về
                    các bộ trang phục may đo chất lượng cao, nhưng với mức giá hợp lý hơn, cùng một trải nghiệm mua sắm
                    tốt hơn.</p>

                <p>Với mong muốn thay đổi điều đó, Trọng Nhân, Đức Nghĩa và Nhân Nghĩa đã sáng lập **THREEN TAILORED** vào
                    năm 2024. Với sự kết hợp giữa kỹ thuật may đo truyền thống và công nghệ hiện đại, **THREEN TAILORED** kết
                    nối các thợ may tay nghề cao trong nước để mang đến những bộ trang phục vừa vặn hoàn hảo cho khách
                    hàng tại Việt Nam.</p>

                <p>Ban đầu, công ty tự đầu tư và phát triển từ một cửa hàng tại TP.HCM. Đến nay, **THREEN TAILORED** đã có
                    mặt tại nhiều showroom trên toàn quốc, thu hút đông đảo khách hàng trung thành từ các thành phố lớn
                    và nhỏ trong nước.</p>

                <p>Ngày nay, **THREEN TAILORED** tự hào là thương hiệu may đo tùy chỉnh hàng đầu tại Việt Nam, giúp các quý
                    ông trong nước tìm thấy những bộ trang phục vừa vặn, chất lượng cao mà không phải lo lắng về chi
                    phí.</p>
            </div>
            <div class="faq-item">
                <h2>May đo tùy chỉnh có nghĩa là gì?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <h4>Tại Sao Nên Chọn May Đo Tùy Chỉnh Thay Vì Mua Sẵn Hay Thuê Áo Vest?</h4>
                <p>May đo tùy chỉnh, hay may đo theo số đo, có nghĩa là bạn sẽ được lựa chọn mọi chi tiết trong thiết kế
                    trang phục, từ vải vóc, kiểu dáng, đến các chi tiết nhỏ như cúc áo, cổ áo hay các đường may trang
                    trí. Tất cả sẽ được thiết kế và may theo số đo và sở thích riêng của bạn, mang đến một bộ trang phục
                    vừa vặn hoàn hảo, độc đáo chỉ dành cho bạn.</p>

                <h4>Mua Sẵn (Off-The-Rack)</h4>
                <p>Khi mua một bộ đồ hay áo sơ mi may sẵn, trang phục sẽ được sản xuất hàng loạt với kích thước tiêu
                    chuẩn, mẫu mã chung và thiết kế của người khác. Mua sẵn không phải lúc nào cũng là lựa chọn nhanh
                    chóng hay tiết kiệm—nếu bạn không vừa vặn với kích thước tiêu chuẩn, ngoài giá trị của sản phẩm, bạn
                    sẽ phải trả thêm phí sửa chữa. Điều này đồng nghĩa với việc mỗi lần mua sắm bạn sẽ phải bỏ thêm chi
                    phí cho việc thay đổi và chỉnh sửa bộ đồ, mà kết quả chưa chắc đã khiến bạn hài lòng hoàn toàn.</p>

                <h4>Thuê Áo Vest</h4>
                <p>Khi thuê một bộ vest hay áo sơ mi, bạn sẽ chỉ nhận được trang phục có kích thước chuẩn và không thể
                    điều chỉnh theo ý muốn. Ngoài ra, các bộ đồ thuê thường đã được sử dụng bởi nhiều người khác (mà bạn
                    không biết họ là ai) và được giặt khô sau mỗi lần sử dụng, khiến vải có thể bị phai màu, sợi vải yếu
                    đi và chất lượng bị giảm sút. Thuê trang phục không phải lúc nào cũng là lựa chọn tiết kiệm, đặc
                    biệt khi bạn không thực sự sở hữu bộ đồ và không thể tái sử dụng trong tương lai.</p>

                <h4>Đo Tùy Chỉnh - May Đo Theo Số Đo</h4>
                <p>**THREEN TAILORED** mang đến cho bạn trải nghiệm may đo tùy chỉnh hoàn toàn, với thiết kế và số đo riêng
                    biệt cho từng khách hàng. Đơn giản mà nói, điều này có nghĩa là bộ đồ của bạn sẽ được làm theo thiết
                    kế riêng của bạn và sẽ vừa vặn với cơ thể bạn một cách hoàn hảo, không ai khác.</p>

                <p>Cụ thể, may đo tùy chỉnh có nghĩa là bạn có thể chọn mọi chi tiết, từ vải vỏ, số lượng và kiểu cúc,
                    kiểu cổ áo, tay áo, cho đến các đường chỉ may trang trí... tất cả sẽ được tạo ra theo thiết kế mà
                    bạn yêu thích.</p>

                <p>May đo theo số đo và may đo tùy chỉnh có nghĩa là bộ đồ của bạn sẽ được các thợ may có tay nghề cao,
                    được huấn luyện bài bản, tạo ra từ số đo cụ thể của bạn. Một ưu điểm đặc biệt khi chọn
                    **THREEN TAILORED** là số đo của bạn sẽ được lưu trữ trong hồ sơ trực tuyến của bạn (và có thể được cập
                    nhật nếu cần chỉnh sửa), giúp quá trình đặt hàng lại trong tương lai trở nên dễ dàng và nhanh chóng.
                </p>

                <p>**THREEN TAILORED** đã phá vỡ rào cản về giá cả và làm thay đổi hoàn toàn quan niệm về may đo tùy chỉnh
                    truyền thống, mang đến những bộ suit may đo chất lượng cao từ chỉ 3.000.000 VND và áo sơ mi may đo
                    từ 1.000.000 VND. Mức giá này cực kỳ cạnh tranh so với các sản phẩm may sẵn (trong nhiều trường hợp,
                    thậm chí còn rẻ hơn), và là một khoản đầu tư tốt hơn rất nhiều so với việc thuê áo vest nhiều lần.
                    Chúng tôi chắc chắn rằng, khi bạn đã sở hữu một bộ đồ may đo tùy chỉnh, bạn sẽ không bao giờ quay
                    lại với lựa chọn khác!</p>
            </div>
            <div class="faq-item">
                <h2>Vải tự nhiên của chúng tôi - Chỉ sử dụng những chất liệu tốt nhất?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <h4>Tôi Có Thể Chọn Loại Vải May Vest Nào Tại THREEN TAILORED?</h4>
                <p>Tại **THREEN TAILORED**, chúng tôi tự hào mang đến cho khách hàng những bộ trang phục may đo với chất liệu
                    vải cao cấp, hoàn toàn từ thiên nhiên, giúp bạn cảm thấy thoải mái và tự tin trong mọi hoàn cảnh.
                    Tất cả các chất liệu vải mà chúng tôi sử dụng đều được chọn lọc kỹ càng từ các nguồn vải nổi tiếng,
                    đảm bảo chất lượng và độ bền cao, phù hợp với khí hậu và phong cách sống của người Việt. Bạn sẽ có
                    cơ hội lựa chọn từ các chất liệu vải tinh tế như Merino 100% từ Úc, lanh, cotton, cashmere, cho đến
                    những chất liệu đặc biệt khác.</p>

                <h4>Các Loại Vải Chất Lượng Tại THREEN TAILORED:</h4>

                <h5>1. Vải Merino Úc Chứng Nhận Woolmark (100% Merino Wool)</h5>
                <p>Vải Merino của Úc là lựa chọn lý tưởng cho những bộ vest cao cấp và các trang phục công sở. Chất liệu
                    này nổi bật với khả năng điều chỉnh nhiệt độ tuyệt vời, giúp bạn cảm thấy thoải mái suốt cả năm – ấm
                    áp vào mùa đông và mát mẻ vào mùa hè. Merino wool có độ bền cao, không dễ nhăn và dễ chăm sóc, mang
                    đến sự thoải mái suốt cả ngày dài. Đây là vải phù hợp nhất cho những bộ vest thanh lịch, trang
                    trọng.</p>

                <h5>2. Vải Lanh (Linen)</h5>
                <p>Lanh là chất liệu vải nhẹ nhàng, thoáng khí và cực kỳ thích hợp cho những ngày hè oi ả. Với đặc tính
                    thấm hút mồ hôi tốt, vải lanh giữ cho bạn luôn mát mẻ trong những ngày nắng nóng. Lanh cũng là chất
                    liệu tự nhiên có độ bền cao, rất thích hợp cho các bộ đồ mùa hè, mang lại vẻ ngoài tinh tế nhưng vẫn
                    giữ được sự thoải mái.</p>

                <h5>3. Vải Cotton (Vải Cotton)</h5>
                <p>Vải cotton tự nhiên là một trong những chất liệu phổ biến nhất cho các trang phục hàng ngày. Vải
                    cotton rất mềm mại, thoáng khí, dễ chịu và dễ giặt giũ. Đây là chất liệu lý tưởng cho áo sơ mi, quần
                    tây, cũng như các bộ vest thanh lịch cho môi trường công sở hoặc các dịp không quá trang trọng.</p>

                <h5>4. Vải Cashmere (Vải Cashmere)</h5>
                <p>Cashmere là chất liệu vải siêu mềm mại, nhẹ nhàng và mang lại cảm giác cực kỳ sang trọng. Vải
                    cashmere được làm từ lông của dê Cashmere, thường được pha trộn với wool để tăng thêm độ bền và độ
                    mềm. Với đặc tính mịn màng và nhẹ nhàng, cashmere mang đến sự sang trọng cho những bộ vest, rất
                    thích hợp cho những dịp đặc biệt hoặc mùa lạnh.</p>

                <h4>Các Loại Vải Áo Sơ Mi Tại THREEN TAILORED:</h4>

                <h5>1. Vải Lanh (Linen)</h5>
                <p>Vải lanh là lựa chọn lý tưởng cho áo sơ mi mùa hè. Với đặc tính thoáng khí và khả năng hút ẩm tuyệt
                    vời, lanh giúp bạn luôn mát mẻ và dễ chịu trong những ngày nắng nóng. Lanh là chất liệu hoàn hảo cho
                    những buổi hẹn hò hoặc công việc ngoài trời.</p>

                <h5>2. Vải Cotton (Vải Cotton)</h5>
                <p>Chúng tôi cung cấp nhiều loại vải cotton hai lớp (two-ply) 100% với độ bền cao và khả năng chịu nhiệt
                    tốt. Cotton là chất liệu mềm mại, thoải mái và rất dễ giặt giũ. Bạn có thể chọn giữa các loại vải
                    dệt khác nhau như broadcloth, oxford, poplin để tạo ra chiếc áo sơ mi hoàn hảo cho mình.</p>

                <h4>Các Kiểu Dệt Vải Áo Sơ Mi:</h4>

                <h5>1. Broadcloth</h5>
                <p>Broadcloth là loại vải mỏng, nhẹ, dệt với bề mặt mịn màng, không có họa tiết. Đây là chất liệu lý
                    tưởng cho các dịp trang trọng như đám cưới, hội nghị, hoặc các buổi họp công sở.</p>

                <h5>2. Twill</h5>
                <p>Vải twill dày hơn broadcloth, có các đường chéo rõ nét hoặc họa tiết xương cá (herringbone). Twill
                    rất bền, dễ ủi và dễ bảo quản, thích hợp cho những chiếc áo sơ mi mặc hàng ngày hoặc các buổi tiệc
                    tối.</p>

                <h5>3. Chambray</h5>
                <p>Chambray là vải cotton nhẹ, mang lại cảm giác thoải mái, năng động. Đây là chất liệu lý tưởng cho
                    những chiếc áo sơ mi cuối tuần hoặc phối với quần chinos để tạo phong cách thoải mái nhưng vẫn lịch
                    sự.</p>

                <h5>4. Oxford</h5>
                <p>Vải Oxford dày hơn chambray và có cấu trúc giỏ (basket weave), giúp tăng độ bền và khả năng chống
                    nhăn. Đây là chất liệu lý tưởng cho áo sơ mi công sở, vừa mang lại vẻ lịch lãm, vừa dễ dàng chăm
                    sóc.</p>

                <h5>5. Poplin</h5>
                <p>Poplin là vải cotton mỏng, nhẹ, mịn màng, rất thích hợp cho những ngày hè nóng bức. Poplin mang đến
                    vẻ ngoài thanh lịch và thoải mái cho người mặc.</p>

                <h5>6. Cotton-Lycra Blend</h5>
                <p>Vải cotton pha lycra mang lại sự co giãn nhẹ, giúp áo sơ mi ôm sát cơ thể mà vẫn thoải mái. Đây là
                    lựa chọn lý tưởng cho những ai yêu thích phong cách slim fit mà không cần hy sinh sự thoải mái.</p>

                <h4>Giá Cả Vải May Đo Tại THREEN TAILORED:</h4>
                <p>Tại **THREEN TAILORED**, bộ vest may đo của chúng tôi có giá từ 3.000.000 VND và áo sơ mi may đo từ
                    1.000.000 VND. Giá cuối cùng của bộ trang phục sẽ tùy thuộc vào loại vải bạn chọn và các tuỳ chọn cá
                    nhân hoá khác. Chúng tôi cam kết mang đến những sản phẩm chất lượng cao với giá cả hợp lý, phù hợp
                    với nhiều ngân sách khác nhau.</p>

                <h4>Tại Sao Một Số Vải Lại Đắt Hơn?</h4>

                <h5>1. Quá Trình Sản Xuất và Hiếm Có:</h5>
                <p>Các chất liệu như cashmere có giá cao vì nguyên liệu hiếm và quá trình sản xuất phức tạp. Ví dụ, một
                    chiếc áo len cashmere cần phải dùng lông của nhiều con dê Cashmere.</p>

                <h5>2. Chỉ Số "Super S":</h5>
                <p>Chỉ số Super S đo độ mịn của sợi vải. Chỉ số càng cao, sợi vải càng mịn, nhẹ và mềm mại hơn, tuy
                    nhiên cũng dễ hư hỏng hơn. Vải tại **THREEN TAILORED** chủ yếu nằm trong khoảng Super 100 đến Super 140,
                    đảm bảo chất lượng và độ bền cho bộ vest công sở.</p>

                <h5>3. Nhà Máy Sản Xuất:</h5>
                <p>Chúng tôi hợp tác với các nhà máy sản xuất vải nổi tiếng, đảm bảo chất lượng và tính năng vượt trội
                    của từng loại vải. Các nhà máy này sử dụng công nghệ dệt hiện đại để tạo ra các loại vải đạt chuẩn
                    quốc tế.</p>

                <h5>4. Trọng Lượng Vải:</h5>
                <p>Trọng lượng vải cũng ảnh hưởng đến mức độ phù hợp của bộ vest với từng mùa. Vải nhẹ thích hợp cho khí
                    hậu nóng, trong khi vải dày hơn là sự lựa chọn lý tưởng cho mùa đông.</p>

                <h4>Bạn Có Thể Mang Vải Tự Mua Để May Không?</h4>
                <p>Hiện tại, **THREEN TAILORED** chỉ sử dụng các loại vải đã được chọn lọc kỹ càng trong bộ sưu tập của chúng
                    tôi. Tuy nhiên, với hàng trăm lựa chọn chất liệu vải cao cấp, bạn chắc chắn sẽ tìm thấy chất liệu
                    phù hợp với sở thích và nhu cầu của mình. Chúng tôi rất mong được phục vụ bạn tại showroom của mình
                    hoặc trực tuyến.</p>


            </div>
            <div class="faq-item">
                <h2>Trang phục độc đáo của THREEN TAILORED được tạo ra như thế nào?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <h4>Các Bộ Trang Phục Tại THREEN TAILORED Được May Như Thế Nào? Quy Trình May Đo Truyền Thống</h4>
                <p>Tại **THREEN TAILORED**, chúng tôi tôn trọng quy trình may đo truyền thống, nơi từng chi tiết được chuẩn
                    bị tỉ mỉ từ những bước đầu tiên, trước khi may từng mũi chỉ đầu tiên.</p>
                <p>Tất cả các bộ trang phục của **THREEN TAILORED** đều được may đo riêng theo số đo và thiết kế cá nhân của
                    bạn – kết quả là một bộ suit hoàn hảo, chỉ dành riêng cho bạn.</p>
                <p>Quá trình bắt đầu từ việc lấy số đo của bạn. Sau khi có đầy đủ số đo, chúng tôi sẽ tạo ra mẫu thiết
                    kế từ nền mẫu chuẩn và thông tin riêng của bạn. Tiếp theo, vải sẽ được cắt chính xác bằng công nghệ
                    cắt laser hiện đại, đảm bảo độ chính xác tuyệt đối.</p>
                <p>Đặc biệt đối với áo khoác, một trong những bước quan trọng nhất là tạo lớp vải canvas – công đoạn này
                    được thực hiện bởi những thợ may có kinh nghiệm từ các trường phái may đo nổi tiếng. Canvas là nền
                    tảng tạo nên một bộ suit hoàn hảo suốt hàng trăm năm qua, và chúng tôi vẫn gìn giữ truyền thống này,
                    giúp tạo nên chiếc áo từ bên trong ra ngoài.</p>
                <p>Tại **THREEN TAILORED**, chúng tôi sử dụng canvas Freudenberg cao cấp – một loại vải nhẹ nhàng kết hợp
                    giữa cotton, lông ngựa và mohair, giúp bộ trang phục giữ được kết cấu vững chắc phần trước áo.
                    Canvas được khâu vào phần nách và ve áo, cho phép nó "nổi" trên cơ thể, trong khi lớp vải bên ngoài
                    có thể di chuyển nhẹ nhàng và uyển chuyển.</p>
                <p>Cuối cùng, chúng tôi sẽ thêm các chi tiết như cúc áo và những hoàn thiện cuối cùng, sau đó đội ngũ
                    của chúng tôi sẽ thực hiện kiểm tra chất lượng nghiêm ngặt. Chúng tôi chỉ chấp nhận sự hoàn hảo. Khi
                    bộ trang phục hoàn thành và vượt qua kiểm tra chất lượng, chúng tôi sẽ gửi trực tiếp đến tay bạn
                    hoặc đến showroom của **THREEN TAILORED** để bạn có thể thử và nhận bộ trang phục của mình.</p>

                <h4>Canvas Áo Khoác THREEN TAILORED</h4>
                <p>Canvas Freudenberg "nổi" là nền tảng của mọi chiếc áo khoác tại **THREEN TAILORED**. Đây là một hỗn hợp
                    nhẹ nhàng từ cotton, lông ngựa và mohair giúp áo khoác giữ được hình dáng. Mục đích chính của canvas
                    là duy trì kết cấu áo khoác, cho phép nó giữ vững form dáng trong suốt quá trình mặc. Canvas được
                    khâu vào các phần như nách và ve áo, giúp áo khoác vừa vặn và thoải mái, trong khi lớp vải bên ngoài
                    vẫn di chuyển nhẹ nhàng, tạo sự thanh thoát cho người mặc.</p>

                <h4>Canvas Chuẩn THREEN TAILORED (Half Canvas)</h4>
                <p>Canvas chuẩn (half canvas) là lựa chọn tiêu chuẩn cho mọi chiếc áo khoác tại **THREEN TAILORED** và không
                    tính thêm phí. Đây là lựa chọn phổ biến, đảm bảo áo khoác giữ form dáng chắc chắn nhưng vẫn nhẹ
                    nhàng và thoải mái khi mặc.</p>

                <h4>Canvas THREEN TAILORED Nhẹ (Lightweight Half Canvas)</h4>
                <p>Canvas nhẹ (lightweight half canvas) được thiết kế đặc biệt cho những vùng khí hậu ấm áp, như các
                    thành phố miền Nam Việt Nam. Nó mang lại những lợi ích tương tự như canvas chuẩn, giúp giữ kết cấu
                    vững chắc cho áo khoác nhưng không tạo cảm giác nặng nề. Bạn có thể chọn canvas nhẹ cho thiết kế của
                    mình mà không phải trả thêm chi phí.</p>

                <h4>Canvas THREEN TAILORED Toàn Bộ (Full Canvas)</h4>
                <p>Canvas toàn bộ (full canvas) là lựa chọn dành cho những ai sống ở các khu vực có khí hậu lạnh hơn,
                    hoặc đơn giản là yêu thích sự sang trọng và hoàn hảo trong từng chi tiết. Canvas chạy suốt dọc áo,
                    giúp giữ ấm tốt hơn và vẫn duy trì được kết cấu của áo khoác. Full canvas là một lựa chọn bổ sung
                    với mức phí thêm.</p>

                <h4>Tôi Có Một Yêu Cầu Đặc Biệt, Các Bạn Có Thể Giúp Tôi Không?</h4>
                <p>Vui lòng gửi yêu cầu đặc biệt của bạn tới <a href="threentailored@gmail.com">threentailored@gmail.com</a>.
                    Chúng tôi sẽ liên hệ với các thợ
                    may để kiểm tra tính khả thi và giúp bạn thực hiện yêu cầu đó. Chúng tôi luôn sẵn sàng để mang đến
                    cho bạn một sản phẩm hoàn hảo nhất, phù hợp với nhu cầu và sở thích riêng của bạn!</p>
            </div>
            <div class="faq-item">
                <h2>Trang phục độc đáo của THREEN TAILORED được may ở đâu?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">

                <h4>Quá Trình Tạo Ra Bộ Trang Phục May Đo Tại THREEN TAILORED</h4>
                <p>Khi bạn đã hoàn tất việc đo đạc, các thợ may chuyên nghiệp của **THREEN TAILORED** sẽ bắt tay vào việc tạo
                    ra bộ trang phục hoàn hảo dành riêng cho bạn.</p>

                <p>Tất cả các bộ trang phục may đo của chúng tôi đều được thực hiện ngay tại xưởng sản xuất của
                    **THREEN TAILORED** tại Việt Nam, nơi có đội ngũ thợ may tay nghề cao và cơ sở vật chất hiện đại. Chúng
                    tôi luôn đảm bảo rằng quy trình may đo của mình tuân thủ tiêu chuẩn chất lượng cao nhất, từ việc
                    chọn lựa vải cho đến việc hoàn thiện từng chi tiết nhỏ nhất.</p>

                <p>Quy trình thiết kế và sản xuất của **THREEN TAILORED** áp dụng những kỹ thuật may đo tinh xảo và công nghệ
                    hiện đại, kết hợp giữa truyền thống may đo của Savile Row (Anh) và các kỹ thuật sản xuất tiên tiến.
                    Các thợ may của chúng tôi được đào tạo bài bản và giàu kinh nghiệm, cam kết mang đến cho bạn một bộ
                    trang phục hoàn hảo, với từng đường kim mũi chỉ sắc sảo.</p>

                <p>Khi bộ trang phục của bạn được cắt, vải sẽ được đo và cắt chính xác bằng công nghệ cắt laser tiên
                    tiến, đảm bảo độ chính xác tuyệt đối. Đặc biệt, chúng tôi sử dụng chất liệu canvas Freudenberg cao
                    cấp, một loại vải đặc biệt giúp giữ form dáng áo khoác, mang đến sự chắc chắn và bền bỉ cho bộ trang
                    phục. Tất cả các chi tiết được may tỉ mỉ, từ lớp vải bên trong đến lớp ngoài, tạo nên một bộ trang
                    phục hoàn chỉnh, sang trọng và vừa vặn với cơ thể bạn.</p>

                <p>Sau khi hoàn tất, chúng tôi sẽ tiến hành kiểm tra chất lượng sản phẩm một cách nghiêm ngặt để đảm bảo
                    mỗi bộ trang phục đều đạt tiêu chuẩn cao nhất. Tại **THREEN TAILORED**, sự hoàn hảo trong từng chi tiết
                    là yếu tố quan trọng nhất đối với chúng tôi.</p>

                <p>Chúng tôi cũng hiểu rằng sự tiện lợi là rất quan trọng. Sau khi sản phẩm được hoàn thành tại xưởng,
                    bộ trang phục sẽ được vận chuyển đến showroom của **THREEN TAILORED** tại các thành phố lớn như Hà Nội,
                    Hồ Chí Minh, nơi bạn có thể đến thử đồ và nhận bộ trang phục của mình. Nếu bạn không thể đến trực
                    tiếp, chúng tôi sẽ giao hàng tận nơi, mang đến sự tiện lợi và dịch vụ tận tâm cho bạn.</p>
            </div>
            <div class="faq-item">
                <h2>Chế độ chăm sóc sản phẩm như thế nào?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <h4>Cách Chăm Sóc Trang Phục THREEN TAILORED Của Bạn</h4>
                <p>Để bộ trang phục may đo THREEN TAILORED của bạn luôn giữ được độ bền và vẻ đẹp lâu dài, việc chăm sóc đúng
                    cách là rất quan trọng. Dưới đây là một số hướng dẫn để giúp bạn bảo quản bộ trang phục của mình
                    luôn như mới:</p>

                <h4>Hướng Dẫn Chăm Sóc Trang Phục THREEN TAILORED Của Bạn</h4>
                <p>Chúc mừng bạn đã sở hữu một bộ trang phục may đo **THREEN TAILORED** mới hoặc có thể bạn gặp phải một vết
                    bẩn nhỏ, đừng lo—chúng tôi sẽ giúp bạn giữ cho bộ trang phục của mình luôn như mới.</p>

                <p>Trước hết, trừ khi bộ trang phục của bạn được làm từ chất liệu cotton, hãy tránh giặt khô trừ khi
                    thật sự cần thiết, và đừng bao giờ giặt áo vest hay quần tây bằng máy. Hãy làm theo các hướng dẫn
                    dưới đây vì mỗi loại vải có những phương pháp chăm sóc khác nhau.</p>

                <h5>Đối Với Vải Merino Úc...</h5>
                <p><strong>Giặt:</strong> Một số người nghĩ rằng giặt khô sẽ tốt cho vải wool, nhưng thực tế, giặt khô
                    quá thường xuyên có thể làm yếu đi các sợi vải và phai màu. Vì vậy, chỉ nên giặt khô khi thật sự cần
                    thiết. Thay vào đó, bạn có thể áp dụng một số phương pháp chăm sóc khác dưới đây.</p>

                <p><strong>Xoay vòng:</strong> Để bảo quản bộ trang phục Merino lâu dài, hãy hạn chế mặc thường xuyên.
                    Nên để vải "nghỉ ngơi", không mặc bộ suit Merino trong hai ngày liên tiếp.</p>

                <p><strong>Sau khi sử dụng:</strong> Ngay lập tức treo bộ suit sau khi mặc để vải có thể "thở" và phục
                    hồi. Bạn có thể sử dụng bàn chải chuyên dụng để làm sạch bộ suit, và sau một giờ, cho bộ suit vào
                    túi vải để bảo vệ khỏi bụi bẩn và các yếu tố bên ngoài, ngay cả khi treo trong tủ quần áo.</p>

                <p><strong>Mẹo làm sạch:</strong> Hãy treo bộ suit trong phòng tắm trong khi tắm. Hơi nước sẽ giúp xóa
                    nếp nhăn và loại bỏ mùi hôi khó chịu.</p>

                <h5>Đối Với Vải Lanh...</h5>
                <p><strong>Giặt:</strong> Chúng tôi khuyến nghị giặt khô bộ trang phục lanh chỉ khi thật sự cần thiết.
                    Áo sơ mi lanh có thể giặt tay, nhưng vì lanh dễ co lại, bạn cần giặt ở nhiệt độ nước lạnh hoặc ấm
                    (nước lạnh giúp bảo vệ màu sắc), sử dụng bột giặt nhẹ, không có hương liệu hay phẩm màu. Tránh sử
                    dụng chất tẩy trắng hoặc làm mềm vải. Giặt bằng tay hoặc chế độ giặt nhẹ nếu máy giặt có tính năng
                    này.</p>

                <p><strong>Hong khô:</strong> Lanh khô rất nhanh, nhưng để tránh co rút, bạn tuyệt đối không nên dùng
                    máy sấy. Hãy phơi khô tự nhiên trên giá treo hoặc nằm phẳng. Tránh dùng móc treo vì chúng có thể tạo
                    ra nếp gấp trên vải.</p>

                <p><strong>Ủi:</strong> Lanh không nhất thiết phải ủi, nhưng nếu bạn muốn bộ đồ lanh trông gọn gàng,
                    thời điểm lý tưởng để ủi là khi sản phẩm còn ẩm sau khi giặt. Bạn cũng có thể dùng xịt làm cứng để
                    giữ dáng cho bộ đồ của mình.</p>

                <h5>Đối Với Áo Sơ Mi Cotton...</h5>
                <p><strong>Giặt:</strong> Đảm bảo bạn tháo hết cúc áo và bỏ các miếng lót cổ ra trước khi giặt. Nếu có
                    vết bẩn, hãy dùng bột tẩy vết bẩn hoặc một ít bột giặt và vải để làm sạch. Tùy vào độ dày của vải,
                    bạn có thể giặt bằng chế độ nhẹ cho vải mềm hoặc chế độ bình thường cho vải dày.</p>

                <p><strong>Khô:</strong> Áo sơ mi cotton nên được phơi khô tự nhiên, tránh sử dụng máy sấy để đảm bảo áo
                    không bị co lại.</p>

                <p><strong>Ủi:</strong> Thời điểm lý tưởng để ủi áo sơ mi là khi áo gần như khô hoàn toàn, hoặc còn hơi
                    ẩm. Nếu bạn muốn tiết kiệm thời gian, có thể dùng máy ủi hơi để làm phẳng áo một cách nhanh chóng.
                </p>

                <h5>Đối Với Bộ Suit Cotton...</h5>
                <p><strong>Giặt:</strong> Bộ suit cotton không nên giặt bằng máy, vì dễ làm hỏng cấu trúc vải. Chúng tôi
                    khuyến nghị giặt khô bộ suit cotton khi thật sự cần thiết, nhưng càng ít càng tốt. Nếu bộ suit của
                    bạn sạch nhưng bị nhăn, hãy yêu cầu là hơi để giữ form dáng mà không làm hư hại vải. Bạn cũng có thể
                    dùng máy xông hơi tại nhà để là quần và áo suit cotton.</p>

                <p><strong>Sau khi sử dụng:</strong> Ngay lập tức treo bộ suit sau khi mặc để vải có thể "thở" và phục
                    hồi. Bạn cũng có thể sử dụng bàn chải chuyên dụng để làm sạch bộ suit, và sau đó, cho bộ suit vào
                    túi vải để bảo vệ khỏi bụi bẩn và các yếu tố bên ngoài.</p>

                <p><strong>Xoay vòng:</strong> Hãy tránh mặc bộ suit cotton trong hai ngày liên tiếp để các sợi vải có
                    thể phục hồi, giúp bộ trang phục của bạn luôn giữ được form dáng hoàn hảo.</p>

            </div>
            <div class="faq-item">
                <h2>Vận chuyển và theo dõi đơn hàng?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <h4>Vận Chuyển Có Miễn Phí Không?</h4>
                <p>Chúng tôi cung cấp <strong>vận chuyển miễn phí toàn quốc</strong> cho tất cả các đơn hàng có giá trị
                    từ 30 triệu đồng trở lên. Đối với các đơn hàng có giá trị dưới 30 triệu đồng, phí vận chuyển cố định
                    là 90.000 VNĐ cho tất cả các đơn hàng trong nước.</p>

                <h4>Thời Gian Giao Hàng Là Bao Lâu?</h4>
                <p>Đối với các đơn hàng trong nước, sản phẩm của bạn sẽ được giao trong vòng 4-5 tuần kể từ ngày đặt
                    hàng. Chúng tôi luôn nỗ lực để đảm bảo rằng sản phẩm may đo của bạn sẽ được giao đúng hạn và chất
                    lượng cao nhất.</p>

                <h4>Đơn Hàng Của Tôi Sẽ Giao Đến Đâu? Tôi Cần Đến Showroom Để Lấy Hàng Không?</h4>
                <p>Bạn có thể lựa chọn phương thức nhận hàng phù hợp với mình. Bạn có thể yêu cầu giao hàng trực tiếp
                    đến địa chỉ của mình trong nước hoặc nhận tại showroom gần nhất. Nếu bạn chọn nhận tại showroom,
                    chúng tôi sẽ gửi email thông báo khi đơn hàng đã sẵn sàng để lấy, kèm theo liên kết để bạn có thể
                    đặt lịch hẹn lấy sản phẩm. Nếu không nhận được phản hồi từ bạn, đội ngũ của chúng tôi sẽ chủ động
                    liên hệ để nhắc nhở về thời gian lấy hàng.</p>

                <h4>Có Giao Hàng Đến Các Tỉnh Thành Khác Không?</h4>
                <p>Chắc chắn rồi! Dù bạn ở đâu trong phạm vi Việt Nam, chúng tôi đều cung cấp dịch vụ giao hàng tận nơi.
                    Với các khu vực xa trung tâm, chúng tôi sẽ đảm bảo giao hàng nhanh chóng và an toàn đến tay bạn.</p>

                <h4>Làm Thế Nào Để Theo Dõi Đơn Hàng Của Mình?</h4>
                <p>Việc theo dõi đơn hàng của bạn rất đơn giản. Bạn chỉ cần đăng nhập vào tài khoản của mình và kiểm tra
                    thông tin đơn hàng trong mục "Đơn Hàng Của Tôi". Nếu cần thêm thông tin, bạn có thể liên hệ trực
                    tiếp với chúng tôi qua email <a href="threentailored@gmail.com">threentailored@gmail.com</a> hoặc sử dụng
                    tính năng chat trực tiếp trên website để được cập nhật tình trạng đơn hàng. Ngoài ra, bạn sẽ nhận
                    được email thông báo về tiến độ giao hàng mỗi khi có thay đổi về tình trạng đơn hàng của mình.</p>



            </div>
            <div class="faq-item">
                <h2>Tôi đang mua sắm trực tuyến và cần sự giúp đỡ?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">

                <h4>Cách Đặt Bộ Vest Hoặc Áo Sơ Mi Online Tại THREEN TAILORED</h4>

                <p>Việc thiết kế trang phục độc đáo đầu tiên của bạn tại THREEN TAILORED vô cùng đơn giản. Đầu tiên, bạn chỉ
                    cần tạo một *profile* trực tuyến (đăng nhập tài khoản) và sử dụng công cụ thiết kế của chúng tôi để
                    chọn chất liệu vải, kiểu dáng và các tùy chọn cá nhân hóa. Sau khi chọn xong, bạn sẽ nhập số đo của
                    mình, hoặc nếu đã có số đo từ các lần đặt hàng trước, chúng tôi sẽ tự động lấy lại thông tin. Sau
                    đó, chỉ cần thêm sản phẩm vào giỏ hàng và tiến hành thanh toán. Đơn hàng của bạn sẽ được giao tận
                    nơi trong khoảng 4-5 tuần. Nếu bạn là khách hàng quay lại, các số đo của bạn sẽ được lưu trong tài
                    khoản để dễ dàng đặt lại sản phẩm, điều chỉnh thiết kế, hoặc tạo ra một mẫu mới hoàn toàn. Tất cả
                    các đơn hàng đều được bảo vệ bởi <strong>Cam Kết Vừa Vặn Tuyệt Hảo</strong> của THREEN TAILORED, đảm bảo
                    bạn sẽ luôn hài lòng với trang phục của mình.</p>

                <p>Đừng quên, đội ngũ Chuyên Gia Tư Vấn của THREEN TAILORED luôn sẵn sàng hỗ trợ bạn. Nếu bạn có bất kỳ câu
                    hỏi nào hoặc gặp khó khăn khi lựa chọn kiểu dáng, hãy gọi cho chúng tôi trong giờ hành chính (9:00
                    AM - 5:00 PM) qua số điện thoại: 028 6261 8888 (VN), hoặc email tại
                    <strong>threentailored@gmail.com</strong>.
                </p>

                <h4>Tôi Thích Một Trong Các Sản Phẩm Trong Bộ Sưu Tập Nhưng Muốn Thay Đổi Một Chút, Tôi Có Thể Làm Được
                    Không?</h4>

                <p>Chắc chắn rồi! Một trong những lợi thế lớn của việc may đo là bạn có thể tùy chỉnh bất kỳ chi tiết
                    nào trong các thiết kế bộ sưu tập của chúng tôi. Bạn có thể bắt đầu từ một thiết kế mới hoàn toàn,
                    hoặc chọn mẫu yêu thích và thay đổi nó sao cho phù hợp với phong cách cá nhân của bạn. Để tùy chỉnh
                    thiết kế từ bộ sưu tập, chỉ cần chọn mẫu mà bạn yêu thích và nhấn vào <strong>"Tùy chỉnh thiết
                        kế"</strong> để chọn các tùy chọn cá nhân hóa theo ý muốn, từ màu sắc, chất liệu vải, đến chi
                    tiết nhỏ nhất của bộ trang phục.</p>

                <h4>Tôi Đang Mua Sắm Online Và Cần Tư Vấn Về Phong Cách — THREEN TAILORED Có Thể Giúp Gì Không?</h4>

                <p>Tất nhiên! Chúng tôi cung cấp dịch vụ <strong>chat trực tuyến</strong> trên website từ 9:00 AM -
                    10:00 PM vào các ngày trong tuần để giải đáp mọi thắc mắc của bạn về phong cách, chất liệu vải, hoặc
                    sự kết hợp trang phục. Nếu bạn muốn tư vấn qua điện thoại, đội ngũ Chăm Sóc Khách Hàng của chúng tôi
                    cũng sẵn sàng hỗ trợ từ 9:00 AM - 5:00 PM (giờ Việt Nam) qua số điện thoại: 028 6261 8888, hoặc qua
                    email tại <strong>threentailored@gmail.com</strong>. Nếu bạn muốn gặp trực tiếp, chúng tôi luôn chào đón
                    bạn tại showroom của chúng tôi, nơi các chuyên gia tư vấn phong cách sẽ giúp bạn tìm ra những lựa
                    chọn hoàn hảo nhất cho mình.</p>

                <p>Để lấy thêm cảm hứng về phong cách, đừng quên ghé thăm <strong>blog THREEN TAILORED</strong> của chúng
                    tôi, nơi chia sẻ các xu hướng mới nhất, mẹo phối đồ, và các thông tin hữu ích để bạn luôn tự tin với
                    phong cách của mình.</p>


            </div>
            <div class="faq-item">
                <h2>Trải nghiệm phòng trưng bày THREEN TAILORED?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <p>
                <h4>Quy Trình Đo Lường và Thử Trang Phục Tại Showroom</h4>
                </p>
                <p>Trải nghiệm tại showroom của chúng tôi mang đậm phong cách may đo cổ điển. Bạn sẽ được đo lường bởi
                    các Chuyên Gia Tư Vấn của chúng tôi, tham khảo trực tiếp bộ sưu tập vải cao cấp, xem các mẫu trang
                    phục và được hướng dẫn chi tiết qua quy trình thiết kế riêng biệt, trong khi thưởng thức một ly
                    whisky hoặc nước giải khát. Các số đo của bạn sẽ được lưu trữ trong hồ sơ trực tuyến, giúp bạn dễ
                    dàng đặt lại trang phục từ nhà vào lần sau.</p>

                <p>Lịch hẹn tại showroom hoàn toàn miễn phí và không bắt buộc phải mua hàng — không có bất kỳ áp lực nào
                    khi bạn đến tham quan. Chúng tôi sẽ chỉ định một Chuyên Gia Tư Vấn riêng cho bạn trong suốt thời
                    gian hẹn.</p>

                <p>
                <h4>Thời Gian Hẹn Tại Showroom</h4>
                </p>
                <p>Dưới đây là hướng dẫn về thời gian dành cho các cuộc hẹn. Tuy nhiên, thời gian thực tế có thể thay
                    đổi tùy theo từng showroom:</p>

                <ul>
                    <li><strong>Hẹn cá nhân:</strong> 45 phút</li>
                    <li><strong>Thử đồ nhóm:</strong> 1 giờ</li>
                    <li><strong>Dịch vụ tại chỗ (Chuyên gia di động):</strong> 30 phút</li>
                    <li><strong>Nhận bộ trang phục:</strong> 15 phút</li>
                </ul>

                <p>
                <h4>Tôi có cần phải đặt lịch hẹn tại showroom không?</h4>
                </p>
                <p>Mặc dù bạn hoàn toàn có thể đến showroom và tham khảo các loại vải, mẫu mã sản phẩm mà chúng tôi cung
                    cấp, nhưng sẽ không phải lúc nào cũng có Chuyên Gia Tư Vấn sẵn sàng. Vì vậy, chúng tôi luôn khuyến
                    khích bạn đặt lịch hẹn trước để có thể trải nghiệm đầy đủ quy trình may đo cổ điển đặc trưng của
                    chúng tôi. Bạn có thể đặt lịch hẹn tại đây.</p>

                <p>
                <h4> Nếu tôi không có lịch hẹn và chỉ muốn ghé qua showroom thì sao?</h4>
                </p>
                <p>Đừng ngại, hãy ghé qua và giới thiệu bản thân. Chúng tôi rất vui được gặp bạn và sẽ cố gắng sắp xếp
                    thời gian để phục vụ bạn. Bạn cũng có thể tham khảo các mẫu trang phục và vải, sau đó đặt lịch hẹn
                    vào thời gian phù hợp hoặc mua sắm trực tuyến. Tuy nhiên, nếu bạn không có lịch hẹn trước, có thể
                    không có Chuyên Gia Tư Vấn có mặt ngay lập tức, nhưng bạn vẫn có thể tham quan showroom và cảm nhận
                    về các loại vải cũng như quy trình của chúng tôi.</p>

                <p>
                <h4>THREEN TAILORED có nhận hẹn thử đồ nhóm không?</h4>
                </p>
                <p>Chắc chắn rồi! Càng đông càng vui. Hãy đặt lịch hẹn thử đồ nhóm tại đây.</p>

                <p>
                <h4>Các showroom của THREEN TAILORED ở đâu?</h4>
                </p>
                <p>Chúng tôi có các showroom tại nhiều thành phố lớn ở Việt Nam. Để biết thông tin chi tiết về vị trí
                    các showroom, vui lòng xem tại đây.</p>

                <p>
                <h4>Showroom có phục vụ đồ uống không?</h4>
                </p>
                <p>Trải nghiệm may đo cổ điển sẽ không thể hoàn chỉnh nếu thiếu một ly whisky hay bia lạnh phải không?
                    Chúng tôi cung cấp một loạt các loại whisky, rượu vang, bia và nước khoáng có ga tại các showroom
                    của mình để bạn có thể thư giãn trong khi lựa chọn trang phục.</p>

            </div>
            <div class="faq-item">
                <h2>Cách Đo - các Lựa Chọn Thuận Tiện?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <p>
                <h4>Làm Thế Nào Để Đo Số Đo Của Tôi?</h4>
                </p>
                <p>Có nhiều cách đơn giản để bạn đo số đo của mình, tùy vào sự tiện lợi và sở thích cá nhân. Khi số đo
                    của bạn được lưu vào hồ sơ trực tuyến, bạn có thể dễ dàng đặt lại trang phục bất kỳ lúc nào chỉ với
                    vài cú click chuột.</p>

                <p>
                <h4>1. Đo Số Đo Tại Nhà</h4>
                </p>
                <p>Hãy tự đo số đo của bạn ngay tại nhà bằng các video hướng dẫn chi tiết của chúng tôi. Chỉ cần 14 số
                    đo đơn giản — vậy là xong. Các thợ may của chúng tôi sẽ kiểm tra lại số đo của bạn trước khi bắt đầu
                    và các thuật toán của chúng tôi sẽ tự động phát hiện bất kỳ sai sót nào.</p>

                <p>
                <h4>2. Đo Trang Phục Yêu Thích Của Bạn</h4>
                </p>
                <p>Bạn có thể đo trang phục yêu thích của mình ngay tại nhà, hoặc mang đến showroom và để Chuyên Gia Tư
                    Vấn của chúng tôi đo và lưu số đo vào hồ sơ trực tuyến của bạn.</p>

                <p>
                <h4>3. Thăm Showroom</h4>
                </p>
                <p>Trải nghiệm may đo cổ điển tại showroom của chúng tôi, nơi bạn sẽ được đo số đo bởi các Chuyên Gia Tư
                    Vấn, tham khảo bộ sưu tập vải và được hướng dẫn qua quy trình thiết kế trang phục, trong khi thưởng
                    thức một ly whisky hoặc thức uống yêu thích.</p>

                <p>
                <h4>4. Dịch Vụ Chuyên Gia Di Động</h4>
                </p>
                <p>Hãy đặt lịch hẹn với một trong các Chuyên Gia Di Động của chúng tôi, người sẽ mang dịch vụ may đo đến
                    tận nhà bạn. Bạn sẽ được đo số đo bởi các chuyên gia của chúng tôi và tham khảo các loại vải mà
                    không cần phải ra ngoài.</p>

                <p>
                <h4>5. Chọn Kích Cỡ Chuẩn và Tùy Chỉnh</h4>
                </p>
                <p>Nếu bạn phù hợp với kích cỡ chuẩn, nhưng vẫn muốn trang phục của mình có những điều chỉnh riêng, bạn
                    có thể chọn một trong các kích cỡ chuẩn và tùy chỉnh thiết kế ngay hôm nay.</p>

                <p>
                <h4>Tôi Có Thể Tìm Video Hướng Dẫn Đo Số Đo Ở Đâu và Quá Trình Đo Mất Bao Lâu?</h4>
                </p>
                <p>Truy cập vào trang đo số đo của chúng tôi. Sau đó, bạn chỉ cần click vào từng phần đo để xem video
                    hướng dẫn và nhập số đo vào hệ thống (ví dụ: Cổ, Vai, Tay áo, v.v.). Khi tất cả số đo đã được nhập,
                    hãy nhấn “Lưu” ở cuối trang (một mẹo nhỏ là bạn nên lưu lại thường xuyên trong quá trình nhập số
                    đo). Quá trình đo sẽ không mất quá 45 phút.</p>

                <p><strong>Mẹo:</strong> Nếu bạn ở giữa hai mức số đo, chúng tôi khuyến khích bạn làm tròn lên.</p>

                <p>
                <h4>Tôi Có Thể Đo Trang Phục Yêu Thích Của Mình Tại Nhà Hoặc Gửi Cho Chuyên Gia THREEN TAILORED Để Đo và Lưu
                    Vào Hồ Sơ Trực Tuyến Không?</h4>
                </p>
                <p>Chắc chắn rồi! Bạn có thể thiết kế trang phục của mình từ đầu, hoặc gửi trang phục yêu thích đến
                    Chuyên Gia Tư Vấn của THREEN TAILORED để họ đo và lưu số đo vào hồ sơ trực tuyến của bạn.</p>

                <p>Để đo trang phục yêu thích tại nhà, chỉ cần làm theo các bước hướng dẫn tại đây.</p>

                <p>Nếu bạn muốn gửi trang phục của mình đến đội ngũ của chúng tôi để đo và lưu vào hồ sơ trực tuyến, hãy
                    gửi email cho chúng tôi qua địa chỉ <a href="mailto:threentailored@gmail.com">threentailored@gmail.com</a>
                    với thông tin liên lạc và mô tả về trang phục của bạn. Sau đó, gửi trang phục đến địa chỉ dưới đây
                    (vui lòng gửi bằng dịch vụ chuyển phát nhanh hoặc có bảo đảm để chúng tôi có thể theo dõi đơn hàng
                    của bạn và đảm bảo không bị thất lạc). Xin lưu ý rằng bạn sẽ chịu trách nhiệm chi phí vận chuyển.
                </p>

                <p><strong>Địa Chỉ Gửi:</strong><br>
                    THREEN TAILORED Showroom<br>
                    Số 10, đường Nguyễn Văn Cừ, Quận 1, TP. Hồ Chí Minh, Việt Nam<br>
                </p>

                <p>
                <h4>Nếu Tôi Vẫn Không Chắc Chắn Số Đo Của Mình Có Chính Xác Không?</h4>
                </p>
                <p>Chúng tôi tự tin rằng nếu bạn làm theo hướng dẫn và video đo số đo một cách kỹ lưỡng, trang phục của
                    bạn sẽ vừa vặn hoàn hảo. Trong quá trình đo, nếu bạn không chắc chắn về một số đo nào đó hoặc có câu
                    hỏi, đừng ngần ngại trò chuyện với chúng tôi qua chat trực tuyến trên website trong giờ làm việc
                    hoặc gửi email đến <a href="mailto:threentailored@gmail.com">threentailored@gmail.com</a> — chúng tôi luôn
                    sẵn sàng hỗ trợ.</p>

                <p>Ngay sau khi đơn hàng và số đo của bạn được nhận, thuật toán đo lường của chúng tôi sẽ tự động phát
                    hiện bất kỳ sai sót nào và các thợ may chuyên nghiệp sẽ kiểm tra lại số đo của bạn một lần nữa trước
                    khi bắt đầu may.</p>

                <p>Hãy yên tâm rằng, tất cả các trang phục của THREEN TAILORED, dù được bạn tự đo tại nhà hay được đo tại
                    showroom bởi các Chuyên Gia Tư Vấn, đều được bảo vệ bởi <strong>Chính Sách Hoàn Hảo Đảm Bảo Vừa
                        Vặn</strong>. *Trong trường hợp không may trang phục của bạn không vừa vặn như mong đợi, chúng
                    tôi cung cấp ba giải pháp đơn giản để đảm bảo bạn hoàn toàn hài lòng với sản phẩm của mình.</p>

            </div>
            <div class="faq-item">
                <h2>Làm thế nào để tôi đặt hàng lại?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <p>
                <h4>Làm Thế Nào Để Đặt Lại Trang Phục?</h4>
                </p>
                <p>Để đặt lại một sản phẩm, bạn chỉ cần đăng nhập vào tài khoản THREEN TAILORED và truy cập vào mục “Đơn Hàng
                    Của Tôi” (lưu ý rằng số đo của bạn đã được lưu trữ trong tài khoản). Sau đó, chọn đơn hàng và trang
                    phục bạn muốn đặt lại, nhấn “Đặt hàng” và tiến hành thanh toán. Nếu bạn muốn đặt lại trực tiếp tại
                    showroom, bạn có thể đặt lịch hẹn tại đây, hoặc liên hệ với chúng tôi qua các số điện thoại:
                    <strong>02 92222801</strong> (VN), <strong>+1 646 609 4954</strong> (Mỹ), hoặc <strong>+64 9 887
                        7263</strong> (New Zealand), và chúng tôi sẽ hỗ trợ bạn trong quá trình đặt lại đơn hàng.
                </p>

                <p>
                <h4>Tại Sao Nên Mua Hai Quần Tây Khi Mua Bộ Suit?</h4>
                </p>
                <p>Chúng tôi khuyến khích bạn mua hai chiếc quần tây khi chọn bộ suit, vì quần thường bị hao mòn nhanh
                    hơn so với áo khoác, đặc biệt khi bạn mặc hàng ngày (áo khoác thường chỉ mặc vài giờ trong ngày). Do
                    đó, việc sở hữu thêm một chiếc quần để thay đổi là rất hợp lý. Bên cạnh đó, chiếc quần thứ hai sẽ
                    được may từ cùng một cuộn vải, đảm bảo tính đồng nhất về màu sắc và độ nhuộm. Mỗi cuộn vải có thể có
                    những biến đổi nhỏ, vì vậy việc mua hai chiếc quần và một chiếc áo khoác từ cùng một cuộn vải sẽ
                    giúp bộ suit của bạn hoàn hảo hơn, đồng thời duy trì tính thẩm mỹ cao khi mặc.</p>
                <p>
                <h4>Tôi Có Thể Tùy Chỉnh Trang Phục Sau Khi Đặt Hàng Không?</h4>
                </p>
                <p>Chắc chắn! Sau khi bạn đặt hàng, nếu bạn muốn thay đổi chi tiết nào về trang phục, chẳng hạn như màu
                    sắc, kiểu dáng hoặc chất liệu, bạn chỉ cần liên hệ với chúng tôi trong vòng 48 giờ kể từ thời điểm
                    đặt hàng. Chúng tôi sẽ cố gắng hết sức để thực hiện điều chỉnh theo yêu cầu của bạn trước khi bắt
                    đầu quá trình sản xuất.</p>

                <p>
                <h4>THREEN TAILORED Có Cung Cấp Dịch Vụ Sửa Đổi Sau Khi Đã Nhận Trang Phục Không?</h4>
                </p>
                <p>Vâng, chúng tôi cung cấp dịch vụ sửa đổi để đảm bảo trang phục của bạn hoàn hảo nhất. Nếu sau khi
                    nhận hàng bạn cảm thấy cần điều chỉnh một số chi tiết nhỏ về độ vừa vặn hoặc kiểu dáng, hãy liên hệ
                    với chúng tôi ngay để được hỗ trợ sửa chữa miễn phí trong vòng 30 ngày sau khi nhận hàng.</p>

            </div>
            <div class="faq-item">
                <h2>Làm sao tôi có thể xem và cảm nhận các mẫu vải trước khi quyết định mua?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <h4>Tôi không thể chọn giữa nhiều loại vải và muốn xem thử trước khi quyết định mua, làm sao để có thể
                    làm vậy?</h4>
                <p>Bạn có thể đặt mua <strong>bộ mẫu vải</strong> và nhận các mẫu vải có sẵn trong bộ sưu tập của chúng
                    tôi. Mỗi bộ mẫu chứa tối đa 5 loại vải, và bạn có thể đặt mua nhiều bộ mẫu nếu muốn. Sau khi đặt
                    hàng, bạn sẽ nhận được một email với mã giảm giá tương đương với tổng giá trị của các bộ mẫu đã mua,
                    để sử dụng cho lần mua tiếp theo. <strong>Vận chuyển bộ mẫu vải luôn miễn phí.</strong></p>

                <h4>Vải len có thể mặc vào mùa hè không?</h4>
                <p>Vải len cũng có thể mặc vào mùa hè nhờ vào khả năng điều hòa nhiệt độ tự nhiên của sợi vải. Để tìm
                    những loại vải phù hợp với mùa hè, bạn có thể áp dụng bộ lọc <strong>"Mùa: Xuân/Hè"</strong> trên
                    website của chúng tôi.</p>

                <h4>Tại sao một số loại vải lại đắt hơn những loại khác?</h4>
                <p>Mỗi loại vải có những đặc tính riêng biệt: các yếu tố như loại sợi, độ mịn của vải, hay kỹ thuật may
                    đo có thể khiến một loại vải trở nên quý giá và đắt tiền hơn những loại khác.</p>

                <h4>Các thông số "độ mịn", "giá trị", "trọng lượng" và "nhiệt độ" có ý nghĩa gì?</h4>

                <h5>Độ mịn:</h5>
                <p>Đây là chỉ số đo đường kính trung bình của sợi vải. Giá trị càng cao, sợi vải càng mịn và quý hiếm.
                    Những loại vải có độ mịn cao thường rất mỏng manh và cần chăm sóc kỹ lưỡng.</p>

                <p>Độ mịn của vải len thường được phân loại theo hệ thống “super”, với các giá trị từ 100’s đến 250’s:
                </p>
                <ul>
                    <li><strong>100’s – 140’s:</strong> Len bền, phù hợp cho các trang phục hàng ngày.</li>
                    <li><strong>>150’s:</strong> Len cực kỳ mịn, mềm mại và giá trị.</li>
                    <li><strong>>160’s:</strong> Len siêu mịn, lý tưởng cho các loại vải nhẹ và sang trọng, nhưng cần
                        chăm sóc đặc biệt vì độ mỏng manh.</li>
                </ul>

                <p>Độ mịn quyết định giá trị và cách sử dụng vải len, nhưng không phải là yếu tố duy nhất để đánh giá
                    chất lượng. Vải càng mịn thì càng mềm mại và sang trọng, nhưng chất lượng của vải cũng phụ thuộc vào
                    loại nguyên liệu và quy trình sản xuất.</p>

                <h5>Trọng lượng:</h5>
                <p>Là chỉ số đo trọng lượng của mỗi mét vải. Các loại vải “bốn mùa” thường có trọng lượng từ <strong>240
                        - 270 g/m</strong>, phù hợp để mặc từ mùa thu đến mùa xuân. Vải len dành cho mùa hè có trọng
                    lượng dưới <strong>240 g/m</strong>, trong khi vải dành cho mùa đông có trọng lượng từ <strong>270
                        g/m</strong> trở lên.</p>

                <p>Lưu ý rằng hệ thống đo trọng lượng này chỉ áp dụng cho vải len. Ví dụ, vải lanh có thể nặng tới
                    <strong>390 g/m</strong>, nhưng nhờ tính năng thoáng khí và độ bền, vải lanh là một trong những chất
                    liệu lý tưởng cho mùa hè.
                </p>

                <h5>Nhiệt độ:</h5>
                <p>Là mức độ ấm áp mà một loại vải có thể mang lại. Có những loại vải rất nặng nhưng vẫn phù hợp cho mùa
                    hè (như vải lanh), trong khi có những loại vải nhẹ nhưng lại giữ ấm rất tốt (như cashmere).
                    <strong>Nhiệt độ</strong> là một yếu tố bổ sung, cần được xem xét cùng với <strong>trọng
                        lượng</strong> của vải.
                </p>

                <h5>Sự xuất sắc:</h5>
                <p>Đây là yếu tố đánh giá mức độ độc đáo của vải, dựa trên các chỉ số như độ mịn, loại sợi và sự uy tín
                    của thương hiệu vải.</p>


            </div>
            <div class="faq-item">
                <h2>Mua Sản Phẩm Của Tôi</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <p>
                <h4>Các Cách Thanh Toán Đơn Hàng?</h4>
                </p>
                <p>Chúng tôi chấp nhận các hình thức thanh toán sau:</p>
                <ul>
                    <li>Tiền mặt (chỉ tại các Showroom)</li>
                    <li>Thẻ tín dụng ( Visa)</li>
                    <li>Chuyển khoản Momo</li>
                    <li>ZaloPay</li>

                </ul>

                <p>
                <h4>Có Phải Thanh Toán Thuế hoặc Phí Hải Quan Không?</h4>
                </p>
                <p>Vì chúng tôi chỉ cung cấp dịch vụ và sản phẩm trong phạm vi Việt Nam, bạn không cần phải thanh toán
                    bất kỳ loại thuế hay phí hải quan nào khi đặt hàng từ THREEN TAILORED. Các đơn hàng sẽ được tính theo giá
                    niêm yết và giao hàng tận nơi trong nước.</p>

            </div>
            <div class="faq-item">
                <h2>Bạn Cần Hỗ trợ kỹ thuật?</h2>
                <i class="fas fa-chevron-down"></i>
            </div>
            <div class="faq-content">
                <p>
                <h4>Tôi Quên Mật Khẩu/Tên Tài Khoản, Tôi Cần Làm Gì?</h4>
                </p>
                <p>Đơn giản, bạn chỉ cần nhấp vào "Quên Mật Khẩu?". Sau đó, bạn có thể yêu cầu thay đổi mật khẩu và làm
                    theo hướng dẫn bạn nhận được qua email. Hãy nhớ kiểm tra hộp thư đến (và cả hộp thư rác).</p>
                <p>Để được hỗ trợ thêm, vui lòng liên hệ với chúng tôi qua email <a
                        href="threentailored@gmail.com">threentailored@gmail.com</a>.</p>

                <p>
                <h4>Vấn Đề Thanh Toán</h4>
                </p>
                <p>Nếu bạn gặp khó khăn trong việc hoàn tất thanh toán, vui lòng thử các bước sau:</p>
                <ul>
                    <li>Kiểm tra lại thông tin thẻ và/hoặc ngày hết hạn của thẻ bạn đang sử dụng.</li>
                    <li>Đảm bảo thẻ của bạn đã được kích hoạt cho thanh toán trực tuyến.</li>
                    <li>Thử sử dụng một thiết bị hoặc trình duyệt khác.</li>
                    <li>Thử thanh toán bằng phương thức khác, ví dụ như thẻ khác, Momo hoặc ZaloPay.</li>
                </ul>
                <p>Nếu vấn đề vẫn tiếp tục, vui lòng liên hệ với ngân hàng của bạn để tìm hiểu thêm, có thể thẻ của bạn
                    đã bị tạm khóa vì lý do bảo mật.</p>
                <p>Để được hỗ trợ thêm, vui lòng liên hệ với chúng tôi qua email <a
                        href="threentailored@gmail.com">threentailored@gmail.com</a>.</p>

                <p>
                <h4>Làm Thế Nào Để Tôi Cập Nhật Thông Tin Về Các Sự Kiện Và Khuyến Mãi Của THREEN TAILORED?</h4>
                </p>
                <p>Bạn có thể đăng ký nhận bản tin của chúng tôi và theo dõi các trang Facebook và Instagram của chúng
                    tôi để nhận thông tin mới nhất về sự kiện và chương trình khuyến mãi.</p>

                <p>
                <h4>Tôi Có Thể Lưu Một Bộ Trang Phục Đã Tùy Chỉnh Nhưng Chưa Muốn Mua Ngay Được Không?</h4>
                </p>
                <p>Tất cả các sản phẩm trong giỏ hàng của bạn sẽ được lưu lại trong vài ngày. Trước khi giỏ hàng bị hủy,
                    bạn sẽ nhận được thông báo qua email.</p>

                <div class="faq-item">
                    <h2>Tôi có một câu hỏi khác?</h2>
                    <i class="fas fa-chevron-down"></i>
                </div>
                <div class="faq-content">
                    <p>
                    <h4>Đừng Lo Lắng. Hãy Liên Hệ Với Bộ Phận Hỗ Trợ Khách Hàng Của Chúng Tôi Ngay Hôm Nay - Không Có
                        Câu
                        Hỏi
                        Nào Là Không Hợp Lý!</h4>
                    </p>
                    <p>Chúng tôi luôn sẵn sàng hỗ trợ bạn. Nếu bạn có bất kỳ câu hỏi nào, đừng ngần ngại liên hệ với
                        chúng
                        tôi
                        qua email <a href="threentailored@gmail.com">threentailored@gmail.com</a>, trò chuyện trực tuyến trên
                        website, hoặc gọi đến số <strong>028 6261 8888</strong> (VN). Chúng tôi rất mong được nghe ý
                        kiến
                        từ
                        bạn!
                    </p>

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