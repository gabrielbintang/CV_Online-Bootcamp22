/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.UserMii;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class UserMiiDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public UserMiiDAO() {
    }

    public UserMiiDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<UserMii> functions(UserMii user, int opt) {
        List<UserMii> userMii = new ArrayList<UserMii>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(user);
            } else if (opt == 2) {
                session.delete(user);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(UserMii.class);
                c.add(Restrictions.or(Restrictions.eq("id", user.getId()),
                        Restrictions.like("name", "%" + user.getName() + "%"),
                        Restrictions.like("email", "%" + user.getEmail() + "%"),
                        Restrictions.eq("role", user.getRole())));
                userMii = c.list();
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
        return userMii;
    }
}
