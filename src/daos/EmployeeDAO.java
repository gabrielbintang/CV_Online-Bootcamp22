/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rayhan
 */
public class EmployeeDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public EmployeeDAO() {
    }

    public EmployeeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Employee> functions(Employee employee, int opt) {
        List<Employee> employees = new ArrayList<Employee>();

        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(employee);
            } else if (opt == 2) {
                session.delete(employee);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Employee.class);
                c.add(Restrictions.or(Restrictions.eq("id", employee.getId()),
                        Restrictions.like("religion", "%"+employee.getReligion()+"%"),
                        Restrictions.like("phone", "%"+employee.getPhone()+"%"),
                        Restrictions.like("maritalStatus", "%"+employee.getMaritalStatus()+"%"),
                        Restrictions.like("nationality", "%"+employee.getNationality()+"%"),
                        Restrictions.like("birthDate", employee.getBirthDate()),
                        Restrictions.like("startDate", employee.getStartDate()),
                        Restrictions.like("endDate", employee.getEndDate()),
                        Restrictions.like("isDelete", employee.getIsDelete())));
//                        Restrictions.like("photo", employee.getPhoto())));
                employees = c.list();
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
        return employees;
    }
}
