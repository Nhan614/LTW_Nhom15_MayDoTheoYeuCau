 // Kiểm tra khi cuộn trang
 window.addEventListener('scroll', function () {
    var scrollPosition = window.scrollY;
    var backToTopButton = document.querySelector('.back-to-top');

    // Hiển thị nút khi cuộn xuống 200px
    if (scrollPosition > 200) {
        backToTopButton.classList.add('show');
    } else {
        backToTopButton.classList.remove('show');
    }
});

// Thêm hành động khi nhấn vào nút
document.querySelector('.back-to-top').addEventListener('click', function (e) {
    e.preventDefault();
    window.scrollTo({
        top: 0,
        behavior: 'smooth' // Hiệu ứng cuộn mượt mà lên đầu trang
    });
});
// lien hệ
function toggleContactMenu(event) {
    event.preventDefault(); // Ngăn không để nút reload trang
    const menu = document.querySelector('.contact-menu');
    menu.classList.toggle('active'); // Thêm/xóa class "active" để hiển thị menu
}
