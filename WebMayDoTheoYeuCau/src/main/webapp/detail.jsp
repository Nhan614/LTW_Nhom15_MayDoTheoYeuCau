<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Detail - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
        type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
</head>

<body>
    <!-- menu -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

    <!-- sec1 -->
    <div id="sec1">

        <div class="top-bar text-center py-2">
            <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>

        <div class="container mt-5">
            <div class="row">
                <div class="col-md-6">
                    <img src="${product.image}" class="img-fluid" alt="${product.productName}">
                    <div class="detail-limg">
                        <img src="resources/images/vai1.jpg" class="img-fluid img-acs mx-auto" alt="Additional Image">
                        <img src="resources/images/cutAo1.png" class="img-fluid img-acs mx-auto" alt="Additional Image">
                    </div>
                </div>
                <div class="col-md-6">
                    <h1 class="display-4">${product.productName}</h1>
                    <p class="lead">Vải do <strong>${product.maker}</strong> sản xuất</p>
                    <h3 class="text-price">${product.price} VNĐ</h3>
                    <p class="mt-4">${product.description}</p>

                    <a href="custumize.jsp"><button class="btn-custumize btn-lg">THIẾT KẾ</button></a>

                    <div class="product-detail mt-4">
                        <h3>Chi Tiết</h3>
                        <p>Mã sản phẩm : ${product.id}</p>
                        <p>Chất liệu : ${product.material}</p>
                        <p>Sản xuất bởi : <span class="text-price">THREEN TAILORED</span> tại Việt Nam</p>
                    </div>
                </div>
            </div>
        </div>

    </div>

    </div>
    <!-- footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <!-- js -->
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>

</body>

</html>