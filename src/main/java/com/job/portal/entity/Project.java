package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PROJECT")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "PROJECT_NAME")
    @NotNull(message = "Project name must be assigned.")
    private String projectName;
    @Column(name = "PROJECT_REQUIREMENTS")
    @NotNull(message = "Project requirements must be assigned.")
    private String projectRequirements;
    @Column(name = "PROJECT_DETAILS")
    @NotNull(message = "Project details must be assigned.")
    private String projectDetails;

    public Project(String projectName, String projectRequirements, String projectDetails) {
        this.projectName = projectName;
        this.projectRequirements = projectRequirements;
        this.projectDetails = projectDetails;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectRequirements() {
        return projectRequirements;
    }

    public void setProjectRequirements(String projectRequirements) {
        this.projectRequirements = projectRequirements;
    }

    public String getProjectDetails() {
        return projectDetails;
    }

    public void setProjectDetails(String projectDetails) {
        this.projectDetails = projectDetails;
    }
}
