package com.jmachicado.studentmanagement.service;

import com.jmachicado.studentmanagement.domain.model.StudentDTO;

import java.util.List;

public interface GetAllStudentService {
    List<StudentDTO> getAllStudent();
}
