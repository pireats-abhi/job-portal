package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "DESCRIPTION")
public class Description {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "DESCRIPTION_POINT")
    @NotNull(message = "Description cannot be null.")
    private String descriptionPoint;

    public Description(String descriptionPoint) {
        this.descriptionPoint = descriptionPoint;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescriptionPoint() {
        return descriptionPoint;
    }

    public void setDescriptionPoint(String descriptionPoint) {
        this.descriptionPoint = descriptionPoint;
    }
}
