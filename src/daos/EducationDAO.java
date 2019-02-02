/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Education;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rayhan
 */
public class EducationDAO {
     private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public EducationDAO() {
    }

    public EducationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public List<Education> functions(Education education, int opt) {
        List<Education> educations = new ArrayList<Education>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(education);
            } else if (opt == 2) {
                session.delete(education);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Education.class);
                c.add(Restrictions.or(Restrictions.eq("id", education.getId()),
                        Restrictions.like("startDate", education.getStartDate()),
                        Restrictions.like("endDate", education.getEndDate()),
                        Restrictions.like("ip", "%"+education.getIp()+"%"),
                        Restrictions.like("majorUniversity", education.getMajorUniversity()),
                        Restrictions.like("employee", education.getEmployee())));
                educations = c.list();
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
        return educations;
    }
    
}
