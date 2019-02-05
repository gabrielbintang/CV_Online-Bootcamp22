/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.AchievementDAO;
import java.util.List;
import models.Achievement;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class AchievementController {

    AchievementDAO achievementDAO;

    public AchievementController() {
    }

    public AchievementController(SessionFactory sessionFactory) {
        achievementDAO = new AchievementDAO(sessionFactory);
    }

    public List<Achievement> save(Achievement a) {
        return achievementDAO.functions(a, 1);
    }

    public List<Achievement> getAll(Achievement a) {
        return achievementDAO.functions(a, 3);
    }

    public List<Achievement> delete (Achievement a){
        return achievementDAO.functions(a, 2);
    }
}
