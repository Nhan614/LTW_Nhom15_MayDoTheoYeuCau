
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
        const emailValue = emailInput.value.trim(); // Loại bỏ khoảng trắng ở đầu và cuối
        if (emailValue === "") {
            resetButton.disabled = true; // Vô hiệu hóa nút nếu email rỗng
        } else if (isValidEmail(emailValue)) {
            resetButton.disabled = false; // Kích hoạt nút nếu email hợp lệ
        } else {
            resetButton.disabled = true; // Vô hiệu hóa nút nếu email không hợp lệ
        }
    });

    // Thêm thông báo lỗi cho người dùng
    emailInput.addEventListener("blur", function () {
        const emailValue = emailInput.value.trim();
        const errorMessage = document.getElementById("email-error");

        if (!isValidEmail(emailValue) && emailValue !== "") {
            if (!errorMessage) {
                const errorElement = document.createElement("p");
                errorElement.id = "email-error";
                errorElement.style.color = "red";
                errorElement.textContent = "Email không hợp lệ. Vui lòng nhập đúng định dạng email!";
                emailInput.parentElement.appendChild(errorElement);
            }
        } else {
            if (errorMessage) {
                errorMessage.remove(); // Xóa thông báo lỗi nếu email hợp lệ
            }
        }
    });
});
