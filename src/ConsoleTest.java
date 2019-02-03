
import daos.AchievementDAO;
import daos.CertificationDAO;
import daos.ClientDAO;
import daos.EducationDAO;
import daos.EmployeeDAO;
import daos.ExperienceDAO;
//<<<<<<< Updated upstream
import daos.LanguageDAO;
//=======
import daos.LanguageEmployeeDAO;
import daos.MajorDAO;
import daos.MajorUniversityDAO;
import daos.OrganizationDAO;
//>>>>>>> Stashed changes
import daos.ProjectDAO;
import daos.ProjectEmployeeDAO;
import daos.RoleMiiDAO;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import models.Achievement;
import models.Certification;
import models.Client;
import models.Education;
import models.Employee;
import models.Experience;
import models.Language;
//<<<<<<< Updated upstream
//=======
import models.LanguageEmployee;
import models.Major;
//>>>>>>> Stashed changes
import models.MajorUniversity;
import models.Organization;
import models.Project;
import models.ProjectEmployee;
import models.RoleMii;
import models.University;
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
        ProjectEmployeeDAO projectEmployeeDAO = new ProjectEmployeeDAO(sessionFactory);
        ProjectEmployee projectEmployee = new ProjectEmployee();
        EmployeeDAO employeeDAO = new EmployeeDAO(sessionFactory);
        Employee employee = new Employee();
        ExperienceDAO experienceDAO = new ExperienceDAO(sessionFactory);
        Experience experience = new Experience();
//<<<<<<< Updated upstream
        LanguageDAO languageDAO = new LanguageDAO(sessionFactory);
        Language language = new Language();
//=======
        OrganizationDAO organizationDAO = new OrganizationDAO(sessionFactory);
        Organization organization = new Organization();
        MajorDAO majorDAO = new MajorDAO(sessionFactory);
        Major major = new Major();
        MajorUniversityDAO majorUniversityDAO = new MajorUniversityDAO(sessionFactory);
        MajorUniversity majorUniversity = new MajorUniversity();
        LanguageEmployeeDAO languageEmployeeDAO = new LanguageEmployeeDAO(sessionFactory);
        LanguageEmployee languageEmployee = new LanguageEmployee();
//>>>>>>> Stashed changes

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
//==============================Experience======================================
//        Delete
//        experience.setId("");
//        experience.setName("");
//        experience.setDescription("");
//        experience.setEmployee(new Employee(""));
//        System.out.println(experienceDAO.functions(experience, 2));
//
//        Select
//        experience.setId("");
//        experience.setName("a");
//        experience.setDescription("");
//        experience.setEmployee(new Employee(""));
//        for (Experience e : experienceDAO.functions(experience, 3)) {
//            System.out.println(e.getId() + "-" + e.getName());
//        }
//        Insert/update
//        experience.setId("");
//        experience.setName("a");
//        experience.setDescription("");
//        experience.setEmployee(new Employee(""));
//        experienceDAO.functions(experience, 1);
//==============================Experience======================================
//==============================Language========================================
//        Delete
//        language.setId("");
//        language.setName("");
//        System.out.println(languageDAO.functions(language, 2));
//
//        Select
//        language.setId("");
//        language.setName("a");
//        for (Language l : languageDAO.functions(language, 3)) {
//            System.out.println(l.getId() + "-" + l.getName());
//        }
//        Insert/update
//        language.setId("");
//        language.setName("");
//        languageDAO.functions(language, 1);
//==============================Language========================================
//=======================Project================================================
//        Delete
//        project.setId("idpro007");
//        project.setName("BCA");
//        project.setAssessment("Bagus");
//        project.setStartDate(Date.from(Instant.now()));
//        project.setEndDate(Date.from(Instant.now()));
//        project.setProjectStatus("done");
//        project.setProjectSpecification("deskripsibla");
//        project.setClient(new Client("iduser05"));
//        projectDAO.functions(project, 2);
//        Select
//       project.setId("idpro007");
//        project.setName("B");
//        project.setAssessment("B");
//        project.setStartDate(Date.from(Instant.now()));
//        project.setEndDate(Date.from(Instant.now()));
//        project.setProjectStatus("do");
//        project.setProjectSpecification("");
//        project.setClient(new Client("iduser05"));
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
//=======================ProjectEmployee================================================
//        Delete
//        projectEmployee.setId("idpe003");
//        projectEmployee.setStartDate(Date.from(Instant.now()));
//        projectEmployee.setEndDate(Date.from(Instant.now()));
//        projectEmployee.setProjectEmployeeStatus("do");
//        projectEmployee.setJobDescription("Project Manager");
//        projectEmployee.setEmployee(new Employee("iduser04"));
//        projectEmployee.setProject(new Project("idpro001"));
//        projectEmployeeDAO.functions(projectEmployee, 2);
//        Select
//        projectEmployee.setId("id");
//        projectEmployee.setStartDate(Date.from(Instant.now()));
//        projectEmployee.setEndDate(Date.from(Instant.now()));
//        projectEmployee.setProjectEmployeeStatus("do");
//        projectEmployee.setJobDescription("do");
//        projectEmployee.setEmployee(new Employee("iduser02"));
//        projectEmployee.setProject(new Project("idpro001"));
//        for (ProjectEmployee pe : projectEmployeeDAO.functions(projectEmployee, 3)) {
//            System.out.println(pe.getId() + "-" + pe.getJobDescription());
//        }
//        Insert/update
//        projectEmployee.setId("idpe003");
//        projectEmployee.setStartDate(Date.from(Instant.now()));
//        projectEmployee.setEndDate(Date.from(Instant.now()));
//        projectEmployee.setProjectEmployeeStatus("do");
//        projectEmployee.setJobDescription("Project Manager");
//        projectEmployee.setEmployee(new Employee("iduser04"));
//        projectEmployee.setProject(new Project("idpro001"));
//        projectEmployeeDAO.functions(projectEmployee, 1);
//=======================ProjectEmployee============================================
//=======================Organization================================================
//        Delete
//        organization.setId("idorg004");
//        organization.setName("MLI");
//        organization.setStartDate(Date.from(Instant.now()));
//        organization.setEndDate(Date.from(Instant.now()));
//        organization.setPosition("Penasehat");
//        organization.setEmployee(new Employee("iduser07"));
//        organizationDAO.functions(organization, 2);
//        Select
//        organization.setId("idorg003");
//        organization.setName("");
//        organization.setStartDate(Date.from(Instant.now()));
//        organization.setEndDate(Date.from(Instant.now()));
//        organization.setPosition("");
//        organization.setEmployee(new Employee("iduser02"));
//        for (Organization or : organizationDAO.functions(organization, 3)) {
//            System.out.println(or.getId() + "-" + or.getName());
//        }
//        Insert/update
//        organization.setId("idorg004");
//        organization.setName("MLI");
//        organization.setStartDate(Date.from(Instant.now()));
//        organization.setEndDate(Date.from(Instant.now()));
//        organization.setPosition("Penasehat");
//        organization.setEmployee(new Employee("iduser07"));
//        organizationDAO.functions(organization, 1);
//=======================Organization============================================
//=======================Major================================================
//        Delete
//        achievement.setId("idach007");
//        achievement.setName("");
//        achievement.setDescription("");
//        achievement.setEmployee(new Employee("iduser02"));
//        System.out.println(achievementDAO.functions(achievement, 2));
//        Select
//        major.setId("idmajor003");
//        major.setName("");
//        for (Major maj : majorDAO.functions(major, 3)) {
//            System.out.println(maj.getId() + "-" + maj.getName());
//        }
//        Insert/update
//        major.setId("idmajor006");
//        major.setName("Ilmu Komputer");
//        majorDAO.functions(major, 1);
        
//=======================Major============================================
//=======================MajorUniversity================================================
//        Delete
//        majorUniversity.setId("idmu006");
//        majorUniversity.setDegree("S.Ilkom");
//        majorUniversity.setDegreeLevel("S1/D4");
//        majorUniversity.setMajor(new Major("idmajor003"));
//        majorUniversity.setUniversity(new University("iduniv005"));
//        majorUniversityDAO.functions(majorUniversity, 2);
//        Select
//        majorUniversity.setId("idmajor003");
//        majorUniversity.setDegree("");
//        majorUniversity.setDegreeLevel("");
//        majorUniversity.setMajor(new Major("idmajor006"));
//        majorUniversity.setUniversity(new University("iduniv005"));
//        for (MajorUniversity maju : majorUniversityDAO.functions(majorUniversity, 3)) {
//            System.out.println(maju.getId() + "-" + maju.getDegree());
//        }
//        Insert/update
//        majorUniversity.setId("idmu006");
//        majorUniversity.setDegree("S.Ilkom");
//        majorUniversity.setDegreeLevel("S1/D4");
//        majorUniversity.setMajor(new Major("idmajor003"));
//        majorUniversity.setUniversity(new University("iduniv005"));
//        majorUniversityDAO.functions(majorUniversity, 1);
        
//=======================MajorUniversity============================================
//=======================LanguageEmployee================================================
//        Delete
//         languageEmployee.setId("idle04");
//        languageEmployee.setLanguage(new Language("idlang03"));
//        languageEmployee.setEmployee(new Employee("iduser02"));
//        languageEmployeeDAO.functions(languageEmployee, 2);
//        Select
//        languageEmployee.setId("idle01");
//        languageEmployee.setLanguage(new Language("idlang02"));
//        languageEmployee.setEmployee(new Employee("iduser04"));
//        for (LanguageEmployee le : languageEmployeeDAO.functions(languageEmployee, 3)) {
//            System.out.println(le.getId() + "-" + le.getEmployee());
//        }
//        Insert/update
//        languageEmployee.setId("idle04");
//        languageEmployee.setLanguage(new Language("idlang03"));
//        languageEmployee.setEmployee(new Employee("iduser02"));
//        languageEmployeeDAO.functions(languageEmployee, 1);
        
//=======================LanguageEmployee============================================
        sessionFactory.close();
//
    }
}
