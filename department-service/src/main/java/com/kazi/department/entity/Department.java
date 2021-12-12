package com.kazi.department.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "department_id_seq")
    @SequenceGenerator(name = "department_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
