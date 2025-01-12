<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MayAo - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
          type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <style>
        input[type="radio"]:checked + label .custumize-card-body {
            border: 2px solid #007bff;
            border-radius: 10px;
        }
    </style>
</head>
<body>
<!-- Header -->
<div id="menubar">
    <%@ include file="resources/data/header.jsp" %>
</div>
<!-- section 1 -->
<section id="sec1">
    <div class="top-bar text-center py-2">
        <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
        <button type="button" class="btn-close position-absolute end-0" style="margin-right:10px;filter: brightness(0) invert(1); "aria-label="Close"></button>
    </div>
</section>
<!-- Customize Form -->
<form id="customizeForm" action="submit_form.jsp" method="POST">
    <!-- Loại Vải -->
    <div class="container mt-5">
        <h1 class="mb-4">Lựa Chọn Loại Vải</h1>
        <div class="row">
            <!-- Vòng lặp lấy dữ liệu vật liệu -->
            <c:forEach var="material" items="${materials}">
                <c:if test="${material.matCategory != null && material.matCategory == 'Vai'}">
                    <div class="col-md-3">
                        <div class="custumize-card">
                            <input type="radio" id="fabric_${material.name}" name="fabric" value="${material.name}"
                                   <c:if test="${material.name == fabric}">checked</c:if> required>
                            <label for="fabric_${material.name}" class="custumize-label">
                                <img src="${material.image}" class="custumize-img w-100" alt="${material.name}">
                                <div class="custumize-card-body">
                                    <h5 class="card-title">${material.name}</h5>
                                    <span>${material.season}</span>
                                        <%--                                <span>${material.material}</span>--%>
                                    <strong>${material.price} VND</strong>
                                </div>
                            </label>
                        </div>
                    </div>
                </c:if>
            </c:forEach>
        </div>
    </div>

    <!-- Các phần tử khác -->
    <hr>
    <div class="container mt-5">
        <h1 class="mb-4">Cổ Áo</h1>
        <div class="row">
            <!-- Vòng lặp lấy dữ liệu vật liệu -->
            <c:forEach var="material" items="${materials}">
                <c:if test="${material.matCategory != null && material.matCategory == 'Co'}">
                    <div class="col-md-3">
                        <div class="custumize-card">
                            <input type="radio" id="collar_${material.name}" name="collar" value="${material.name}"
                                   <c:if test="${material.name == collar}">checked</c:if> required>
                            <label for="collar_${material.name}" class="custumize-label">
                                <img src="${material.image}" class="custumize-img" alt="${material.name}">
                                <div class="custumize-card-body">
                                    <h5 class="card-title">${material.name}</h5>
<%--                                    <span>${material.season}</span>--%>
                                        <%--                                <span>${material.material}</span>--%>
                                    <strong>${material.price} VND</strong>
                                </div>
                            </label>
                        </div>
                    </div>
                </c:if>
            </c:forEach>
        </div>
    </div>

    <!-- Túi Áo -->
    <hr>
    <div class="container mt-5">
        <h1 class="mb-4">Túi Áo</h1>
        <div class="row">
            <!-- Vòng lặp lấy dữ liệu vật liệu -->
            <c:forEach var="material" items="${materials}">
                <c:if test="${material.matCategory != null && material.matCategory == 'Tui Ao'}">
                    <div class="col-md-3">
                        <div class="custumize-card">
                            <input type="radio" id="pocket_${material.name}" name="pocket" value="${material.name}"
                                   <c:if test="${material.name == pocket}">checked</c:if> required>
                            <label for="pocket_${material.name}" class="custumize-label">
                                <img src="${material.image}" class="custumize-img" alt="${material.name}">
                                <div class="custumize-card-body">
                                    <h5 class="card-title">${material.name}</h5>
<%--                                    <span>${material.season}</span>--%>
                                        <%--                                <span>${material.material}</span>--%>
                                    <strong>${material.price} VND</strong>
                                </div>
                            </label>
                        </div>
                    </div>
                </c:if>
            </c:forEach>
        </div>
    </div>

    <!-- Nút áo -->
    <hr>
    <div class="container mt-5">
        <h1 class="mb-4">Lựa Chọn Cúc Áo</h1>
        <div class="row">
            <!-- Vòng lặp lấy dữ liệu vật liệu -->
            <c:forEach var="material" items="${materials}">
                <c:if test="${material.matCategory != null && material.matCategory == 'Nut Ao'}">
                    <div class="col-md-3">
                        <div class="custumize-card">
                            <input type="radio" id="button_${material.name}" name="button" value="${material.name}"
                                   <c:if test="${material.name == button}">checked</c:if> required>
                            <label for="button_${material.name}" class="custumize-label">
                                <img src="${material.image}" class="custumize-img" alt="${material.name}">
                                <div class="custumize-card-body">
                                    <h5 class="card-title">${material.name}</h5>
                                        <%--                                    <span>${material.season}</span>--%>
                                        <%--                                <span>${material.material}</span>--%>
                                    <strong>${material.price} VND</strong>
                                </div>
                            </label>
                        </div>
                    </div>
                </c:if>
            </c:forEach>
        </div>
    </div>

    <!-- Form Liên Hệ -->
    <div class="container mt-5 bg-body-secondary">
        <h2>Liên Hệ Đặt May</h2>
        <div class="mb-3">
            <label for="name" class="form-label">Họ và tên <span class="red">*</span></label>
            <input id="name" name="name" type="text" class="form-control" placeholder="Nhập họ và tên" required>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email (để nhận xác nhận đơn hàng) <span class="red">*</span></label>
            <input id="email" name="email" type="email" class="form-control" placeholder="Nhập email" required>
        </div>
        <div class="mb-3">
            <label for="chest" class="form-label">Vòng ngực (cm) <span class="red">*</span></label>
            <input id="chest" name="chest" type="number" class="form-control" placeholder="Nhập số đo vòng ngực" required>
        </div>
        <div class="mb-3">
            <label for="shirtLength" class="form-label">Dài áo (cm) <span class="red">*</span></label>
            <input id="shirtLength" name="shirtLength" type="number" class="form-control" placeholder="Nhập số đo dài áo" required>
        </div>
        <div class="mb-3">
            <label for="sleeveLength" class="form-label">Dài tay áo (cm) <span class="red">*</span></label>
            <input id="sleeveLength" name="sleeveLength" type="number" class="form-control" placeholder="Nhập số đo dài tay áo" required>
        </div>
        <div class="mb-3">
            <label for="shoulderWidth" class="form-label">Rộng vai (cm) <span class="red">*</span></label>
            <input id="shoulderWidth" name="shoulderWidth" type="number" class="form-control" placeholder="Nhập số đo rộng vai" required>
        </div>
        <div class="m-5 justify-content-center" >
            <button type="submit" class="btn btn-primary" style="width: 300px; height: auto">Gửi đi</button>
        </div>
    </div>
</form>

<!-- Footer -->
<div id="footer">
    <%@ include file="resources/data/footer.jsp" %>
</div>

<!-- Scripts -->
<script src="vendors/js/jquery-3.7.1.min.js"></script>
<script src="vendors/bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
<script src="resources/js/backtotop.js"></script>
<script src="resources/js/quit.js"></script>
</body>
</html>
