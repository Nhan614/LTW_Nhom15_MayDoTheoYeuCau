
document.addEventListener('DOMContentLoaded', () => {
    const wrapper = document.querySelector('.wrapper');
    const registerLink = document.querySelector('.register-link');
    const loginLink = document.querySelector('.login-link');

    // Khi nhấn vào "Đăng Ký", hiển thị form đăng ký
    registerLink.onclick = () => {
        wrapper.classList.add('active'); // Hiển thị form đăng ký
    };

    // Khi nhấn vào "Đăng Nhập", hiển thị form đăng nhập
    loginLink.onclick = () => {
        wrapper.classList.remove('active'); // Hiển thị form đăng nhập
    };

    // Kiểm tra nếu trang được tải từ #login-form hoặc #signup-form
    if (window.location.hash === '#signup-form') {
        wrapper.classList.add('active'); // Đảm bảo form đăng ký hiển thị
    } else if (window.location.hash === '#login-form') {
        wrapper.classList.remove('active'); // Đảm bảo form đăng nhập hiển thị
    }

    // Lắng nghe sự kiện thay đổi hash
    window.addEventListener('hashchange', () => {
        if (window.location.hash === '#signup-form') {
            wrapper.classList.add('active');
        } else if (window.location.hash === '#login-form') {
            wrapper.classList.remove('active');
        }
    });
});




