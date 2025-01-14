<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>About Us - THREEN TAILORED</title>
  <link rel="icon" href="resources/images/favicon.jpg" sizes="16x16 32x32 48x48 64x64 128x128 256x256" type="image/x-icon">
  <script src="vendors/js/jquery-3.7.1.min.js"></script>
  <link rel="stylesheet" href="vendors/bootstrap-5.3.3-dist/css/bootstrap.min.css">
  <link rel="stylesheet" href="vendors/fontawesome-free-6.6.0-web/css/all.min.css">
  <link rel="stylesheet" href="resources/css/aboutStyle.css">
  <link rel="stylesheet" href="resources/css/style.css">

</head>
<body>
  <!-- header -->
  <div id="menubar"><%@ include file="resources/data/header.jsp"%></div>

  <!-- section 1 -->
<section id="sec1">
    <div class="top-bar text-center py-2">
        <span>GIẢM GIÁ 25% KHI NHẬP MÃ "THREENTAILORED"</span>
        <button type="button" class="btn-close position-absolute end-0" style="margin-right:10px;filter: brightness(0) invert(1); "aria-label="Close"></button>
    </div>
</section>
<section class="hero-about-section d-flex align-items-center justify-content-center text-center">
  <div class="container">
    <p class="lead text-white">SỰ ĐỔI MỚI CỦA VẺ THANH LỊCH</p>
    <h1 class="display-4 text-white">Sáng Tạo Bền Vững và</h1>
    <h1 class="display-4 text-white">Thiết Kế Ý, Sản Xuất Tại Việt Nam</h1>
  </div>
</section>
<div class="welcome-section text-center" id="typing-container"></div>
<section class="custom-section py-5">
    <div class="container">
        <div class="row align-items-center">
            <!-- Left Text Section -->
            <div class="col-lg-6 text-section">
                <h1 class="display-4">May Đo <br>Và Công Nghệ<br>Sẵn Sàng Phục Vụ Bạn</h1>
                <p class="mt-4">
                    Chuyên về việc tạo ra và tùy chỉnh bộ vest nam và phụ kiện,
                    THREEN TAILORED chế tác mỗi sản phẩm với sự chăm sóc và đam mê, chỉ sử dụng vải Made in Italy.
                    Khách hàng có thể lựa chọn từ các bộ vest, áo sơ mi, quần, áo blazer, áo khoác, áo choàng, quần chino và phụ kiện;
                    mỗi sản phẩm đều có thể được cá nhân hóa chỉ với vài thao tác đơn giản, mang đến trải nghiệm may đo hoàn hảo, nhanh chóng và liền mạch.
                </p>
                <a href="home.jsp" class="about-btn btn-link mt-3">START NOW &gt;</a>
            </div>

            <!-- Right Image Section -->
            <div class="col-lg-6 image-section">
                <div class="d-flex">
                    <!-- Small Image -->
                    <div class="image-wrapper small-image-wrapper me-3">
                        <img src="resources/images/small-image1.webp" alt="Small image" class="img-fluid small-image">
                    </div>
                    <!-- Large Image -->
                    <div class="image-wrapper large-image-wrapper">
                        <img src="resources/images/large-image1.webp" alt="Large image" class="img-fluid large-image">
                    </div>
                </div>
            </div>

        </div>
    </div>
</section>
<div class="empty_line" style="height:80px;"></div>
<!--image banner section-->
<div class="full_banner section container " style="background-image: url(resources/images/aboutBanner.webp);  height:550px;">
</div>
  <div class="empty_line" style="height:80px;"></div>
  <section class="custom-section py-5">
      <div class="container">
          <div class="row align-items-center">
              <!-- Left Image Section -->
              <div class="col-lg-6 image-section">
                  <div class="d-flex flex-column align-items-start">
                      <!-- Small Image -->
                      <div class="image-wrapper small-image-wrapper2 me-3">
                          <img src="resources/images/small-image2.webp" alt="Small image" class="img-fluid small-image">
                      </div>
                      <!-- Large Image -->
                      <div class="image-wrapper large-image-wrapper2">
                          <img src="resources/images/large-image2.webp" alt="Large image" class="img-fluid large-image">
                      </div>
                  </div>
              </div>

              <!-- Right Text Section -->
              <div class="col-lg-6 text-section txt-right">
                  <h1 class="display-4 ">Sự tinh túy <br>của truyền thống<br>may đo đỉnh cao</h1>
                  <p class="mt-4">
                    THREEN TAILORED là một phần của <strong>Reda Group</strong>, tập đoàn hàng đầu trong ngành dệt may, với sứ mệnh thúc đẩy sự thay đổi thông qua sáng tạo bền vững, tôn trọng môi trường và tiến bộ xã hội, nhằm đảm bảo một tương lai tốt đẹp hơn cho các thế hệ kế tiếp.
                      Tập đoàn bao gồm: <strong>Successori Reda</strong>, một nhà máy sản xuất len lịch sử, đã sản xuất vải cao cấp <strong>Made in Vietnam</strong> suốt hơn 150 năm; <strong>Rewoolution</strong>, dòng sản phẩm thể thao và thư giãn từ len Merino tự nhiên thân thiện với môi trường; và <strong>Tailoor</strong>,
                      nền tảng thương mại điện tử phygital đầu tiên cho phép tạo ra các sản phẩm tùy chỉnh.
                  </p>
                  <a href="home.jsp" class="about-btn btn-link mt-3">MADE IN VIETNAM &gt;</a>
              </div>
          </div>
      </div>
  </section>
<!-- bảo hành -->
<div class="custom-container">
  <div class="custom-row text-center">
      <!-- Feature 1 -->
      <div class="col-md-3">
          <div class="feature-box">
              <div class="feature-icon">
                  <i class="fas fa-mug-hot"></i>
              </div>
              <div class="feature-text"> <!-- Thêm class bao quanh -->
                  <h5>Free trà và cafe</h5>
                  <p>Tại showroom</p>
              </div>
          </div>
      </div>
      <!-- Feature 2 -->
      <div class="col-md-3 ">
          <div class="feature-box">
              <div class="feature-icon">
                  <i class="fas fa-truck"></i>
              </div>
              <div class="feature-text"> <!-- Thêm class bao quanh -->
                  <h5>Giao hàng</h5>
                  <p>Free ship đơn > 3.500k</p>
              </div>
          </div>
      </div>
      <!-- Feature 3 -->
      <div class="col-md-3">
          <div class="feature-box">
              <div class="feature-icon">
                  <i class="fa-solid fa-money-check-dollar"></i>
              </div>
              <div class="feature-text"> <!-- Thêm class bao quanh -->
                  <h5>Thanh toán</h5>
                  <p>Bảo mật an toàn</p>
              </div>
          </div>
      </div>
      <!-- Feature 4 -->
      <div class="col-md-3">
          <div class="feature-box">
              <div class="feature-icon">
                  <i class="fas fa-shield-alt"></i>
              </div>
              <div class="feature-text"> <!-- Thêm class bao quanh -->
                  <h5>Bảo hành</h5>
                  <p>Lên đến 180 ngày</p>
              </div>
          </div>
      </div>
  </div>
</div>
  <script>
  // Mảng câu văn bản
  const sentences = [
    "THREEN TAILORED được hình thành từ một góc nhìn mới mẻ về nghệ thuật may đo theo",
    "yêu cầu, một phương thức bền vững, biến di sản may đo Ý thành một",
    "tầm nhìn thu hút cho tương lai, với sự xuất sắc và đổi mới làm cốt lõi.."
  ];

  const typingSpeed = 30;    // Tốc độ gõ
  const sentenceDelay = 200; // Khoảng cách giữa các câu

  let sentenceIndex = 0;
  let charIndex = 0;

  function typeEffect() {
    const container = document.getElementById("typing-container");

    // Nếu đang ở câu mới, tạo <p> cho câu đó
    if (charIndex === 0) {
      const newParagraph = document.createElement("p");
      container.appendChild(newParagraph);
    }

    const currentSentence = sentences[sentenceIndex];
    const paragraph = container.lastElementChild;

    // Thêm từng ký tự vào câu hiện tại
    if (charIndex < currentSentence.length) {
      paragraph.innerHTML += currentSentence.charAt(charIndex);
      charIndex++;
      setTimeout(typeEffect, typingSpeed); // Gọi lại `typeEffect` để tiếp tục
    } else {
      // Nếu câu hiện tại hoàn tất, chuyển sang câu tiếp theo sau khoảng delay
      sentenceIndex++;
      charIndex = 0;

      if (sentenceIndex < sentences.length) {
        setTimeout(typeEffect, sentenceDelay);
      }
    }
  }

  // Bắt đầu hiệu ứng typing khi page được tải
  document.addEventListener("DOMContentLoaded", typeEffect);
</script>

<!-- footer -->
<div id="footer"><%@include file="resources/data/footer.jsp"%></div>

<script src="vendors/bootstrap-5.3.3-dist/js/bootstrap.bundle.min.js"></script>
<%--<script src="./resources/js/main.js"></script>--%>
<script src="resources/js/quit.js"></script>
<script src="resources/js/backtotop.js"></script>


</body>
</html>