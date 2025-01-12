<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
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
        <!--Section-->
        <section class="hero-section d-flex align-items-center justify-content-center text-center mb-5">
            <div class="container">
                <h1 class="display-4 text-white">Thiết Kế Nên Những Kiệt Tác Hoàn Hảo</h1>
                <p class="lead text-white">May đo riêng biệt, tinh tế trong từng chi tiết, mang đậm dấu ấn phong cách
                    của bạn</p>
                <div class="home-btn-shop">
                    <a href="MayAoController" class="shop-btn text-center">Thiết Kế Ngay</a>
                </div>
            </div>
        </section>
        <div class="welcome-section text-center">
            <p>
                Mỗi trang phục là một tác phẩm độc đáo, được chế tác tỉ mỉ theo số đo và cá nhân hóa hoàn toàn, phản ánh
                phong cách riêng của bạn.
                Tựa như một tác phẩm nghệ thuật, mỗi bộ suit là sự kết tinh của cá tính và gu thẩm mỹ độc nhất.
            </p>
            <p>
                Khám phá tầm nhìn mới của chúng tôi về nghệ thuật may đo—không gian dành riêng cho sự khác biệt và nét
                thanh lịch của chính bạn.
            </p>
        </div>
    
    <div class="my-5">
        <!-- Category Section -->
        <section class="category-section">
            <div class="container">
                <h2 class="text-left mb-5">Danh Mục Nổi Bật</h2>
                <div class="row">
                    <!-- Suit Category -->
                    <div class="col-md-3 col-sm-6"><a href="../../../../vestCongSo.html">
                            <div class="category-box">
                                <img src="resources/images/suitCategory.jpg" alt="Suit" class="img-fluid">
                                <h3>BỘ VEST</h3>
                            </div>
                        </a>
                    </div>


                    <!-- Shirt Category -->
                    <div class="col-md-3 col-sm-6"><a href="aoSoMi.jsp">
                            <div class="category-box">
                                <img src="resources/images/shirtCategory.jpg" alt="Shirt" class="img-fluid">
                                <h3>ÁO SƠ MI</h3>
                            </div>
                        </a>
                    </div>

                    <!-- Trouser Category -->
                    <div class="col-md-3 col-sm-6"><a href="../../../../quanAu.html">
                            <div class="category-box">
                                <img src="resources/images/trouserCategory.jpg" alt="Trouser" class="img-fluid">
                                <h3>QUẦN ÂU</h3>
                            </div>
                        </a>
                    </div>

                    <!-- Accessories Category -->
                    <div class="col-md-3 col-sm-6"><a href="caVat.jsp">
                            <div class="category-box">
                                <img src="resources/images/accessoriesCategory.jpg" alt="Accessories" class="img-fluid">
                                <h3>CÀ VẠT</h3>
                            </div>
                        </a>
                    </div>
                </div>
            </div>
        </section>
    </div>

    <!-- Banner Section -->
    <div class="banner">
        <div class="banner-text-left">
            <h2>THU ĐÔNG 2024</h2>
        </div>
        <div class="banner-text-right">
            <h2>BỘ SƯU TẬP MỚI</h2>
            <a href="collection.jsp" class="shop-btn text-center">ĐẾN BỘ SƯU TẬP</a>
        </div>
    </div>
    <!--Carousel-->
    <div id="howItWorksCarousel" class="carousel slide" data-bs-ride="carousel">
        <h2 class="carousel-title">Cách Thức Hoạt Động</h2>
        <div class="carousel-inner">
            <!-- Slide 1 -->
            <div class="carousel-item active">
                <div class="carousel-content">
                    <img src="resources/images/theFabric.webp" class="carousel-image" alt="Step 1">
                    <div class="carousel-text">
                        <h3>Bước 1</h3>
                        <h4>Tinh Hoa Sản Xuất Tại Việt Nam</h4>
                        <p>Hãy chọn chất liệu vải phù hợp với phong cách và dịp sử dụng của bạn.</p>
                        <p>Nếu bạn chưa chắc chắn, hãy tạo bộ mẫu vải để có thể chạm và cảm nhận từng chất liệu,
                            hoặc ghé thăm xưởng may của chúng tôi để được tư vấn trực tiếp.</p>
                    </div>
                </div>
            </div>

            <!-- Slide 2 -->
            <div class="carousel-item">
                <div class="carousel-content">
                    <img src="resources/images/personalization.webp" class="carousel-image" alt="Step 2">
                    <div class="carousel-text">
                        <h3>Bước 2</h3>
                        <h4>Tùy Chỉnh Trang Phục Độc Đáo Của Bạn</h4>
                        <p>Lựa chọn từng chi tiết cho bộ trang phục: từ kiểu dáng, ve áo,
                            cổ tay, túi áo, cúc áo, đến những điểm nhấn tinh tế khác.
                        </p>
                        <p>Đội ngũ chuyên gia của chúng tôi sẽ đồng hành cùng bạn trong suốt quá trình,<br>
                            đảm bảo trang phục vừa vặn hoàn hảo và mang lại sự thoải mái tối đa.</p>
                    </div>
                </div>
            </div>

            <!-- Slide 3 -->
            <div class="carousel-item">
                <div class="carousel-content">
                    <img src="resources/images/measurement.webp" class="carousel-image" alt="Step 3">
                    <div class="carousel-text">
                        <h3>Bước 3</h3>
                        <h4>Tại Xưởng May Hoặc Trực Tuyến</h4>
                        <p>Đến một trong các cửa hàng THREEN TAILORED để được đo kích thước: các Chuyên Gia
                            Phong Cách của chúng tôi sẽ sẵn lòng chào đón và hỗ trợ bạn để đạt được sự vừa vặn hoàn hảo.
                        </p>
                        <p>Hoặc có thể tham khảo hướng dẫn của chúng tôi để tự nhập số đo một cách<br> dễ dàng và chính
                            xác.</p>
                    </div>
                </div>
            </div>
        </div>

        <!-- nút cho Carousel -->
        <button class="carousel-control-prev" type="button" data-bs-target="#howItWorksCarousel" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#howItWorksCarousel" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
        </button>
    </div>
   
</section>
    <!-- Footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <!-- js -->
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>
</body>


</html>