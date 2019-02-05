/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.QualificationEmployeeDAO;
import java.util.List;
import models.QualificationEmployee;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class QualificationEmployeeController {
    private QualificationEmployeeDAO qualificationEmployeeDAO;
        private SessionFactory sessionFactory;

    public QualificationEmployeeController(SessionFactory sessionFactory) {
        qualificationEmployeeDAO = new QualificationEmployeeDAO(sessionFactory);
    }
    
            public List<QualificationEmployee> save(QualificationEmployee qe) {
        return qualificationEmployeeDAO.functions(qe, 1);
    }

    public List<QualificationEmployee> search(QualificationEmployee qe) {
        return qualificationEmployeeDAO.functions(qe, 3);
    }

    public List<QualificationEmployee> delete(QualificationEmployee qe) {
        return qualificationEmployeeDAO.functions(qe, 2);
    }
        
        
}
