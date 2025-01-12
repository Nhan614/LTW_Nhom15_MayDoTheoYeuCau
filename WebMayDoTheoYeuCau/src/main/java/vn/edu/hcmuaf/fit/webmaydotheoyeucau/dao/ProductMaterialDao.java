package vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.db.DBConnect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductMaterialDao implements Serializable {
    DBConnect dbConnect;
    public ProductMaterialDao() {
        dbConnect = new DBConnect();
    }

    
    
}
