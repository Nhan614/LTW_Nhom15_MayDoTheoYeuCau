package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import jdk.jfr.Category;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Supplier;

import java.util.List;

public class CategoryDao {
    DBConnect dbConnect;

    public CategoryDao() {
        dbConnect = new DBConnect();
    }

    public List<CategoryModel> getAllCategoriesByParentID(int parentID) {
        String sql = "select * from categories where categoryParentID = :?";
        List<CategoryModel> listCategories =  dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).bind(1, parentID).mapToBean(CategoryModel.class).list();
        });
        return listCategories;
    }
    public List<CategoryModel> getAllCategories() {
        String sql = "select * from categories";
        return dbConnect.get().withHandle(handle -> {
            return handle.createQuery(sql).mapToBean(CategoryModel.class).list();
        });
    }

    public boolean addCategory(CategoryModel category) {
        String sql = "INSERT INTO categories (categoryName, description, state, categoryParentID) VALUES (:categoryName, :description, :state, :categoryParentID)";
        try {
            int rowsInserted = dbConnect.get().withHandle(handle ->
                    handle.createUpdate(sql)
                            .bind("categoryName", category.getCategoryName())
                            .bind("description", category.getDescription())
                            .bind("state", category.getState())
                            .bind("categoryParentID", category.getCategoryParentID())
                            .execute()
            );
            return rowsInserted > 0; // Returns true if a row was inserted
        } catch (Exception e) {
            e.printStackTrace(); // Log exception for debugging
        }
        return false;
    }

    public static void main(String[] args) {
        CategoryDao categoryDao = new CategoryDao();
        System.out.println(categoryDao.getAllCategories());
    }
}