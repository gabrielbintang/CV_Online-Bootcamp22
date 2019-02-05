/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import daos.RoleMiiDAO;
import daos.UserMiiDAO;
import java.util.List;
import models.RoleMii;
import models.UserMii;
import org.hibernate.SessionFactory;

/**
 *
 * @author Dell
 */
public class LoginController {
    private UserMiiDAO umdao;
    private RoleMiiDAO rmdao;
    private Message message;

    public LoginController(SessionFactory sessionFactory) {
        umdao = new UserMiiDAO(sessionFactory);
        rmdao = new RoleMiiDAO(sessionFactory);
        message = new Message();
    }
    
    public String checkUser(UserMii userMii, RoleMii roleMii) {
               if (umdao.functions(userMii, 3) != null 
                && rmdao.functions(roleMii, 3) != null) {
                   message.getClass();
        } else {
                   System.out.println("Gagal Login");
        }
        return null;
    }

    
    
}
