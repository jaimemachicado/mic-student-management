package com.jmachicado.studentmanagement.adapters.persistence.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "STUDENT")
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
