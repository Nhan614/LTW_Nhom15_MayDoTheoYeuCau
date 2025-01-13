package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

import java.security.Timestamp;

public class Notification {
    private int id;
    private String title;
    private String detail;
    private Timestamp createTime;
    private String style;
    private int userID;

    public Notification() {}

    public Notification(String title, String detail, String style, int userID) {
        this.title = title;
        this.detail = detail;
        this.style = style;
        this.userID = userID;
    }

    // Getters và Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }

    public Timestamp getCreateTime() { return createTime; }
    public void setCreateTime(Timestamp createTime) { this.createTime = createTime; }

    public String getStyle() { return style; }
    public void setStyle(String style) { this.style = style; }

    public int getUserID() { return userID; }
    public void setUserID(int userID) { this.userID = userID; }
}
