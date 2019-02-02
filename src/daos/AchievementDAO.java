/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Achievement;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rayhan
 */
public class AchievementDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public AchievementDAO() {
    }

    public AchievementDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Achievement> functions(Achievement achievement, int opt) {
        List<Achievement> achievements = new ArrayList<Achievement>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(achievement);
            } else if (opt == 2) {
                session.delete(achievement);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Achievement.class);
                c.add(Restrictions.or(Restrictions.eq("id", achievement.getId()),
                        Restrictions.like("name", "%"+achievement.getName() + "%"),
                        Restrictions.like("description", "%"+achievement.getDescription()+ "%"),
                        Restrictions.eq("employee", achievement.getEmployee())));
                achievements = c.list();
            }
            trasaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (trasaction != null) {
                trasaction.rollback();
            }
        } finally {
            session.close();
        }
        return achievements;
    }

}
