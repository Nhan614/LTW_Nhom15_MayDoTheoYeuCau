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

// chart doanh thu

new Chartist.Line('.line-chart-filled', {
    labels: [1, 2, 3, 4, 5, 6, 7, 8],
    series: [
      [5, 9, 7, 8, 5, 3, 5, 4]
    ]
  }, {
    low: 0,
    showArea: true
  });

