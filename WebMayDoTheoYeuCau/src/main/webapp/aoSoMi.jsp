<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ÁO SƠ MI - N3TAILORED</title>
    <link rel="icon" href="<c:url value='/resources/images/favicon.jpg'/>" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="<c:url value='/vendors/js/jquery-3.7.1.min.js'/>"></script>
    <link rel="stylesheet" href="<c:url value='/vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/vendors/fontawesome-free-6.6.0-web/css/all.min.css'/>">
    <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>">
    <style>
        .vest-title {
            display: flex;
            justify-content: space-between;
            align-items: center;
            padding: 20px 0;
        }

        .vest-header h2 {
            font-family: "Montserrat", sans-serif;
        }

        .vest-description {
            margin-bottom: 20px;
            font-family: "Roboto", sans-serif;
        }

        .tl-filters {
            flex-basis: 300px;
            display: flex;
            text-align: right;
        }

        .sorting {
            margin-right: 20px;
        }

        .ordainment {
            border: none;
            font: normal normal bold 14px / 19px ;
            cursor: pointer;
        }

        .tl-filters a {
            font: normal normal bold 14px / 19px ;
            cursor: pointer;
        }

        .tl-filters img {
            max-height: 12px;
            margin-right: 2px;
        }
    </style>
</head>

<body>
    <!-- Header -->
    <div id="menubar"></div>

    <section id="sec1">
        <div class="top-bar text-center py-2">
            <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>
    </section>
    <section class="container my-4">
        <!-- Tiêu Đề và Mô Tả -->
        <div class="vest-title">
            <div class="vest-header">
                <h2>Áo Sơ Mi May Đo Cho Quý Ông</h2>
            </div>
            <!-- Sắp Xếp và Lọc -->
            <div class="tl-filters">
                <div class="sorting">
                    <img src="https://lanieri.com/app/plugins/tailoor-integration/assets/img/sort.png">
                    <select class="ordainment">
                        <option value="">Sắp xếp</option>
                        <option value="price_asc">Giá cao đến thấp</option>
                        <option value="price_desc">Giá thấp đến cao</option>
                    </select>
                </div>
                <div class="filter-part" onclick="toggleSidebar()">
                    <img src="https://lanieri.com/app/plugins/tailoor-integration/assets/img/ico_filter.svg">
                    <a class="tl-filter">Lọc</a>
                </div>
            </div>
        </div>

        <!-- Mô Tả -->
        <p class="vest-description">
            Món đồ không thể thiếu trong tủ đồ của mỗi quý ông? Một chiếc áo sơ mi may đo! Thanh lịch
            cho những dịp đặc biệt, giản dị cho cuộc sống thường ngày: một chiếc áo sơ mi vừa vặn hoàn
            hảo luôn là điểm nhấn cho mọi phong cách.
            Mỗi chiếc áo sơ mi THREEN TAILORED đều được sản xuất hoàn toàn tại VietNam,
            sử dụng vải cao cấp từ những thương hiệu nổi tiếng của Ý. Tất cả các sản phẩm đều được chế
            tác theo những truyền thống may đo tinh tế nhất, kết hợp với công nghệ hiện đại nhất để
            đạt được sự hoàn hảo. Những chi tiết đặc biệt như cổ áo có thể tháo rời, đường may Pháp tinh
            xảo và những mảnh vải đệm hình cánh bướm là những yếu tố làm cho mỗi chiếc áo sơ mi nam của
            chúng tôi trở nên thực sự độc đáo.
        </p>
    </section>
    <section class="container my-4 section-products">
        <div class="row">
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-1" class="single-product">
                        <div class="part-1">
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">Bốn Mùa</div>
                            <h3 class="product-title">Áo Sơ Mi Cotton Kẻ Sọc Màu Xanh Nhạt May Đo Theo Yêu Cầu</h3>
                            <div class="product-maker">đức nghĩa</div>
                            <h4 class="product-old-price">1,500,000 VND</h4>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-2" class="single-product">
                        <div class="part-1">
                            <span class="discount">Giảm 15%</span>
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">Bốn Mùa</div>
                            <h3 class="product-title">Áo Sơ Mi Herringbone Màu Hồng May Đo Theo Yêu Cầu</h3>
                            <div class="product-maker">đức nghĩa</div>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-3" class="single-product">
                        <div class="part-1">
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">Bốn Mùa</div>
                            <h3 class="product-title">Áo Sơ Mi Cotton Kẻ Sọc Màu Tím May Đo Theo Yêu Cầu</h3>
                            <div class="product-maker">đức nghĩa</div>
                            <h4 class="product-old-price">1,500,000 VND</h4>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-4" class="single-product">
                        <div class="part-1">
                            <span class="new">Mới</span>
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">Bốn Mùa</div>
                            <h3 class="product-title">Áo Sơ Mi Cotton Màu Tím Nhạt May Đo Theo Yêu Cầu</h3>
                            <div class="product-maker">trọng nhân</div>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-5" class="single-product">
                        <div class="part-1">
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">thu đông</div>
                            <h3 class="product-title">Áo Sơ Mi Flannel Herringbone Lớn Màu Xanh Nhạt</h3>
                            <div class="product-maker">trọng nhân</div>
                            <h4 class="product-old-price">1,500,000 VND</h4>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-6" class="single-product">
                        <div class="part-1">
                            <span class="discount">Giảm 15%</span>
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">thu đông</div>
                            <h3 class="product-title">Áo Sơ Mi Flannel Twill Màu Xanh</h3>
                            <div class="product-maker">trọng nhân</div>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-7" class="single-product">
                        <div class="part-1">
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">xuân hạ</div>
                            <h3 class="product-title">Áo Sơ Mi May Đo Nam Màu Nâu Thuốc Lá Làm Từ Vải Linen Zephyr Cho
                                Phong Cách Tối Thượng</h3>
                            <div class="product-maker">nhân nghĩa</div>
                            <h4 class="product-old-price">1,500,000 VND</h4>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
            <!-- Single Product -->
            <div class="col-md-6 col-lg-4 position-relative">
                <a href="detail.html" class="full-link">
                    <div id="somi-8" class="single-product">
                        <div class="part-1">
                            <span class="new">Mới</span>
                            <ul>
                                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                                <li><a href="#"><i class="fas fa-expand"></i></a></li>
                            </ul>
                        </div>
                        <div class="part-2">
                            <div class="product-season">xuân hạ</div>
                            <h3 class="product-title">Áo Sơ Mi May Đo Nam Màu Xám Băng Làm Từ Vải Linen Zephyr Cho Phong
                                Cách Tối Thượng</h3>
                            <div class="product-maker">nhân nghĩa</div>
                            <h4 class="product-price">1,300,000 VND</h4>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </section>
<!-- sidebar -->
<div class="sidebarFil" id="sidebarFil">
    <h2 class="mt-3">Lọc</h2>
    <hr>
    <h4>Theo Giá</h4>
    <div class="mx-3">
        <label><input type="checkbox" value="under-1000" onchange="filterItems()"> Dưới 500,000 VND</label><br>
        <label><input type="checkbox" value="1000-1500" onchange="filterItems()">Từ 500,000 - 1,500,000
            VND</label><br>
        <label><input type="checkbox" value="above-1500" onchange="filterItems()">Từ 1,500,000 - 2,000,000 VND</label>
        <label><input type="checkbox" value="above-1500" onchange="filterItems()">Trên 2,000,000 VND</label>
    </div>
    <h4 class="mt-5">Theo Vật Liệu</h4>
    <select id="priceFilter" onchange="filterItems()">
        <option value="all">Tất Cả</option>
        <option value="under-1000">Vải Nhám</option>
        <option value="1000-1500">Vải Trơn</option>
        <option value="1000-1500">Vải Trơn Nhẵn</option>
        <option value="above-1500">Vải Bóng</option>
    </select>
    <button class="btn-custumize mt-5" onclick="toggleSidebar()">Đóng</button>
</div>

    <!-- Footer -->
    <jsp:include page="/resources/data/footer.jsp" />


    <!-- js -->
    <script src="<c:url value='/vendors/bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js'/>"></script>
    <script src="<c:url value='/resources/js/backtotop.js'/>"></script>
    <script src="<c:url value='/resources/js/search.js'/>"></script>
    <script src="<c:url value='/resources/js/main.js'/>"></script>
    <script src="<c:url value='/resources/js/quit.js'/>"></script>

<!-- my js -->
<script> function toggleSidebar() { var sidebar = document.getElementById('sidebarFil'); sidebar.classList.toggle('active'); }</script>

</body>

</html>