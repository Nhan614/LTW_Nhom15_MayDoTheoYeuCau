// load header
document.addEventListener("DOMContentLoaded", function() {
    fetch('./resources/data/header.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('menubar').innerHTML = data;
        });
});

// load footer
document.addEventListener("DOMContentLoaded", function() {
    fetch('./resources/data/footer.html')
        .then(response => response.text())
        .then(data => {
            document.getElementById('footer').innerHTML = data;
        });
});

// active navbar

document.addEventListener("DOMContentLoaded", function() {
    var navLink = document.querySelectorAll(".nav-link");
    console.log(navLink)
    if (navLink) {
        console.log("Đã tìm thấy: " + navLink.textContent);
    } else {
        console.log("Không tìm thấy phần tử nào.");
    }
});

