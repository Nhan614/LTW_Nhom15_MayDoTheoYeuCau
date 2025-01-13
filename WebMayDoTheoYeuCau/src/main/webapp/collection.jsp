<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Collection - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

</head>

<body>
    <!-- header -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

    <!-- secsion 1 -->
    <div id="sec1">
        <div class="top-bar text-center py-2">
            <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>
        <div class="container">
            <div class="container">
                <div class="banner-text-left">
                    <h3>THU ĐÔNG 2024</h3>
                    <p class="collection-text">
                        Phong cách cổ điển vượt thời gian và thanh lịch là cốt lõi của bộ sưu tập mùa này.
                        Kiểu dáng được cải tiến nhẹ nhàng và thoải mái hơn, giúp bạn có thể phối trang phục theo nhiều phong cách khác nhau nhưng vẫn dễ dàng di chuyển, vận động.
                        Thỏa thích kết hợp các màu sắc và họa tiết để tăng thêm nét hiện đại, linh hoạt cho tủ quần áo của bạn.
                    </p>
                </div>

                <!-- Suits -->

                <div class="collection-banner">
                    <div class="collection-banner-img">
                        <img src="resources/images/collectionSuit.jpg" alt="">
                    </div>

                    <div class="collection-alpha">
                        <h2 class="text-white text-center ">BỘ VEST</h2>
                        <p class="collection-text-costume">Tạo nên thiết kế bộ đồ ưng ý nhất đối với bạn</p>
                        <a href="products?type=vestCongSo"  class="shop-btn text-center">Khám Phá</a>
                    </div>
                </div>
                <div class="container mt-5">
                    <div class="row">
                        <!-- Dữ liệu (bên trái) -->
                        <div class="col-lg-6">
                            <!-- Hàng 1 -->
                            <div class="row">
                                <c:forEach var="vest" items="${vests}" varStatus="status">
                                    <c:if test="${status.index < 2}">
                                        <div class="col-lg-12">
                                            <div class="card mb-3">
                                                <div class="row g-0 align-items-center">
                                                    <!-- Dữ liệu -->
                                                    <div class="col-md-8">
                                                        <div class="card-body">
                                                            <h5 class="card-title">${vest.productName}</h5>
                                                            <p class="card-text">Giá: ${vest.price} VNĐ</p>
                                                            <a href="product-detail?id=${vest.id}" class="btn btn-primary">Xem Chi Tiết</a>
                                                        </div>
                                                    </div>
                                                    <!-- Ảnh -->
                                                    <div class="col-md-4">
                                                        <a href="product-detail?id=${vest.id}">
                                                            <img src="${vest.image}" class="img-fluid rounded-start" alt="${vest.productName}">
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>

                            <!-- Hàng 2 -->
                            <div class="row mt-5">
                                <c:forEach var="vest" items="${vests}" varStatus="status">
                                    <c:if test="${status.index >= 2 && status.index < 4}">
                                        <div class="col-lg-12">
                                            <div class="card mb-3">
                                                <div class="row g-0 align-items-center">
                                                    <!-- Dữ liệu -->
                                                    <div class="col-md-8">
                                                        <div class="card-body">
                                                            <h5 class="card-title">${vest.productName}</h5>
                                                            <p class="card-text">Giá: ${vest.price} VNĐ</p>
                                                            <a href="product-detail?id=${vest.id}" class="btn btn-primary">Xem Chi Tiết</a>
                                                        </div>
                                                    </div>
                                                    <!-- Ảnh -->
                                                    <div class="col-md-4">
                                                        <a href="product-detail?id=${vest.id}">
                                                            <img src="${vest.image}" class="img-fluid rounded-start" alt="${vest.productName}">
                                                        </a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </div>

                        <!-- Ảnh lớn (bên phải) -->
                        <div class="col-lg-6">
                            <div class="collection-img-review">
                                <img src="resources/images/collection-suit-review1.webp" class="img-fluid" alt="Collection Review">
                            </div>
                        </div>
                    </div>
                </div>



                <!-- Jacket -->

                <div class="collection-banner mt-lg-5">
                    <div class="collection-banner-img">
                        <img src="resources/images/collection-jacket-banner.jpg" alt="">
                    </div>
                    <div class="collection-alpha">
                        <h2 class="text-white text-center">ÁO BLAZER</h2>
                        <p class="collection-text-costume">Các loại áo khác được thiết kế tỉ mỉ với chất liệu vải tốt
                            nhất
                        </p>
                        <a href="products?type=blazer" class="shop-btn text-center">Khám Phá</a>
                    </div>
                </div>
                <div class="container mt-5">
                    <div class="row">
                        <!-- Beta -->
                        <div class="col-lg-6">
                            <div class="collection-img-review">
                                <img src="resources/images/collection-jacket-review1.jpg" alt="">
                            </div>
                        </div>

                        <!-- alpha -->
                        <div class="col-lg-6">
                            <!-- Hàng 1 -->
                            <div class="row">
                                <c:forEach var="blazers" items="${blazers}" varStatus="status">
                                    <c:if test="${status.index < 2}"> <!-- Hiển thị 2 sản phẩm đầu -->
                                        <div class="col-lg-6">
                                            <div class="card">
                                                <a href="product-detail?id=${blazers.id}">
                                                    <img src="${blazers.image}" class="card-img-top" alt="${vest.productName}">
                                                </a>
                                                <div class="card-body">
                                                    <h5 class="card-title">${blazers.productName}</h5>
                                                    <p class="card-text">Giá: ${blazers.price} VNĐ</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>

                            <!-- Hàng 2 -->
                            <div class="row mt-5">
                                <c:forEach var="blazers" items="${blazers}" varStatus="status">
                                    <c:if test="${status.index >= 2 && status.index < 4}"> <!-- Hiển thị sản phẩm 3 và 4 -->
                                        <div class="col-lg-6">
                                            <div class="card">
                                                <a href="product-detail?id=${blazers.id}">
                                                    <img src="${blazers.image}" class="card-img-top" alt="${blazers.productName}">
                                                </a>
                                                <div class="card-body">
                                                    <h5 class="card-title">${blazers.productName}</h5>
                                                    <p class="card-text">Giá: ${blazers.price} VNĐ</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </div>
                    </div>
                </div>


                <!-- Shirt -->

                <div class="collection-banner mt-lg-5">
                    <div class="collection-banner-img">
                        <img src="resources/images/collection-shirt-banner.webp" alt="">
                    </div>
                    <div class="collection-alpha">
                        <h2 class="text-white text-center">ÁO SƠ MI</h2>
                        <p class="collection-text-costume">Lựa chọn kiểu dáng và màu sắc mà bạn thích</p>
                        <a href="products?type=aoSoMi" class="shop-btn text-center">Khám Phá</a>
                    </div>
                </div>
                <div class="container mt-5">
                    <div class="row">


                        <!-- alpha -->
                        <div class="col-lg-6">
                            <!-- Hàng 1 -->
                            <div class="row">
                                <c:forEach var="aoSoMi" items="${aoSoMi}" varStatus="status">
                                    <c:if test="${status.index < 2}"> <!-- Hiển thị 2 sản phẩm đầu -->
                                        <div class="col-lg-6">
                                            <div class="card">
                                                <a href="product-detail?id=${aoSoMi.id}">
                                                    <img src="${aoSoMi.image}" class="card-img-top" alt="${aoSoMi.productName}">
                                                </a>
                                                <div class="card-body">
                                                    <h5 class="card-title">${aoSoMi.productName}</h5>
                                                    <p class="card-text">Giá: ${aoSoMi.price} VNĐ</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>

                            <!-- Hàng 2 -->
                            <div class="row mt-5">
                                <c:forEach var="aoSoMi" items="${aoSoMi}" varStatus="status">
                                    <c:if test="${status.index >= 2 && status.index < 4}"> <!-- Hiển thị sản phẩm 3 và 4 -->
                                        <div class="col-lg-6">
                                            <div class="card">
                                                <a href="product-detail?id=${aoSoMi.id}">
                                                    <img src="${aoSoMi.image}" class="card-img-top" alt="${aoSoMi.productName}">
                                                </a>
                                                <div class="card-body">
                                                    <h5 class="card-title">${aoSoMi.productName}</h5>
                                                    <p class="card-text">Giá: ${aoSoMi.price} VNĐ</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </div>
                        <!-- Beta -->
                        <div class="col-lg-6">
                            <div class="collection-img-review">
                                <img src="resources/images/shirtLightBlueStripedCotton.jpg" alt="">
                            </div>
                        </div>
                    </div>
                </div>

                <!-- Trouser -->

                <div class="collection-banner mt-lg-5">
                    <div class="collection-banner-img">
                        <img src="resources/images/collection-trouser-banner.png" alt="">
                    </div>
                    <div class="collection-alpha">
                        <h2 class="text-white text-center">QUẦN ÂU</h2>
                        <p class="collection-text-costume">Kiểu dáng đẹp mắt thoải mái khi mặc</p>
                        <a href="products?type=quanAu" class="shop-btn text-center">Khám Phá</a>
                    </div>
                </div>
                <div class="container mt-5 mb-5">
                    <div class="row">
                        <!-- Beta -->
                        <div class="col-lg-6">
                            <div class="collection-img-review">
                                <img src="resources/images/collection-trouser-review1.jpg" alt="">
                            </div>
                        </div>

                        <!-- alpha -->
                        <div class="col-lg-6">
                            <!-- Hàng 1 -->
                            <div class="row">
                                <c:forEach var="quanAu" items="${quanAu}" varStatus="status">
                                    <c:if test="${status.index < 2}"> <!-- Hiển thị 2 sản phẩm đầu -->
                                        <div class="col-lg-6">
                                            <div class="card">
                                                <a href="product-detail?id=${quanAu.id}">
                                                    <img src="${quanAu.image}" class="card-img-top" alt="${quanAu.productName}">
                                                </a>
                                                <div class="card-body">
                                                    <h5 class="card-title">${quanAu.productName}</h5>
                                                    <p class="card-text">Giá: ${quanAu.price} VNĐ</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>

                            <!-- Hàng 2 -->
                            <div class="row mt-5">
                                <c:forEach var="quanAu" items="${quanAu}" varStatus="status">
                                    <c:if test="${status.index >= 2 && status.index < 4}"> <!-- Hiển thị sản phẩm 3 và 4 -->
                                        <div class="col-lg-6">
                                            <div class="card">
                                                <a href="product-detail?id=${quanAu.id}">
                                                    <img src="${quanAu.image}" class="card-img-top" alt="${quanAu.productName}">
                                                </a>
                                                <div class="card-body">
                                                    <h5 class="card-title">${quanAu.productName}</h5>
                                                    <p class="card-text">Giá: ${quanAu.price} VNĐ</p>
                                                </div>
                                            </div>
                                        </div>
                                    </c:if>
                                </c:forEach>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
    <!-- Footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <!-- js -->

    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/backtotop.js"></script>
    <script src="resources/js/quit.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>

</body>

</html>