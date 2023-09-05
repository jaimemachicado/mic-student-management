package com.jmachicado.studentmanagement.controller;

import com.jmachicado.openapi.api.StudentApi;
import com.jmachicado.openapi.model.StudentDto;
import com.jmachicado.studentmanagement.controller.mapper.StudentApiMapper;
import com.jmachicado.studentmanagement.domain.model.StudentDTO;
import com.jmachicado.studentmanagement.service.CreateStudentService;
import com.jmachicado.studentmanagement.service.GetAllStudentService;
import com.jmachicado.studentmanagement.service.GetStudentIdByEmail;
import com.jmachicado.studentmanagement.service.GetStudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController implements StudentApi {

  @Autowired
  private CreateStudentService createStudentService;

  @Autowired
  private GetAllStudentService getAllStudentService;

  @Autowired
  private GetStudentService getStudentService;

  @Autowired
  private GetStudentIdByEmail getStudentIdByEmail;
  @Autowired
  private StudentApiMapper studentApiMapper;

  @Override
  public ResponseEntity<StudentDto> createStudent(StudentDto studentDto) {
    StudentDTO studentDTO = createStudentService.createStudent(
        studentApiMapper.studentDtoToStudentDTO(studentDto));
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(studentApiMapper.studentDtoToStudentDTO(studentDTO));
  }

  @Override
  public ResponseEntity<List<StudentDto>> getAllStudent() {
    return ResponseEntity.status(HttpStatus.OK)
        .body(studentApiMapper.studentDTOsToStudentDtos(getAllStudentService.getAllStudent()));
  }

  @Override
  public ResponseEntity<Integer> getStudentIdByEmail(String email) {
    return ResponseEntity.ok(getStudentIdByEmail.getStudentIdByEmail(email));
  }


  @Override
  public ResponseEntity<StudentDto> getStudentInfo(String id) {
    return ResponseEntity.status(HttpStatus.OK).body(
        studentApiMapper.studentDtoToStudentDTO(getStudentService.getStudent(Integer.valueOf(id))));
  }
}
