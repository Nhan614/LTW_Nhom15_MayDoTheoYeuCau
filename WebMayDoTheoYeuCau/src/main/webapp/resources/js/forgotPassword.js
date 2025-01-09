// document.addEventListener("DOMContentLoaded", function () {
//     const emailInput = document.getElementById("email");
//     const resetButton = document.querySelector(".reset-button");
//
//     // Hàm kiểm tra email hợp lệ
//     function isValidEmail(email) {
//         const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // Biểu thức regex kiểm tra định dạng email
//         return emailPattern.test(email);
//     }
//
//     // Thêm sự kiện khi người dùng nhập email
//     emailInput.addEventListener("input", function () {
//         if (isValidEmail(emailInput.value)) {
//             resetButton.disabled = false; // Kích hoạt nút
//         } else {
//             resetButton.disabled = true; // Vô hiệu hóa nút
//         }
//     });
// });

document.addEventListener("DOMContentLoaded", function () {
    const emailInput = document.getElementById("email");
    const resetButton = document.getElementById("reset-button");
    const errorMessage = document.getElementById("error-message");

    // Hàm kiểm tra email hợp lệ
    function isValidEmail(email) {
        const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailPattern.test(email);
    }

    // Kích hoạt hoặc vô hiệu hóa nút đặt lại mật khẩu
    emailInput.addEventListener("input", function () {
        if (isValidEmail(emailInput.value)) {
            resetButton.disabled = false;
            errorMessage.style.display = "none"; // Ẩn lỗi cũ
        } else {
            resetButton.disabled = true;
            errorMessage.style.display = "block";
            errorMessage.textContent = "Vui lòng nhập một email hợp lệ!";
        }
    });

    // Xử lý khi nhấn nút "Đặt lại mật khẩu"
    resetButton.addEventListener("click", function (e) {
        e.preventDefault();
        const email = emailInput.value;

        fetch("ForgotPasswordServlet", {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify({ email }),
        })
            .then((response) => response.json())
            .then((data) => {
                if (data.success) {
                    // Chuyển hướng đến trang đặt lại mật khẩu
                    window.location.href = "layLaiMatKhau.jsp";
                } else {
                    // Hiển thị lỗi khi email không hợp lệ hoặc chưa đăng ký
                    errorMessage.style.display = "block";
                    errorMessage.textContent = data.message || "Sai gmail hoặc chưa có tài khoản!";
                }
            })
            .catch((error) => {
                console.error("Error:", error);
                errorMessage.style.display = "block";
                errorMessage.textContent = "Đã xảy ra lỗi. Vui lòng thử lại sau!";
            });
    });
});

