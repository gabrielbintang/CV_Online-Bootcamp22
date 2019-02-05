/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.LanguageDAO;
import java.util.List;
import models.Language;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class LanguageController {

    LanguageDAO languageDAO;

    public LanguageController() {
    }

    public LanguageController(SessionFactory sessionFactory) {
        languageDAO = new LanguageDAO(sessionFactory);
    }

    public List<Language> save(Language a) {
        return languageDAO.functions(a, 1);
    }

    public List<Language> search(Language a) {
        return languageDAO.functions(a, 3);
    }

    public List<Language> delete(Language a) {
        return languageDAO.functions(a, 2);
    }
}
