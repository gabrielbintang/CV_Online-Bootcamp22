/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.MajorUniversityDAO;
import java.util.List;
import models.MajorUniversity;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class MajorUniversityController {
    MajorUniversityDAO majorUniversityDAO;

    public MajorUniversityController() {
    }

    public MajorUniversityController(SessionFactory sessionFactory) {
        majorUniversityDAO = new MajorUniversityDAO(sessionFactory);
    }

    public List<MajorUniversity> save(MajorUniversity a) {
        return majorUniversityDAO.functions(a, 1);
    }

    public List<MajorUniversity> search(MajorUniversity a) {
        return majorUniversityDAO.functions(a, 3);
    }

    public List<MajorUniversity> delete(MajorUniversity a) {
        return majorUniversityDAO.functions(a, 2);
    }
}
