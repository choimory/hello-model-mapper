package com.practice.hellomodelmapper.employee.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.practice.hellomodelmapper.common.type.GenderType;
import com.practice.hellomodelmapper.company.entity.Company;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Enumerated
    private GenderType genderType;
    @Column
    private LocalDateTime birthDateTime;
    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    @JsonManagedReference
    private Company company;
}
