$(document).ready(function (e) {
    // admin sidebar
    $('.admin-sidebar-1').click(function (e) {
        $('section').addClass('admin-hide');
        $('#admin-dashboard').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-dashboard';  // Đặt hash sau khi thay đổi
    });

    $('.admin-sidebar-2').click(function (e) {
        $('section').addClass('admin-hide');
        $('#admin-products').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-products'; // Đặt hash sau khi thay đổi
    });
    $('.admin-sidebar-4').click(function (e) {
        $('section').addClass('admin-hide');
        $('#admin-material').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-material';
    });

    $('.admin-sidebar-5').click(function (e) {

        $('section').addClass('admin-hide');
        $('#admin-user').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-user'; // Đặt hash sau khi thay đổi
    });

    $('.admin-sidebar-3').click(function (e) {
        $('section').addClass('admin-hide');
        $('#admin-orders').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-orders'; // Đặt hash sau khi thay đổi
    });

    $('.admin-sidebar-6').click(function (e) {

        window.location.hash = '#admin-categories';  // Đặt hash sau khi thay đổi
        $('section').addClass('admin-hide');
        $('#admin-categories').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
    });

    $('.admin-sidebar-7').click(function (e) {
        $('section').addClass('admin-hide');
        $('#admin-notification').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-notification'; // Đặt hash sau khi thay đổi
    });

    $('.admin-sidebar-8').click(function (e) {
        $('section').addClass('admin-hide');
        $('#admin-reports').removeClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');
        $(this).addClass('sidebar-active');
        window.location.hash = '#admin-reports'; // Đặt hash sau khi thay đổi
    });

    // Xử lý sự kiện thay đổi hash
    $(window).on('hashchange', function () {
        $('section').addClass('admin-hide');
        $('.sidebar li').removeClass('sidebar-active');

        switch (window.location.hash) {
            case '#admin-dashboard':
                $('#admin-dashboard').removeClass('admin-hide');
                $('.admin-sidebar-1').addClass('sidebar-active');
                break;
            case '#admin-products':
                $('#admin-products').removeClass('admin-hide');
                $('.admin-sidebar-2').addClass('sidebar-active');
                break;
            case '#admin-user':
                $('#admin-user').removeClass('admin-hide');
                $('.admin-sidebar-5').addClass('sidebar-active');
                loadUsers();
                break;
            case '#admin-material':
                $('#admin-material').removeClass('admin-hide');
                $('.admin-sidebar-4').addClass('sidebar-active');
                loadMaterials();
                break;
            case '#admin-material':
                $('#admin-user').removeClass('admin-hide');
                $('.admin-sidebar-4').addClass('sidebar-active');
                break;
            case '#admin-orders':
                $('#admin-orders').removeClass('admin-hide');
                $('.admin-sidebar-3').addClass('sidebar-active');
                break;
            case '#admin-categories':
                $('#admin-categories').removeClass('admin-hide');
                $('.admin-sidebar-6').addClass('sidebar-active');
                loadCategories();
                break;
            case '#admin-notification':
                $('#admin-notification').removeClass('admin-hide');
                $('.admin-sidebar-7').addClass('sidebar-active');
                break;
            case '#admin-reports':
                $('#admin-reports').removeClass('admin-hide');
                $('.admin-sidebar-8').addClass('sidebar-active');
                break;
            default:
                $('#admin-dashboard').removeClass('admin-hide');
                $('.admin-sidebar-1').addClass('sidebar-active');
                break;
        }
    });

    // Kích hoạt sự kiện hashchange khi trang tải lần đầu
    $(window).trigger('hashchange');


// --------------------------- Category --------------------------------------

// ajax function to load categories
// Hàm loadCategories sử dụng AJAX
    function loadCategories() {
        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/categories',
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                // Xóa nội dung hiện có trong bảng và dropdown
                $('#categories-tbody').empty();
                const danhMucChaSelect = $('#DanhMucCha');
                danhMucChaSelect.empty();
                danhMucChaSelect.append('<option value="">Danh Mục Cha</option>');

                // Duyệt qua danh sách danh mục và hiển thị tất cả các danh mục vào bảng
                data.forEach(function (category) {
                    // Thêm danh mục vào bảng
                    var row = $('<tr></tr>');
                    row.append('<td>' + category.id + '</td>');
                    row.append('<td>' + category.categoryName + '</td>');
                    row.append('<td>' + (category.categoryParentID || 'N/A') + '</td>');
                    row.append('<td>' + (category.state === 1 ? 'Hiện' : category.state === 2 ? 'Nổi Bật' : 'Ẩn') + '</td>');
                    row.append('<td>' + category.description + '</td>');

                    // Kiểm tra nếu categoryParentID là 1 hoặc 0 thì không hiển thị nút Delete
                    var actionButtons = '<button class="editCategory-btn btn btn-primary btn-sm" data-id="' + category.id + '">Edit</button>';

                    if (category.categoryParentID !== 1 && category.categoryParentID !== 0) {
                        actionButtons += ' <button class="deleteCategory-btn btn btn-sm btn-danger" data-id="' + category.id + '">Delete</button>';
                    }

                    row.append('<td>' + actionButtons + '</td>');
                    $('#categories-tbody').append(row);
                });

                // Lọc các danh mục có categoryParentID = 1 và hiển thị vào dropdown
                const filteredCategories = data.filter(function (category) {
                    return category.categoryParentID === 1; // Chỉ lấy các danh mục có categoryParentID = 1
                });

                // Thêm các danh mục đã lọc vào dropdown
                filteredCategories.forEach(function (category) {
                    danhMucChaSelect.append('<option value="' + category.id + '">' + category.categoryName + '</option>');
                });
            },
            error: function (xhr, status, error) {
                console.error("Error fetching categories: " + error);
            }
        });
    }

    function addCategory() {
        // Lấy giá trị từ các trường nhập liệu
        var categoryName = $('#categoryName').val();
        var categoryParentID = $('#DanhMucCha').val();
        var state = $('#TrangThai').val();
        var description = $('#categoryDescription').val();

        // Tạo đối tượng JSON để gửi lên server
        var newCategory = {
            categoryName: categoryName,
            categoryParentID: categoryParentID || null, // Nếu không có chọn danh mục cha, sẽ là null
            state: state,
            description: description
        };

        // Gửi yêu cầu AJAX để thêm danh mục
        $.ajax({
            url: '/WebMayDoTheoYeuCau_war_exploded/categories',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(newCategory),
            success: function (response) {
                alert('Thêm danh mục thành công!');
                clearFormCategory(); // Xóa form sau khi thêm
                loadCategories(); // Tải lại danh sách danh mục
            },
            error: function (xhr, status, error) {
                console.error('Error adding category: ' + error);
                alert('Thêm danh mục thất bại.');
            }
        });
    }


    $('#addCategoryForm').submit(function (event) {
        event.preventDefault(); // Prevent default form submission

        // Get values from the form
        var categoryName = $('#categoryName').val();
        var categoryParentID = $('#DanhMucCha').val();
        var state = $('#TrangThai').val();
        var description = $('#categoryDescription').val();

        // Create JSON object
        var newCategory = {
            categoryName: categoryName,
            categoryParentID: categoryParentID,
            state: state,
            description: description
        };

        // Send AJAX request
        $.ajax({
            url: '/WebMayDoTheoYeuCau_war_exploded/categories',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(newCategory),
            success: function (response) {
                alert('Thêm danh mục thành công!');
                clearFormCategory();
                loadCategories(); // Reload the categories to reflect the new addition
            },
            error: function (xhr, status, error) {
                console.error('Error adding category: ' + error);
                alert('Thêm danh mục thất bại.');
            }
        });
    });

// Gọi khi nhấn nút Edit
    $(document).on('click', '.editCategory-btn', function () {
        // Lấy hàng cha (tr của nút edit)
        var row = $(this).closest('tr');

        // Lấy dữ liệu từ các ô trong hàng
        var id = row.find('td:eq(0)').text(); // ID
        var categoryName = row.find('td:eq(1)').text(); // Tên danh mục
        var categoryParentID = row.find('td:eq(2)').text(); // ID danh mục cha (lấy từ ô của dòng)
        var state = row.find('td:eq(3)').text() === 'Hiện' ? 1 : (row.find('td:eq(3)').text() === 'Nổi Bật' ? 2 : 0); // Trạng thái (0: Ẩn, 1: Hiện, 2: Nổi Bật)
        var description = row.find('td:eq(4)').text(); // Mô tả

        // Điền dữ liệu vào form
        $('#categoryName').val(categoryName);
        $('#categoryDescription').val(description);

        // Điền dữ liệu vào dropdown Danh Mục Cha
        $('#DanhMucCha').val(categoryParentID); // Chọn danh mục cha trong dropdown

        // Điền dữ liệu vào dropdown Trạng Thái
        $('#TrangThai').val(state); // Chọn trạng thái trong dropdown

        // Lưu ID danh mục vào input ẩn (hidden input) để sử dụng khi cập nhật
        if ($('#categoryId').length === 0) {
            $('<input>').attr({
                type: 'hidden',
                id: 'categoryId',
                name: 'id',
                value: id
            }).appendTo('#addCategoryForm');
        } else {
            $('#categoryId').val(id);
        }

        // Thay đổi nút thêm thành nút cập nhật
        $('.btn-custumize').text('Cập Nhật Danh Mục').off('click').on('click', function (event) {
            event.preventDefault();
            updateCategory();
        });
    });

    function updateCategory() {
        var id = $('#categoryId').val();
        var categoryName = $('#categoryName').val();
        var categoryParentID = $('#DanhMucCha').val();
        var state = $('#TrangThai').val();
        var description = $('#categoryDescription').val();

        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/categories',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify({
                id: id,
                categoryName: categoryName,
                categoryParentID: categoryParentID || null,
                state: parseInt(state),
                description: description
            }),
            success: function (response) {
                alert(response.message);
                loadCategories(); // Tải lại danh sách danh mục
                resetFormCategory(); // Đặt lại form sau khi cập nhật
            },
            error: function (xhr, status, error) {
                console.error("Error updating category: " + error);
            }
        });
    }


    $(document).on('click', '.deleteCategory-btn', function () {
        // Lấy ID danh mục cần xóa
        var categoryId = $(this).data('id');

        // Hiển thị xác nhận
        if (confirm('Bạn có chắc chắn muốn xóa danh mục này?')) {
            // Gửi yêu cầu AJAX
            $.ajax({
                url: '/WebMayDoTheoYeuCau_war_exploded/categories?id=' + categoryId,
                type: 'DELETE',
                success: function (response) {
                    alert(response.message); // Thông báo kết quả
                    loadCategories(); // Tải lại danh sách danh mục
                },
                error: function (xhr, status, error) {
                    console.error('Error deleting category: ' + error);
                }
            });
        }
    });

    function resetFormCategory() {
        $('#addCategoryForm')[0].reset();
        $('#categoryId').remove(); // Xóa input ẩn chứa ID danh mục
        $('.btn-custumize').text('Thêm Danh Mục').off('click').on('click', function (event) {
            event.preventDefault();
            addCategory(); // Trở lại hàm thêm danh mục
        });
    }

    function clearFormCategory() {
        $('#addCategoryForm')[0].reset(); // Reset lại form
        $('#categoryId').remove(); // Xóa input ẩn chứa ID danh mục
        // Gắn lại sự kiện click cho nút Thêm Danh Mục
        $('.btn-custumize').text('Thêm Danh Mục').off('click').on('click', function (event) {
            event.preventDefault();
            addCategory(); // Gọi hàm thêm danh mục
        });
    }

// -------------------------------------------- User ----------------------------------------------

    function loadUsers() {
        // Kiểm tra và hủy DataTable nếu đã khởi tạo
        if ($.fn.dataTable.isDataTable('#userTable')) {
            $('#userTable').DataTable().clear().destroy();
        }

        // Gửi yêu cầu GET đến servlet
        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/userManagerController',
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                // Xóa các hàng cũ trong bảng
                $('#userTable tbody').empty();

                // Khởi tạo DataTable
                var table = $('#userTable').DataTable({
                    paging: true,
                    searching: true,
                    ordering: true,
                    responsive: true,
                    language: {
                        search: "Tìm kiếm:",
                        lengthMenu: "Hiển thị _MENU_ mục",
                        info: "Hiển thị _START_ đến _END_ của _TOTAL_ mục",
                        paginate: {
                            first: "Đầu",
                            last: "Cuối",
                            next: "Sau",
                            previous: "Trước",
                        },
                    },
                });

                // Xử lý và thêm dữ liệu vào DataTable
                data.forEach(function (user) {
                    table.row.add([
                        user.id || '', // ID
                        `<img src="${user.avatar || 'default-avatar-url'}" alt="Avatar" class="avatar-thumbnail" width="50" height="50">`, // Avatar
                        user.fullName || 'N/A', // Họ và tên
                        user.gmail || 'N/A', // Email
                        user.phone || 'N/A', // Số điện thoại
                        user.address || 'N/A', // Địa chỉ
                        user.notificationCheck ? 'Đã Đăng Ký' : 'Chưa Đăng Ký', // Trạng thái thông báo
                        user.role === 1 ? 'Admin' : (user.role === 2 ? 'Nhân Viên' : 'Người Dùng'), // Vai trò
                        `<button class="btn btn-primary btn-sm user-editBtn" data-id="${user.id}">Sửa</button>
                     <button class="btn btn-danger btn-sm user-deleteBtn" data-id="${user.id}">Xóa</button>` // Hành động
                    ]).draw(false);
                });
            },
            error: function (xhr, status, error) {
                console.error("Error fetching users: " + error);
                alert("Không thể tải danh sách người dùng. Vui lòng thử lại!");
            }
        });
    }

// Khi nhấn nút Edit User
    $(document).on('click', '.user-editBtn', function () {
        let row = $(this).closest('tr');

        // Lấy thông tin từ hàng
        let id = row.find('td:eq(0)').text(); // ID người dùng
        let avatarUrl = row.find('td:eq(1) img').attr('src'); // URL ảnh đại diện
        let fullName = row.find('td:eq(2)').text(); // Tên người dùng
        let email = row.find('td:eq(3)').text(); // Email
        let phone = row.find('td:eq(4)').text(); // Số điện thoại
        let address = row.find('td:eq(5)').text(); // Địa chỉ
        let notificationCheck = row.find('td:eq(6)').text() === 'Đã Đăng Ký' ? 1 : 0; // Đăng Ký
        let role = row.find('td:eq(7)').text() === 'Admin' ? 1 : (row.find('td:eq(7)').text() === 'Nhân Viên' ? 2 : 3); // Vai Trò

        // Điền thông tin vào form
        $('#userId').val(id); // Điền ID vào hidden input
        $('#userAvatarPreview').attr('src', avatarUrl); // Hiển thị ảnh đại diện
        $('#userAvatarUrl').val(avatarUrl); // Hiển thị URL ảnh đại diện
        $('#userName').val(fullName);
        $('#userEmail').val(email);
        $('#userPhone').val(phone);
        $('#userAddress').val(address);
        $('#userCheck').val(notificationCheck);
        $('#userRole').val(role);

        // Hiển thị modal
        $('#userModal').modal('show');
    });

// Cập nhật người dùng
    function updateUser() {
        // Lấy dữ liệu từ form
        let id = $('#userId').val(); // Lấy ID từ hidden input
        let avatar = $('#userAvatarUrl').val();
        let fullName = $('#userName').val();
        let gmail = $('#userEmail').val();
        let phone = $('#userPhone').val();
        let address = $('#userAddress').val();
        let notificationCheck = parseInt($('#userCheck').val());
        let role = parseInt($('#userRole').val());

        console.log(JSON.stringify({
            id: id,
            avatar: avatar,
            fullName: fullName,
            gmail: gmail,
            phone: phone,
            address: address,
            notificationCheck: notificationCheck,
            role: role
        }));
        // Gửi yêu cầu PUT đến API
        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/userManagerController',
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify({
                id: id,
                avatar: avatar,
                fullName: fullName,
                gmail: gmail,
                phone: phone,
                address: address,
                notificationCheck: notificationCheck,
                role: role
            }),

            success: function (response) {
                alert(response.message || 'Cập nhật thành công!');
                $('#userModal').modal('hide'); // Ẩn modal
                loadUsers(); // Tải lại danh sách người dùng
            },
            error: function (xhr, status, error) {
                console.error('Error updating user:', error);
                alert('Cập nhật không thành công. Vui lòng thử lại!');
            }
        });
    }

// Gọi hàm updateUser khi nhấn nút "Lưu Thay Đổi"
    $('#userForm').on('submit', function (event) {
        event.preventDefault(); // Ngăn form reload trang
        updateUser();
    });

    $(document).on('click', '.user-deleteBtn', function () {
        let userId = $(this).data('id'); // Lấy ID người dùng từ nút xóa

        if (confirm('Bạn có chắc chắn muốn xóa người dùng này không?')) {
            // Gửi yêu cầu xóa đến server
            $.ajax({
                url: `http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/userManagerController?id=${userId}`,
                type: 'DELETE',
                success: function (response) {
                    alert(response.message || 'Xóa thành công!');
                    loadUsers(); // Tải lại danh sách người dùng
                },
                error: function (xhr, status, error) {
                    console.error('Error deleting user:', xhr.responseText);
                    alert('Xóa không thành công. Vui lòng thử lại!');
                }
            });
        }
    });

//-----------------------------------Material ---------------------------------------

    function loadMaterials() {
        // Kiểm tra và hủy DataTable nếu đã khởi tạo
        if ($.fn.dataTable.isDataTable('#materialTable')) {
            $('#materialTable').DataTable().clear().destroy();
        }

        // Gửi yêu cầu GET đến API
        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/materialController', // URL API
            type: 'GET',
            dataType: 'json',
            success: function (data) {
                // Xóa các hàng cũ trong bảng
                $('#materialTable tbody').empty();

                // Khởi tạo DataTable
                var table = $('#materialTable').DataTable({
                    paging: true,
                    searching: true,
                    ordering: true,
                    responsive: true,
                    language: {
                        search: "Tìm kiếm:",
                        lengthMenu: "Hiển thị _MENU_ mục",
                        info: "Hiển thị _START_ đến _END_ của _TOTAL_ mục",
                        paginate: {
                            first: "Đầu",
                            last: "Cuối",
                            next: "Sau",
                            previous: "Trước",
                        },
                    },
                });

                // Thêm dữ liệu vào DataTable
                data.forEach(function (material) {
                    table.row.add([
                        material.id || '', // ID
                        material.name || 'N/A', // Tên
                        material.season || 'N/A', // Mùa
                        `<img src="${material.image || 'default-image-url'}" alt="Image" class="material-image" width="50" height="50">`, // Hình ảnh
                        material.quantity || 0, // Số lượng
                        material.state === 1 ? 'Còn hàng' : (material.state === 0 ? 'Hết hàng' : 'Ẩn'), // Trạng thái
                        material.matCategory || 'N/A', // Loại chất liệu
                        material.price, // Loại chất liệu
                        material.description || 'N/A', // Mô tả
                        `<button class="btn btn-primary btn-sm material-editBtn" data-id="${material.id}">Sửa</button>
                     <button class="btn btn-danger btn-sm material-deleteBtn" data-id="${material.id}">Xóa</button>` // Hành động
                    ]).draw(false);
                });
            },
            error: function (xhr, status, error) {
                console.error("Error fetching materials: " + error);
                alert("Không thể tải danh sách chất liệu. Vui lòng thử lại!");
            }
        });
    }

// Khi người dùng click vào nút "Thêm Vật Liệu", mở modal
    $('.admin-addMaterialbtn').on('click', function () {
        $('#addMaterialModal').modal('show');
    });

// Gửi form khi nhấn nút "Thêm Vật Liệu"
    $('#addMaterialForm').on('submit', function (event) {
        event.preventDefault(); // Ngăn chặn việc reload trang

        // Lấy dữ liệu từ các input trong modal
        var materialData = {
            name: $('#materialName').val(),
            season: $('#materialSeason').val(),
            description: $('#materialDescription').val(),
            image: $('#materialImage').val() || "", // Mặc định là chuỗi rỗng nếu không nhập
            quantity: parseInt($('#materialQuantity').val()) || 0, // Chuyển đổi sang số nguyên
            state: parseInt($('#materialState').val()), // Chuyển đổi sang số nguyên
            matCategory: $('#materialCategory').val(),
            price: parseFloat($('#materialPrice').val()) || 0 // Chuyển đổi sang số thực
        };
        console.log(materialData)
        // Gửi dữ liệu tới server
        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/materialController', // Đường dẫn API
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(materialData),
            success: function (response) {
                alert('Thêm vật liệu thành công!');
                $('#addMaterialModal').modal('hide'); // Đóng modal
                loadMaterials(); // Cập nhật bảng dữ liệu
            },
            error: function (xhr, status, error) {
                console.error(xhr.responseText); // Debug thông báo lỗi
                alert('Có lỗi xảy ra khi thêm vật liệu!');
            }
        });
    });

// Khi người dùng nhấn nút "Sửa" trên vật liệu
    $(document).on('click', '.material-editBtn', function () {
        // Lấy dữ liệu từ hàng chứa nút edit
        let row = $(this).closest('tr');

        // Lấy thông tin từ các cột trong bảng
        let id = row.find('td:eq(0)').text(); // ID vật liệu
        let name = row.find('td:eq(1)').text(); // Tên vật liệu
        let season = row.find('td:eq(2)').text(); // Mùa
        let image = row.find('td:eq(3) img').attr('src') || ''; // URL hình ảnh
        let quantity = row.find('td:eq(4)').text(); // Số lượng
        let state = row.find('td:eq(5)').text() === 'Còn hàng' ? 1 : (row.find('td:eq(5)').text() === 'Hết hàng' ? 0 : 2); // Trạng thái
        let matCategory = row.find('td:eq(6)').text(); // Loại chất liệu
        let price = row.find('td:eq(7)').text(); // Giá
        let description = row.find('td:eq(8)').text(); // Mô tả

        // Điền thông tin vào form chỉnh sửa
        $('#editMaterialId').val(id);
        $('#editMaterialName').val(name);
        $('#editMaterialSeason').val(season);
        $('#editMaterialImage').val(image);
        $('#editMaterialQuantity').val(quantity);
        $('#editMaterialState').val(state);
        $('#editMaterialCategory').val(matCategory);
        $('#editMaterialPrice').val(price);
        $('#editMaterialDescription').val(description);

        // Hiển thị modal chỉnh sửa
        $('#editMaterialModal').modal('show');
    });

    $('#editMaterialForm').on('submit', function (event) {
        event.preventDefault(); // Ngăn không cho reload trang khi submit form

        // Lấy dữ liệu từ form
        let materialData = {
            id: $('#editMaterialId').val(),
            name: $('#editMaterialName').val(),
            season: $('#editMaterialSeason').val(),
            image: $('#editMaterialImage').val(),
            quantity: $('#editMaterialQuantity').val(),
            state: $('#editMaterialState').val(),
            matCategory: $('#editMaterialCategory').val(),
            price: $('#editMaterialPrice').val(),
            description: $('#editMaterialDescription').val()
        };

        // Gửi dữ liệu tới server qua PUT
        $.ajax({
            url: 'http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/materialController', // Thay URL API PUT của bạn
            type: 'PUT',
            contentType: 'application/json',
            data: JSON.stringify(materialData),
            success: function (response) {
                alert('Cập nhật vật liệu thành công!');
                $('#editMaterialModal').modal('hide'); // Ẩn modal chỉnh sửa
                loadMaterials(); // Gọi lại hàm load để cập nhật danh sách vật liệu
            },
            error: function (xhr, status, error) {
                console.error('Lỗi cập nhật vật liệu:', error);
                alert('Có lỗi xảy ra khi cập nhật vật liệu!');
            }
        });
    });

    $(document).on('click', '.material-deleteBtn', function () {
        const materialId = $(this).data('id');

        if (confirm('Bạn có chắc muốn xóa vật liệu này?')) {
            $.ajax({
                url: `http://localhost:8080/WebMayDoTheoYeuCau_war_exploded/materialController?id=${materialId}`,
                type: 'DELETE',
                success: function (response) {
                    alert(response.message);
                    loadMaterials(); // Tải lại danh sách vật liệu
                },
                error: function (xhr, status, error) {
                    const errorMessage = xhr.responseJSON?.message || 'Có lỗi xảy ra khi xóa vật liệu';
                    alert(errorMessage);
                }
            });
        }
    });

});