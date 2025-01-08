package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.MaterialDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Material;

import java.util.List;

public class MaterialService {
    MaterialDao materialDao;
    public MaterialService() {
        this.materialDao = new MaterialDao();
    }

    public List<Material> getMaterial() {
       return materialDao.getAllMaterial();
    }
}
