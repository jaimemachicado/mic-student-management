package com.jmachicado.studentmanagement.service.mapper;
import com.jmachicado.studentmanagement.adapters.persistence.entities.Student;
import com.jmachicado.studentmanagement.domain.model.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email")
    })
    StudentDTO studentToStudentDTO(Student student);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email")
    })
    Student studentDTOToStudent(StudentDTO studentDTO);

    List<StudentDTO> studentsToStudentDTOs(List<Student> students);
}
