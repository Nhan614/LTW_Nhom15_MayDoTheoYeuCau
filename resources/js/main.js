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


// admin sidebar

$(document).ready( function(e){
  $('.admin-sidebar-1').click(function(e) {
    $('section').addClass('admin-hide')
    $('#admin-dashboard').removeClass('admin-hide')

  })

  $('.admin-sidebar-2').click(function(e) {
    $('section').addClass('admin-hide')
    $('#admin-products').removeClass('admin-hide')
  })
  
  if (window.location.hash === '#admin-dashboard') {
    $('#admin-dashboard').removeClass('admin-hide')
  }
  if (window.location.hash === '#admin-products') {
    $('#admin-products').removeClass('admin-hide')
  }
})

