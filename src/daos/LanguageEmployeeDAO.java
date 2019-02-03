/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.LanguageEmployee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class LanguageEmployeeDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public LanguageEmployeeDAO() {
    }

    public LanguageEmployeeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    public List<LanguageEmployee> functions(LanguageEmployee languageEmployee, int opt) {
        List<LanguageEmployee> languageEmployees = new ArrayList<LanguageEmployee>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(languageEmployee);
            } else if (opt == 2) {
                session.delete(languageEmployee);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(LanguageEmployee.class);
                c.add(Restrictions.or(Restrictions.eq("id", languageEmployee.getId()),
                        Restrictions.eq("employee",languageEmployee.getEmployee()),
                        Restrictions.eq("language", languageEmployee.getLanguage())));
                languageEmployees = c.list();
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
        return languageEmployees;
    }
}
