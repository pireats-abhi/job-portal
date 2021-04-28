package com.job.portal.entity;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ADMIN")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;
    @Column(name = "USERNAME")
    @Size(min = 6, message = "Username must be at least 6 character.")
    @NotNull(message = "Username field cannot be null.")
    private String userName;
    @Column(name = "FIRST_NAME")
    @NotNull(message = "First name field cannot be null.")
    private String firstName;
    @Column(name = "LAST_NAME")
    @NotNull(message = "Last name field cannot be null.")
    private String lastName;
    @Column(name = "PHONE_NUMBER")
    @NotNull(message = "Phone number field cannot be null.")
    @Length(min = 11, max = 11, message = "Phone number should be exact 11 character.")
    private String phoneNumber;
    @Column(name = "EMAIL")
    @NotNull(message = "Email address field cannot be null.")
    @Email(message = "Must be a valid email address.")
    private String email;
    @Column(name = "PASSWORD")
    @NotNull
    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])(?=.*[a-z]).{8}$", message = "Must follow the pattern.")
    private String password;
    @Column(name = "IMAGE")
    @NotNull(message = "Please upload a profile picture.")
    private String image;

    public Admin(String userName, String firstName, String lastName,
                 String phoneNumber, String email, String password, String image) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.password = password;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
