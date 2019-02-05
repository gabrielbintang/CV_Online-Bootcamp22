/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.LanguageEmployeeDAO;
import java.util.List;
import models.LanguageEmployee;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class LanguageEmployeeController {
    LanguageEmployeeDAO languageEmployeeDAO;

    public LanguageEmployeeController() {
    }

    public LanguageEmployeeController(SessionFactory sessionFactory) {
        languageEmployeeDAO = new LanguageEmployeeDAO(sessionFactory);
    }

    public List<LanguageEmployee> save(LanguageEmployee a) {
        return languageEmployeeDAO.functions(a, 1);
    }

    public List<LanguageEmployee> search(LanguageEmployee a) {
        return languageEmployeeDAO.functions(a, 3);
    }

    public List<LanguageEmployee> delete(LanguageEmployee a) {
        return languageEmployeeDAO.functions(a, 2);
    }
}
