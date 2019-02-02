/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Experience;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rayhan
 */
public class ExperienceDAO {
    
     private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public ExperienceDAO() {
    }

    public ExperienceDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Experience> functions(Experience experience, int opt) {
        List<Experience> experiences = new ArrayList<Experience>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(experience);
            } else if (opt == 2) {
                session.delete(experience);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Experience.class);
                c.add(Restrictions.or(Restrictions.eq("id", experience.getId()),
                        Restrictions.like("name", "%"+experience.getName()+"%"),
                        Restrictions.like("description", "%"+experience.getDescription()+"%"),
                        Restrictions.like("employee", experience.getEmployee())));
                experiences = c.list();
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
        return experiences;
    }
}
