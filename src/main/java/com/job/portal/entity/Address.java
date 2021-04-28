package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "HOUSE_NUMBER")
    @NotNull(message = "House number must be included.")
    private String houseNumber;
    @Column(name = "UPAZILA")
    @NotNull(message = "Upazila must be included.")
    private String upazila;
    @Column(name = "ZILA")
    @NotNull(message = "Zila must be included.")
    private String zila;

    public Address(String houseNumber, String upazila, String zila) {
        this.houseNumber = houseNumber;
        this.upazila = upazila;
        this.zila = zila;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    public String getZila() {
        return zila;
    }

    public void setZila(String zila) {
        this.zila = zila;
    }
}
