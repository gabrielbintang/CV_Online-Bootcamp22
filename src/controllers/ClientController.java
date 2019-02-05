/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.ClientDAO;
import java.util.List;
import models.Client;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class ClientController {

    ClientDAO clientDAO;

    public ClientController() {
    }

    public ClientController(SessionFactory sessionFactory) {
        clientDAO = new ClientDAO(sessionFactory);
    }

    public List<Client> save(Client a) {
        return clientDAO.functions(a, 1);
    }

    public List<Client> search(Client a) {
        return clientDAO.functions(a, 3);
    }

    public List<Client> delete(Client a) {
        return clientDAO.functions(a, 2);
    }
}
