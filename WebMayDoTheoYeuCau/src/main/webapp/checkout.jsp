<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Thanh toán - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/checkout.css">



</head>

<body>
    <!-- Header -->
    <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

    <section id="sec1">
        <div class="top-bar text-center py-2">
            <a href="#">GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</a>
            <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
        </div>
    </section>


    <main id="main" role="main">
        <section id="checkout-container">
            <div class="container">
                <div class="py-5 text-center">
                    <i class="fa fa-credit-card fa-3x text-primary"></i>
                    <h2 class="my-3">THANH TOÁN</h2>
                </div>
                <div class="row py-4 justify-content-center">
                    <div class="col-md-3 order-md-2 mb-4">
                        <h4 class="d-flex justify-content-between align-items-center mb-3">
                            <span class="text-muted">Giỏ hàng của bạn</span>
                            <span class="badge badge-secondary badge-pill">3</span>
                        </h4>
                        <ul class="list-group mb-3">
                            <li class="list-group-item d-flex justify-content-between lh-condensed">
                                <img src="resources/images/vestBrownLinen.jpg" alt="visa logo" width="40" height="40">
                                <div>
                                    <h6 class="my-0">Vest Nâu</h6>
                                    <small class="text-muted">Số lượng:1</small>
                                </div>
                                <span class="text-muted">1.500.000 VND</span>
                            </li>

                            <li class="list-group-item d-flex justify-content-between lh-condensed">
                                <img src="resources/images/vestBrownLinen.jpg" alt="visa logo" width="40" height="40">
                                <div>
                                    <h6 class="my-0">Vest Xám</h6>
                                    <small class="text-muted">Số lượng:2</small>
                                </div>
                                <span class="text-muted">2.200.000 VND</span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between lh-condensed">
                                <img src="resources/images/vestBrownLinen.jpg" alt="visa logo" width="40" height="40">
                                <div>
                                    <h6 class="my-0">Quần Âu</h6>
                                    <small class="text-muted">Số lượng:1</small>
                                </div>
                                <span class="text-muted">1.000.000 VND</span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between bg-light">
                                <div class="text-success">
                                    <h6 class="my-0">Vận chuyển:</h6>
                                </div>
                                <span class="text-success">70.000 VND</span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between bg-light">
                                <div class="text-success">
                                    <h6 class="my-0">Chiết Khấu:</h6>
                                </div>
                                <span class="text-success">-50.000 VND</span>
                            </li>
                            <li class="list-group-item d-flex justify-content-between">
                                <h6 class="my-0">Tổng cộng:</h6>
                                <strong>4.720.000 VND</strong>
                            </li>
                        </ul>
                    </div>

                    <div class="col-md-7 order-md-1">
                        <h4 class="mb-3">Địa chỉ thanh toán</h4>
                        <form class="needs-validation" novalidate>
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="lastName"><i class="fas fa-id-card"></i>Họ</label>
                                    <input type="text" class="form-control" id="lastName" placeholder="" value=""
                                        required>
                                    <div class="invalid-feedback">
                                        Cần nhập họ hợp lệ.
                                    </div>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <label for="firstName"><i class="fas fa-id-card"></i>Tên</label>
                                    <input type="text" class="form-control" id="firstName" placeholder="" value=""
                                        required>
                                    <div class="invalid-feedback">
                                        Cần nhập tên hợp lệ.
                                    </div>
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="username"><i class="fas fa-phone"></i>Số điện thoại</label>
                                <div class="input-group">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">+84</span>
                                    </div>
                                    <input type="text" class="form-control" id="username" placeholder="Số điện thoại"
                                        required>
                                    <div class="invalid-feedback" style="width: 100%;">
                                        Tên người dùng là bắt buộc.
                                    </div>
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="email"><i class="fas fa-envelope"></i>Email
                                    <span class="text-muted">(Tùy chọn)</span>
                                </label>
                                <input type="email" class="form-control" id="email" placeholder="E-mail">
                                <div class="invalid-feedback">
                                    Vui lòng nhập địa chỉ email hợp lệ để nhận thông báo giao hàng.
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="address"><i class="fas fa-map-marker-alt"></i>Địa chỉ</label>
                                <input type="text" class="form-control" id="address" placeholder="Số nhà"
                                    required>
                                <div class="invalid-feedback">
                                    Vui lòng nhập địa chỉ giao hàng.
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-4 mb-3">
                                    <label for="country">Quốc gia</label>
                                    <select class="custom-select d-block w-100" id="country " required>
                                        <option value="">Việt Nam</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Vui lòng chọn quốc gia hợp lệ.
                                    </div>
                                </div>
                                <div class="col-md-4 mb-3">
                                    <label for="state">Tỉnh/Thành Phố</label>

                                    <select class="custom-select d-block w-100" id="city  " required>
                                        <option value="">Chọn...</option>
                                        <option>An Giang</option>
                                        <option>Bà Rịa - Vũng Tàu</option>
                                        <option>Bắc Giang</option>
                                        <option>Bắc Kạn</option>
                                        <option>Bạc Liêu</option>
                                        <option>Bắc Ninh</option>
                                        <option>Bến Tre</option>
                                        <option>Bình Dương</option>
                                        <option>Bình Định</option>
                                        <option>Bình Phước</option>
                                        <option>Bình Thuận</option>
                                        <option>Cà Mau</option>
                                        <option>Cao Bằng</option>
                                        <option>Cần Thơ</option>
                                        <option>Đà Nẵng</option>
                                        <option>Đắk Lắk</option>
                                        <option>Đắk Nông</option>
                                        <option>Điện Biên</option>
                                        <option>Đồng Nai</option>
                                        <option>Đồng Tháp</option>
                                        <option>Gia Lai</option>
                                        <option>Hà Giang</option>
                                        <option>Hà Nam</option>
                                        <option>Hà Nội</option>
                                        <option>Hà Tây</option>
                                        <option>Hải Dương</option>
                                        <option>Hải Phòng</option>
                                        <option>Hòa Bình</option>
                                        <option>Hưng Yên</option>
                                        <option>Khánh Hòa</option>
                                        <option>Kiên Giang</option>
                                        <option>Kon Tum</option>
                                        <option>Lai Châu</option>
                                        <option>Lâm Đồng</option>
                                        <option>Lạng Sơn</option>
                                        <option>Long An</option>
                                        <option>Lào Cai</option>
                                        <option>Nam Định</option>
                                        <option>Nghệ An</option>
                                        <option>Ninh Bình</option>
                                        <option>Ninh Thuận</option>
                                        <option>Phú Thọ</option>
                                        <option>Phú Yên</option>
                                        <option>Quảng Bình</option>
                                        <option>Quảng Nam</option>
                                        <option>Quảng Ngãi</option>
                                        <option>Quảng Ninh</option>
                                        <option>Quảng Trị</option>
                                        <option>Sóc Trăng</option>
                                        <option>Sơn La</option>
                                        <option>Tây Ninh</option>
                                        <option>Thái Bình</option>
                                        <option>Thái Nguyên</option>
                                        <option>Thanh Hóa</option>
                                        <option>Thừa Thiên Huế</option>
                                        <option>Tuyên Quang</option>
                                        <option>Vĩnh Long</option>
                                        <option>Vĩnh Phúc</option>
                                        <option>Yên Bái</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Vui lòng chọn thành phố hợp lệ.
                                    </div>
                                </div>

                                <div class="col-md-4 mb-3">
                                    <label for="zip">Địa chỉ khác (không bắt buộc)</label>
                                    <input type="text" class="form-control" id="zip" placeholder="" required>
                                    <div class="invalid-feedback">
                                        Mã bưu chính là bắt buộc.
                                    </div>
                                </div>
                            </div>
                            <hr class="mb-4">
                           
                            <div class="custom-control custom-checkbox">
                                <input type="checkbox" class="custom-control-input" id="save-info">
                                <label class="custom-control-label" for="save-info">Lưu thông tin </label>
                            </div>
                            <hr class="mb-4">

                            <h4 class="mb-3">Thanh toán</h4>

                            <div class="d-block my-3">
                                <div class="custom-control custom-radio">
                                    <img src="resources/images/zalopay.webp" alt="zalopay logo" width="40" height="40">
                                    <label class="custom-control-label" for="credit">ZaloPay</label>
                                    <input id="credit" name="paymentMethod" type="radio" class="custom-control-input"
                                        checked required>
                                </div>
                                <div class="custom-control custom-radio">
                                    <img src="resources/images/MoMo_Logo.png" alt="Momo logo" width="40" height="40">
                                    <label class="custom-control-label" for="debit">Momo</label>
                                    <input id="debit" name="paymentMethod" type="radio" class="custom-control-input"
                                        required>
                                </div>
                                <div class="custom-control custom-radio">
                                    <img src="resources/images/cod.png" alt="Cod logo" width="40" height="40">
                                    <label class="custom-control-label" for="debit">Thanh toán khi nhận hàng (COD)</label>
                                    <input id="debit" name="paymentMethod" type="radio" class="custom-control-input"
                                        required>
                                </div>
                                <div class="custom-control custom-radio">
                                    <img src="resources/images/visa.jpg" alt="visa logo" width="40" height="40">
                                    <label class="custom-control-label" for="paypal">Thẻ tín dụng/Thẻ ghi nợ</label>
                                    <input id="paypal" name="paymentMethod" type="radio" class="custom-control-input"
                                        required>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6 mb-3">
                                    <label for="cc-name">Tên trên thẻ</label>
                                    <input type="text" class="form-control" id="cc-name" placeholder="Họ tên" required>
                                    <small class="text-muted">Họ và tên như hiển thị trên thẻ</small>
                                    <div class="invalid-feedback">
                                        Tên trên thẻ là bắt buộc
                                    </div>
                                </div>
                                <div class="col-md-6 mb-3">
                                    <label for="cc-number">Số thẻ tín dụng</label>
                                    <input type="text" class="form-control" id="cc-number" placeholder="Nhập số thẻ"
                                        required>
                                    <div class="invalid-feedback">
                                        Số thẻ tín dụng là bắt buộc
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-3 mb-3">
                                    <label for="cc-expiration">Ngày hết hạn</label>
                                    <input type="text" class="form-control" id="cc-expiration"
                                        placeholder="Ngày hết hạn" required>
                                    <div class="invalid-feedback">
                                        Ngày hết hạn là bắt buộc
                                    </div>
                                </div>
                                <div class="col-md-3 mb-3">
                                    <label for="cc-expiration">Mã bảo mật</label>
                                    <input type="text" class="form-control" id="cc-cvv" placeholder="CVV/CVC" required>
                                    <div class="invalid-feedback">
                                        Mã bảo mật là bắt buộc
                                    </div>
                                </div>
                            </div>
                            <hr class="mb-4">
                            <button class="btn-t btn-primary btn-lg btn-block" type="submit">Tiếp tục thanh
                                toán</button>
                        </form>
                    </div>
                </div>
            </div>
            
        </section>
    </main>


    <!-- Footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <!-- js -->
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>

</body>


</html>