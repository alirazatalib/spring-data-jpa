package com.codextra.universitymanagement.repository;

import com.codextra.universitymanagement.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}