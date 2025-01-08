package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

import java.io.Serializable;

public class User implements Serializable {

    private int id;
    private String avatar;
    private String password;
    private String fullName;
    private String gmail;
    private String phone;
    private String address;
    private int notificationCheck;
    private int role;

    public User() {
    }

    public User(int id, String avatar,  String password, String fullName, String gmail, String phone, String address, int notificationCheck, int role) {
        this.id = id;
        this.avatar = avatar;
        this.password = password;
        this.fullName = fullName;
        this.gmail = gmail;
        this.phone = phone;
        this.address = address;
        this.notificationCheck = notificationCheck;
        this.role = role;
    }
    public User(int id, String avatar, String fullName, String gmail, String phone, String address, int notificationCheck, int role) {
        this.id = id;
        this.avatar = avatar;
        this.fullName = fullName;
        this.gmail = gmail;
        this.phone = phone;
        this.address = address;
        this.notificationCheck = notificationCheck;
        this.role = role;
    }

    public User(String image, String password123, String johnDoe, String mail, String number, String address, int notificationCheck, int role) {
        this.avatar = image;
        this.password = password123;
        this.fullName = johnDoe;
        this.gmail = mail;
        this.phone = number;
        this.address = address;
        this.notificationCheck = notificationCheck;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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

    public int getNotificationCheck() {
        return notificationCheck;
    }

    public void setNotificationCheck(int notificationCheck) {
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
                "id=" + id +
                ", avatar='" + avatar + '\'' +
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
