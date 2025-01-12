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
                        <a href="collection.jsp" class="nav-link">BỘ SƯU TẬP</a>
                    </li>
                    <li class="nav-item dropdown mega-menu">
                        <a class="nav-link dropdown-toggle" href="#" role="button">TRANG PHỤC</a>
                        <div class="dropdown-menu alpha">
                            <div class="container-fluid">
                                <div class="row">
                                    <div class="col-md-3">
                                        <h6>Vest</h6>
                                        <a href="products?type=vestCongSo" class="dropdown-item">Vest Công Sở</a>
                                        <a href="vestThuongNgay.jsp" class="dropdown-item">Vest Thường Ngày</a>
                                        <a href="vestXanh.jsp" class="dropdown-item">Vest Xanh</a>
                                        <a href="vestNau.jsp" class="dropdown-item">Vest Nâu</a>
                                        <a href="vestXam.jsp" class="dropdown-item">Vest Xám</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Áo</h6>
                                        <a href="aoSoMi.jsp" class="dropdown-item">Áo Sơ Mi</a>
                                        <a href="aoPolo.jsp" class="dropdown-item">Áo Polo</a>
                                        <a href="overshirt.jsp" class="dropdown-item">Áo Khoác Ngoài</a>
                                        <a href="blazer.jsp" class="dropdown-item">Blazers</a>
                                    </div>
                                    <div class="col-md-3">
                                        <h6>Quần Dài</h6>
                                        <a href="quanAu.jsp" class="dropdown-item">Quần Âu</a>
                                        <a href="quanChino.jsp" class="dropdown-item">Quần Chino</a>
                                        <a href="quanNi.jsp" class="dropdown-item">Quần Nỉ</a>
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
                                        <a href="caVat.jsp" class="dropdown-item">Cà Vạt</a>
                                        <a href="khanChoang.jsp" class="dropdown-item">Khăn Choàng</a>
                                        <a href="thatLung.jsp" class="dropdown-item">Thắt Lưng</a>
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

