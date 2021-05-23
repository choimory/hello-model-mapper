package com.practice.hellomodelmapper.employee.dto;

import com.practice.hellomodelmapper.common.type.GenderType;
import com.practice.hellomodelmapper.company.dto.CompanyDto;
import com.practice.hellomodelmapper.company.entity.Company;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name;
    private GenderType genderType;
    private LocalDateTime birthDateTime;
    private CompanyDto company;
}
