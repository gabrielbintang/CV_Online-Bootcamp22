/*
 * To change this license header, choose License Headers in Organization Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Organization;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class OrganizationDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public OrganizationDAO() {
    }

    public OrganizationDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Organization> functions(Organization organization, int opt) {
        List<Organization> organizations = new ArrayList<Organization>();
        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(organization);
            } else if (opt == 2) {
                session.delete(organization);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Organization.class);
                c.add(Restrictions.or(Restrictions.eq("id", organization.getId()),
                        Restrictions.like("name", "%"+organization.getName() + "%"),
                        Restrictions.eq("startDate",organization.getStartDate()),
                        Restrictions.eq("employee", organization.getEmployee()),
                        Restrictions.eq("employee", organization.getPosition()),
                        Restrictions.eq("endDate",organization.getEndDate())));
                organizations = c.list();
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
        return organizations;
    }

}
