/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.University;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class UniversityDAO {
    
    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public UniversityDAO() {
    }

    public UniversityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
        public List<University> functions(University u, int opt) {
        List<University> university = new ArrayList<University>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(u);
            } else if (opt == 2) {
                session.delete(u);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(University.class);
                c.add(Restrictions.or(Restrictions.eq("id", u.getId()),
                        Restrictions.like("name", "%" + u.getName() + "%")));
                university = c.list();
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
        return university;
    }
}
