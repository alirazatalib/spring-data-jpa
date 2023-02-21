package com.codextra.universitymanagement.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HomeController {
    @GetMapping("/all")
    public ResponseEntity<String> getAllStudents() {
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}
