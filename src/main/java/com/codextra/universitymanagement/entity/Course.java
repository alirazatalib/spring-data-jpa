package com.codextra.universitymanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "credit_hours")
    private Integer creditHours;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "program_id", referencedColumnName = "id")
    private Program program;

    public Course() {
    }

    public Course(String name, String code, Integer creditHours) {
        this.name = name;
        this.code = code;
        this.creditHours = creditHours;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Integer creditHours) {
        this.creditHours = creditHours;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
