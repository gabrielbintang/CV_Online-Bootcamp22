/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import java.util.ArrayList;
import java.util.List;
import models.Project;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dell
 */
public class ProjectDAO {

    private Session session;
    private Transaction trasaction;
    private SessionFactory sessionFactory;

    public ProjectDAO() {
    }

    public ProjectDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Project> functions(Project project, int opt) {
        List<Project> projects = new ArrayList<Project>();
        try {
            session = sessionFactory.openSession();
            trasaction = session.beginTransaction();
            if (opt == 1) {
                session.saveOrUpdate(project);
            } else if (opt == 2) {
                session.delete(project);
            } else if (opt == 3) {
                Criteria c = session.createCriteria(Project.class);
                c.add(Restrictions.or(Restrictions.eq("id", project.getId()),
                        Restrictions.like("name", "%"+project.getName() + "%"),
                        Restrictions.eq("startDate",project.getStartDate()),
                        Restrictions.eq("endDate",project.getEndDate()),
                        Restrictions.like("projectStatus", "%"+project.getProjectStatus() + "%"),
                        Restrictions.like("assessment", "%"+project.getAssessment() + "%"),
                        Restrictions.like("client", project.getClient()),
                        Restrictions.like("projectSpecification", "%"+project.getProjectSpecification() + "%")));
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
