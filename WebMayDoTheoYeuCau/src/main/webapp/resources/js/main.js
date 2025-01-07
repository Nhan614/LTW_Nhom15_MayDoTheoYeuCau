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

// ajax function to load categories
// Hàm loadCategories sử dụng AJAX thuần
function loadCategories() {
    $.ajax({
        url: '//localhost:8080/WebMayDoTheoYeuCau_war_exploded/categories',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            // Clear the current content of the table body
            $('#categories-tbody').empty();

            // Clear the current content of the select dropdown
            const danhMucChaSelect = $('#DanhMucCha');
            danhMucChaSelect.empty();
            danhMucChaSelect.append('<option value="">Danh Mục Cha</option>');

            // Iterate over the received categories
            data.forEach(function (category) {
                // Create a new row for each category
                var row = $('<tr></tr>');

                // Append the category details into the row
                row.append('<td>' + category.id + '</td>');
                row.append('<td>' + category.categoryName + '</td>');
                row.append('<td>' + (category.categoryParentID ? category.categoryParentID : 0) + '</td>');
                row.append('<td>' + (category.state === 1 ? 'Yes' : 'No') + '</td>'); // Assuming state 1 means featured
                row.append('<td>' + category.description + '</td>');
                row.append('<td><button class="edit-btn btn btn-primary btn-sm">Edit</button> <button class="delete-btn btn btn-sm btn-danger">Delete</button></td>');

                // Append the row to the table body
                $('#categories-tbody').append(row);

                // Add category to the dropdown
                danhMucChaSelect.append('<option value="' + category.id + '"> ' + category.categoryName +'</option>');
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
            loadCategories(); // Reload the categories to reflect the new addition
        },
        error: function (xhr, status, error) {
            console.error('Error adding category: ' + error);
            alert('Failed to add category. Please check the server logs for details.');
        }
    });
});

