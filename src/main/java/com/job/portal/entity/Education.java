package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "EDUCATION")
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "TITLE")
    @NotNull(message = "Title cannot be null.")
    private String title;
    @Column(name = "INSTITUTE_NAME")
    @NotNull(message = "Institute name cannot be null.")
    private String institute;
    @Column(name = "DEGREE")
    @NotNull(message = "Degree cannot be null.")
    private String degree;
    @Column(name = "PASSING_YEAR")
    @NotNull(message = "Passing year cannot be null.")
    private int passingYear;
    @Column(name = "GRADE")
    @NotNull(message = "Grade cannot be null.")
    private float grade;

    public Education(String title, String institute, String degree, int passingYear, float grade) {
        this.title = title;
        this.institute = institute;
        this.degree = degree;
        this.passingYear = passingYear;
        this.grade = grade;
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

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public int getPassingYear() {
        return passingYear;
    }

    public void setPassingYear(int passingYear) {
        this.passingYear = passingYear;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}
