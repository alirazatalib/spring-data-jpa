package com.codextra.universitymanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand_name")
    private String brandName;
    @Column(name = "model")
    private Integer model;
    @Column(name = "item_number")
    private Integer itemNumber;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    public Laptop() {
    }

    public Laptop(String brandName, Integer model, Integer itemNumber) {
        this.brandName = brandName;
        this.model = model;
        this.itemNumber = itemNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public Integer getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(Integer itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
