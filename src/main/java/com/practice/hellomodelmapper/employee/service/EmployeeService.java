package com.practice.hellomodelmapper.employee.service;

import com.practice.hellomodelmapper.employee.dto.EmployeeDto;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    ResponseEntity<List<EmployeeDto>> getEmployees(Pageable pageable);
    ResponseEntity<EmployeeDto> getEmployee(EmployeeDto param);
}
