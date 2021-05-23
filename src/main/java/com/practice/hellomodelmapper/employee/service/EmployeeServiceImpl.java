package com.practice.hellomodelmapper.employee.service;

import com.practice.hellomodelmapper.employee.dto.EmployeeDto;
import com.practice.hellomodelmapper.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<EmployeeDto>> getEmployees(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<EmployeeDto> getEmployee(EmployeeDto param) {
        return null;
    }
}
