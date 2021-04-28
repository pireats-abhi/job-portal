package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CIRCULAR")
public class Circular {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "TITLE")
    @NotNull(message = "Title must be written.")
    private String title;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "CIRCULAR_DESCRIPTION", joinColumns = @JoinColumn(name = "CIRCULAR_FK"),
            inverseJoinColumns = @JoinColumn(name = "DESCRIPTION_FK"))
    private List<Description> descriptions;
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "CIRCULAR_REQUIREMENT", joinColumns = @JoinColumn(name = "CIRCULAR_FK"),
            inverseJoinColumns = @JoinColumn(name = "REQUIREMENT_FK"))
    private List<Requirement> requirements;
    @Column(name = "LAST_DATE_OF_SUBMISSION")
    @NotNull(message = "Last date of submission field must be included.")
    private Date lastDateOfSubmission;
    @ManyToOne
    @JoinColumn(name = "COMPANY_FK")
    private Company company;
    @ManyToMany
    private List<JobSeeker> applicants;

    public Circular(String title, List<Description> descriptions, List<Requirement> requirements,
                    Date lastDateOfSubmission, Company company, List<JobSeeker> applicants) {
        this.title = title;
        this.descriptions = descriptions;
        this.requirements = requirements;
        this.lastDateOfSubmission = lastDateOfSubmission;
        this.company = company;
        this.applicants = applicants;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Description> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<Requirement> requirements) {
        this.requirements = requirements;
    }

    public Date getLastDateOfSubmission() {
        return lastDateOfSubmission;
    }

    public void setLastDateOfSubmission(Date lastDateOfSubmission) {
        this.lastDateOfSubmission = lastDateOfSubmission;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<JobSeeker> getApplicants() {
        return applicants;
    }

    public void setApplicants(List<JobSeeker> applicants) {
        this.applicants = applicants;
    }
}
