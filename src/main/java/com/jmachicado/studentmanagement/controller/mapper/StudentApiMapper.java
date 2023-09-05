package com.jmachicado.studentmanagement.controller.mapper;

import com.jmachicado.openapi.model.StudentDto;
import com.jmachicado.studentmanagement.domain.model.StudentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentApiMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email")
    })
    StudentDTO studentDtoToStudentDTO(StudentDto student);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "email", target = "email")
    })
    StudentDto studentDtoToStudentDTO(StudentDTO student);
    List<StudentDto> studentDTOsToStudentDtos(List<StudentDTO> studentDTOs);
}
