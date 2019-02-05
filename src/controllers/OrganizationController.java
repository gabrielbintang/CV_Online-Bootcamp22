/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.OrganizationDAO;
import java.util.List;
import models.Organization;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class OrganizationController {
    private OrganizationDAO organizationDAO;
        private SessionFactory sessionFactory;

    public OrganizationController(SessionFactory sessionFactory) {
        organizationDAO = new OrganizationDAO(sessionFactory);
    }
    
        public List<Organization> save(Organization org) {
        return organizationDAO.functions(org, 1);
    }

    public List<Organization> search(Organization org) {
        return organizationDAO.functions(org, 3);
    }

    public List<Organization> delete(Organization org) {
        return organizationDAO.functions(org, 2);
    }
    
}
