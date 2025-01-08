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
</head>

<body>
<!-- menu -->
<div id="menubar">
    <%@ include file="resources/data/header.jsp" %>
</div>

<!-- sec1 -->
<div id="sec1">

    <div class="top-bar text-center py-2">
        <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
        <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
    </div>


    <div class="col-lg-6 mx-auto mt-3">
        <div class="card">
            <div class="card-header text-center">
                <h3>Thay đổi thông tin khách hàng</h3>
            </div>
            <div class="card-body text-center">
                <form action="profileEditController" method="POST">
                    <img src="<%=user.getAvatar()%>" alt="Profile Image" class="profile-img"
                         id="profileImage">
                    <div class="mb-3">
                        <label for="profileImageUrl" class="form-label">Nhập URL hình ảnh mới</label>
                        <input class="form-control" type="text" id="profileImageUrl"
                               placeholder="https://example.com/image.jpg"
                               value="<%=user.getAvatar()%>">
                    </div>

                    <div class="mb-3"><label for="name" class="form-label">Tên</label> <input type="text"
                                                                                              class="form-control"
                                                                                              id="name"
                                                                                              placeholder="Tên của bạn"
                                                                                              value="<%=user.getFullName()%>">
                    </div>
                    <div class="mb-3"><label for="email" class="form-label">Email</label> <input type="email"
                                                                                                 class="form-control"
                                                                                                 id="email"
                                                                                                 placeholder="your.email@example.com"
                                                                                                 value="<%=user.getGmail()%>">
                    </div>
                    <div class="mb-3"><label for="phone" class="form-label">Điện thoại</label> <input
                            type="text" class="form-control" id="phone" placeholder="0123456789"
                            value="<%=user.getPhone()%>"></div>
                    <div class="mb-3"><label for="address" class="form-label">Địa chỉ</label> <input
                            type="text" class="form-control" id="address" placeholder="Địa chỉ của bạn"
                            value="<%=user.getAddress()%>"></div>
                    <button type="submit" class="btn-custumize">Lưu thay đổi</button>
                </form>
            </div>
        </div>
    </div>
</div>


<!-- footer -->
<div id="footer">
    <%@include file="resources/data/footer.jsp" %>
</div>

<!-- js -->
<script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
<script src="vendors/js/jquery-3.7.1.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
<script src="resources/js/quit.js"></script>
<script src="resources/js/backtotop.js"></script>

</body>

</html>