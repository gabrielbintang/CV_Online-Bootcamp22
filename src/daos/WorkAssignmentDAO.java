/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.WorkAssignment;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class WorkAssignmentDAO {
        private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public WorkAssignmentDAO() {
    }

    public WorkAssignmentDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    
    
        public List<WorkAssignment> functions(WorkAssignment wa, int opt) {
        List<WorkAssignment> workAssignment = new ArrayList<WorkAssignment>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(wa);
            } else if (opt == 2) {
                session.delete(wa);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(WorkAssignment.class);
                c.add(Restrictions.or(Restrictions.eq("id", wa.getId()),
                        Restrictions.eq("startDate", wa.getStartDate()),
                        Restrictions.eq("endDate", wa.getEndDate() ),
                        Restrictions.like("position", "%" + wa.getPosition()+ "%"),
                        Restrictions.like("company", "%" + wa.getCompany() + "%"),
                        Restrictions.like("jobDescription", "%" + wa.getJobDescription()+ "%"),
                        Restrictions.eq("employee", wa.getEmployee() )));
                workAssignment = c.list();
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
        return workAssignment;
    }
}
