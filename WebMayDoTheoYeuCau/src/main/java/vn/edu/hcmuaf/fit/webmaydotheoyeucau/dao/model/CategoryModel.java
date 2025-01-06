package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model;

public class CategoryModel implements java.io.Serializable {

    private int id;
    private String categoryName;
    private String description;
    private int state;
    private int categoryParentID;

    public CategoryModel() {}
    public CategoryModel(int id, String categoryName, String description, int state, int categoryParentID) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.state = state;
        this.categoryParentID = categoryParentID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getCategoryParentID() {
        return categoryParentID;
    }

    public void setCategoryParentID(int categoryParentID) {
        this.categoryParentID = categoryParentID;
    }

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", description='" + description + '\'' +
                ", state=" + state +
                ", categoryParentID=" + categoryParentID +
                '}';
    }
}
