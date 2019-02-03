/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Qualification;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class QualificationDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public QualificationDAO() {
    }

    public QualificationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
       public List<Qualification> functions(Qualification ql, int opt) {
        List<Qualification> qualification = new ArrayList<Qualification>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(ql);
            } else if (opt == 2) {
                session.delete(ql);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Qualification.class);
                c.add(Restrictions.or(Restrictions.eq("id", ql.getId()),
                        Restrictions.like("name", "%" + ql.getName() + "%"),
                        Restrictions.like("specialization", "%" + ql.getSpecialization() + "%")));
                qualification = c.list();
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
        return qualification;
    }
}
