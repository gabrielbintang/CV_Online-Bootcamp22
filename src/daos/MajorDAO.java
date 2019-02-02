/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Major;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class MajorDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public MajorDAO() {
    }

    public MajorDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Major> functions(Major major, int opt) {
        List<Major> majors = new ArrayList<Major>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(major);
            } else if (opt == 2) {
                session.delete(major);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Major.class);
                c.add(Restrictions.or(Restrictions.eq("id", major.getId()),
                        Restrictions.like("name", major.getName()+ "%")));
                majors = c.list();
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
        return majors;
    }
}
