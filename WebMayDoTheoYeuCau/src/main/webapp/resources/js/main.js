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
        loadCategories();  // Gọi AJAX để tải danh mục
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

    // onload sidebar
    if (window.location.hash === '#admin-dashboard') {
        $('#admin-dashboard').removeClass('admin-hide')
        $('.admin-sidebar-1').addClass('sidebar-active')
    }
    if (window.location.hash === '#admin-products') {
        $('#admin-products').removeClass('admin-hide')
        $('.admin-sidebar-2').addClass('sidebar-active')
    }
    if (window.location.hash === '#admin-user') {
        $('#admin-user').removeClass('admin-hide')
        $('.admin-sidebar-5').addClass('sidebar-active')
    }
    if (window.location.hash === '#admin-orders') {
        $('#admin-orders').removeClass('admin-hide')
        $('.admin-sidebar-3').addClass('sidebar-active')
    }
    if (window.location.hash === '#admin-categories') {
        loadCategories();
        $('#admin-categories').removeClass('admin-hide')
        $('.admin-sidebar-6').addClass('sidebar-active')
    }
    if (window.location.hash === '#admin-notification') {
        $('#admin-notification').removeClass('admin-hide')
        $('.admin-sidebar-7').addClass('sidebar-active')
    }
    if (window.location.hash === '#admin-reports') {
        $('#admin-reports').removeClass('admin-hide')
        $('.admin-sidebar-8').addClass('sidebar-active')
    }

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
                break;
            case '#admin-orders':
                $('#admin-orders').removeClass('admin-hide');
                $('.admin-sidebar-3').addClass('sidebar-active');
                break;
            case '#admin-categories':
                $('#admin-categories').removeClass('admin-hide');
                $('.admin-sidebar-6').addClass('sidebar-active');
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
});

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

            // Duyệt qua danh sách danh mục
            data.forEach(function (category) {
                // Thêm danh mục vào bảng
                var row = $('<tr></tr>');
                row.append('<td>' + category.id + '</td>');
                row.append('<td>' + category.categoryName + '</td>');
                row.append('<td>' + (category.categoryParentID || 'N/A') + '</td>');
                row.append('<td>' + (category.state === 1 ? 'Hiện' : category.state === 2 ? 'Nổi Bật' : 'Ẩn') + '</td>');
                row.append('<td>' + category.description + '</td>');
                row.append('<td>' +
                    '<button class="editCategory-btn btn btn-primary btn-sm" data-id="' + category.id + '">Edit</button>' +
                    ' <button class="deleteCategory-btn btn btn-sm btn-danger" data-id="' + category.id + '">Delete</button>' +
                    '</td>');
                $('#categories-tbody').append(row);

                // Thêm danh mục vào dropdown
                danhMucChaSelect.append('<option value="' + category.id + '">' + category.categoryName + '</option>');
            });
        },
        error: function (xhr, status, error) {
            console.error("Error fetching categories: " + error);
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
            alert('Category added successfully!');
            clearFormCategory();
            loadCategories(); // Reload the categories to reflect the new addition
        },
        error: function (xhr, status, error) {
            console.error('Error adding category: ' + error);
            alert('Failed to add category. Please check the server logs for details.');
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
    $('#addCategoryForm')[0].reset();
    $('#categoryId').remove(); // Xóa input ẩn chứa ID danh mục
    $('.btn-custumize').text('Thêm Danh Mục').off('click').on('click', function (event) {
        event.preventDefault();
    });
}
