/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author kresna92
 * @param <E>
 */
public class DAO<E> implements DAOInterface {

    private Session session;
    private Transaction transaction;

    public DAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    private SessionFactory sessionFactory;

    @Override
    public List<E> function(Object object, int t) {
        List<E> data = new ArrayList<E>();
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            if (t == 1) {
                session.saveOrUpdate(object);
            } else if (t == 2) {
                session.delete(object);
            } else if (t == 3) {
                data = session.
                        createQuery("from " + object.getClass()
                                .getName() + " order by id ").list();
            }
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return data;
    }

    @Override
    public E getById(Object object, String id) {
        E o = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            o = (E) session.createCriteria(object.getClass()).add(Restrictions.eq("id", id)).list().get(0);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return o;
    }

    @Override
    public E getMaxId(Object object) {
        E i = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            i = (E) session.createQuery("from "+object.getClass().getName()+" "
                    + "where id = (select max(id) from  "+object.getClass().
                            getName()+" ) ").list().get(0);
        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }
        } finally {
            session.close();
        }
        return i;
    }
}
