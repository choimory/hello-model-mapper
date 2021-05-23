package com.practice.hellomodelmapper.company.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.practice.hellomodelmapper.company.type.BusinessType;
import com.practice.hellomodelmapper.employee.entity.Employee;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Enumerated(EnumType.STRING)
    private BusinessType businessType;
    @Column
    private String address;
    @Column
    private LocalDateTime foundationDateTime;
    @OneToMany(mappedBy = "company")
    @JsonBackReference
    private List<Employee> employees;
}
