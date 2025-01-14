<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
        type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <style>
        .modal-content {
            background-color: #fefefe;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.3);
        }

        .modal-header {
            border-bottom: none;
        }

        .modal-title {
            font-weight: bold;
        }

        .modal-body p {
            margin-bottom: 10px;
        }

        .modal-footer {
            border-top: none;
            justify-content: center;
        }

        .btn-close {
            background: none;
            border: none;
            font-size: 1.5rem;
        }
    </style>

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
                <li class="nav-item" role="presentation"> <button class="nav-link active" id="orders-tab"
                        data-bs-toggle="tab" data-bs-target="#orders" type="button" role="tab" aria-controls="orders"
                        aria-selected="true">Đơn hàng</button> </li>
                <li class="nav-item" role="presentation"> <button class="nav-link" id="history-tab" data-bs-toggle="tab"
                        data-bs-target="#history" type="button" role="tab" aria-controls="orders"
                        aria-selected="true">Lịch Sử</button> </li>
                <li class="nav-item" role="presentation"> <button class="nav-link" id="profile-tab" data-bs-toggle="tab"
                        data-bs-target="#profile" type="button" role="tab" aria-controls="profile"
                        aria-selected="false">Hồ sơ</button> </li>
                <li class="nav-item" role="presentation"> <button class="nav-link" id="settings-tab"
                        data-bs-toggle="tab" data-bs-target="#settings" type="button" role="tab"
                        aria-controls="settings" aria-selected="false">Cài đặt</button> </li>
            </ul>
            <div class="tab-content" id="myTabContent">
            <!-- don hang -->
                <div class="tab-pane fade show active" id="orders" role="tabpanel" aria-labelledby="orders-tab">
                    <div class="card mt-3">
                        <div class="card-body">
                            <h1 class="mb-4">Đơn Hàng Của Bạn</h1>
                            <div class="table-responsive">
                                <table class="table ">
                                    <thead>
                                        <tr>
                                            <th scope="col">Hình ảnh</th>
                                            <th scope="col">Tên sản phẩm</th>
                                            <th scope="col">Số lượng</th>
                                            <th scope="col">Giá</th>
                                            <th scope="col">Trạng Thái</th>
                                            <th scope="col">Vị Trí Hiện Tại</th>
                                            <th scope="col">Chi Tiết</th>
                                            <th scope="col">Cập Nhật</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="align-middle"> <img
                                                    src="./resources/images/vestBlueSilkCotton.jpg" alt="Product 1"
                                                    class="img-cart"> </td>
                                            <td class="">
                                                <p><strong>Vest Blue</strong></p>
                                            </td>

                                            <td class="align-middle"> <input type="number" class="form-control"
                                                    value="1" min="1" max="99" readonly> </td>
                                            <td class="align-middle">
                                                <p><strong>1,000,000 VND</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <p><strong>Đã Giao</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <p><strong>Quận Thủ Đức</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize btn-profile-deltail">Chi Tiết</button>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize bg-danger">Đã nhận được hàng</button>
                                            </td>
                                        <tr>
                                            <td class="align-middle"> <img
                                                    src="./resources/images/vestBlueSilkCotton.jpg" alt="Product 1"
                                                    class="img-cart"> </td>
                                            <td class="">
                                                <p><strong>Vest Blue</strong></p>
                                            </td>

                                            <td class="align-middle"> <input type="number" class="form-control"
                                                    value="1" min="1" max="99" readonly> </td>
                                            <td class="align-middle">
                                                <p><strong>1,000,000 VND</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <p><strong>Đang Giao</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <p><strong>Long An</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize btn-profile-deltail">Chi Tiết</button>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize bg-secondary">Hủy Đơn Hàng</button>
                                            </td>
                                        </tr> <!-- Thêm các sản phẩm khác ở đây -->
                                    </tbody>
                                </table>
                                <!-- Modal -->
                                <div class="modal fade" id="productModal" tabindex="-1"
                                    aria-labelledby="productModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="productModalLabel">Thông tin sản phẩm</h5>
                                            </div>
                                            <div class="modal-body"> <!-- Product details go here -->
                                                <p id="productName"></p>
                                                <p id="productPrice"></p>
                                                <p id="productQuantity"></p>
                                                <p id="productDescription"></p>
                                            </div>
                                            <div class="modal-footer"> <button type="button"
                                                    class="btn-custumize btn-profile-close"
                                                    data-dismiss="modal">Đóng</button> </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- history -->
                <div class="tab-pane fade show" id="history" role="tabpanel" aria-labelledby="history-tab">
                    <div class="card mt-3">
                        <div class="card-body">
                            <h1 class="mb-4">Lịch sử</h1>
                            <div class="table-responsive">
                                <table class="table ">
                                    <thead>
                                        <tr>
                                            <th scope="col">Hình ảnh</th>
                                            <th scope="col">Tên sản phẩm</th>
                                            <th scope="col">Số lượng</th>
                                            <th scope="col">Giá</th>
                                            <th scope="col">Trạng Thái</th>
                                            <th scope="col">Chi Tiết</th>
                                            <th scope="col">Phản Hồi</th>

                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <td class="align-middle"> <img
                                                    src="./resources/images/vestBlueSilkCotton.jpg" alt="Product 1"
                                                    class="img-cart"> </td>
                                            <td class="">
                                                <p><strong>Vest Blue</strong></p>
                                            </td>

                                            <td class="align-middle"> <input type="number" class="form-control"
                                                    value="1" min="1" max="99" readonly> </td>
                                            <td class="align-middle">
                                                <p><strong>1,000,000 VND</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <p><strong>Đã Nhận</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize btn-profile-deltail">Chi Tiết</button>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize bg-danger">Phản Hồi</button>
                                            </td>
                                        </tr> <!-- Thêm các sản phẩm khác ở đây -->
                                        <tr>
                                            <td class="align-middle"> <img
                                                    src="./resources/images/vestBlueSilkCotton.jpg" alt="Product 1"
                                                    class="img-cart"> </td>
                                            <td class="">
                                                <p><strong>Vest Blue</strong></p>
                                            </td>

                                            <td class="align-middle"> <input type="number" class="form-control"
                                                    value="1" min="1" max="99" readonly> </td>
                                            <td class="align-middle">
                                                <p><strong>1,000,000 VND</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <p><strong>Đã Hủy</strong></p>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize btn-profile-deltail">Chi Tiết</button>
                                            </td>
                                            <td class="align-middle">
                                                <button class="btn-custumize bg-secondary">Phản Hồi</button>
                                            </td>
                                        </tr> <!-- Thêm các sản phẩm khác ở đây -->
                                    </tbody>
                                </table>
                                <!-- Modal -->
                                <div class="modal fade" id="productModal" tabindex="-1"
                                    aria-labelledby="productModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="productModalLabel">Thông tin sản phẩm</h5>
                                            </div>
                                            <div class="modal-body"> <!-- Product details go here -->
                                                <p id="productName"></p>
                                                <p id="productPrice"></p>
                                                <p id="productQuantity"></p>
                                                <p id="productDescription"></p>
                                            </div>
                                            <div class="modal-footer"> <button type="button"
                                                    class="btn-custumize btn-profile-close"
                                                    data-dismiss="modal">Đóng</button> </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                    <div class="card mt-3">
                        <div class="card-body">
                            <h5 class="card-title">Hồ sơ của bạn</h5>
                            <!-- profile -->
                            <div class="container mt-5">
                                <div class="row ">
                                    <div class="col-lg-6 mx-auto">
                                        <input type="hidden" id="userId" name="userId" value="<%=user.getId()%>">
                                        <img src="<%= user.getAvatar() %>" class="profile-img" alt="Profile Picture">
                                            <div class="card-body">
                                                <h5 class="card-title"> <%= user.getFullName()%></h5>
                                                <hr>
                                                <ul class="list-group list-group-flush">
                                                    <li class="list-group-item">Email: <%= user.getGmail()%></li>
                                                    <li class="list-group-item">Điện thoại: <%= user.getPhone()%></li>
                                                    <li class="list-group-item">Địa chỉ:<%= user.getAddress()%>
                                                    </li>
                                                </ul>
                                                <a href="profileEdit.jsp"><button
                                                        class="btn-custumize mt-3 profile-update-btn">Cập
                                                        nhật
                                                        thông tin</button></a>
                                                <a href="changePassword.jsp"><button class="btn-custumize mt-3">Đổi
                                                        mật
                                                        khẩu</button></a>
                                                <a href="logout"><button class="btn-custumize bg-danger mt-3">Đăng xuất</button></a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </div>
                <div class="tab-pane fade" id="settings" role="tabpanel" aria-labelledby="settings-tab">
                    <div class="card mt-3">
                        <div class="card-body">
                            <h5 class="card-title">Cài đặt</h5>
                            <p class="card-text">Các tùy chọn cài đặt sẽ được hiển thị ở đây.</p>
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

    <!-- js demo -->
    <script> // Initialize the modal
        $(document).ready(function () {
            $(document).on('click', '.btn-profile-close', function () {
                $('#productModal').modal('hide');
            });
            $('.btn-profile-deltail').click(function () {
                var productId = $(this).data('product');
                // Fetch product details based on productId
                var productDetails = { name: 'Sản phẩm 1', price: '1,000,000 VND', quantity: 3, description: 'Đây là mô tả của sản phẩm 1.' };
                $('#productName').text('Tên sản phẩm: ' + productDetails.name);
                $('#productPrice').text('Giá: ' + productDetails.price);
                $('#productQuantity').text('Số lượng: ' + productDetails.quantity);
                $('#productDescription').text('Mô tả: ' + productDetails.description);
                $('#productModal').modal('show');
            });
        });
    </script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js"></script>
</body>

</html>