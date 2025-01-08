package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

public class Material implements java.io.Serializable {
    private int id;
    private String name;
    private String season;
    private String description;
    private String image;
    private int quantity;
    private int state;
    private String matCategory;
    private int price;

    public Material() {}
    public Material(int id, String name, String season, String description, String image, int quantity, int state, String matCategory, int price) {
        this.id = id;
        this.name = name;
        this.season = season;
        this.description = description;
        this.image = image;
        this.quantity = quantity;
        this.state = state;
        this.matCategory = matCategory;
        this.price = price;
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

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getMatCategory() {
        return matCategory;
    }

    public void setMatCategory(String matCategory) {
        this.matCategory = matCategory;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Material{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", season='" + season + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", quantity=" + quantity +
                ", state=" + state +
                ", matCategory=" + matCategory +
                ", price=" + price +
                '}';
    }
}
