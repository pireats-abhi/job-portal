package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "JOB_SEEKER")
public class JobSeeker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "USERNAME")
    @NotNull(message = "Username must be included.")
    @Size(min = 6, message = "Username at least 6 character.")
    private String username;
    @Column(name = "PASSWORD")
    @NotNull(message = "Password cannot be null.")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$", message = "Password cannot be null.")
    private String password;
    @Column(name = "FIRST_NAME")
    @NotNull(message = "First name cannot be null.")
    private String firstName;
    @Column(name = "LAST_NAME")
    @NotNull(message = "Last name cannot be null.")
    private String lastName;
    @Column(name = "GENDER")
    @NotEmpty(message = "Gender cannot be empty.")
    private String gender;
    @Column(name = "BIRTH_DATE")
    @NotNull(message = "Birth date must be included.")
    private Date birthdate;
    @Column(name = "FATHERS_NAME")
    @NotNull(message = "Fathers name cannot be null.")
    private String fathersName;
    @Column(name = "MOTHERS_NAME")
    @NotNull(message = "Mothers name cannot be null.")
    private String mothersName;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ADDRESS_FK")
    private Address address;
    @Column(name = "OBJECTIVE")
    @NotNull(message = "Objective must be written.")
    private String objective;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "JOB_SEEKER_SKILLS", joinColumns = @JoinColumn(name = "JOB_SEEKER_FK"),
            inverseJoinColumns = @JoinColumn(name = "SKILLS_FK"))
    private List<Skill> skills;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "JOB_SEEKER_PROJECTS", joinColumns = @JoinColumn(name = "JOB_SEEKER_FK"),
            inverseJoinColumns = @JoinColumn(name = "PROJECTS_FK"))
    private List<Project> projects;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "JOB_SEEKER_EDUCATIONS", joinColumns = @JoinColumn(name = "JOB_SEEKER_FK"),
            inverseJoinColumns = @JoinColumn(name = "EDUCATIONS_FK"))
    private List<Education> educations;
    @ManyToMany
    @JoinTable(name = "JOB_SEEKER_APPLICATIONS", joinColumns = @JoinColumn(name = "JOB_SEEKER_FK"),
            inverseJoinColumns = @JoinColumn(name = "CIRCULAR_FK"))
    private List<Circular> applications;

    public JobSeeker(String username, String password, String firstName, String lastName,
                     String gender, Date birthdate, String fathersName, String mothersName,
                     Address address, String objective, List<Skill> skills, List<Project> projects,
                     List<Education> educations, List<Circular> applications) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.fathersName = fathersName;
        this.mothersName = mothersName;
        this.address = address;
        this.objective = objective;
        this.skills = skills;
        this.projects = projects;
        this.educations = educations;
        this.applications = applications;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Circular> getApplications() {
        return applications;
    }

    public void setApplications(List<Circular> applications) {
        this.applications = applications;
    }
}
