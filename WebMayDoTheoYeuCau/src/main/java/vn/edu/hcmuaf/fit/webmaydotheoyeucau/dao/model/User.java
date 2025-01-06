package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

import java.io.Serializable;

public class User implements Serializable {

    private int userID;
    private String avatar;
    private String userName;
    private String password;
    private String fullName;
    private String gmail;
    private String phone;
    private String address;
    private boolean notificationCheck;
    private int role;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isNotificationCheck() {
        return notificationCheck;
    }

    public void setNotificationCheck(boolean notificationCheck) {
        this.notificationCheck = notificationCheck;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", avatar='" + avatar + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", fullName='" + fullName + '\'' +
                ", gmail='" + gmail + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", notificationCheck=" + notificationCheck +
                ", role=" + role +
                '}';
    }
}
