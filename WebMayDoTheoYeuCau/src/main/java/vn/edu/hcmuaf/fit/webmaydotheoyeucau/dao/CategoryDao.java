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

    public static void main(String[] args) {
        CategoryDao categoryDao = new CategoryDao();
        System.out.println(categoryDao.getAllCategories());
    }
}
