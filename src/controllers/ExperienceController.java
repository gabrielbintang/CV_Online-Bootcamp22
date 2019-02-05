/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ExperienceDAO;
import java.util.List;
import models.Experience;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class ExperienceController {

    ExperienceDAO experienceDAO;

    public ExperienceController() {
    }

    public ExperienceController(SessionFactory sessionFactory) {
        experienceDAO = new ExperienceDAO(sessionFactory);
    }

    public List<Experience> save(Experience a) {
        return experienceDAO.functions(a, 1);
    }

    public List<Experience> search(Experience a) {
        return experienceDAO.functions(a, 3);
    }

    public List<Experience> delete(Experience a) {
        return experienceDAO.functions(a, 2);
    }
}
