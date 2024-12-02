const xValues = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];
const yValues = [200, 150, 170, 100, 210, 220, 250, 300, 400, 300, 600, 1000];

new Chart("chartDashBoard", {
    type: "line",
    data: {
        labels: xValues,
        datasets: [{
            fill: true,
            lineTension: 0,
            backgroundColor: "rgba(0,0,255,0.3)",
            borderColor: "rgba(0,0,255,1.0)",
            data: yValues
        }]
    },
    options: {
        legend: { display: false },
        scales: {
            yAxes: [{ ticks: { min: 0, max: 1000 } }],
        }
    }
});


// product

$(document).on('click', '.admin-addProduct', function () {
    $('#productModal').modal('show');
});
let productId = 1
$('#productForm').on('submit', function (e) {
    e.preventDefault(); let productName = $('#productName').val(); let productPrice = $('#productPrice').val(); let productNum = $('#productNum').val(); let season = $('#season').val(); let material = $('#material').val(); let manufacturer = $('#hot').val(); let category = $('#category').val(); let productRow = `<tr> <td>${productId}</td> <td>${productName}</td> <td>${productPrice}</td> <td>${productNum}</td> <td>${season}</td> <td>${material}</td> <td>${manufacturer}</td> <td>${category}</td> <td> <button class="btn btn-primary btn-sm admin-product-editBtn">Sửa</button> <button class="btn btn-danger btn-sm deleteBtn">Xóa</button> </td> </tr>`; $('#productList').append(productRow); $('#productModal').modal('hide'); $('#productForm')[0].reset(); productId++;
})
$(document).on('click', '.deleteBtn', function () {
    $(this).closest('tr').remove();
});
$(document).on('click', '.admin-product-editBtn', function () {
    let row = $(this).closest('tr');
    $('#productName').val(row.find('td:eq(0)').text());
    $('#productCode').val(row.find('td:eq(1)').text());
    $('#productPrice').val(row.find('td:eq(2)').text());
    $('#productNum').val(row.find('td:eq(3)').text());
    $('#season').val(row.find('td:eq(4)').text());
    $('#material').val(row.find('td:eq(5)').text());
    $('#manufacturer').val(row.find('td:eq(6)').text());
    $('#category').val(row.find('td:eq(7)').text());
    row.remove();
    $('#productModal').modal('show');
});

// user
$(document).on('click', '.user-editBtn', function () {
    let row = $(this).closest('tr')
    $('#userName').val(row.find('td:eq(0)').text());
    $('#userEmail').val(row.find('td:eq(1)').text());
    $('#userPhone').val(row.find('td:eq(2)').text());
    $('#userCheck').val(row.find('td:eq(3)').text());
    $('#userRole').val(row.find('td:eq(4)').text());
    $('#userModal').modal('show');
    $(this).closest('tr').remove();
});
$('#userForm').on('submit', function (e) {
    e.preventDefault();
    let userName = $('#userName').val();
    let userEmail = $('#userEmail').val();
    let userPhone = $('#userPhone').val();
    let userCheck = $('#userCheck').val();
    let userRole = $('#userRole').val();
    let userRow = `<tr> <td>${userName}</td> <td>${userEmail}</td> <td>${userPhone}</td> <td>${userCheck}</td> <td>${userRole}</td> <td> <button class="btn btn-primary btn-sm editBtn">Sửa</button> <button class="btn btn-danger btn-sm deleteBtn">Xóa</button> </td> </tr>`;
    $('#userList').append(userRow);
    $('#userModal').modal('hide');
    $('#userForm')[0].reset();
});
$(document).on('click', '.deleteBtn', function () {
    $(this).closest('tr').remove();
});

// đon hàng

$(document).on('click', '.admin-order-editBtn', function () {
    let row = $(this).closest('tr');
    $('#orderCode').val(row.find('td:eq(0)').text());
    $('#customerName').val(row.find('td:eq(1)').text());
    $('#product').val(row.find('td:eq(2)').text());
    $('#quantity').val(row.find('td:eq(3)').text());
    $('#price').val(row.find('td:eq(4)').text());
    $('#status').val(row.find('td:eq(5)').text());
    $('#order-location').val(row.find('td:eq(6)').text());
    $('#orderModal').modal('show');
    $(this).closest('tr').remove();
});
$('#orderForm').on('submit', function (e) {
    e.preventDefault();
    let orderCode = $('#orderCode').val();
    let customerName = $('#customerName').val();
    let product = $('#product').val();
    let quantity = $('#quantity').val();
    let price = $('#price').val();
    let status = $('#status').val();
    let orderLocation = $('#order-location').val();
    let orderRow = `<tr> <td>${orderCode}</td> <td>${customerName}</td> <td>${product}</td> <td>${quantity}</td> <td>${price}</td> <td>${status}</td> <td>${orderLocation}</td> <td> <button class="btn btn-primary btn-sm admin-order-editBtn">Cập Nhật</button> </td> </tr>`;
    $('#orderList').append(orderRow);
    $('#orderModal').modal('hide');
    $('#orderForm')[0].reset();
});

// Dữ liệu mẫu cho thông báo khách hàng 
const notifications = [ 
    { id: 1, name: 'Nguyễn Trọng Nhân', email: 'nhan@nlu.com', orderId: '123', content: 'Sản phẩm rất tốt, nhưng kích thước' }, 
    { id: 2, name: 'Hoàng Đức Nghĩa', email: 'nghia1@nlu.com', orderId: '22', content: 'Sản phẩm rất vừa ý nhưng túi bị rách' }, 
    { id: 3, name: 'Lai Nhân Nghĩa', email: 'nghia2@nlu.com', orderId: '43', content: 'Nói chung là không thích' } ]; 
    const notificationList = document.getElementById('notificationList'); notifications.forEach(notification => { const newNotification = document.createElement('li'); newNotification.className = 'list-group-item'; newNotification.innerHTML = ` <strong>${notification.id} <strong>: ${notification.name} (${notification.email}) - Mã Đơn Hàng: ${notification.orderId}:</strong> ${notification.content} <button class="btn btn-link" type="button" data-bs-toggle="collapse" data-bs-target="#replyForm${notification.id}" aria-expanded="false" aria-controls="replyForm${notification.id}"> Phản hồi </button> <div class="collapse" id="replyForm${notification.id}"> <form class="mt-3"> <div class="mb-3"> <label for="replyContent${notification.id}" class="form-label">Nội Dung Phản Hồi</label> <textarea class="form-control" id="replyContent${notification.id}" rows="3" placeholder="Nhập nội dung phản hồi"></textarea> </div> <button type="submit" class="btn btn-primary">Gửi Phản Hồi</button> </form> </div> `; notificationList.appendChild(newNotification); });