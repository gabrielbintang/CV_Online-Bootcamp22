/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.UniversityDAO;
import java.util.List;
import models.University;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class UniversityController {
    private UniversityDAO universityDAO ;
        private SessionFactory sessionFactory;

    public UniversityController(SessionFactory sessionFactory) {
        universityDAO = new UniversityDAO(sessionFactory);
    }
    
            public List<University> save(University univ) {
        return universityDAO.functions(univ, 1);
    }

    public List<University> search(University univ) {
        return universityDAO.functions(univ, 3);
    }

    public List<University> delete(University univ) {
        return universityDAO.functions(univ, 2);
    }
        
        
}
