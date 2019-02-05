/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.TrainingDAO;
import java.util.List;
import models.Training;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class TrainingController {
     private TrainingDAO trainingDAO;
        private SessionFactory sessionFactory;

    public TrainingController(SessionFactory sessionFactory) {
        trainingDAO = new TrainingDAO(sessionFactory);
    }
    
            public List<Training> save(Training t) {
        return trainingDAO.functions(t, 1);
    }

    public List<Training> search(Training t) {
        return trainingDAO.functions(t, 3);
    }

    public List<Training> delete(Training t) {
        return trainingDAO.functions(t, 2);
    }
        
        
}
