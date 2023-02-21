package com.codextra.universitymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentDTO implements Serializable {
    private String name;
    private String address;
    private Integer semester;
    private String registrationNumber;
    private Date admissionDate;
}
