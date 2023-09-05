package com.jmachicado.studentmanagement.service.impl;

import com.jmachicado.studentmanagement.domain.model.StudentDTO;
import com.jmachicado.studentmanagement.adapters.persistence.repositories.StudentJpaRepository;
import com.jmachicado.studentmanagement.service.GetAllStudentService;
import com.jmachicado.studentmanagement.service.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class GetAllStudentServiceImpl implements GetAllStudentService {
    @Autowired
    private final StudentJpaRepository studentJpaRepository;

    @Autowired
    private final StudentMapper studentMapper;
    @Override
    public List<StudentDTO> getAllStudent() {
        return studentMapper.studentsToStudentDTOs(studentJpaRepository.findAll());
    }
}
