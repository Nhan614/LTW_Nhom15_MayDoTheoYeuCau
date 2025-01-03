<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
        type="image/x-icon">
    <link rel="stylesheet" href="resources/css/signup.css">
    <link rel="stylesheet" href="resources/css/style.css">

</head>

<body>
    <div id="header">
        <div class="navbar navbar-lg navbar-expand-lg fixed-top bg-white shadow ">
            <a class="navbar-brand" href="home.html"> <img src="resources/images/logo.jpg" alt="Logo" width="100%"
                    height="60px"></a>
            <!-- collapse -->
            <!-- Toggle Button for Collapsing -->
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapseMenu"
                aria-controls="collapseMenu" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapseMenu">
                <ul class="navbar-nav nav-menu-left">
                    <li class="nav-item">
                        <a href="collection.html" class="nav-link">BỘ SƯU TẬP</a>
                    </li>
                    <li class="nav-item dropdown mega-menu">
                        <a class="nav-link dropdown-toggle" href="#" role="button">TRANG PHỤC</a>
                        <div class="dropdown-menu alpha">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-3">
                                        <h6>Vest</h6>
                                        <a href="vestCongSo.html" class="dropdown-item">Vest Công Sở</a>
                                        <a href="vestThuongNgay.html" class="dropdown-item">Vest Thường Ngày</a>
                                        <a href="vestXanh.html" class="dropdown-item">Vest Xanh</a>
                                        <a href="vestNau.html" class="dropdown-item">Vest Nâu</a>
                                        <a href="vestXam.html" class="dropdown-item">Vest Xám</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Áo</h6>
                                        <a href="aoSoMi.html" class="dropdown-item">Áo Sơ Mi</a>
                                        <a href="aoPolo.html" class="dropdown-item">Áo Polo</a>
                                        <a href="overshirt.html" class="dropdown-item">Áo Khoác Ngoài</a>
                                        <a href="blazer.html" class="dropdown-item">Blazers</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Quần Dài</h6>
                                        <a href="quanAu.html" class="dropdown-item">Quần Âu</a>
                                        <a href="quanChino.html" class="dropdown-item">Quần Chino</a>
                                        <a href="quanNi.html" class="dropdown-item">Quần Nỉ</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Ưu Đãi</h6>
                                        <a href="#" class="dropdown-item">Sản Phẩm Mới</a>
                                        <a href="#" class="dropdown-item">Giảm Giá</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>

                    <!-- Mega Menu for ACCESSORIES -->
                    <li class="nav-item dropdown mega-menu">
                        <a class="nav-link dropdown-toggle" href="#" role="button">PHỤ KIỆN</a>
                        <div class="dropdown-menu omega">
                            <div class="container-fluid">
                                <div class="row gap-5">
                                    <div class="col-md-3">
                                        <h6>Tất Cả Phụ Kiện</h6>
                                        <a href="caVat.html" class="dropdown-item">Cà Vạt</a>
                                        <a href="khanChoang.html" class="dropdown-item">Khăn Choàng</a>
                                        <a href="thatLung.html" class="dropdown-item">Thắt Lưng</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Sắp Ra Mắt</h6>
                                        <a href="#" class="dropdown-item">Mũ Len</a>
                                        <a href="#" class="dropdown-item">Nơ</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a href="blog.html" class="nav-link">TIN TỨC</a>
                    </li>
                    <li class="nav-item">
                        <a href="aboutUs.html" class="nav-link">VỀ CHÚNG TÔI</a>
                    </li>

                    <li class="nav-item">
                        <a href="contactUs.html" class="nav-link">LIÊN HỆ</a>
                    </li>

                </ul>
                <ul class="navbar-nav nav-icons-left">
                    <div class="nav-search-box">
                        <li class="nav-item">
                            <i class="fa-solid fa-magnifying-glass fa-xl align-middle"></i>
                            <div class="box">
                                <!-- <a href="#">
                                </a> -->
                                <input type="text" class="box-input" placeholder="Nhập..." id="search-bar">
                            </div>
                        </li>
                    </div>
                    <!-- ------------login ------------- -->
                    <li class="nav-item dropdown">
                        <div class="user-box">
                            <a href="profile.html"><i class="fa-regular fa-user fa-xl"></i></a>
                            <ul class="dropdown-menu dropdown-menu-end pt-2 m-2">
                                <li><a id="adress-form" href="signup.html#login-form" class="dropdown-item">Đăng
                                        Nhập</a>
                                </li>
                                <li><a class="dropdown-item" href="signup.html#signup-form">Đăng Ký</a></li>

                            </ul>
                        </div>
                    </li>



                    <!-- shop -->
                    <div class="cart-box">
                        <li class="nav-item" id="shop-address"> <a style="color: black;" href="cart.html"><i
                                    class="fa-solid fa-cart-shopping fa-lg"></i> </a></li>
                    </div>
                </ul>
            </div>
        </div>
    </div>

    <script src="/venders/js/jquery-3.7.1.min.js"></script>
    <script src="resources/js/signup.js"></script>
    <script src="resources/js/main.js"></script>

</body>

</html>