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

        $('#productForm').on('submit', function (e) {
            e.preventDefault();
            let productName = $('#productName').val();
            let productCode = $('#productCode').val();
            let productPrice = $('#productPrice').val();
            let productNum= $('#productNum').val();
            let season = $('#season').val();
            let material = $('#material').val();
            let manufacturer = $('#manufacturer').val();
            let category = $('#category').val();
            let productRow = `<tr> <td>${productName}</td> <td>${productCode}</td> <td>${productPrice}</td> <td>${productNum}</td> <td>${season}</td> <td>${material}</td> <td>${manufacturer}</td> <td>${category}</td> <td> <button class="btn btn-primary btn-sm admin-product-editBtn">Sửa</button> <button class="btn btn-danger btn-sm deleteBtn">Xóa</button> </td> </tr>`;
            $('#productList').append(productRow);
            $('#productModal').modal('hide');
            $('#productForm')[0].reset();
        });
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
            $('#userRole').val(row.find('td:eq(3)').text());
            $('#userModal').modal('show');
            $(this).closest('tr').remove();
        });
        $('#userForm').on('submit', function (e) {
            e.preventDefault();
            let userName = $('#userName').val();
            let userEmail = $('#userEmail').val();
            let userPhone = $('#userPhone').val();
            let userRole = $('#userRole').val();
            let userRow = `<tr> <td>${userName}</td> <td>${userEmail}</td> <td>${userPhone}</td> <td>${userRole}</td> <td> <button class="btn btn-primary btn-sm editBtn">Sửa</button> <button class="btn btn-danger btn-sm deleteBtn">Xóa</button> </td> </tr>`;
            $('#userList').append(userRow);
            $('#userModal').modal('hide');
            $('#userForm')[0].reset();
        });
        $(document).on('click', '.deleteBtn', function () {
            $(this).closest('tr').remove();
        });

        // đon hàng

        $(document).on('click', '.order-editBtn', function () {
            let row = $(this).closest('tr');
            $('#orderCode').val(row.find('td:eq(0)').text());
            $('#customerName').val(row.find('td:eq(1)').text());
            $('#product').val(row.find('td:eq(2)').text());
            $('#quantity').val(row.find('td:eq(3)').text());
            $('#price').val(row.find('td:eq(4)').text());
            $('#status').val(row.find('td:eq(5)').text());
            $('#orderModal').modal('show');
        });
        $('#orderForm').on('submit', function (e) {
            e.preventDefault();
            let orderCode = $('#orderCode').val();
            let customerName = $('#customerName').val();
            let product = $('#product').val();
            let quantity = $('#quantity').val();
            let price = $('#price').val();
            let status = $('#status').val();
            let orderRow = `<tr> <td>${orderCode}</td> <td>${customerName}</td> <td>${product}</td> <td>${quantity}</td> <td>${price}</td> <td>${status}</td> <td> <button class="btn btn-primary btn-sm editBtn">Sửa</button> <button class="btn btn-danger btn-sm deleteBtn">Xóa</button> </td> </tr>`;
            $('#orderList').append(orderRow);
            $('#orderModal').modal('hide');
            $('#orderForm')[0].reset();
        });
        $(document).on('click', '.deleteBtn', function () {
            $(this).closest('tr').remove();
        });
