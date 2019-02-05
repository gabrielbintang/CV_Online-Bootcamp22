/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ProjectDAO;
import java.util.List;
import models.Project;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class ProjectController {
    private ProjectDAO projectDAO;
        private SessionFactory sessionFactory;

    public ProjectController(SessionFactory sessionFactory) {
        projectDAO = new ProjectDAO(sessionFactory);
    }
                public List<Project> save(Project pro) {
        return projectDAO.functions(pro, 1);
    }

    public List<Project> search(Project pro) {
        return projectDAO.functions(pro, 3);
    }

    public List<Project> delete(Project pro) {
        return projectDAO.functions(pro, 2);
    }
        
}
