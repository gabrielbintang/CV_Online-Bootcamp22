/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "EMPLOYEE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e")
    , @NamedQuery(name = "Employee.findById", query = "SELECT e FROM Employee e WHERE e.id = :id")
    , @NamedQuery(name = "Employee.findByReligion", query = "SELECT e FROM Employee e WHERE e.religion = :religion")
    , @NamedQuery(name = "Employee.findByPhone", query = "SELECT e FROM Employee e WHERE e.phone = :phone")
    , @NamedQuery(name = "Employee.findByMaritalStatus", query = "SELECT e FROM Employee e WHERE e.maritalStatus = :maritalStatus")
    , @NamedQuery(name = "Employee.findByNationality", query = "SELECT e FROM Employee e WHERE e.nationality = :nationality")
    , @NamedQuery(name = "Employee.findByBirthDate", query = "SELECT e FROM Employee e WHERE e.birthDate = :birthDate")
    , @NamedQuery(name = "Employee.findByStartDate", query = "SELECT e FROM Employee e WHERE e.startDate = :startDate")
    , @NamedQuery(name = "Employee.findByEndDate", query = "SELECT e FROM Employee e WHERE e.endDate = :endDate")
    , @NamedQuery(name = "Employee.findByIsDelete", query = "SELECT e FROM Employee e WHERE e.isDelete = :isDelete")})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Column(name = "RELIGION")
    private String religion;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private String phone;
    @Basic(optional = false)
    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;
    @Basic(optional = false)
    @Column(name = "NATIONALITY")
    private String nationality;
    @Basic(optional = false)
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Basic(optional = false)
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Basic(optional = false)
    @Column(name = "IS_DELETE")
    private String isDelete;
    @Lob
    @Column(name = "PHOTO")
    private Serializable photo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<LanguageEmployee> languageEmployeeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<WorkAssignment> workAssignmentCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<ProjectEmployee> projectEmployeeCollection;
    @JoinColumn(name = "ID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private UserMii userMii;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Certification> certificationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Education> educationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Training> trainingCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Organization> organizationCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Achievement> achievementCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<QualificationEmployee> qualificationEmployeeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Experience> experienceCollection;

    public Employee() {
    }

    public Employee(String id) {
        this.id = id;
    }

    public Employee(String id, String phone, String maritalStatus, String nationality, Date birthDate, Date startDate, String isDelete) {
        this.id = id;
        this.phone = phone;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.startDate = startDate;
        this.isDelete = isDelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public Serializable getPhoto() {
        return photo;
    }

    public void setPhoto(Serializable photo) {
        this.photo = photo;
    }

    @XmlTransient
    public Collection<LanguageEmployee> getLanguageEmployeeCollection() {
        return languageEmployeeCollection;
    }

    public void setLanguageEmployeeCollection(Collection<LanguageEmployee> languageEmployeeCollection) {
        this.languageEmployeeCollection = languageEmployeeCollection;
    }

    @XmlTransient
    public Collection<WorkAssignment> getWorkAssignmentCollection() {
        return workAssignmentCollection;
    }

    public void setWorkAssignmentCollection(Collection<WorkAssignment> workAssignmentCollection) {
        this.workAssignmentCollection = workAssignmentCollection;
    }

    @XmlTransient
    public Collection<ProjectEmployee> getProjectEmployeeCollection() {
        return projectEmployeeCollection;
    }

    public void setProjectEmployeeCollection(Collection<ProjectEmployee> projectEmployeeCollection) {
        this.projectEmployeeCollection = projectEmployeeCollection;
    }

    public UserMii getUserMii() {
        return userMii;
    }

    public void setUserMii(UserMii userMii) {
        this.userMii = userMii;
    }

    @XmlTransient
    public Collection<Certification> getCertificationCollection() {
        return certificationCollection;
    }

    public void setCertificationCollection(Collection<Certification> certificationCollection) {
        this.certificationCollection = certificationCollection;
    }

    @XmlTransient
    public Collection<Education> getEducationCollection() {
        return educationCollection;
    }

    public void setEducationCollection(Collection<Education> educationCollection) {
        this.educationCollection = educationCollection;
    }

    @XmlTransient
    public Collection<Training> getTrainingCollection() {
        return trainingCollection;
    }

    public void setTrainingCollection(Collection<Training> trainingCollection) {
        this.trainingCollection = trainingCollection;
    }

    @XmlTransient
    public Collection<Organization> getOrganizationCollection() {
        return organizationCollection;
    }

    public void setOrganizationCollection(Collection<Organization> organizationCollection) {
        this.organizationCollection = organizationCollection;
    }

    @XmlTransient
    public Collection<Achievement> getAchievementCollection() {
        return achievementCollection;
    }

    public void setAchievementCollection(Collection<Achievement> achievementCollection) {
        this.achievementCollection = achievementCollection;
    }

    @XmlTransient
    public Collection<QualificationEmployee> getQualificationEmployeeCollection() {
        return qualificationEmployeeCollection;
    }

    public void setQualificationEmployeeCollection(Collection<QualificationEmployee> qualificationEmployeeCollection) {
        this.qualificationEmployeeCollection = qualificationEmployeeCollection;
    }

    @XmlTransient
    public Collection<Experience> getExperienceCollection() {
        return experienceCollection;
    }

    public void setExperienceCollection(Collection<Experience> experienceCollection) {
        this.experienceCollection = experienceCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "models.Employee[ id=" + id + " ]";
    }
    
}
