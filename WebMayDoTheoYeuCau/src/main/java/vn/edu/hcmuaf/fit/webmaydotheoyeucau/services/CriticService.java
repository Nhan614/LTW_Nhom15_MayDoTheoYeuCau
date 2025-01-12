package vn.edu.hcmuaf.fit.webmaydotheoyeucau.services;

import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.CriticDao;
import vn.edu.hcmuaf.fit.webmaydotheoyeucau.dao.model.Critic;

import java.util.List;

public class CriticService {
    CriticDao criticDao;

    public  List<Critic> getAllCritic() {
        return criticDao.getAllCritic();
    }

    public boolean addCritic(Critic critic) {
        return criticDao.addCritic(critic);
    }

    public boolean deleteCritic(int id) {
        return criticDao.deleteCritic(id);
    }

    public Critic getCriticById(int id) {
        return criticDao.getCriticByID(id);
    }

    public static void main(String[] args) {
        CriticService criticService = new CriticService();
        System.out.println(criticService.getCriticById(1));
    }

}
