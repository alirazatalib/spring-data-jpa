package com.codextra.universitymanagement.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "club")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "members")
    private Long member;
    @Column(name = "description")
    private String description;
    @ManyToMany
    private List<Student> studentList;

    public Club() {
    }

    public Club(String name, Long member, String description) {
        this.name = name;
        this.member = member;
        this.description = description;
    }
}
