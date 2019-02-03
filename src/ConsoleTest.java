
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
import daos.MiiInfoDAO;
import daos.QualificationDAO;
import daos.QualificationEmployeeDAO;
import daos.TrainingDAO;
import daos.UniversityDAO;
import daos.UserMiiDAO;
import daos.WorkAssignmentDAO;
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
import models.MiiInfo;
import models.Qualification;
import models.QualificationEmployee;
import models.Training;
import models.University;
import models.UserMii;
import models.WorkAssignment;
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
                MiiInfoDAO miiInfoDAO = new MiiInfoDAO(sessionFactory);
        MiiInfo miiInfo = new MiiInfo();
        QualificationDAO qualificationDAO = new QualificationDAO(sessionFactory);
        Qualification qualification = new Qualification();
        QualificationEmployeeDAO qualificationEmployeeDAO = new QualificationEmployeeDAO(sessionFactory);
        QualificationEmployee qualificationEmployee = new QualificationEmployee();
        TrainingDAO trainingDAO = new TrainingDAO(sessionFactory);
        Training training = new Training();
        UniversityDAO universityDAO = new UniversityDAO(sessionFactory);
        University university = new University();
        UserMiiDAO userMiiDAO = new UserMiiDAO(sessionFactory);
        UserMii userMii = new UserMii();
        WorkAssignmentDAO workAssignmentDAO = new WorkAssignmentDAO(sessionFactory);
        WorkAssignment workAssignment = new WorkAssignment();
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

//==================================Mii Info====================================
// insert and update
//        miiInfo.setId("");
//        miiInfo.setAddress("Sur");
//        miiInfo.setPhone("");
//        miiInfo.setEmail("");
//        System.out.println(miiInfoDAO.functions(miiInfo, 1));
// delete
//        System.out.println(miiInfoDAO.functions(miiInfo, 2));
// select
//        for (MiiInfo info : miiInfoDAO.functions(miiInfo, 3)) {
//            System.out.println(info.getId() + " - " + info.getAddress() + " - " + info.getPhone() + " - " + info.getEmail());
//        }
//==================================Mii Info====================================
//==================================User Mii====================================
// insert and update
//        userMii.setId("iduser01");
//        userMii.setPassword("");
//        userMii.setName("");
//        userMii.setEmail("");
//        userMii.setRole(new RoleMii("client"));
//        System.out.println(userMiiDAO.functions(userMii, 1));
// delete
//        System.out.println(userMiiDAO.functions(userMii, 2));
// select
//        for (UserMii user : userMiiDAO.functions(userMii, 3)) {
//            System.out.println(user.getId() + " - " + user.getName() + " - " + user.getEmail() + " - " + user.getRole().getName());
//        }
//==================================User Mii====================================
//===============================Qualification==================================
// insert and update
//        qualification.setId("idq001");
//        qualification.setName("");
//        qualification.setSpecialization("");
//        System.out.println(qualificationDAO.functions(qualification, 1));
// delete
//        System.out.println(qualificationDAO.functions(qualification, 2));
// select
//        for (Qualification q : qualificationDAO.functions(qualification, 3)) {
//            System.out.println(q.getId() + " - " + q.getName() + " - " + q.getSpecialization());
//        }
//===============================Qualification==================================
//=========================Qualification Employee===============================
// insert and update
//        qualificationEmployee.setId("idqe004");
//        qualificationEmployee.setEmployee(new Employee("iduser07"));
//        qualificationEmployee.setQualification(new Qualification("idq004"));
//        System.out.println(qualificationEmployeeDAO.functions(qualificationEmployee, 1));
// delete
//        System.out.println(qualificationEmployeeDAO.functions(qualificationEmployee, 2));
// select
//        for (QualificationEmployee qe : qualificationEmployeeDAO.functions(qualificationEmployee, 3)) {
//            System.out.println(qe.getId() + " - " + qe.getEmployee().getUserMii().getName() + " - " + qe.getQualification().getName());
//            System.out.println(qe.getId() + " - " + qe.getEmployee() + " - " + qe.getQualification().getName());
//        }
//=========================Qualification Employee===============================
//=================================Training=====================================
// insert and update
//        training.setId("idtrain006");
//        training.setName("traig");
//        training.setDescription("fdghas");
//        training.setCertificate("n");
//        training.setEmployee(new Employee("iduser07"));
//        System.out.println(trainingDAO.functions(training, 1));
// delete
//        System.out.println(trainingDAO.functions(training, 2));
// select
//        for (Training t : trainingDAO.functions(training, 3)) {
//            System.out.println(t.getId() + " - " + t.getName() + " - " + t.getDescription() + " - " + t.getCertificate() + " - " + t.getEmployee().getUserMii().getName());
//        }
//=================================Training=====================================
//=================================University===================================
// insert and update
//        university.setId("");
//        university.setName("");
//        System.out.println(universityDAO.functions(university, 1));
// delete
//        System.out.println(universityDAO.functions(university, 2));
// select
//        for (University u : universityDAO.functions(university, 3)) {
//            System.out.println(u.getId() + " - " + u.getName());
//        }
//=================================University===================================
//==============================Work Assignment=================================
// insert and update
//        workAssignment.setId("idwa001");
//        workAssignment.setStartDate(Date.from(Instant.now()));
//        workAssignment.setEndDate(Date.from(Instant.now()));
//        workAssignment.setPosition("");
//        workAssignment.setCompany("");
//        workAssignment.setJobDescription("");
//        workAssignment.setEmployee(new Employee("iduser02"));
//        System.out.println(workAssignmentDAO.functions(workAssignment, 1));
// delete
//        System.out.println(workAssignmentDAO.functions(workAssignment, 2));
// select
//        for (WorkAssignment wa : workAssignmentDAO.functions(workAssignment, 3)) {
//            System.out.println(wa.getId() + " - " + wa.getStartDate() + " - " + wa.getEndDate() + " - " + wa.getPosition() + " - " + wa.getCompany() + " - " + wa.getJobDescription() + " - " + wa.getEmployee().getUserMii().getName());
//      }
//==============================Work Assignment=================================
        sessionFactory.close();
//
    }
}
