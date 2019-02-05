/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.CertificationDAO;
import java.util.List;
import models.Certification;
import org.hibernate.SessionFactory;

/**
 *
 * @author Rayhan
 */
public class CertificationController {

    CertificationDAO certificationDAO;

    public CertificationController() {
    }

    public CertificationController(SessionFactory sessionFactory) {
        certificationDAO = new CertificationDAO(sessionFactory);
    }

    public List<Certification> save(Certification a) {
        return certificationDAO.functions(a, 1);
    }

    public List<Certification> search(Certification a) {
        return certificationDAO.functions(a, 3);
    }

    public List<Certification> delete(Certification a) {
        return certificationDAO.functions(a, 2);
    }
}
