package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String image;
    private String state;
    private String description;
    private boolean checkCollection;

    public Product(int id, String productName, double price, String image, String state, String description, boolean checkCollection) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.image = image;
        this.state = state;
        this.description = description;
        this.checkCollection = checkCollection;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCheckCollection() {
        return checkCollection;
    }

    public void setCheckCollection(boolean checkCollection) {
        this.checkCollection = checkCollection;
    }

    // Getters và Setters
}
