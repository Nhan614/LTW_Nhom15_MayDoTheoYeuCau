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
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })

  $('.admin-sidebar-2').click(function(e) {
    $('section').addClass('admin-hide')
    $('#admin-products').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })

  $('.admin-sidebar-5').click(function(e) {
    $('section').addClass('admin-hide')
    $('#admin-user').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })

  $('.admin-sidebar-3').click(function(e) {
    $('section').addClass('admin-hide')
    $('#admin-orders').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })
  // onload sidebar
  if (window.location.hash === '#admin-dashboard') {
    $('#admin-dashboard').removeClass('admin-hide')
    $('.admin-sidebar-1').addClass('sidebar-active')
  }
  if (window.location.hash === '#admin-products') {
    $('#admin-products').removeClass('admin-hide')
    $('.admin-sidebar-2').addClass('sidebar-active')
  }
  if (window.location.hash === '#admin-user') {
    $('#admin-user').removeClass('admin-hide')
    $('.admin-sidebar-5').addClass('sidebar-active')
  }
  if (window.location.hash === '#admin-orders') {
    $('#admin-orders').removeClass('admin-hide')
    $('.admin-sidebar-3').addClass('sidebar-active')
  }
})

