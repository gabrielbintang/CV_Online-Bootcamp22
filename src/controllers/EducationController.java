/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.EducationDAO;
import java.util.List;
import models.Education;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class EducationController {

    EducationDAO educationDAO;

    public EducationController() {
    }

    public EducationController(SessionFactory sessionFactory) {
        educationDAO = new EducationDAO(sessionFactory);
    }

    public List<Education> save(Education a) {
        return educationDAO.functions(a, 1);
    }

    public List<Education> search(Education a) {
        return educationDAO.functions(a, 3);
    }

    public List<Education> delete(Education a) {
        return educationDAO.functions(a, 2);
    }
}
