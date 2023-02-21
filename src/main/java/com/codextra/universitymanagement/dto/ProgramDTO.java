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
public class ProgramDTO implements Serializable {
    private String programName;
    private Integer totalSemesters;
}
