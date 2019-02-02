
import daos.AchievementDAO;
import daos.CertificationDAO;
import daos.RoleMiiDAO;
import java.time.Instant;
import java.util.Date;
import models.Achievement;
import models.Certification;
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
        certification.setId("idcer002");
        certification.setName("CISCOO");
        certification.setExpiredDate(Date.from(Instant.now()));
        certification.setDescription("CISCOOoo");
        certification.setEmployee(new Employee("iduser02"));
        certificationDAO.functions(certification, 1);
//=======================Certification==========================================
//==============================Client==========================================


//==============================Client==========================================
        sessionFactory.close();

    }
}
