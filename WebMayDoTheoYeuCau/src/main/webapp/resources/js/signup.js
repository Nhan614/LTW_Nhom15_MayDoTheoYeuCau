
document.addEventListener('DOMContentLoaded', () => {
    const wrapper = document.querySelector('.wrapper');
    const registerLink = document.querySelector('.register-link');
    const loginLink = document.querySelector('.login-link');

// Các thông báo lỗi riêng biệt cho đăng nhập và đăng ký
    const loginErrorMessage = document.querySelector('.login-error-message'); // Lỗi đăng nhập
    const registerErrorMessage = document.querySelector('.register-error-message'); // Lỗi đăng ký

// Khi nhấn vào "Đăng Ký", hiển thị form đăng ký và thông báo lỗi đăng ký
    registerLink.onclick = () => {
        wrapper.classList.add('active'); // Hiển thị form đăng ký
        if (registerErrorMessage) {
            registerErrorMessage.classList.add('animation'); // Hiển thị thông báo lỗi đăng ký
        }
        if (loginErrorMessage) {
            loginErrorMessage.classList.remove('animation'); // Ẩn thông báo lỗi đăng nhập
        }
    };

// Khi nhấn vào "Đăng Nhập", hiển thị form đăng nhập và thông báo lỗi đăng nhập
    loginLink.onclick = () => {
        wrapper.classList.remove('active'); // Hiển thị form đăng nhập
        if (loginErrorMessage) {
            loginErrorMessage.classList.add('animation'); // Hiển thị thông báo lỗi đăng nhập
        }
        if (registerErrorMessage) {
            registerErrorMessage.classList.remove('animation'); // Ẩn thông báo lỗi đăng ký
        }
    };

    // Kiểm tra nếu trang được tải từ #signup-form hoặc #login-form
    if (window.location.hash === '#signup-form') {
        wrapper.classList.add('active'); // Đảm bảo form đăng ký hiển thị
        if (registerErrorMessage) {
            registerErrorMessage.classList.add('animation'); // Thêm hiệu ứng thông báo lỗi đăng ký
        }
    } else if (window.location.hash === '#login-form') {
        wrapper.classList.remove('active'); // Đảm bảo form đăng nhập hiển thị
        if (loginErrorMessage) {
            loginErrorMessage.classList.add('animation'); // Thêm hiệu ứng thông báo lỗi đăng nhập
        }
    }

    // Lắng nghe sự kiện thay đổi hash
    window.addEventListener('hashchange', () => {
        if (window.location.hash === '#signup-form') {
            wrapper.classList.add('active');
            if (registerErrorMessage) {
                registerErrorMessage.classList.add('animation'); // Thêm hiệu ứng khi chuyển đến form đăng ký
            }
        } else if (window.location.hash === '#login-form') {
            wrapper.classList.remove('active');
            if (loginErrorMessage) {
                loginErrorMessage.classList.add('animation'); // Thêm hiệu ứng khi chuyển về form đăng nhập
            }
        }
    });
});
