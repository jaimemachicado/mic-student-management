package com.jmachicado.studentmanagement.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
