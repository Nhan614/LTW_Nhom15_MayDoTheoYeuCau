package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

public class Contact {
    private int id;
    private String name;
    private String email;
    private String message;
    private int status;
    private String response;
    private String responseBy;

    public Contact() {
    }

    public Contact(int id, String name, String email, String message, int status,
                   String response, String responseBy) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.message = message;
        this.status = status;
        this.response = response;
        this.responseBy = responseBy;
    }

    public Contact(int id, int status, String response, String responseBy) {
        this.id = id;
        this.status = status;
        this.response = response;
        this.responseBy = responseBy;
    }

    public Contact(String name, String email, String message, int status) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponseBy() {
        return responseBy;
    }

    public void setResponseBy(String responseBy) {
        this.responseBy = responseBy;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", message='" + message + '\'' +
                ", status=" + status +
                ", response='" + response + '\'' +
                ", responseBy='" + responseBy + '\'' +
                '}';
    }
}

