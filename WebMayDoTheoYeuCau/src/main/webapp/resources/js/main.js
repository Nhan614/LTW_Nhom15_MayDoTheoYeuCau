// load header
document.addEventListener("DOMContentLoaded", function () {
  fetch('./resources/data/header.jsp')
    .then(response => response.text())
    .then(data => {
      document.getElementById('menubar').innerHTML = data; // Add active class to current nav-link
      const currentPath = window.location.pathname.split("/").pop();
      const navLinks = document.querySelectorAll(".nav-link");
      navLinks.forEach(link => {
        if (link.getAttribute("href") === currentPath) {
          link.classList.add("active");
        }
      });
    });
});

// load footer
document.addEventListener("DOMContentLoaded", function () {
  fetch('./resources/data/footer.jsp')
    .then(response => response.text())
    .then(data => {
      document.getElementById('footer').innerHTML = data;
    });
});




$(document).ready(function (e) {

  // admin sidebar
  $('.admin-sidebar-1').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-dashboard').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })

  $('.admin-sidebar-2').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-products').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })

  $('.admin-sidebar-5').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-user').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })

  $('.admin-sidebar-3').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-orders').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })
  $('.admin-sidebar-6').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-categories').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })
  $('.admin-sidebar-7').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-notification').removeClass('admin-hide')
    $('.sidebar li').removeClass('sidebar-active')
    $(this).addClass('sidebar-active')
  })
  $('.admin-sidebar-8').click(function (e) {
    $('section').addClass('admin-hide')
    $('#admin-reports').removeClass('admin-hide')
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
  if (window.location.hash === '#admin-categories') {
    $('#admin-categories').removeClass('admin-hide')
    $('.admin-sidebar-6').addClass('sidebar-active')
  }
  if (window.location.hash === '#admin-notification') {
    $('#admin-notification').removeClass('admin-hide')
    $('.admin-sidebar-7').addClass('sidebar-active')
  }
  if (window.location.hash === '#admin-reports') {
    $('#admin-reports').removeClass('admin-hide')
    $('.admin-sidebar-8').addClass('sidebar-active')
  }

})

