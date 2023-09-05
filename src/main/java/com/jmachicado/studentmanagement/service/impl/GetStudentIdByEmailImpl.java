package com.jmachicado.studentmanagement.service.impl;

import com.jmachicado.studentmanagement.adapters.persistence.entities.Student;
import com.jmachicado.studentmanagement.adapters.persistence.repositories.StudentJpaRepository;
import com.jmachicado.studentmanagement.service.GetStudentIdByEmail;
import com.jmachicado.studentmanagement.service.mapper.StudentMapper;
import java.util.Objects;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetStudentIdByEmailImpl implements GetStudentIdByEmail {

  @Autowired
  private final StudentJpaRepository studentJpaRepository;

  @Autowired
  private final StudentMapper studentMapper;

  @Override
  public Integer getStudentIdByEmail(String email) {
    Student student = studentJpaRepository.findByEmail(email);
    return Objects.isNull(student)?null:student.getId();
  }
}
