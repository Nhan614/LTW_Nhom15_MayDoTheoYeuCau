function sendNotification(event) {
    event.preventDefault();

    const formData = new FormData(document.getElementById('notificationForm'));
    const data = Object.fromEntries(formData);

    fetch('/admin/notifications', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(data),
    })
        .then(response => response.json())
        .then(result => {
            alert(result.message || 'Thông báo đã được gửi thành công!');
            loadNotifications(); // Tải lại danh sách thông báo
        })
        .catch(error => {
            console.error('Error:', error);
            alert('Đã xảy ra lỗi khi gửi thông báo.');
        });
}

function loadNotifications() {
    fetch('/admin/notifications', {
        method: 'GET',
    })
        .then(response => response.json())
        .then(data => {
            const notificationList = document.getElementById('notificationList');
            notificationList.innerHTML = '';
            data.forEach(notification => {
                notificationList.innerHTML += `
                    <tr>
                        <td>${notification.title}</td>
                        <td>${notification.userGroup}</td>
                        <td>${notification.style}</td>
                        <td>${notification.detail}</td>
                        <td>${new Date(notification.createTime).toLocaleString()}</td>
                    </tr>`;
            });
        })
        .catch(error => console.error('Error:', error));
}

// Tải danh sách thông báo khi trang được tải
window.onload = loadNotifications;
