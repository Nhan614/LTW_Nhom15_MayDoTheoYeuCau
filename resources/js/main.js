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

