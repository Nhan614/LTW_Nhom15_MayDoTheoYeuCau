document.addEventListener("DOMContentLoaded", function () {
    const emailInput = document.getElementById("email");
    const resetButton = document.querySelector(".reset-button");

    // Hàm kiểm tra email hợp lệ
    function isValidEmail(email) {
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // Biểu thức regex kiểm tra định dạng email
        return emailPattern.test(email);
    }

    // Thêm sự kiện khi người dùng nhập email
    emailInput.addEventListener("input", function () {
        if (isValidEmail(emailInput.value)) {
            resetButton.disabled = false; // Kích hoạt nút
        } else {
            resetButton.disabled = true; // Vô hiệu hóa nút
        }
    });
});
