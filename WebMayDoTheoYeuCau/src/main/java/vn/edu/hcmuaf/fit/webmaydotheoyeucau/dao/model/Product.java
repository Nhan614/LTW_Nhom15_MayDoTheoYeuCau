package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

public class Product {
    private int id;
    private String title;
    private String season;
    private String maker;
    private double oldPrice;
    private double price;
    private String material;
    private String imageUrl;
    private int discountPercentage;

    public Product(int id, String title, String season, String maker, double oldPrice, double price, String material, String imageUrl, int discountPercentage) {
        this.id = id;
        this.title = title;
        this.season = season;
        this.maker = maker;
        this.oldPrice = oldPrice;
        this.price = price;
        this.material = material;
        this.imageUrl = imageUrl;
        this.discountPercentage = discountPercentage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
