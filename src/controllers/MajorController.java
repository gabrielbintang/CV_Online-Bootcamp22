/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.MajorDAO;
import java.util.List;
import models.Major;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class MajorController {
    MajorDAO majorDAO;

    public MajorController() {
    }

    public MajorController(SessionFactory sessionFactory) {
        majorDAO = new MajorDAO(sessionFactory);
    }

    public List<Major> save(Major a) {
        return majorDAO.functions(a, 1);
    }

    public List<Major> search(Major a) {
        return majorDAO.functions(a, 3);
    }

    public List<Major> delete(Major a) {
        return majorDAO.functions(a, 2);
    }
}
