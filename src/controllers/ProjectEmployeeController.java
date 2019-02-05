/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ProjectEmployeeDAO;
import java.util.List;
import models.ProjectEmployee;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class ProjectEmployeeController {
    private ProjectEmployeeDAO projectEmployeeDAO;
        private SessionFactory sessionFactory;

    public ProjectEmployeeController(SessionFactory sessionFactory) {
        projectEmployeeDAO = new ProjectEmployeeDAO(sessionFactory);
    }
    
            public List<ProjectEmployee> save(ProjectEmployee pe) {
        return projectEmployeeDAO.functions(pe, 1);
    }

    public List<ProjectEmployee> search(ProjectEmployee pe) {
        return projectEmployeeDAO.functions(pe, 3);
    }

    public List<ProjectEmployee> delete(ProjectEmployee pe) {
        return projectEmployeeDAO.functions(pe, 2);
    }
        
        
    
}
