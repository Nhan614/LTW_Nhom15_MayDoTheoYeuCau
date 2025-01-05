<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Khăn Choàng - THREEN TAILORED</title>
  <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
    type="image/x-icon">
  <script src="vendors/js/jquery-3.7.1.min.js"></script>
  <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
  <link rel="stylesheet" href="resources/css/style.css">
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
  <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

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
        <h2>Khăn Choàng Thủ Công</h2>
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
      Khăn choàng nam không chỉ là phụ kiện giữ ấm thiết thực trong thời tiết lạnh mà còn là điểm nhấn
      cần thiết để hoàn thiện phong cách hàng ngày. Trong bộ sưu tập của chúng tôi, bạn sẽ không chỉ tìm
      thấy những chiếc khăn len cổ điển để phối cùng áo mưa hay giấu dưới áo khoác, mà còn nhiều hơn thế.
      Mỗi chiếc khăn trong bộ sưu tập đều là phụ kiện độc đáo, được sản xuất hoàn toàn tại Việt Nam, hoàn hảo để
      thêm nét thanh lịch vào cuộc sống thường nhật. Hãy chọn chất liệu yêu thích của bạn: cashmere, lụa,
      cotton, hoặc len, và tận hưởng niềm vui khi phối khăn với phong cách trang trọng hoặc phong cách
      casual thoải mái.
    </p>
  </section>
  <section class="container my-4 section-products">
    <div class="row">
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-1" class="single-product">
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
              <h3 class="product-title">Khăn Choàng Len Màu Xanh</h3>
              <div class="product-maker">đức nghĩa</div>
              <h4 class="product-old-price">1,500,000 VND</h4>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-2" class="single-product">
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
              <h3 class="product-title">Khăn Choàng Cashmere Màu Xám</h3>
              <div class="product-maker">đức nghĩa</div>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-3" class="single-product">
            <div class="part-1">
              <ul>
                <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
                <li><a href="#"><i class="fas fa-heart"></i></a></li>
                <li><a href="#"><i class="fas fa-plus"></i></a></li>
                <li><a href="#"><i class="fas fa-expand"></i></a></li>
              </ul>
            </div>
            <div class="part-2">
              <div class="product-season">hạ thu</div>
              <h3 class="product-title">Khăn Choàng Len Màu Xám Nhạt</h3>
              <div class="product-maker">đức nghĩa</div>
              <h4 class="product-old-price">1,500,000 VND</h4>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-4" class="single-product">
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
              <div class="product-season">thu đông</div>
              <h3 class="product-title">Khăn Choàng Len Màu Nâu</h3>
              <div class="product-maker">trọng nhân</div>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-5" class="single-product">
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
              <h3 class="product-title">Khăn Choàng Len Màu Xanh</h3>
              <div class="product-maker">trọng nhân</div>
              <h4 class="product-old-price">1,500,000 VND</h4>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-6" class="single-product">
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
              <h3 class="product-title">Khăn Choàng Cashmere Màu Xám Đậm</h3>
              <div class="product-maker">trọng nhân</div>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-7" class="single-product">
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
              <h3 class="product-title">Khăn Choàng Len Màu Be</h3>
              <div class="product-maker">nhân nghĩa</div>
              <h4 class="product-old-price">1,500,000 VND</h4>
              <h4 class="product-price">1,300,000 VND</h4>
            </div>
          </div>
        </a>
      </div>
      <!-- Single Product -->
      <div class="col-md-6 col-lg-4 position-relative">
        <a href="detail.jsp" class="full-link">
          <div id="khanChoang-8" class="single-product">
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
              <div class="product-season">hạ thu</div>
              <h3 class="product-title">Khăn Choàng Cashmere Tái Chế Màu Xanh Bottle</h3>
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
  <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

  <!-- js -->
  <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
  <script src="resources/js/backtotop.js"></script>
  <script src="resources/js/search.js"></script>
<%--  <script src="resources/js/main.js"></script>--%>
  <script src="resources/js/quit.js"></script>

<!-- my js -->
<script> function toggleSidebar() { var sidebar = document.getElementById('sidebarFil'); sidebar.classList.toggle('active'); }</script>

</body>

</html>