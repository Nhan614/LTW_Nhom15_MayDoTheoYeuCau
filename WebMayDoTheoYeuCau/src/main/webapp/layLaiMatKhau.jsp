<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Recovery - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
          type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

</head>

<body>



<div class="container  " style="width: 100vw; height: 100vh;">
    <div class="" style="width: 100%; height: 100%;">
        <div class="row">
            <div class="col-lg-6 m-auto">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Nhập Mật Khẩu Mới</h5>
                        <hr>

                        <!-- Hiển thị thông báo lỗi hoặc thành công -->
                        <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
                        <% String successMessage = (String) request.getAttribute("successMessage"); %>

                        <% if (errorMessage != null) { %>
                        <div class="alert alert-danger">
                            <%= errorMessage %>
                        </div>
                        <% } %>

                        <% if (successMessage != null) { %>
                        <div class="alert alert-success">
                            <%= successMessage %>
                        </div>
                        <% } %>

                        <form action="ResetPassword" method="post">
                            <input type="hidden" name="email" value="<%= request.getSession().getAttribute("email") %>">
                            <div class="mb-3">
                                <label for="newPassword" class="form-label">Mật Khẩu Mới</label>
                                <input type="password" class="form-control" id="newPassword" name="newPassword"
                                       placeholder="Nhập mật khẩu mới" required>
                            </div>
                            <div class="mb-3">
                                <label for="confirmPassword" class="form-label">Xác Nhận Mật Khẩu Mới</label>
                                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword"
                                       placeholder="Xác nhận mật khẩu mới" required>
                            </div>
                            <button type="submit" class="btn-custumize">Đổi Mật Khẩu</button>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
<!-- js -->
<script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
<script src="vendors/js/jquery-3.7.1.min.js"></script>
<script src="resources/js/main.js"></script>
<script src="resources/js/quit.js"></script>
<script src="resources/js/backtotop.js"></script>


</html>