/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Project;
import models.ProjectEmployee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class ProjectEmployeeDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public ProjectEmployeeDAO() {
    }

    public ProjectEmployeeDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<ProjectEmployee> functions(ProjectEmployee projectEmployee, int opt) {
        List<ProjectEmployee> projects = new ArrayList<ProjectEmployee>();
        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(projectEmployee);
            } else if (opt == 2) {
                session.delete(projectEmployee);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(ProjectEmployee.class);
                c.add(Restrictions.or(Restrictions.eq("id", projectEmployee.getId()),
                        Restrictions.eq("startDate",projectEmployee.getStartDate()),
                        Restrictions.eq("endDate",projectEmployee.getEndDate()),
                        Restrictions.like("projectEmployeeStatus", "%"+projectEmployee.getProjectEmployeeStatus() + "%"),
                        Restrictions.like("jobDescription", "%"+projectEmployee.getJobDescription()+ "%"),
                        Restrictions.like("employee", "%"+projectEmployee.getEmployee()+ "%"),
                        Restrictions.like("project", "%"+projectEmployee.getProject() + "%")));
                projects = c.list();
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
        return projects;
    }

}
