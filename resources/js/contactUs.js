// Lấy phần tử công tắc chế độ sáng/tối
const toggleSwitch = document.querySelector('.theme-switch input[type="checkbox"]');

// Hàm chuyển đổi giữa chế độ sáng và tối
function switchTheme(e) {
    if (e.target.checked) {
        document.documentElement.setAttribute('data-theme', 'dark'); // Chế độ tối
    } else {
        document.documentElement.setAttribute('data-theme', 'light'); // Chế độ sáng
    }
}

// Lắng nghe sự kiện thay đổi trạng thái của công tắc
toggleSwitch.addEventListener('change', switchTheme, false);

// Lấy các phần tử trong form
const nameInput = document.getElementById('name');
const emailInput = document.getElementById('email');
const messageInput = document.getElementById('message');
const contactForm = document.getElementById('contact-form');
const errorElement = document.getElementById('error');
const successMsg = document.getElementById('success-msg');
const submitBtn = document.getElementById('submit');

// Hàm xác thực dữ liệu form
const validate = (e) => {
  e.preventDefault();  // Ngăn hành động gửi form mặc định

  // Kiểm tra Tên
  if (nameInput.value.length < 3) {
    errorElement.innerHTML = 'Tên của bạn phải dài ít nhất 3 ký tự.';
    return false;
  }

  // Kiểm tra Email
  if (!(emailInput.value.includes('.') && emailInput.value.includes('@'))) {
    errorElement.innerHTML = 'Vui lòng nhập địa chỉ email hợp lệ.';
    return false;
  }

  if (!emailIsValid(emailInput.value)) {
    errorElement.innerHTML = 'Vui lòng nhập địa chỉ email hợp lệ.';
    return false;
  }

  // Kiểm tra Tin nhắn
  if (messageInput.value.length < 15) {
    errorElement.innerHTML = 'Vui lòng viết một tin nhắn dài hơn.';
    return false;
  }

  // Nếu không có lỗi, hiển thị thông báo thành công
  errorElement.innerHTML = '';
  successMsg.innerHTML = 'Cảm ơn bạn! Tôi sẽ phản hồi lại bạn sớm nhất có thể.';

  // Reset form sau 6 giây
  setTimeout(function () {
    successMsg.innerHTML = '';
    contactForm.reset();
  }, 6000);

  return true;
}

// Hàm kiểm tra tính hợp lệ của email
const emailIsValid = (email) => {
  return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email); // Kiểm tra email hợp lệ bằng regex
}

// Lắng nghe sự kiện khi người dùng nhấn nút Gửi
submitBtn.addEventListener('click', validate);
