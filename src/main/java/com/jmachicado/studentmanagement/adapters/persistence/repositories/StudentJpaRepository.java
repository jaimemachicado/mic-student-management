package com.jmachicado.studentmanagement.adapters.persistence.repositories;

import com.jmachicado.studentmanagement.adapters.persistence.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentJpaRepository extends JpaRepository<Student, Integer> {
  Student findByEmail(String email);
}
