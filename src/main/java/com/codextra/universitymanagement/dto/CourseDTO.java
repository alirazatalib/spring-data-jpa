package com.codextra.universitymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourseDTO implements Serializable {
    private String name;
    private String code;
    private Integer creditHours;
}
