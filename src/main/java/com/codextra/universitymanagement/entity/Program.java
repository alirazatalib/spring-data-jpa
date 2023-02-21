package com.codextra.universitymanagement.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "program")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "program_name")
    private String programName;
    @Column(name = "total_semesters")
    private Integer totalSemesters;
    @OneToMany(mappedBy = "program", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Course> courseList;

    public Program() {
    }

    public Program(String programName, Integer totalSemesters) {
        this.programName = programName;
        this.totalSemesters = totalSemesters;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Integer getTotalSemesters() {
        return totalSemesters;
    }

    public void setTotalSemesters(Integer totalSemesters) {
        this.totalSemesters = totalSemesters;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
