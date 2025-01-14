<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tin Tức - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/footer/blog.css">

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

    <div class="container my-4">
        <!-- Breadcrumb -->
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="home.jsp">Trang chủ</a></li>
                <li class="breadcrumb-item active" aria-current="page">Tin tức</li>

            </ol>
        </nav>

        <!-- Title -->
        <h1 class="mb-4">TIN TỨC </h1>

        <!-- News Card -->
        <div class="card news-card shadow">
            <div class="row g-0 align-items-stretch">
                <!-- Text Section -->
                <div class="col-md-5 p-4 d-flex flex-column justify-content-center">
                    <div class="d-flex align-items-center mb-2">
                        <span class="badge bg-dark text-uppercase me-3">Tin tức mới</span>
                        <p class="text-muted mb-4">Ngày 11/11/2024</p>
                    </div>
                    <a href="blogvest.jsp"> <h3>HUYỀN THOẠI PHƯƠNG ĐÔNG | BST THU ĐÔNG 2024</h3></a>
                    <p>
                        Ra mắt Bộ Sưu Tập Thu Đông mới 2024, THREEN TAILORED dành tặng khách </br>
                        hàng chương trình quà tặng đặc biệt "Nhân ba điểm tích lũy" với</br>
                        đơn hàng có sẵn...
                    </p>
                    <a href="blogvest.jsp" class="text-decoration-none fw-bold">Tìm hiểu thêm →</a>
                </div>

                <!-- Image Section -->
                <a href="blogvest.jsp" class="col-md-7 position-relative">
                    <img src="resources/images/vest31.jpg" alt="Aristino - BST Thu Đông" class="img-fluid">
                    <div
                        class="overlay position-absolute top-0 start-0 w-100 h-100  flex-column align-items-center justify-content-center">
                        <h3 class=" fw-bold text-center mb-2">
                            Huyền Thoại<br>Phương Đông
                        </h3>
                        <h6 class="text-white text-center fs-7">BST Thu Đông 2024</h6>
                    </div>
                </a>


            </div>

        </div>
    </div>
    <!-- Tin nhanh 360 Section -->

    <div class="row d-flex justify-content-center">
        <div class="col-md-7">
            <div class="row">
                <!-- Column 1 -->
                <h2 class="mt-5 mb-4">TẤT CẢ BÀI VIẾT </h2>
                <a href="blogvest.jsp" class="col-md-4 mb-4">
                    <div class="card text-center border-0 shadow-sm">
                        <img src="resources/images/blog9.webp" class="card-img-top" alt="Bóng đá Việt Nam">
                        <div class="card-body bg-light">
                            <h6 class="text-primary fw-bold">Top 8 bộ vest nam thanh niên yêu thích nhất 2024
                            </h6>
                            <p class="card-text">Năm 2024, phong cách vest nam ghi dấu ấn với thiết kế hiện đại,
                                trẻ
                                trung và đa dạng. Từ vest truyền thống đến kiểu dáng phá cách, các mẫu này giúp
                                phái
                                mạnh tự tin, phù hợp nhiều dịp quan trọng.
                            </p>
                        </div>
                    </div>
                </a>

                <!-- Column 2 -->
                <a href="blogvest.jsp" class="col-md-4 mb-4">
                    <div class="card text-center border-0 shadow-sm">
                        <img src="resources/images/blog2.jpg" class="card-img-top" alt="Bóng đá Việt Nam">
                        <div class="card-body bg-light">
                            <h6 class="text-primary fw-bold">Chọn vest nam giản dị cho đàn ông tuổi trung niên
                            </h6>
                            <p class="card-text">Vest thoải mái, vừa vặn và mang phong cách cổ điển là lựa chọn
                                hoàn
                                hảo cho quý ông trung niên. Những bộ vest này không chỉ tạo vẻ lịch lãm mà còn
                                phù
                                hợp khi tham gia tiệc hay tiếp khách hàng.</p>
                        </div>
                    </div>
                </a>

                <!-- Column 3 -->
                <a href="blogvest.jsp" class="col-md-4 mb-4">
                    <div class="card text-center border-0 shadow-sm">
                        <img src="resources/images/blog3.jpg" class="card-img-top" alt="Sức khoẻ">
                        <div class="card-body bg-light">
                            <h6 class="text-primary fw-bold">Giá may áo vest nam gồm phụ thuộc vào yếu tố nào?
                            </h6>
                            <p class="card-text">Áo vest nam trơn màu trung tính sang trọng, chất liệu vải cao
                                cấp,
                                độ tinh xảo trong may đo và thiết kế phù hợp với dáng người là những yếu tố
                                quyết
                                định giá trị của một bộ vest nam đẹp.</p>
                        </div>
                    </div>
                </a>

                <!-- Column 4 -->
                <a href="blogvest.jsp" class="col-md-4 mb-4">
                    <div class="card text-center border-0 shadow-sm">
                        <img src="resources/images/blog6.jpg" class="card-img-top" alt="Phim">
                        <div class="card-body bg-light">
                            <h6 class="text-primary fw-bold">5 mẫu áo vest nam không bao giờ lỗi thời nên lựa
                                chọn
                            </h6>
                            <p class="card-text">Vest nam hiện nay rất đa dạng về chủng loại cũng như màu sắc.
                                Hoài
                                Giang shop gợi ý 5 mẫu vest được sử dụng phổ biến và không bị lỗi thời.</p>
                        </div>
                    </div>
                </a>

                <!-- Column 5 -->
                <a href="blogvest.jsp" class="col-md-4 mb-4">
                    <div class="card text-center border-0 shadow-sm">
                        <img src="resources/images/blog10.jpg" class="card-img-top" alt="Sức khoẻ">
                        <div class="card-body bg-light">
                            <h6 class="text-primary fw-bold">THREEN TAILORED: Biểu Tượng của Phong Cách và Lịch Lãm
                            </h6>
                            <p class="card-text">Vest nam từ lâu đã trở thành biểu tượng của sự thanh lịch,
                                chuyên
                                nghiệp và sự tự tin, là lựa chọn hàng đầu cho những dịp trang trọng.</p>
                        </div>
                    </div>
                </a>

                <!-- Column 6 -->
                <a href="blogvest.jsp" class="col-md-4 mb-4">
                    <div class="card text-center border-0 shadow-sm">
                        <img src="resources/images/blog7.jpg" class="card-img-top" alt="Truyền hình">
                        <div class="card-body bg-light">
                            <h6 class="text-primary fw-bold">Chất Liệu Vest Nam: Yếu Tố Quyết Định Sự Đẳng Cấp Của
                                Bạn
                            </h6>
                            <p class="card-text">Từ len đến cotton, chất liệu vest không chỉ ảnh hưởng
                                đến cảm giác thoải mái mà còn quyết định vẻ ngoài lịch lãm, sang trọng và thể hiện
                                phong cách cá nhân.</p>
                        </div>
                    </div>
                </a>
            </div>
        </div>
        <!-- Bài viết mới nhất Section -->
        <div class="col-md-3">
            <div class="row list-blog">
                <h4 class="mt-5 mb-3">Bài viết mới nhất</h4>
                <div class="list-group">
                    <!-- Bài viết 1 -->
                    <a href="blogvest.jsp" class="list-group-item list-group-item-action d-flex align-items-start">
                        <img src="resources/images/blog6.jpg" alt="Post 1" class="me-3 img-thumbnail"
                            style="width: 80px; height: 80px;">
                        <div>
                            <h6 class="mb-1">5 mẫu áo vest nam không bao giờ lỗi thời nên lựa chọn</br>
                                <small class="text-muted">19.11.2024</small>
                            </h6>
                        </div>
                    </a>
                    <!-- Bài viết 2 -->
                    <a href="blogvest.jsp" class="list-group-item list-group-item-action d-flex align-items-start">
                        <img src="resources/images/blog2.jpg" alt="Post 2" class="me-3 img-thumbnail"
                            style="width: 80px; height: 80px;">
                        <div>
                            <h6 class="mb-1">Chọn vest nam giản dị cho đàn ông tuổi trung niên</br>
                                <small class="text-muted">23.11.2024</small>
                            </h6>
                        </div>
                    </a>
                    <!-- Bài viết 3 -->
                    <a href="blogvest.jsp" class="list-group-item list-group-item-action d-flex align-items-start">
                        <img src="resources/images/blog9.webp" alt="Post 3" class="me-3 img-thumbnail"
                            style="width: 80px; height: 80px;">
                        <div>
                            <h6 class="mb-1">Top 8 bộ vest nam thanh niên yêu thích nhất 2024</br>
                                <small class="text-muted">12.11.2024</small>
                            </h6>
                        </div>
                    </a>

                </div>
            </div>

            <!-- bài viết xem nhiều -->
            <div class="row list-blog">
                <h4 class="mt-2 mb-3">Bài viết nổi bật</h4>
                <div class="list-group">
                    <!-- Bài viết 4 -->
                    <a href="blogvest.jsp" class="list-group-item list-group-item-action d-flex align-items-start">
                        <img src="resources/images/blog10.jpg" alt="Post 1" class="me-3 img-thumbnail"
                            style="width: 80px; height: 80px;">
                        <div>
                            <h6 class="mb-1">THREEN TAILORED: Biểu Tượng của Phong Cách và Lịch Lãm</br>
                                <small class="text-muted">22.10.2024</small>
                            </h6>
                        </div>
                    </a>
                    <!-- Bài viết 5 -->
                    <a href="blogvest.jsp" class="list-group-item list-group-item-action d-flex align-items-start">
                        <img src="resources/images/blog7.jpg" alt="Post 2" class="me-3 img-thumbnail"
                            style="width: 80px; height: 80px;">
                        <div>
                            <h6 class="mb-1">Chất Liệu Vest Nam: Yếu Tố Quyết Định Sự Đẳng Cấp</br>
                                <small class="text-muted">2.10.2024</small>
                            </h6>
                        </div>
                    </a>
                    <!-- Bài viết 6 -->
                    <a href="blogvest.jsp" class="list-group-item list-group-item-action d-flex align-items-start">
                        <img src="resources/images/blog3.jpg" alt="Post 3" class="me-3 img-thumbnail"
                            style="width: 80px; height: 80px;">
                        <div>
                            <h6 class="mb-1">Giá may áo vest nam gồm phụ thuộc vào yếu tố nào?</br>
                                <small class="text-muted">17.10.2024</small>
                            </h6>
                        </div>
                    </a>

                </div>
            </div>
        </div>
    </div>
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
    
    <!-- back-to-top -->
    <a href="#" class="contact-btn shadow" onclick="toggleContactMenu(event)">
        <i class="fa-regular fa-comment-dots"></i>
        <span class="contact-text">Liên Hệ</span>
    </a>
    <div class="contact-menu">
        <div class="contact-item">
            <a href="https://www.facebook.com/"><i class="fa-brands fa-facebook"></i></a> Facebook
        </div>
        <div class="contact-item">
            <a href="contactUs.jsp"><i class="fa-solid fa-envelope"></i></a> Khiếu nại
        </div>
        <div class="contact-item">
            <a href="https://x.com/i/flow/login"><i class="fab fa-twitter"></i></a> Twitter
        </div>
        <div class="contact-item">
            <a href="https://www.instagram.com/"><i class="fa-brands fa-instagram"></i> Instagram</a></li>

        </div>
    </div>

    <a href="#" class="back-to-top">
        <i class="fa-solid fa-arrow-up"></i>
    </a>



    <!-- Footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <!-- js -->
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>
    
</body>


</html>