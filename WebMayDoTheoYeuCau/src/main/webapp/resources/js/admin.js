// user
$(document).on('click', '.user-editBtn', function () {
    let row = $(this).closest('tr')
    $('#userName').val(row.find('td:eq(0)').text());
    $('#userEmail').val(row.find('td:eq(1)').text());
    $('#userPhone').val(row.find('td:eq(2)').text());
    $('#userCheck').val(row.find('td:eq(3)').text());
    $('#userRole').val(row.find('td:eq(4)').text());
    $('#userModal').modal('show');
});