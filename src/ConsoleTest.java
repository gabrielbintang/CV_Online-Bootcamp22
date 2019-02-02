
import daos.RoleMiiDAO;
import models.RoleMii;
import org.hibernate.SessionFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dell
 */
public class ConsoleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        RoleMiiDAO roleMiiDAO = new RoleMiiDAO(sessionFactory);
        RoleMii rolemii = new RoleMii();

//Delete
//        System.out.println(roleMiiDAO.functions(rolemii, 2));
//Select
        rolemii.setId("idrole02");
        rolemii.setName("");
        for (RoleMii role : roleMiiDAO.functions(rolemii, 3)) {
            System.out.println(role.getId() + "-" + role.getName());
//        }
        }

    }
}
