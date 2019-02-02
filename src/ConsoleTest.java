
import daos.AchievementDAO;
import daos.CertificationDAO;
import daos.ClientDAO;
import daos.RoleMiiDAO;
import java.time.Instant;
import java.util.Date;
import models.Achievement;
import models.Certification;
import models.Client;
import models.Employee;
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
        AchievementDAO achievementDAO = new AchievementDAO(sessionFactory);
        Achievement achievement = new Achievement();
        CertificationDAO certificationDAO = new CertificationDAO(sessionFactory);
        Certification certification = new Certification();
        ClientDAO clientDAO = new ClientDAO(sessionFactory);
        Client client = new Client();

//        EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);
        Employee employee = new Employee();

//=======================ROLE MII===============================================
        //Delete
//        System.out.println(roleMiiDAO.functions(rolemii, 2));
        //Select
//        rolemii.setId("idrole02");
//        rolemii.setName("");
//        for (RoleMii role : roleMiiDAO.functions(rolemii, 3)) {
//            System.out.println(role.getId() + "-" + role.getName());
//        }
//=======================ROLE MII===============================================
//=======================Achievement============================================
        //Delete
//        achievement.setId("idach007");
//        achievement.setName("");
//        achievement.setDescription("");
//        achievement.setEmployee(new Employee("iduser02"));
//        System.out.println(achievementDAO.functions(achievement, 2));
        //Select
//        achievement.setId("idach001");
//        achievement.setName("a");
//        for (Achievement a : achievementDAO.functions(achievement, 3)) {
//            System.out.println(a.getId() + "-" + a.getName());
//        }
        //Insert/update
//        achievement.setId("idach007");
//        achievement.setName("Juara 3 TIMNAS");
//        achievement.setDescription("Juara");
//        achievement.setEmployee(new Employee("iduser02"));
//        achievementDAO.functions(achievement, 1);
//=======================Achievement============================================
//=======================Certification==========================================
        //Delete
//        System.out.println(certificationDAO.functions(certification, 2));
        //Select
//        certification.setId("idcer002");
//        certification.setName("CISCO");
//        for (Certification c : certificationDAO.functions(certification, 3)) {
//            System.out.println(c.getId() + "-" + c.getName());
//        }
        //Insert/update
//        certification.setId("idcer002");
//        certification.setName("CISCO");
//        certification.setExpiredDate(Date.from(Instant.now()));
//        certification.setDescription("CISCO Certification");
//        certification.setEmployee(new Employee("iduser02"));
//        certificationDAO.functions(certification, 1);
//=======================Certification==========================================
//==============================Client==========================================
        //Delete
//        System.out.println(clientDAO.functions(client, 2));
        //Select
//        client.setId("");
//        client.setAddress("a");
//        for (Client c : clientDAO.functions(client, 3)) {
//            System.out.println(c.getId() + "-" + c.getAddress());
//        }
        //Insert/update
//        client.setId("iduser05");
//        client.setAddress("Riau");
//        client.setBusiness("Oil and Gas");
//        client.setIsDelete("NO");
//
//        clientDAO.functions(client, 1);

//==============================Client==========================================
//==============================Education=======================================

//==============================Education=======================================
        sessionFactory.close();

    }
}
