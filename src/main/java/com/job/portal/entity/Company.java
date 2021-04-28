package com.job.portal.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "COMPANY")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "COMPANY_NAME")
    @NotNull(message = "Company name must be written.")
    private String companyName;
    @Column(name = "ADDRESS")
    @NotNull(message = "Address must be written")
    private Address address;
    @Column(name = "PHONE_NUMBER")
    @NotNull(message = "Phone number cannot be null.")
    @Size(min = 11, max = 11, message = "Phone number exactly 11 digit.")
    private String phoneNumber;
    @Column(name = "EMAIL")
    @NotNull(message = "Must have a email address.")
    @Email(message = "Use a valid email address.")
    private String email;
    @Column(name = "PASSWORD")
    @NotNull(message = "Password cannot be null.")
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$", message = "Password cannot be null.")
    private String password;
    @OneToMany
    @JoinTable(name = "COMPANY_CIRCULARS", joinColumns = @JoinColumn(name = "COMPANY_FK"),
            inverseJoinColumns = @JoinColumn(name = "CIRCULAR_FK"))
    private List<Circular> circulars;

    public Company(String companyName, Address address, String phoneNumber, String email,
                   String password, List<Circular> circulars) {
        this.companyName = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.circulars = circulars;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Circular> getCirculars() {
        return circulars;
    }

    public void setCirculars(List<Circular> circulars) {
        this.circulars = circulars;
    }
}
