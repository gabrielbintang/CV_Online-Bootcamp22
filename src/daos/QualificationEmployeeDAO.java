/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.QualificationEmployee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class QualificationEmployeeDAO {
    
    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public QualificationEmployeeDAO() {
    }

    public QualificationEmployeeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
        public List<QualificationEmployee> functions(QualificationEmployee qle, int opt) {
        List<QualificationEmployee> qualificationEmployee = new ArrayList<QualificationEmployee>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(qle);
            } else if (opt == 2) {
                session.delete(qle);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(QualificationEmployee.class);
                c.add(Restrictions.or(Restrictions.eq("id", qle.getId()),
                        Restrictions.like("qualification", qle.getQualification()),
                        Restrictions.like("employee", qle.getEmployee())));
                qualificationEmployee = c.list();
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
        return qualificationEmployee;
    }
}
