/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.WorkAssignmentDAO;
import java.util.List;
import models.WorkAssignment;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class WorkAssignmentController {
        private WorkAssignmentDAO workAssignmentDAO;
        private SessionFactory sessionFactory;

    public WorkAssignmentController(SessionFactory sessionFactory) {
        workAssignmentDAO = new WorkAssignmentDAO(sessionFactory);
    }
    
            public List<WorkAssignment> save(WorkAssignment work) {
        return workAssignmentDAO.functions(work, 1);
    }

    public List<WorkAssignment> search(WorkAssignment work) {
        return workAssignmentDAO.functions(work, 3);
    }

    public List<WorkAssignment> delete(WorkAssignment work) {
        return workAssignmentDAO.functions(work, 2);
    }
        
        
}
