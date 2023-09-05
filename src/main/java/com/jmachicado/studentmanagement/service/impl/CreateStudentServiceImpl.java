package com.jmachicado.studentmanagement.service.impl;

import com.jmachicado.studentmanagement.adapters.persistence.entities.Student;
import com.jmachicado.studentmanagement.domain.model.StudentDTO;
import com.jmachicado.studentmanagement.adapters.persistence.repositories.StudentJpaRepository;
import com.jmachicado.studentmanagement.service.CreateStudentService;
import com.jmachicado.studentmanagement.service.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CreateStudentServiceImpl implements CreateStudentService {
    @Autowired
    private final StudentJpaRepository studentJpaRepository;

    @Autowired
    private final StudentMapper studentMapper;


    @Override
    public StudentDTO createStudent(StudentDTO studentDto){
        Student student = studentMapper.studentDTOToStudent(studentDto);
        studentJpaRepository.save(student);
        log.info("Student {} created",studentDto.getFirstName());
        return studentMapper.studentToStudentDTO(student);
    }
}
