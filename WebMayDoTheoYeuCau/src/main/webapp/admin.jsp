<%@ page import="java.util.List" %>
<%@ page import="vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
          type="image/x-icon">
    <!-- DataTables CSS -->
    <link rel="stylesheet" href="https://cdn.datatables.net/1.13.6/css/jquery.dataTables.min.css">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
</head>

<body>

<!-- menu -->
<!-- <div id="menubar"></div> -->

<!-- sec1 -->
<!-- <div id="sec1"> -->

<div class="container">

    <!-- sidebar -->
    <ul class="sidebar">
        <li class="admin-sidebar-1">
            <a href="#admin-dashboard">
                <i class="fa-solid fa-chart-simple"></i>
                <span>Dữ liệu</span>
            </a>
        </li>
        <li class="admin-sidebar-2">
            <a href="#admin-products">
                <i class="fa-brands fa-product-hunt"></i>
                <span>Quản lý sản phẩm</span>
            </a>
        </li>
        <li class="admin-sidebar-3">
            <a href="#admin-orders">
                <i class="fa-solid fa-cart-shopping"></i>
                <span>Quản lý đơn hàng</span>
            </a>
        </li>
        <li class="admin-sidebar-4">
            <a href="#admin-material">
                <i class="fa-solid fa-wrench"></i>
                <span>Quản lý vật liệu</span>
            </a>
        </li>
        <li class="admin-sidebar-5">
            <a href="#admin-user">
                <i class="fa-regular fa-user"></i>
                <span>Quản lý người dùng</span>
            </a>
        </li>
        <li class="admin-sidebar-6">
            <a href="#admin-categories">
                <i class="fa-solid fa-list"></i>
                <span>Quản lý danh mục</span>
            </a>
        </li>
        <li class="admin-sidebar-7">
            <a href="#admin-notification">
                <i class="fa-regular fa-note-sticky"></i>
                <span>Quản lý thông báo</span>
            </a>
        </li>
<%--        <li class="admin-sidebar-8">--%>
<%--            <a href="#admin-reports">--%>
<%--                <i class="fa-brands fa-whatsapp"></i>--%>
<%--                <span>Phản hồi khách hàng</span>--%>
<%--            </a>--%>
<%--        </li>--%>
        <li class="admin-sidebar-9">
            <a href="#admin-contacts">
                <i class="fa-brands fa-whatsapp"></i>
                <span>Liên hệ khách hàng</span>
            </a>
        </li>
        <li class="admin-sidebar-10">
            <a href="#admin-settings">
                <i class="fa-solid fa-gear"></i>
                <span>Cài đặt</span>
            </a>
        </li>
        <li>
            <a href="home.jsp" class="admin-logout">
                <i class="fa-solid fa-right-to-bracket"></i>
                <span>Về trang chủ</span>
            </a>
        </li>

    </ul>

</div>

<!-- content -->
<div class="admin-content">
    <!-- Dash Board -->
    <section id="admin-dashboard" class="admin-hide">
        <!-- <br>
            <br>
            <br> -->
        <div class="container">
            <h1>Dữ Liệu</h1>
            <hr>
            <!-- doanh thu hom nay -->
            <div class="row mt-4">
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-header"> Doanh Thu Tháng</div>
                        <div class="card-body">
                            <h5 class="card-title text-success">1,000,000,000 VND</h5>
                            <p class="card-text">Tổng doanh thu từ các đơn hàng tháng này.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-header"> Chi Phí Nhập Hàng</div>
                        <div class="card-body">
                            <h5 class="card-title text-danger">600,000,000 VND</h5>
                            <p class="card-text">Tiền nhập các loại vật liệu.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-header"> Lợi Nhuận</div>
                        <div class="card-body">
                            <h5 class="card-title text-primary">400,000,000 VND</h5>
                            <p class="card-text">Lợi nhận thu được chưa qua thuế.</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-4 mt-4">
                    <div class="card">
                        <div class="card-header"> Tổng Sản Phẩm Bán Ra</div>
                        <div class="card-body">
                            <h5 class="card-title">200 Sản Phẩm</h5>
                            <p class="card-text">Bao gồm các lại vest và phụ kiện.</p>
                        </div>
                    </div>
                </div>


                <!-- chart -->
                <h3 class="mt-5 mb-5">Biểu đồ doanh thu hàng tháng (triệu VND / tháng):</h3>
                <canvas id="chartDashBoard" style="width:100%;max-width:700px" class="mt-5  mx-auto"></canvas>
            </div>

        </div>
    </section>

    <!-- Product -->
    <section id="admin-products" class="admin-hide">
        <!-- <br><br><br> -->

        <div class="container">
            <div class="admin-header">
                <h1 class="">Quản Lý Sản Phẩm</h1>
                <div class="admin-header-right">
                    <div class="input-group"><input type="text" class="form-control" placeholder="Tìm kiếm...">
                        <button class="btn btn-primary" type="button"><i class="fas fa-search"></i></button>
                    </div>
                </div>
            </div>
            <!-- Button to Open the Modal -->
            <button type="button" class="btn-custumize btn-lg admin-addProduct mt-3" data-toggle="modal"
                    data-target="#productModal"> Thêm Sản Phẩm
            </button>
            <!-- The Modal -->
            <div class="modal" id="productModal">
                <div class="modal-dialog">
                    <div class="modal-content"> <!-- Modal Header -->
                        <div class="modal-header">
                            <h4 class="modal-title">Thêm/Sửa Sản Phẩm</h4>
                            <!-- <button type="button" class="close"
                                data-dismiss="modal">&times;</button> -->
                        </div> <!-- Modal Body -->
                        <div class="modal-body">
                            <form id="productForm">
                                <div class="form-group"><label for="productName">Tên Sản Phẩm</label> <input
                                        type="text" class="form-control" id="productName" placeholder="Nhập"
                                        required></div>
                                <div class="form-group"><label for="productPrice">Giá</label>
                                    <input type="number" id="productPrice" class="form-control" min="0">
                                </div>
                                <div class="form-group"><label for="productNum">Số Lượng</label>
                                    <input type="number" id="productNum" class="form-control" value="1" min="1"
                                           max="99">
                                </div>
                                <div class="form-group"><label for="season">Mùa</label> <select
                                        class="form-control" id="season" required>
                                    <option value="">Chọn mùa</option>
                                    <option>Xuân</option>
                                    <option>Hạ</option>
                                    <option>Thu</option>
                                    <option>Đông</option>
                                    <option>4 Mùa</option>
                                </select></div>
                                <div class="form-group"><label for="material">Chất Liệu</label> <input type="text"
                                                                                                       class="form-control"
                                                                                                       id="material"
                                                                                                       placeholder="Nhập chất liệu"
                                                                                                       required>
                                </div>
                                <div class="form-group"><label for="hot">Nổi Bật</label> <select
                                        class="form-control" id="hot" required>
                                    <option>0</option>
                                    <option>1</option>
                                </select></div>
                                <div class="form-group"><label for="category">Loại Sản Phẩm</label> <select
                                        class="form-control" id="category">
                                    <option>Vest Công Sở</option>
                                    <option>Vest Thường Ngày</option>
                                    <option>Vest Xanh</option>
                                    <option>Vest Nâu</option>
                                    <option>Vest Xám</option>
                                </select></div>
                                <label for="admin-product-mota">Mô Tả</label>
                                <textarea name="" id="admin-product-mota"
                                          style="width: 100%; min-height: 100px;"></textarea>
                                <button type="submit" class="btn-custumize btn-lg mt-2">Thêm Sản Phẩm</button>
                            </form>
                        </div> <!-- Modal Footer -->
                        <div class="modal-footer">
                            <button type="button" class="btn btn-danger"
                                    data-dismiss="modal">Đóng
                            </button>
                        </div>
                    </div>
                </div>
            </div>
            <hr>
            <h3 class="text-center">Danh Sách Sản Phẩm</h3>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Mã Sản Phẩm</th>
                    <th>Tên Sản Phẩm</th>
                    <th>Giá</th>
                    <th>Số Lượng</th>
                    <th>Mùa</th>
                    <th>Chất Liệu</th>
                    <th>Nổi Bật</th>
                    <th>Loại Sản Phẩm</th>
                    <th>Hành Động</th>
                </tr>
                </thead>
                <!-- p1 -->
                <tr>
                    <td>1</td>
                    <td>Vest Nam Cao Cấp</td>
                    <td>2,500,000 VND</td>
                    <td>1</td>
                    <td>4 Mùa</td>
                    <td>Len</td>
                    <td>0</td>
                    <td>Vest Công Sở</td>
                    <td>
                        <button class="btn btn-primary btn-sm admin-product-editBtn">Sửa</button>
                        <button
                                class="btn btn-danger btn-sm deleteBtn">Xóa
                        </button>
                        <tbody id="productList"> <!-- Danh sách sản phẩm sẽ được thêm vào đây --> </tbody>
            </table>
        </div>
    </section>

    <!-- User  -->
    <section id="admin-user" class="admin-hide">
        <div class="container">
            <div class="admin-header">
                <h1>Quản Lý Người Dùng</h1>
            </div>
            <hr>
            <h3 class="text-center">Danh Sách Người Dùng</h3>
            <table id="userTable" class="table table-bordered">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Avatar</th>
                    <th>Tên</th>
                    <th>Email</th>
                    <th>Điện thoại</th>
                    <th>Địa chỉ</th>
                    <th>Thông báo</th>
                    <th>Vai trò</th>
                    <th>Hành động</th>
                </tr>
                </thead>
                <tbody>
                <!-- Dữ liệu sẽ được thêm vào đây -->
                </tbody>
            </table>

            <!-- Modal for Editing User -->
            <div class="modal" id="userModal">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title">Sửa Người Dùng</h4>
                        </div>
                        <div class="modal-body">
                            <form id="userForm">
                                <input type="hidden" id="userId" name="userId">
                                <div class="form-group">
                                    <img id="userAvatarPreview" src="" alt="Avatar Preview"
                                         class="avatar-thumbnail mt-2">
                                    <input type="text" class="form-control mt-2" id="userAvatarUrl"
                                           placeholder="URL của Avatar">
                                </div>
                                <div class="form-group">
                                    <label for="userName">Tên Người Dùng</label>
                                    <input type="text" class="form-control" id="userName"
                                           placeholder="Nhập tên người dùng" required>
                                </div>
                                <div class="form-group">
                                    <label for="userEmail">Email</label>
                                    <input type="email" class="form-control" id="userEmail" name="userEmail"
                                           placeholder="Nhập email"
                                           required>
                                </div>
                                <div class="form-group">
                                    <label for="userPhone">Số Điện Thoại</label>
                                    <input type="number" class="form-control" id="userPhone"
                                           placeholder="Nhập số điện thoại" required>
                                </div>
                                <div class="form-group">
                                    <label for="userAddress">Địa Chỉ</label>
                                    <input type="text" class="form-control" id="userAddress" placeholder="Nhập địa chỉ"
                                           required>
                                </div>
                                <div class="form-group">
                                    <label for="userCheck">Đăng Ký</label>
                                    <select class="form-control" id="userCheck" required>
                                        <option value="0">Chưa Đăng Ký</option>
                                        <option value="1">Đã Đăng Ký</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="userRole">Vai Trò</label>
                                    <select class="form-control" id="userRole" required>
                                        <option value="1">Admin</option>
                                        <option value="2">Nhân Viên</option>
                                        <option value="3">Người Dùng</option>
                                    </select>
                                </div>
                                <button type="submit" class="btn-custumize btn-lg mt-2">Lưu Thay Đổi</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>

    <!-- Material Management -->
    <section id="admin-material" class="admin-hide">
        <div class="container">
            <div class="admin-header">
                <h1 class="">Quản Lý Vật Liệu</h1>  
            </div>
            <!-- Modal Thêm Vật Liệu -->
            <div class="modal fade" id="addMaterialModal" tabindex="-1" role="dialog"
                 aria-labelledby="addMaterialModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="addMaterialModalLabel">Thêm Vật Liệu</h5>
                        </div>
                        <div class="modal-body">
                            <form id="addMaterialForm">
                                <div class="form-group">
                                    <label for="materialName">Tên Vật Liệu</label>
                                    <input type="text" class="form-control" id="materialName" required>
                                </div>
                                <div class="form-group">
                                    <label for="materialSeason">Mùa</label>
                                    <select class="form-control" id="materialSeason" required>
                                        <option value="">Chọn mùa</option>
                                        <option value="Xuân">Xuân</option>
                                        <option value="Hạ">Hạ</option>
                                        <option value="Thu">Thu</option>
                                        <option value="Đông">Đông</option>
                                        <option value="4 Mùa">4 Mùa</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="materialImage">Hình Ảnh</label>
                                    <input type="text" class="form-control" id="materialImage"
                                           placeholder="Nhập URL hình ảnh">
                                </div>
                                <div class="form-group">
                                    <label for="materialQuantity">Số Lượng</label>
                                    <input type="number" class="form-control" id="materialQuantity" required min="1">
                                </div>
                                <div class="form-group">
                                    <label for="materialState">Trạng Thái</label>
                                    <select class="form-control" id="materialState" required>
                                        <option value="1">Còn hàng</option>
                                        <option value="0">Hết hàng</option>
                                        <option value="2">Ẩn</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="materialCategory">Loại Chất Liệu</label>
                                    <input type="text" class="form-control" id="materialCategory" required>
                                </div>
                                <div class="form-group">
                                    <label for="materialPrice">Giá</label>
                                    <input type="number" class="form-control" id="materialPrice" required min="0">
                                </div>
                                <div class="form-group">
                                    <label for="materialDescription">Mô Tả</label>
                                    <textarea class="form-control" id="materialDescription" rows="3"></textarea>
                                </div>
                                <button type="submit" class="btn-custumize btn-lg">Thêm Vật Liệu</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Modal sửa vật liệu -->
            <div class="modal" id="editMaterialModal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title">Sửa Vật Liệu</h5>
                        </div>
                        <div class="modal-body">
                            <form id="editMaterialForm">
                                <!-- Input ẩn ID vật liệu -->
                                <input type="hidden" id="editMaterialId">

                                <div class="form-group">
                                    <label for="editMaterialName">Tên Vật Liệu</label>
                                    <input type="text" class="form-control" id="editMaterialName" required>
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialSeason">Mùa</label>
                                    <select class="form-control" id="editMaterialSeason" required>
                                        <option value="Xuân">Xuân</option>
                                        <option value="Hạ">Hạ</option>
                                        <option value="Thu">Thu</option>
                                        <option value="Đông">Đông</option>
                                        <option value="4 Mùa">4 Mùa</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialImage">Hình Ảnh</label>
                                    <input type="text" class="form-control" id="editMaterialImage"
                                           placeholder="Nhập URL hình ảnh">
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialQuantity">Số Lượng</label>
                                    <input type="number" class="form-control" id="editMaterialQuantity" required
                                           min="1">
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialState">Trạng Thái</label>
                                    <select class="form-control" id="editMaterialState" required>
                                        <option value="1">Còn hàng</option>
                                        <option value="0">Hết hàng</option>
                                        <option value="2">Ẩn</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialCategory">Loại Chất Liệu</label>
                                    <input type="text" class="form-control" id="editMaterialCategory" required>
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialPrice">Giá</label>
                                    <input type="number" class="form-control" id="editMaterialPrice" required min="0">
                                </div>
                                <div class="form-group">
                                    <label for="editMaterialDescription">Mô Tả</label>
                                    <textarea class="form-control" id="editMaterialDescription" rows="3"></textarea>
                                </div>
                                <button type="submit" class="btn-custumize btn-lg">Lưu Thay Đổi</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>


            <hr>
            <h3 class="text-center">Danh Sách Vật Liệu</h3>
            <table id="materialTable" class="table table-bordered">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Tên</th>
                    <th>Mùa</th>
                    <th>Hình ảnh</th>
                    <th>Số lượng</th>
                    <th>Trạng thái</th>
                    <th>Loại chất liệu</th>
                    <th>Gía</th>
                    <th>Mô tả</th>
                    <th>Hành động</th>
                </tr>
                </thead>
                <tbody>
                <!-- Dữ liệu sẽ được thêm động -->
                </tbody>
            </table>
        </div>
        <!-- Button to Open the Modal -->
        <button type="button" class="btn-custumize btn-lg admin-addMaterialbtn mt-3" data-toggle="modal"
                data-target="#addMaterialModal"> Thêm Vật Liệu
        </button>
    </section>


    <!-- Đơn hàng  -->
    <section id="admin-orders" class="admin-hide">
        <!-- <br><br><br> -->
        <!--  -->
        <div class="container">
            <div class="admin-header">
                <h1 class="">Quản Lý Đơn Hàng</h1>
                <div class="admin-header-right">
                    <div class="input-group"><input type="text" class="form-control" placeholder="Tìm kiếm...">
                        <button class="btn btn-primary" type="button"><i class="fas fa-search"></i></button>
                    </div>
                </div>
            </div>
            <hr>
            <h3 class="text-center">Danh Sách Đơn Hàng</h3>
            <table class="table table-bordered">
                <thead>
                <tr>
                    <th>Mã Đơn Hàng</th>
                    <th>Tên Khách Hàng</th>
                    <th>Sản Phẩm</th>
                    <th>Số Lượng</th>
                    <th>Giá</th>
                    <th>Trạng Thái</th>
                    <th>Vị Trí Hiện Tại</th>
                    <th>Hành Động</th>
                </tr>
                </thead>
                <tbody id="orderList"> <!-- Danh sách đơn hàng sẽ được thêm vào đây -->
                <tr>
                    <td>1</td>
                    <td>Nguyễn Trọng Nhân</td>
                    <td>Vest Xanh</td>
                    <td>1</td>
                    <td>1000000</td>
                    <td>Đang Vận Chuyển</td>
                    <td>Quận Thủ Đức</td>
                    <td>
                        <button type="submit" class="btn btn-primary btn-sm admin-order-editBtn">Cập Nhật</button>
                    </td>
                </tr>
                </tbody>
            </table>
            <!-- The Modal -->
            <div class="modal" id="orderModal">
                <div class="modal-dialog">
                    <div class="modal-content"> <!-- Modal Header -->
                        <div class="modal-header">
                            <h4 class="modal-title">Sửa Đơn Hàng</h4>
                            <!-- <button type="button" class="close" data-dismiss="modal">&times;</button> -->
                        </div> <!-- Modal Body -->
                        <div class="modal-body">
                            <form id="orderForm">
                                <div class="form-group"><label for="orderCode">Mã Đơn Hàng</label> <input
                                        type="text" class="form-control" id="orderCode"
                                        placeholder="Nhập mã đơn hàng" required readonly></div>
                                <div class="form-group"><label for="customerName">Tên Khách Hàng</label> <input
                                        type="text" class="form-control" id="customerName"
                                        placeholder="Nhập tên khách hàng" required readonly></div>
                                <div class="form-group"><label for="product">Sản Phẩm</label> <input type="text"
                                                                                                     class="form-control"
                                                                                                     id="product"
                                                                                                     placeholder="Nhập sản phẩm"
                                                                                                     required
                                                                                                     readonly>
                                </div>
                                <div class="form-group"><label for="quantity">Số Lượng</label> <input type="number"
                                                                                                      class="form-control"
                                                                                                      id="quantity"
                                                                                                      placeholder="Nhập số lượng"
                                                                                                      required
                                                                                                      readonly>
                                </div>
                                <div class="form-group"><label for="price">Giá</label> <input type="number"
                                                                                              class="form-control"
                                                                                              id="price"
                                                                                              placeholder="Nhập giá"
                                                                                              required readonly>
                                </div>
                                <div class="form-group"><label for="status">Trạng Thái</label> <select
                                        class="form-control" id="status" required>
                                    <option value="">Chọn trạng thái</option>
                                    <option>Đang xử lý</option>
                                    <option>Đang vận chuyển</option>
                                    <option>Đã giao</option>
                                    <option>Đã hủy</option>
                                </select></div>
                                <div class="form-group"><label for="order-location">Vị Trí Hiện Tại</label> <input
                                        type="text" class="form-control" id="order-location"
                                        placeholder="Nhập vị trí hiện tại" required>
                                </div>
                                <button type="submit" class="btn-custumize btn-lg mt-2">Lưu
                                    Thay
                                    Đổi
                                </button>
                            </form>
                        </div> <!-- Modal Footer -->
                        <!-- <div class="modal-footer"> <button type="button" class="btn btn-danger"
                                data-dismiss="modal">Đóng</button> </div> -->
                    </div>
                </div>
            </div>
        </div>
    </section>


    <!-- Danh mục  -->
    <section id="admin-categories" class="admin-hide">
        <!-- <br><br><br> -->
        <!--  -->
        <div class="container">
            <div class="admin-header">
                <h1 class="">Quản Lý Danh Mục</h1>
                <div class="admin-header-right">
                    <div class="input-group"><input type="text" class="form-control" placeholder="Tìm kiếm...">
                        <button class="btn btn-primary" type="button"><i class="fas fa-search"></i></button>
                    </div>
                </div>
            </div>
            <hr>
            <div class="card mt-4">
                <div class="card-header">
                    <h2>Danh Sách Danh Mục</h2>
                </div>
                <div class="card-body">
                    <table class="table table-striped">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>Tên Danh Mục</th>
                            <th>Danh Mục Cha</th>
                            <th>Trạng Thái</th>
                            <th>Mô Tả</th>
                            <th>Hành Động</th>
                        </tr>
                        </thead>
                        <tbody id="categories-tbody">


                        <!-- Thêm các hàng khác tại đây -->
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="card mt-4">
                <div class="card-header">
                    <h2>Thêm Danh Mục Mới</h2>
                </div>
                <div class="card-body">
                    <form id="addCategoryForm" action="categories" method="POST">
                        <div class="mb-3"><label for="categoryName" class="form-label">Tên Danh Mục</label> <input
                                type="text" class="form-control" id="categoryName" placeholder="Nhập tên danh mục"
                                required>
                        </div>


                        <div class="form-group"><label for="DanhMucCha">Danh Mục Cha</label> <select
                                class="form-control" id="DanhMucCha" required>
                            <option value="">Danh Mục Cha</option>

                        </select></div>
                        <div class="form-group"><label for="TrangThai">Trạng Thái</label> <select class="form-control"
                                                                                                  id="TrangThai"
                                                                                                  required>
                            <option value="0">Ẩn</option>
                            <option value="1">Hiện</option>
                            <option value="2">Nổi Bật</option>
                        </select></div>
                        <div class="mb-3"><label for="categoryDescription" class="form-label">Mô Tả</label>
                            <textarea class="form-control" id="categoryDescription" rows="3"
                                      placeholder="Nhập mô tả"></textarea>
                        </div>
                        <button type="submit" class="btn-custumize btn-lg">Thêm Danh Mục</button>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <!-- Notification Section -->
    <section id="admin-notification" class="admin-hide">
        <div class="container">
            <div class="admin-header">
                <h1 class="">Thông Báo Đến Người Dùng</h1>
                <div class="admin-header-right">
                    <div class="input-group">
                        <input type="text" class="form-control" id="searchNotification" placeholder="Tìm kiếm...">
                        <button class="btn btn-primary" type="button" onclick="searchNotification()"><i class="fas fa-search"></i></button>
                    </div>
                </div>
            </div>
            <hr>
            <h2 class="text-center">Tạo Thông Báo</h2>
            <form id="notificationForm" onsubmit="return sendNotification(event);">
                <div class="mb-3">
                    <label for="notificationTitle" class="form-label">Tiêu Đề Thông Báo</label>
                    <input type="text" class="form-control" id="notificationTitle" name="title" placeholder="Nhập tiêu đề thông báo" required>
                </div>
                <div class="mb-3">
                    <label for="checkDangKy">Người Nhận Thông Báo</label>
                    <select class="form-control" id="checkDangKy" name="userGroup" required>
                        <option value="">Chọn</option>
                        <option value="0">Chưa Đăng Ký</option>
                        <option value="1">Đã Đăng Ký</option>
                        <option value="2">Tất Cả Người Dùng</option>
                        <option value="3">Người Giao Hàng</option>
                        <option value="4">Nhân Viên</option>
                        <option value="5">Admin</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="loaithongbao">Loại Thông Báo</label>
                    <select class="form-control" id="loaithongbao" name="type" required>
                        <option value="">Chọn</option>
                        <option value="new_product">Thông Báo Sản Phẩm Mới</option>
                        <option value="promotion">Thông Báo Khuyến Mãi</option>
                    </select>
                </div>
                <div class="mb-3">
                    <label for="notificationContent" class="form-label">Nội Dung Thông Báo</label>
                    <textarea class="form-control" id="notificationContent" name="content" rows="5" placeholder="Nhập nội dung thông báo" required></textarea>
                </div>
                <button type="submit" class="btn btn-primary">Gửi Thông Báo</button>
            </form>

            <!-- Lưu thông báo -->
            <div class="container mt-5">
                <h2 class="text-center">Danh Sách Thông Báo</h2>
                <table class="table table-bordered">
                    <thead>
                    <tr>
                        <th>Tiêu Đề</th>
                        <th>Người Nhận Thông Báo</th>
                        <th>Loại Thông Báo</th>
                        <th>Nội Dung</th>
                        <th>Thời Gian</th>
                    </tr>
                    </thead>
                    <tbody id="notificationList">
                    <!-- Danh sách thông báo sẽ được thêm động tại đây -->
                    </tbody>
                </table>
            </div>
        </div>
    </section>

    <section id="admin-contacts" class="admin-hide">
        <div class="container mt-5">
            <!-- Title -->
            <h1>Quản lý liên hệ</h1>

            <!-- DataTable -->
            <hr>
            <h3 class="text-center">Danh Sách Liên Hệ</h3>
            <table id="contactsTable" class="table table-striped table-bordered">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Tên</th>
                    <th>Email</th>
                    <th>Tin nhắn</th>
                    <th>Trạng thái</th>
                    <th>Phản hồi</th>
                    <th>Hành động</th>
                </tr>
                </thead>
                <tbody>
                <!-- Data will be dynamically populated here via JavaScript -->
                </tbody>
            </table>

            <!-- Modal for Responding to Contact -->
            <div class="modal fade" id="responseModal" tabindex="-1" aria-labelledby="responseModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="responseModalLabel">Phản hồi liên hệ</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <p><strong>Tên:</strong> <span id="responseContactName"></span></p>
                            <p><strong>Email:</strong> <span id="responseContactEmail"></span></p>
                            <p><strong>Tin nhắn:</strong> <span id="responseContactMessage"></span></p>
                            <p><strong>Phản hồi hiện tại:</strong> <span id="currentResponse"></span></p> <!-- Show current response -->
                            <textarea id="responseText" class="form-control" rows="4" placeholder="Nhập phản hồi"></textarea>
                            <input type="hidden" id="responseContactId">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Đóng</button>
                            <button type="button" class="btn btn-primary" id="sendResponseBtn">Gửi phản hồi</button>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>



<%--    <!-- report -->--%>
<%--    <section id="admin-reports" class="admin-hide">--%>
<%--            <div class="container mt-5">--%>
<%--                <!-- Title -->--%>
<%--                <h1>Phản Hồi Khách Hàng</h1>--%>

<%--                <!-- DataTable -->--%>
<%--                <hr>--%>
<%--                <h3 class="text-center">Danh Sách Phản Hồi</h3>--%>
<%--                <table id="criticTable" class="table table-striped table-bordered">--%>
<%--                    <thead>--%>
<%--                    <tr>--%>
<%--                        <th>#</th>--%>
<%--                        <th>Tên</th>--%>
<%--                        <th>Email</th>--%>
<%--                        <th>Tin nhắn</th>--%>
<%--                    </tr>--%>
<%--                    </thead>--%>
<%--                    <tbody>--%>
<%--                    <!-- Data will be dynamically populated here via JavaScript -->--%>
<%--                    </tbody>--%>
<%--                </table>--%>

<%--                <!-- Modal for Responding to Contact -->--%>
<%--                <div class="modal fade" id="criticModal" tabindex="-1" aria-labelledby="responseModalLabel"--%>
<%--                     aria-hidden="true">--%>
<%--                    <div class="modal-dialog">--%>
<%--                        <div class="modal-content">--%>
<%--                            <div class="modal-header">--%>
<%--                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
<%--                            </div>--%>
<%--                            <div class="modal-body">--%>
<%--                                <p><strong>Tên:</strong> <span id="criticContactName"></span></p>--%>
<%--                                <p><strong>Email:</strong> <span id="criticContactEmail"></span></p>--%>
<%--                                <p><strong>Tin nhắn:</strong> <span id="criticContactMessage"></span></p>--%>
<%--                            </div>--%>
<%--                            <div class="modal-footer">--%>
<%--                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Đóng</button>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>

<%--            </div>--%>
<%--        </section>--%>

</div>
<!-- </div>
</div> -->

<!-- footer -->
<!-- <div id="footer"></div> -->

<!-- js -->
<script src="vendors/bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
<script src="vendors/js/jquery-3.7.1.min.js"></script>
<script src="resources/js/main.js"></script>
<script src="resources/js/admin.js"></script>


<!-- CDN chart and demo script  -->
<!-- DataTables JS -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.datatables.net/1.13.6/js/jquery.dataTables.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.4/Chart.js"></script>


</body>

</html>