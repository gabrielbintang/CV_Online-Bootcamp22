/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Client;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rayhan
 */
public class ClientDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public ClientDAO() {
    }

    public ClientDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public List<Client> functions(Client client, int opt) {
        List<Client> clients = new ArrayList<Client>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(client);
            } else if (opt == 2) {
                session.delete(client);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Client.class);
                c.add(Restrictions.or(Restrictions.eq("id", client.getId()),
                        Restrictions.like("address", "%"+client.getAddress() + "%"),
                        Restrictions.like("business", "%"+client.getBusiness()+ "%"),
                        Restrictions.eq("isDelete", client.getIsDelete())));
                clients = c.list();
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
        return clients;
    }
}
