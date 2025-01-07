<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Custumize - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
        type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/footer/cauhoitg.css">
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
            <ul class="nav nav-tabs mt-4" id="myTab" role="tablist">
                <li class="nav-item" role="presentation"> <button class="nav-link active" id="custumize-vest-tab"
                        data-bs-toggle="tab" data-bs-target="#custumize-vest" type="button" role="tab"
                        aria-controls="custumize-vest" aria-selected="true">Vest</button> </li>
                <li class="nav-item" role="presentation"> <button class="nav-link" id="custumize-quan-tab"
                        data-bs-toggle="tab" data-bs-target="#custumize-quan" type="button" role="tab"
                        aria-controls="custumize-quan" aria-selected="false">Quần</button> </li>
                <li class="nav-item" role="presentation"> <button class="nav-link" id="custumize-phuKien-tab"
                        data-bs-toggle="tab" data-bs-target="#custumize-phuKien" type="button" role="tab"
                        aria-controls="custumize-phuKien" aria-selected="false">Phụ Kiện</button> </li>
                <li class="nav-item" role="presentation"> <button class="nav-link" id="custumize-sum-tab"
                        data-bs-toggle="tab" data-bs-target="#custumize-sum" type="button" role="tab"
                        aria-controls="custumize-sum" aria-selected="false">Tổng Kết</button> </li>
            </ul>

            <div class="tab-content" id="myTabContent">
                <!-- Vải -->
                <div class="tab-pane fade show active" id="custumize-vest" role="tabpanel"
                    aria-labelledby="custumize-vest-tab">
                    <div class="container mt-5">
                        <h1 class="mb-4">Lựa Chọn Loại Vải</h1>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/vai1.jpg" class="custumize-img"
                                        alt="Fabric 1">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title">Vải Xanh Nhẳn</h5>
                                        <span>4 Mùa</span>
                                        <span>Sợi Bông</span>
                                        <strong>1,000,000 VND</strong>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/vai2.jpg" class="custumize-img"
                                        alt="Fabric 2">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title">Vải Xanh Đen</h5>
                                        <span>4 Mùa</span>
                                        <span>Sợi Len</span>
                                        <strong>1,500,000 VND</strong>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/vai3.jpg" class="custumize-img"
                                        alt="Fabric 3">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title">Vải Xanh Trơn</h5>
                                        <span>4 Mùa</span>
                                        <span>Sợi Cotton</span>
                                        <strong>1,200,000 VND</strong>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/vai4.jpg" class="custumize-img"
                                        alt="Fabric 3">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title">Vải Xám Chấm</h5>
                                        <span>4 Mùa</span>
                                        <span>Sợi Bông Cao Cấp</span>
                                        <strong>2,000,000 VND</strong>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Kiểu 1 -->
                    <hr>
                    <div class="container mt-5">
                        <h1 class="mb-4">Cổ Áo</h1>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/coAO1.png" class="custumize-img"
                                        alt="Fabric 1">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Lớn</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/coAo2.png" class="custumize-img"
                                        alt="Fabric 2">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Vừa</h5>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <!-- Kiểu 2 -->
                    <hr>
                    <div class="container mt-5">
                        <h1 class="mb-4">Túi Áo</h1>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/tuiAo1.png"
                                        class="custumize-img" alt="Fabric 1">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Nắp</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/TuiAo2.png"
                                        class="custumize-img" alt="Fabric 2">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Túi</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>



                    <!-- Nut -->
                    <hr>
                    <div class="container mt-5">
                        <h1 class="mb-4">Lựa Chọn Cúc áo</h1>
                        <div class="row">
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/cutAo1.png"
                                        class="custumize-img" alt="Fabric 1">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Đen</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/cutAo2.png"
                                        class="custumize-img" alt="Fabric 2">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Mật Ong</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/cutAo3.png"
                                        class="custumize-img" alt="Fabric 3">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Nâu Đen</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="col-md-3">
                                <div class="custumize-card"> <img src="resources/images/cutAo4.png"
                                        class="custumize-img" alt="Fabric 3">
                                    <div class="custumize-card-body">
                                        <h5 class="card-title text-center">Thạch Anh</h5>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <!-- do ao -->
                    <div class="container mt-5">
                        <h1 class="mb-4">Bảng Chọn Kích Thước</h1>
                        <div class="row">
                            <div class="col-md-1 mb-3"> <button class="btn-custumize  w-100">M</button> </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">L</button> </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">XL</button> </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">2XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">3XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">4XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">5XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">6XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">7XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">8XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">9XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">10XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">11XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">12XL</button>
                            </div>
                            <div class="col-md-3 mb-3"> <button class="btn-custumize bg-danger w-100">Kích Thước Khác:
                                    Liên
                                    Hệ</button>
                            </div>
                        </div>
                        <div class="container mt-5">
                            <div class="afk-container mx-0">
                                <!-- chon size -->
                                <div class="faq-item">
                                    <h2>Làm thế nào để chọn size ?</h2>
                                    <i class="fas fa-chevron-down"></i>
                                </div>
                                <div class="faq-content">
                                    <img src="resources/images/doAo.jpg" class="mx-auto" style="width: 100%;" alt="">
                                </div>

                                <!-- cach do -->
                                <div class="faq-item">
                                    <h2>Đo kích thước như thế nào ?</h2>
                                    <i class="fas fa-chevron-down"></i>
                                </div>
                                <div class="faq-content">
                                    <img src="resources/images/huong-dan-do-vest-nam1.jpg" class="mx-auto"
                                        style="width: 100%;" alt="">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- Quan -->
                <div class="tab-pane fade" id="custumize-quan" role="tabpanel" aria-labelledby="custumize-quan-tab">
                    <!-- Vải -->
                    <div class="tab-content" id="myTabContent">
                        <div class="tab-pane fade show active" id="custumize-vest" role="tabpanel"
                            aria-labelledby="custumize-vest-tab">
                            <div class="container mt-5">
                                <h1 class="mb-4">Lựa Chọn Loại Vải</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai1.jpg"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Nhẳn</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Bông</span>
                                                <strong>1,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai2.jpg"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Đen</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Len</span>
                                                <strong>1,500,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai3.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Trơn</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Cotton</span>
                                                <strong>1,200,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai4.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xám Chấm</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Bông Cao Cấp</span>
                                                <strong>2,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Kiểu 1 -->
                            <hr>
                            <div class="container mt-5">
                                <h1 class="mb-4">Kiểu Ống Quần</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/ongQuan1.png"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Vừa</h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/ongQuan3.png"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Rộng</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <!-- Kiểu 2 -->
                            <hr>
                            <div class="container mt-5">
                                <h1 class="mb-4">Kiểu Cuộn Ống</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/ongQuancao1.png"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Không</h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/ongQuancao2.png"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Thấp</h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/ongQuanCao3.png"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Vừa</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <hr>
                    <!-- do ao -->
                    <div class="container mt-5">
                        <h1 class="mb-4">Bảng Chọn Kích Thước</h1>
                        <div class="row">
                            <div class="col-md-1 mb-3"> <button class="btn-custumize  w-100">M</button> </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">L</button> </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">XL</button> </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">2XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">3XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">4XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">5XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">6XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">7XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">8XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">9XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">10XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">11XL</button>
                            </div>
                            <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">12XL</button>
                            </div>
                            <div class="col-md-3 mb-3"> <button class="btn-custumize bg-danger w-100">Kích Thước Khác:
                                    Liên
                                    Hệ</button>
                            </div>
                        </div>
                        <div class="container mt-5">
                            <div class="afk-container mx-0">
                                <!-- chon size -->
                                <div class="faq-item">
                                    <h2>Làm thế nào để chọn size ?</h2>
                                    <i class="fas fa-chevron-down"></i>
                                </div>
                                <div class="faq-content">
                                    <img src="resources/images/doQuan.jpg" class="mx-auto" style="width: 100%;" alt="">
                                </div>

                                <!-- cach do -->
                                <div class="faq-item">
                                    <h2>Đo kích thước như thế nào ?</h2>
                                    <i class="fas fa-chevron-down"></i>
                                </div>
                                <div class="faq-content">
                                    <img src="resources/images/Huong-dan-do-vest-nam-1.jpg" class="mx-auto"
                                        style="width: 100%;" alt="">
                                    <img src="resources/images/Huong-dan-do-vest-nam-2.jpg" class="mx-auto"
                                        style="width: 100%;" alt="">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="tab-pane fade" id="custumize-phuKien" role="tabpanel"
                    aria-labelledby="custumize-phuKien-tab">
                    <!--  -->
                    <div class="tab-content" id="myTabContent">
                        <div class="tab-pane fade show active" id="custumize-vest" role="tabpanel"
                            aria-labelledby="custumize-vest-tab">
                            <div class="container mt-5">
                                <h1 class="mb-4">Cà Vạt</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai1.jpg"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Nhẳn</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Bông</span>
                                                <strong>1,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai2.jpg"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Đen</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Len</span>
                                                <strong>1,500,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai3.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Trơn</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Cotton</span>
                                                <strong>1,200,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai4.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xám Chấm</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Bông Cao Cấp</span>
                                                <strong>2,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <!-- size -->

                            </div>
                            <div class="container mt-5">
                                <h1 class="mb-4">Kích Thước</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/cavatSize1.png"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Tiêu chuẩn</h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/cavatSize2.png"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Ngắn</h5>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/cavatSize3.png"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title text-center">Dài</h5>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <hr>
                            <div class="container mt-5">
                                <h1 class="mb-4">Thắt Lưng</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/daynit1.jpg"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Dây Đen</h5>

                                                <span>Da</span>
                                                <strong>1,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/daynit2.jpg"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Dây Xám</h5>

                                                <span>Da Cá Xấu</span>
                                                <strong>1,500,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/daynit3.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Dây vàng</h5>

                                                <span>Da Hưu</span>
                                                <strong>1,200,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/daynit4.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Dây Nâu</h5>

                                                <span>Da Trâu</span>
                                                <strong>2,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <!-- size -->
                            <div class="container mt-5">
                                <h1 class="mb-4">Bảng Chọn Kích Thước</h1>
                                <div class="row">
                                    <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">46</button> </div>
                                    <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">48</button> </div>
                                    <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">50</button> </div>
                                    <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">52</button> </div>
                                    <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">54</button> </div>
                                    <div class="col-md-1 mb-3"> <button class="btn-custumize w-100">56</button> </div>
                                </div>
                            </div>
                            <hr>
                            <div class="container mt-5">
                                <h1 class="mb-4">Khăng Choàng Cổ</h1>
                                <div class="row">
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai1.jpg"
                                                class="custumize-img" alt="Fabric 1">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Nhẳn</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Bông</span>
                                                <strong>1,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai2.jpg"
                                                class="custumize-img" alt="Fabric 2">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Đen</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Len</span>
                                                <strong>1,500,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai3.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xanh Trơn</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Cotton</span>
                                                <strong>1,200,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-3">
                                        <div class="custumize-card"> <img src="resources/images/vai4.jpg"
                                                class="custumize-img" alt="Fabric 3">
                                            <div class="custumize-card-body">
                                                <h5 class="card-title">Vải Xám Chấm</h5>
                                                <span>4 Mùa</span>
                                                <span>Sợi Bông Cao Cấp</span>
                                                <strong>2,000,000 VND</strong>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

                <div class="tab-pane fade" id="custumize-sum" role="tabpanel" aria-labelledby="custumize-sum-tab">
                    <!--  -->
                    <div class="container mt-5">
                        <div class="card">
                            <div class="card-header">
                                <h2>Tổng Kết</h2>
                            </div>
                            <div class="card-body">
                                <table class="table table-striped">
                                    <thead>
                                        <tr>
                                            <th>Sản Phẩm</th>
                                            <th>Số Lượng</th>
                                            <th>Giá</th>
                                            <th>Tổng</th>
                                            <th>Hành Động</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td>Áo Vest Cobalt Blue</td>
                                            <td>1</td>
                                            <td>1,200,000 VND</td>
                                            <td>1,200,000 VND</td>
                                            <td> <i class="fa-regular fa-pen-to-square fa-xl mx-4"></i>
                                                <i class="fa-solid fa-trash fa-xl"></i>
                                        </tr>
                                        <tr>
                                            <td>Quần Vest Light Blue</td>
                                            <td>1</td>
                                            <td>1,000,000 VND</td>
                                            <td>1,000,000 VND</td>
                                            <td> <i class="fa-regular fa-pen-to-square fa-xl mx-4"></i>
                                                <i class="fa-solid fa-trash fa-xl"></i>
                                        </tr> <!-- Thêm các hàng khác tại đây -->
                                    </tbody>
                                </table>
                                <div class="d-flex justify-content-end">
                                    <h3>Tổng Cộng: 2,500,000 VND</h3>
                                </div>
                                <div class=" d-flex justify-content-end mt-3 ">
                                    <button class="btn-custumize bg-danger " style="width: 50%;">Thêm Vào Giỏ
                                        Hàng</button>
                                </div>
                            </div>
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

</body>

</html>