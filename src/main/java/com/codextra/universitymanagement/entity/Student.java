package com.codextra.universitymanagement.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "semester")
    private Integer semester;
    @Column(name = "registration_number")
    private String registrationNumber;
    @Column(name = "admission_date")
    private Date admissionDate;
    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private Laptop laptop;
    @ManyToMany(mappedBy = "studentList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Club> clubList;

    public Student() {
    }

    public Student(String name, String address, Integer semester, String registrationNumber, Date admissionDate) {
        this.name = name;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.admissionDate = admissionDate;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public List<Club> getClubList() {
        return clubList;
    }

    public void setClubList(List<Club> clubList) {
        this.clubList = clubList;
    }
}
