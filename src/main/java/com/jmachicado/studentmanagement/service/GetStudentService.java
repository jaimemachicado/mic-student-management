package com.jmachicado.studentmanagement.service;

import com.jmachicado.studentmanagement.domain.model.StudentDTO;

public interface GetStudentService {
    StudentDTO getStudent(Integer id);
}
