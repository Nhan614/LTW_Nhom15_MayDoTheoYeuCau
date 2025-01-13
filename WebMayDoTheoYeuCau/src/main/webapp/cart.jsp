<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart - THREEN TAILORED</title>
    <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256"
          type="image/x-icon">
    <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
</head>

<body>
<!-- header -->
<div id="menubar">
    <%@ include file="resources/data/header.jsp" %>
</div>

<!-- section 1 -->
<div id="sec1">
    <div class="top-bar text-center py-2">
        <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
        <button type="button" class="btn-close position-absolute end-0"
                style="margin-right:10px;filter: brightness(0) invert(1); " aria-label="Close"></button>
    </div>
    <hr>
    <div class="container">
        <h1><strong>Giỏ Hàng Của Bạn</strong></h1>

        <!-- Giỏ hàng -->
        <div class="cart mt-2 mb-5">
            <div class="row">
                <div class="col-lg-9  border">
                    <!-- col left -->
                    <div class="container mt-4">
                        <h1 class="mb-4">Danh sách sản phẩm</h1>
                        <div class="table-container">
                            <table class="table table-striped">
                                <thead>
                                <tr>
                                    <th scope="col">Hình ảnh</th>
                                    <th scope="col">Tên sản phẩm</th>
                                    <th scope="col">Số lượng</th>
                                    <th scope="col">Giá</th>
                                    <th scope="col">Chi tiết</th>
                                    <th scope="col">Hành động</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach var="item" items="${cart}">
                                    <tr>
                                        <td class="align-middle"><img src="${item.image}"
                                                                      alt="Product 1"
                                                                      class="img-cart"></td>
                                        <td class="">
                                            <p><strong>${item.name}</strong></p>
                                        </td>
                                        <td class="align-middle"><input type="number" class="form-control" value="${item.quantity}"
                                                                        min="1"
                                                                        max="99"
                                        ></td>

                                        <td class="align-middle">
                                            <p><strong>${item.price}</strong></p>
                                        </td>
                                        <td class="align-middle">
                                            <span></span>
                                        </td>
                                        <td class="align-middle">
                                            <a href="deleteCart?id=${item.id}" class="p-3 bg-danger deleteBtn">Xóa</a>
                                        </td>
                                    </tr>
                                    <!-- Thêm các sản phẩm khác ở đây -->
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>

                <div class="col-lg-3">
                    <div class="row">
                        <!-- col right -->
                        <div class="col-md-12 border bg-body-secondary">
                            <div class="cart-footer">
                                <!-- Mã giảm giá -->
                                <div class="cart-discount">
                                    <label for="discountCode">Mã Giảm Giá</label><br>
                                    <input type="text" class="form-control" id="discountCode"
                                           placeholder="Nhập mã giảm giá">
                                </div>
                                <hr>
                                <!-- nhap ghi chu -->
                                <div class="mb-3"><label for="cartTextarea" class="form-label">Ghi chú</label> <textarea
                                        class="form-control" id="cartTextarea" rows="3"
                                        placeholder="Nhập ghi chú của bạn ở đây..."></textarea>
                                </div>
                                <hr>
                                <!-- van chuyen va gia cu -->
                                <h5 class="text-left">Phí vận chuyển: <span>0 VND</span></h5>
                                <hr>
                                <!-- Tổng cộng -->
                                <div class="col cart-total">
                                    <h4>Tổng cộng: <span>0 VND</span></h4>
                                    <div style="display: flex; gap: 10px; flex-wrap: wrap; justify-content: center;">
                                        <button><a href="collection" class="shop-btn ">Mua Thêm</a></button>
                                        <button><a href="checkout.jsp" class="shop-btn bg-success">Thanh Toán</a>
                                        </button>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- footer -->
<div id="footer">
    <%@include file="resources/data/footer.jsp" %>
</div>

<script>
    // Cố định phí vận chuyển (nếu không miễn phí)
    const baseShippingFee = 70000;
    const freeShippingThreshold = 3500000;


    function calculateTotal() {
        let total = 0;
        let hasProduct = false;
        const rows = document.querySelectorAll("tbody tr");


        rows.forEach(row => {
            const priceText = row.querySelector("td:nth-child(4) strong").innerText;
            const price = parseFloat(priceText.replace(/[^0-9.-]+/g, ""));
            const quantityInput = row.querySelector("td:nth-child(3) input");
            const quantity = parseInt(quantityInput.value);

            if (!isNaN(price) && !isNaN(quantity) && quantity > 0) {
                total += price * quantity;
                hasProduct = true;
            }
        });

        // Tính phí vận chuyển
        let shippingFee = 0;
        if (hasProduct) {
            shippingFee = total >= freeShippingThreshold ? 0 : baseShippingFee;
        }

        // Tổng tiền bao gồm phí vận chuyển
        const totalWithShipping = total + shippingFee;

        // Cập nhật hiển thị tổng tiền
        const totalElement = document.querySelector(".cart-total span");
        if (totalElement) {
            totalElement.innerText = new Intl.NumberFormat("vi-VN", { style: "currency", currency: "VND" }).format(totalWithShipping);
        }

        // Cập nhật hiển thị phí vận chuyển
        const shippingElement = document.querySelector(".cart-footer h5 span");
        if (shippingElement) {
            shippingElement.innerText = new Intl.NumberFormat("vi-VN", { style: "currency", currency: "VND" }).format(shippingFee);
        }
    }

    // Khi trang tải, gọi hàm tính toán tổng tiền
    document.addEventListener("DOMContentLoaded", () => {
        calculateTotal();

        // Lắng nghe sự thay đổi số lượng sản phẩm
        const quantityInputs = document.querySelectorAll("tbody input[type='number']");
        quantityInputs.forEach(input => {
            input.addEventListener("input", calculateTotal);
        });
    });
</script>


<!-- js -->
<script src="vendors/bootstrap-5.3.3-dist//js/bootstrap.bundle.min.js"></script>
<script src="vendors/js/jquery-3.7.1.min.js"></script>
<%--  <script src="resources/js/main.js"></script>--%>
<script src="resources/js/quit.js"></script>
<script src="resources/js/backtotop.js"></script>

</body>

</html>