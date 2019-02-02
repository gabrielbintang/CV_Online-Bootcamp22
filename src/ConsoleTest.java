
import daos.AchievementDAO;
import daos.CertificationDAO;
import daos.ClientDAO;
import daos.EducationDAO;
import daos.EmployeeDAO;
import daos.ProjectDAO;
import daos.RoleMiiDAO;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import models.Achievement;
import models.Certification;
import models.Client;
import models.Education;
import models.Employee;
import models.MajorUniversity;
import models.Project;
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
    public static void main(String[] args) throws ParseException {
        SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
        RoleMiiDAO roleMiiDAO = new RoleMiiDAO(sessionFactory);
        RoleMii rolemii = new RoleMii();
        AchievementDAO achievementDAO = new AchievementDAO(sessionFactory);
        Achievement achievement = new Achievement();
        CertificationDAO certificationDAO = new CertificationDAO(sessionFactory);
        Certification certification = new Certification();
        ClientDAO clientDAO = new ClientDAO(sessionFactory);
        Client client = new Client();
        EducationDAO educationDAO = new EducationDAO(sessionFactory);
        Education education = new Education();
        ProjectDAO projectDAO = new ProjectDAO(sessionFactory);
        Project project = new Project();
        EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);
        Employee employee = new Employee();

//=======================ROLE MII===============================================
        //Insert & Update        
//        rolemii.setId("idrole05");
//        rolemii.setName("Testing");
//        System.out.println(roleMiiDAO.functions(rolemii,1));
//Select
//        rolemii.setId("idrole02");
//        rolemii.setName("");
//        for (RoleMii role : roleMiiDAO.functions(rolemii, 3)) {
//            System.out.println(role.getId() + "-" + role.getName());
//        }
//Delete
//        rolemii.setId("idrole05");        
//        rolemii.setName("");
//        System.out.println(roleMiiDAO.functions(rolemii, 2));
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
//        certification.setId("");
//        certification.setName("");
//        certification.setExpiredDate(Date.from(Instant.now()));
//        certification.setDescription("");
//        certification.setEmployee(new Employee(""));
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
//        client.setId("");
//        client.setAddress("");
//        client.setBusiness("");
//        client.setIsDelete("");
//        System.out.println(clientDAO.functions(client, 2));
        //Select
//        client.setId("iduser05");
//        client.setAddress("Riau");
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
//        Delete
//        education.setId("");
//        education.setStartDate(Date.from(Instant.now()));
//        education.setEndDate(Date.from(Instant.now()));
//        education.setIp("");
//        education.setMajorUniversity(new MajorUniversity(""));
//        education.setEmployee(new Employee("iduser02"));
//        System.out.println(achievementDAO.functions(achievement, 2));
//
//        Select
//        education.setId("");
//        education.setStartDate(Date.from(Instant.now()));
//        education.setEndDate(Date.from(Instant.now()));
//        education.setIp("");
//        education.setMajorUniversity(new MajorUniversity(""));
//        education.setEmployee(new Employee("iduser02"));
//        for (Education e : educationDAO.functions(education, 3)) {
//            System.out.println(e.getId() + "-" + e.getMajorUniversity().getDegree());
//        }
//        Insert/update
//        project.setId("idpro007");
//        project.setName("BCA");
//        project.setAssessment("Bagus");
//        project.setStartDate(Date.from(Instant.now()));
//        project.setEndDate(Date.from(Instant.now()));
//        project.setProjectStatus("done");
//        project.setProjectSpecification("deskripsibla");
//        project.setClient(new Client("iduser05"));
//        projectDAO.functions(project, 1);
//==============================Education=======================================
//==============================Employee========================================
//        Delete
//        employee.setId("");
//        employee.setReligion("");
//        employee.setPhone("");
//        employee.setMaritalStatus("");
//        employee.setBirthDate(Date.from(Instant.now()));
//        employee.setStartDate(Date.from(Instant.now()));
//        employee.setEndDate(Date.from(Instant.now()));
//        employee.setIsDelete("");
//        employee.setPhoto("");
//        System.out.println(employeeDAO.functions(employee, 2));
//
//        Select
//        employee.setId("iduser02");
//        employee.setReligion("");
//        employee.setPhone("");
//        employee.setMaritalStatus("");
////        employee.setBirthDate(Date.from(Instant.now()));
////        employee.setStartDate(Date.from(Instant.now()));
////        employee.setEndDate(Date.from(Instant.now()));
//        employee.setIsDelete("");
////        employee.setPhoto("");
//        for (Employee e : employeeDAO.functions(employee, 3)) {
//            System.out.println(e.getId() + "-" + e.getMaritalStatus());
//        }
//        Insert/update
//        employee.setId("");
//        employee.setReligion("");
//        employee.setPhone("");
//        employee.setMaritalStatus("");
//        employee.setBirthDate(Date.from(Instant.now()));
//        employee.setStartDate(Date.from(Instant.now()));
//        employee.setEndDate(Date.from(Instant.now()));
//        employee.setIsDelete("");
//        employee.setPhoto("");
//        employeeDAO.functions(employee, 1);
//==============================Employee========================================
//=======================Project================================================
//        Delete
//        achievement.setId("idach007");
//        achievement.setName("");
//        achievement.setDescription("");
//        achievement.setEmployee(new Employee("iduser02"));
//        System.out.println(achievementDAO.functions(achievement, 2));
//        Select
//        project.setId("idpro001");
//        project.setName("");
//        for (Project p : projectDAO.functions(project, 3)) {
//            System.out.println(p.getId() + "-" + p.getName());
//        }
//        Insert/update
//        project.setId("idpro007");
//        project.setName("BCA");
//        project.setAssessment("Bagus");
//        project.setStartDate(Date.from(Instant.now()));
//        project.setEndDate(Date.from(Instant.now()));
//        project.setProjectStatus("done");
//        project.setProjectSpecification("deskripsibla");
//        project.setClient(new Client("iduser05"));
//        projectDAO.functions(project, 1);
//=======================Project============================================
        sessionFactory.close();
//
    }
}
