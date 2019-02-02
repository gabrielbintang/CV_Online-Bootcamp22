/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.RoleMii;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class RoleMiiDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public RoleMiiDAO() {
    }

    public RoleMiiDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<RoleMii> functions(RoleMii roleMii, int opt) {
        List<RoleMii> roleMiis = new ArrayList<RoleMii>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(roleMii);
            } else if (opt == 2) {
                session.delete(roleMii);
            } else if (opt == 3) {
//                Criteria c;
//                Criterion id = Restrictions.eq("id", r.getRoleMii());
//                Criterion name = Restrictions.like("roleMiiName", r.getRoleMiiName() + "%");
                Criteria c = session.createCriteria(RoleMii.class);
//                LogicalExpression orE = Restrictions.or(id, name);
                c.add(Restrictions.or(Restrictions.eq("id", roleMii.getId()),
                        Restrictions.like("name",
                                roleMii.getName()+ "%")));
                roleMiis = c.list();
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
        return roleMiis;
    }
}
