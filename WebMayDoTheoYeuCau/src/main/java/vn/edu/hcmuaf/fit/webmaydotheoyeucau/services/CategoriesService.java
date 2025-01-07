package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.CategoryDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.CategoryModel;

import java.util.List;

public class CategoriesService {
    private CategoryDao categoryDao;

    public CategoriesService() {
        categoryDao = new CategoryDao();
    }
    public List<CategoryModel> getCategoriesByParentID(int parentID) {
        return categoryDao.getAllCategoriesByParentID(parentID);
    }
    public List<CategoryModel> getAllCategories() {
        return categoryDao.getAllCategories();
    }
    public boolean addCategory(CategoryModel category) {
        return categoryDao.addCategory(category); // Delegate to DAO
    }
    public boolean updateCategory(CategoryModel category) {
        CategoryDao categoryDao = new CategoryDao();
        return categoryDao.updateCategory(category);
    }
    public boolean deleteCategory(int id) {
        return categoryDao.deleteCategory(id);
    }

    public static void main(String[] args) {
        System.out.println(new CategoriesService().getAllCategories());
    }
}
