package com.practice.hellomodelmapper.employee.service;

import com.practice.hellomodelmapper.employee.dto.EmployeeDto;
import com.practice.hellomodelmapper.employee.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<EmployeeDto>> getEmployees(Pageable pageable) {
        return new ResponseEntity<>(employeeRepository.findAll(pageable)
                                                        .stream()
                                                        .map(Employee -> modelMapper.map(Employee, EmployeeDto.class))
                                                        .collect(Collectors.toList()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<EmployeeDto> getEmployee(EmployeeDto param) {
        return new ResponseEntity<>(modelMapper.map(employeeRepository.findById(param.getId())
                                                                        .orElse(null), EmployeeDto.class), HttpStatus.OK);
    }
}
