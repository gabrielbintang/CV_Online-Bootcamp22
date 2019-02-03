/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Training;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class TrainingDAO {
    
    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public TrainingDAO() {
    }

    public TrainingDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
        public List<Training> functions(Training t, int opt) {
        List<Training> training = new ArrayList<Training>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(t);
            } else if (opt == 2) {
                session.delete(t);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Training.class);
                c.add(Restrictions.or(Restrictions.eq("id", t.getId()),
                        Restrictions.like("name", "%" + t.getName() + "%"),
                        Restrictions.like("description", "%" + t.getDescription() + "%"),
                        Restrictions.like("certificate", "%" + t.getCertificate() + "%"),
                        Restrictions.eq("employee",  t.getEmployee() )));
                training = c.list();
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
        return training;
    }
}
