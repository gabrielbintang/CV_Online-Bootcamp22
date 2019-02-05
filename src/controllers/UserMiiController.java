/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.UserMiiDAO;
import java.util.List;
import models.UserMii;
import org.hibernate.SessionFactory;

/**
 *
 * @author NINDA
 */
public class UserMiiController {

    private UserMiiDAO userMiiDAO;
    private SessionFactory sessionFactory;

    public UserMiiController(SessionFactory sessionFactory) {
        userMiiDAO = new UserMiiDAO(sessionFactory);
    }

    public List<UserMii> save(UserMii user) {
        return userMiiDAO.functions(user, 1);
    }

    public List<UserMii> search(UserMii user) {
        return userMiiDAO.functions(user, 3);
    }

    public List<UserMii> delete(UserMii user) {
        return userMiiDAO.functions(user, 2);
    }

}
