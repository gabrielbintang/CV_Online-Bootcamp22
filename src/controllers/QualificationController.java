/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.QualificationDAO;
import java.util.List;
import models.Qualification;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class QualificationController {
    private QualificationDAO qualificationDAO;
        private SessionFactory sessionFactory;

    public QualificationController(SessionFactory sessionFactory) {
        qualificationDAO = new QualificationDAO(sessionFactory);
    }
        
            public List<Qualification> save(Qualification q) {
        return qualificationDAO.functions(q, 1);
    }

    public List<Qualification> search(Qualification q) {
        return qualificationDAO.functions(q, 3);
    }

    public List<Qualification> delete(Qualification q) {
        return qualificationDAO.functions(q, 2);
    }
        
}
