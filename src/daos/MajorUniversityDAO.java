/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.MajorUniversity;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class MajorUniversityDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public MajorUniversityDAO() {
    }

    public MajorUniversityDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<MajorUniversity> functions(MajorUniversity majorUniversity, int opt) {
        List<MajorUniversity> majorUniversitys = new ArrayList<MajorUniversity>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(majorUniversity);
            } else if (opt == 2) {
                session.delete(majorUniversity);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(MajorUniversity.class);
                c.add(Restrictions.or(Restrictions.eq("id", majorUniversity.getId()),
                        Restrictions.like("degree",majorUniversity.getDegree()+ "%"),
                        Restrictions.like("degreeLevel",majorUniversity.getDegreeLevel()+ "%"),
                        Restrictions.eq("university",majorUniversity.getUniversity()),
                        Restrictions.eq("major",majorUniversity.getMajor()),
                        Restrictions.like("degreeLevel",majorUniversity.getDegreeLevel()+ "%")));
                majorUniversitys = c.list();
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
        return majorUniversitys;
    }
}
