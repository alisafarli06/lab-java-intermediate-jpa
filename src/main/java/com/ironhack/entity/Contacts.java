package com.ironhack.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @AttributeOverrides({
        @AttributeOverride(name = "firstName", column = @Column(name = "first_name")),
        @AttributeOverride(name = "lastName", column = @Column(name = "last_name")),
        @AttributeOverride(name = "middleName", column = @Column(name = "middle_name")),
        @AttributeOverride(name = "salutation", column = @Column(name = "salutation"))
    })

    @Embedded
    private Name name;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String company;

    public Contacts(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
