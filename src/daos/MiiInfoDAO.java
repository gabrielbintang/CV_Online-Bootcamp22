/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.MiiInfo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author NINDA
 */
public class MiiInfoDAO {
    
    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public MiiInfoDAO() {
    }
    
    

    public MiiInfoDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
            public List<MiiInfo> functions(MiiInfo info, int opt) {
        List<MiiInfo> miiInfo = new ArrayList<MiiInfo>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(info);
            } else if (opt == 2) {
                session.delete(info);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(MiiInfo.class);
                c.add(Restrictions.or(Restrictions.eq("id", info.getId()),
                        Restrictions.like("address", "%" + info.getAddress() + "%"),
                        Restrictions.like("phone", "%" + info.getPhone() + "%"),
                        Restrictions.like("email", info.getEmail()+"%")));
                miiInfo = c.list();
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
        return miiInfo;
    }
}
