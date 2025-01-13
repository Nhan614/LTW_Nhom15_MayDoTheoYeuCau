        <%@ page import="vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <div id="header">
        <div class="navbar navbar-lg navbar-expand-lg fixed-top bg-white shadow ">
            <a class="navbar-brand" href="home.jsp"> <img src="resources/images/logo.jpg" alt="Logo" width="100%"
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
                        <a href="collection" class="nav-link">BỘ SƯU TẬP</a>
                    </li>
                    <li class="nav-item dropdown mega-menu">
                        <a class="nav-link dropdown-toggle" href="#" role="button">TRANG PHỤC</a>
                        <div class="dropdown-menu alpha">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-3">
                                        <h6>Vest</h6>
                                        <a href="products?type=vestCongSo" class="dropdown-item">Vest Công Sở</a>
                                        <a href="products?type=vestThuongNgay" class="dropdown-item">Vest Thường Ngày</a>
                                        <a href="products?type=vestXanh" class="dropdown-item">Vest Xanh</a>
                                        <a href="products?type=vestNau" class="dropdown-item">Vest Nâu</a>
                                        <a href="products?type=vestXam" class="dropdown-item">Vest Xám</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Áo</h6>
                                        <a href="products?type=aoSoMi" class="dropdown-item">Áo Sơ Mi</a>
                                        <a href="products?type=aoPolo" class="dropdown-item">Áo Polo</a>
                                        <a href="products?type=overshirt" class="dropdown-item">Áo Khoác Ngoài</a>
                                        <a href="products?type=blazer" class="dropdown-item">Blazers</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Quần Dài</h6>
                                        <a href="products?type=quanAu" class="dropdown-item">Quần Âu</a>
                                        <a href="products?type=quanChino" class="dropdown-item">Quần Chino</a>
                                        <a href="products?type=quanNi" class="dropdown-item">Quần Nỉ</a>
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
                                        <a href="products?type=caVat" class="dropdown-item">Cà Vạt</a>
                                        <a href="products?type=khanChoang" class="dropdown-item">Khăn Choàng</a>
                                        <a href="products?type=thatLung" class="dropdown-item">Thắt Lưng</a>
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
                        <a href="blog.jsp" class="nav-link">TIN TỨC</a>
                    </li>
                    <li class="nav-item">
                        <a href="aboutUs.jsp" class="nav-link">VỀ CHÚNG TÔI</a>
                    </li>

<%--ẩn liên hệ--%>
                    <%
                        User user = (User) session.getAttribute("auth");
                        if (user != null) {
                    %>
                    <li class="nav-item">
                        <a href="contactUs.jsp" class="nav-link">LIÊN HỆ</a>
                    </li>
                    <%
                        }
                    %>
<%-------------------------------------------------------------------------------%>
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


                    <%
                        // Lấy thông tin người dùng từ session
                        user = (User) session.getAttribute("auth");
                    %>

                    <li class="nav-item dropdown">
                        <div class="user-box">
                            <% if (user != null) { %> <!-- Nếu người dùng đã đăng nhập -->

                            <a class="dropdown-item" href="profile.jsp">
                            <img src="<%=user.getAvatar()%>" alt="Avatar" class="avatar-img" style="width: 40px; height: 40px; border-radius: 50%;">
                            </a>

                            <ul class="dropdown-menu dropdown-menu-end pt-2 m-2">
                                <li><a class="dropdown-item" href="logout">Đăng Xuất</a></li>

                            </ul>
                            <% } else { %> <!-- Nếu người dùng chưa đăng nhập -->
                            <a href="#"><i class="fa-regular fa-user fa-xl"></i></a>
                            <ul class="dropdown-menu dropdown-menu-end pt-2 m-2">
                                <li><a id="adress-form" href="login.jsp#login-form" class="dropdown-item">Đăng Nhập</a></li>
                                <li><a class="dropdown-item" href="login.jsp#signup-form">Đăng Ký</a></li>
                            </ul>
                            <% } %>
                        </div>
                    </li>

                    <!-- shop -->
                    <% if (user != null) { %>
                    <div class="cart-box">
                        <li class="nav-item" id="shop-address"> <a style="color: black;" href="cart.jsp"><i
                                    class="fa-solid fa-cart-shopping fa-lg"></i> </a></li>
                    </div>
                    <% } %>
                </ul>
            </div>

        </div>
    </div>

