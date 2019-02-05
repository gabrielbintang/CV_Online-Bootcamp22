/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RoleMiiDAO;
import java.util.List;
import models.RoleMii;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class RoleMiiController {
    private RoleMiiDAO roleMiiDAO;
        private SessionFactory sessionFactory;

    public RoleMiiController(SessionFactory sessionFactory) {
        roleMiiDAO = new RoleMiiDAO(sessionFactory);
    }
    
            public List<RoleMii> save(RoleMii role) {
        return roleMiiDAO.functions(role, 1);
    }

    public List<RoleMii> search(RoleMii role) {
        return roleMiiDAO.functions(role, 3);
    }

    public List<RoleMii> delete(RoleMii role) {
        return roleMiiDAO.functions(role, 2);
    }
        
        
}
