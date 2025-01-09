package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

public class Product {
    private int id;
    private String productName;
    private double price;
    private String image;
    private boolean state;
    private String description;
    private boolean checkCollection;
    private int categoryID;
    private String maker;

    public Product(int id, String productName, double price, String image, boolean state, String description, boolean checkCollection
    , int categoryID, String maker) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.image = image;
        this.state = state;
        this.description = description;
        this.checkCollection = checkCollection;
        this.categoryID = categoryID;
        this.maker = maker;

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

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
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
    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", state='" + state + '\'' +
                ", description='" + description + '\'' +
                ", checkCollection=" + checkCollection +
                ", categoryID=" + categoryID +
                ", maker='" + maker + '\'' +
                '}';
    }

    // Getters và Setters
}
