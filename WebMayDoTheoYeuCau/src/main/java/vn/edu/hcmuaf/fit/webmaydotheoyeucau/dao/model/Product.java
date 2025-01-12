package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

import java.util.*;

public class Product implements java.io.Serializable {
    private int id;
    private String productName;
    private double price;
    private String image;
    private boolean state;
    private String description;
    private boolean checkCollection;
    private String categoryName;
    private List<String> productMaterials;
    private Map<String, Double> partSizes; // Danh sách kích thước các bộ phận

    public Product() {
        partSizes = new HashMap<String, Double>();
        productMaterials = new ArrayList<>();
    }

    public Product(int id, String productName, double price, String image, boolean state, String description, boolean checkCollection, String categoryName, List<String> productMaterials, Map<String, Double> partSizes) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.image = image;
        this.state = state;
        this.description = description;
        this.checkCollection = checkCollection;
        this.categoryName = categoryName;
        this.productMaterials = productMaterials;
        this.partSizes = partSizes;
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

    public boolean isState() {
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

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<String> getProductMaterials() {
        return productMaterials;
    }

    public void setProductMaterials(List<String> productMaterials) {
        this.productMaterials = productMaterials;
    }

    public Map<String, Double> getPartSizes() {
        return partSizes;
    }

    public void setPartSizes(Map<String, Double> partSizes) {
        this.partSizes = partSizes;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", state=" + state +
                ", description='" + description + '\'' +
                ", checkCollection=" + checkCollection +
                ", categoryName='" + categoryName + '\'' +
                ", productMaterials=" + productMaterials +
                ", partSizes=" + partSizes +
                '}';
    }
}
