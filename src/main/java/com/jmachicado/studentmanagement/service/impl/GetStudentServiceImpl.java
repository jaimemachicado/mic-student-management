package com.jmachicado.studentmanagement.service.impl;

import com.jmachicado.studentmanagement.adapters.persistence.entities.Student;
import com.jmachicado.studentmanagement.domain.model.StudentDTO;
import com.jmachicado.studentmanagement.adapters.persistence.repositories.StudentJpaRepository;
import com.jmachicado.studentmanagement.service.GetStudentService;
import com.jmachicado.studentmanagement.service.exceptions.StudentNotFoundException;
import com.jmachicado.studentmanagement.service.mapper.StudentMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class GetStudentServiceImpl implements GetStudentService {
    @Autowired
    private final StudentJpaRepository studentJpaRepository;

    @Autowired
    private final StudentMapper studentMapper;
    @Override
    public StudentDTO getStudent(Integer id) {
        Optional<Student> optionalStudent = studentJpaRepository.findById(id);

        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            return studentMapper.studentToStudentDTO(student);
        } else {
            throw new StudentNotFoundException("User not found with id " + id);
        }
    }
}
