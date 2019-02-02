/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Certification;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rayhan
 */
public class CertificationDAO {
     private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public CertificationDAO() {
    }

    public CertificationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
        public List<Certification> functions(Certification certification, int opt) {
        List<Certification> certifications = new ArrayList<Certification>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(certification);
            } else if (opt == 2) {
                session.delete(certification);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Certification.class);
                c.add(Restrictions.or(Restrictions.eq("id", certification.getId()),
                        Restrictions.like("name", "%"+certification.getName() + "%"),
                        Restrictions.like("description", "%"+certification.getDescription()+ "%"),
                        Restrictions.eq("expiredDate", certification.getExpiredDate()),
                        Restrictions.eq("employee", certification.getEmployee())));
                certifications = c.list();
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
        return certifications;
    }
}
