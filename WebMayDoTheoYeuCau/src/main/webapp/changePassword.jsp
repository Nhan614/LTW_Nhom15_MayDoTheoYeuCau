<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ChangePassword - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">

    <script>
        function validatePasswords() {
            var newPassword = document.getElementById("newPassword").value;
            var confirmPassword = document.getElementById("confirmPassword").value;

            if (newPassword !== confirmPassword) {
                alert("Mật khẩu mới và xác nhận mật khẩu phải trùng khớp.");
                return false;
            }

            return true;
        }


    </script>

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

        <body>
            <div class="container mt-5">
                <div class="row">
                    <div class="col-lg-6 mx-auto">
                        <div class="card">
                            <div class="card-body">
                                <h5 class="card-title">Đổi Mật Khẩu</h5>
                                <hr>

                                <%-- Hiển thị lỗi --%>
                                <c:if test="${not empty error}">
                                    <div class="alert alert-danger">${error}</div>
                                </c:if>

                                <%-- Hiển thị thông báo thành công --%>
                                <c:if test="${not empty success}">
                                    <div class="alert alert-success">${success}</div>
                                </c:if>


                                <form action="changePassword" method="post" onsubmit="return validatePasswords()">
                                    <div class="mb-3">
                                        <label for="currentPassword" class="form-label">Mật Khẩu Hiện Tại</label>
                                        <input type="password" class="form-control" id="currentPassword" name="currentPassword" placeholder="Nhập mật khẩu hiện tại" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="newPassword" class="form-label">Mật Khẩu Mới</label>
                                        <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Nhập mật khẩu mới" required>
                                    </div>
                                    <div class="mb-3">
                                        <label for="confirmPassword" class="form-label">Xác Nhận Mật Khẩu Mới</label>
                                        <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" placeholder="Xác nhận mật khẩu mới" required>
                                    </div>
                                    <button type="submit" class="btn btn-primary">Đổi Mật Khẩu</button>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </body>

    </div>

    <!-- footer -->
    <div id="footer"><%@include file="resources/data/footer.jsp"%></div>

    <!-- js -->
    <script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
    <script src="vendors/js/jquery-3.7.1.min.js"></script>
<%--    <script src="resources/js/main.js"></script>--%>
    <script src="resources/js/quit.js"></script>
    <script src="resources/js/backtotop.js"></script>



</html>