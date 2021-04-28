package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "REQUIREMENT")
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "REQUIREMENT_POINT")
    @NotNull(message = "Requirement cannot be null.")
    private String requirementPoint;

    public Requirement(String requirementPoint) {
        this.requirementPoint = requirementPoint;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRequirementPoint() {
        return requirementPoint;
    }

    public void setRequirementPoint(String requirementPoint) {
        this.requirementPoint = requirementPoint;
    }
}
