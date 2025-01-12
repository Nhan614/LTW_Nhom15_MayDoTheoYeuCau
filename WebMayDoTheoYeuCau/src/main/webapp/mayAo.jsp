<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Collection - THREEN TAILORED</title>
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
<!-- header -->
<div id="menubar">
    <%@ include file="resources/data/header.jsp" %>
</div>

<!-- secsion 1 -->
<div id="sec1">
    <div class="top-bar text-center py-2">
        <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
        <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
    </div>

    <form id="customizeForm" action="submit_form.jsp" method="POST">
        <!-- Vải -->
        <div class="container mt-5">
            <h1 class="mb-4">Lựa Chọn Loại Vải</h1>
            <div class="row">
                <div class="col-md-3">
                    <div class="custumize-card">
                        <input type="radio" id="fabric1" name="fabric" value="Vải Xanh Nhẳn"
                            <%= "Vai Xanh".equals(request.getAttribute("fabric")) ? "checked" : "" %> required>
                        <label for="fabric1" class="custumize-label">
                            <img src="resources/images/vai1.jpg" class="custumize-img" alt="Fabric 1">
                            <div class="custumize-card-body">
                                <h5 class="card-title">Vải Xanh Nhẳn</h5>
                                <span>4 Mùa</span>
                                <span>Sợi Bông</span>
                                <strong>1,000,000 VND</strong>
                            </div>
                        </label>
                    </div>
                </div>
                <!-- Add more fabrics as needed -->
            </div>
        </div>

        <!-- Cổ Áo -->
        <hr>
        <div class="container mt-5">
            <h1 class="mb-4">Cổ Áo</h1>
            <div class="row">
                <div class="col-md-3">
                    <div class="custumize-card">
                        <input type="radio" id="collar1" name="collar" value="Lớn"
                            <%= "Lớn".equals(request.getAttribute("collar")) ? "checked" : "" %> required>
                        <label for="collar1" class="custumize-label">
                            <img src="resources/images/coAO1.png" class="custumize-img" alt="Collar 1">
                            <div class="custumize-card-body">
                                <h5 class="card-title text-center">Lớn</h5>
                            </div>
                        </label>
                    </div>
                </div>
            </div>
        </div>

        <!-- Túi Áo -->
        <hr>
        <div class="container mt-5">
            <h1 class="mb-4">Túi Áo</h1>
            <div class="row">
                <div class="col-md-3">
                    <div class="custumize-card">
                        <input type="radio" id="pocket1" name="pocket" value="Nắp"
                            <%= "Nắp".equals(request.getAttribute("pocket")) ? "checked" : "" %> required>
                        <label for="pocket1" class="custumize-label">
                            <img src="resources/images/tuiAo1.png" class="custumize-img" alt="Pocket 1">
                            <div class="custumize-card-body">
                                <h5 class="card-title text-center">Nắp</h5>
                            </div>
                        </label>
                    </div>
                </div>
            </div>
        </div>

        <!-- Cúc Áo -->
        <hr>
        <div class="container mt-5">
            <h1 class="mb-4">Lựa Chọn Cúc Áo</h1>
            <div class="row">
                <div class="col-md-3">
                    <div class="custumize-card">
                        <input type="radio" id="button1" name="button" value="Đen"
                            <%= "Đen".equals(request.getAttribute("button")) ? "checked" : "" %> required>
                        <label for="button1" class="custumize-label">
                            <img src="resources/images/cutAo1.png" class="custumize-img" alt="Button 1">
                            <div class="custumize-card-body">
                                <h5 class="card-title text-center">Đen</h5>
                            </div>
                        </label>
                    </div>
                    <!-- Add more buttons as needed -->
                </div>
            </div>
        </div>

        <!-- Form Liên Hệ -->
        <div class="container mt-5">
            <h2>Liên Hệ Đặt May</h2>
            <div class="mb-3">
                <label for="name" class="form-label">Họ và tên <span class="red">*</span></label>
                <input id="name" name="name" type="text" class="form-control" placeholder="Nhập họ và tên" required>
            </div>
            <div class="mb-3">
                <label for="phone" class="form-label">Số điện thoại <span class="red">*</span></label>
                <input id="phone" name="phone" type="tel" class="form-control" placeholder="Nhập số điện thoại"
                       required>
            </div>
            <div class="mb-3">
                <label for="chest" class="form-label">Số đo ngực (cm) <span class="red">*</span></label>
                <input id="chest" name="chest" type="number" class="form-control" placeholder="Nhập số đo ngực"
                       required>
            </div>
            <div class="mb-3">
                <label for="waist" class="form-label">Số đo eo (cm) <span class="red">*</span></label>
                <input id="waist" name="waist" type="number" class="form-control" placeholder="Nhập số đo eo" required>
            </div>
            <div class="mb-3">
                <label for="hip" class="form-label">Số đo mông (cm) <span class="red">*</span></label>
                <input id="hip" name="hip" type="number" class="form-control" placeholder="Nhập số đo mông" required>
            </div>
            <div class="mb-3">
                <label for="shoulder" class="form-label">Số đo vai (cm) <span class="red">*</span></label>
                <input id="shoulder" name="shoulder" type="number" class="form-control" placeholder="Nhập số đo vai"
                       required>
            </div>
        </div>

        <!-- Nút Gửi -->
        <div class="container mt-5">
            <button type="submit" class="btn btn-primary">Gửi đi</button>
        </div>
    </form>

    <!-- JavaScript -->
    <script>

    </script>


    <!-- Footer -->
    <div id="footer">
        <%@include file="resources/data/footer.jsp" %>
    </div>

    <!-- js -->

    <script src="vendors/js/jquery-3.7.1.min.js"></script>
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
    <script src="resources/js/backtotop.js"></script>
    <script src="resources/js/quit.js"></script>
    <%--    <script src="resources/js/main.js"></script>--%>
    <script>

    </script>

</body>

</html>