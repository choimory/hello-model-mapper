package com.practice.hellomodelmapper.employee;

import com.practice.hellomodelmapper.employee.dto.EmployeeDto;
import com.practice.hellomodelmapper.employee.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping({"", "/"})
    public ResponseEntity<List<EmployeeDto>> getEmployees(Pageable pageable){
        return employeeService.getEmployees(pageable);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> getEmployee(@PathVariable Long id){
        return employeeService.getEmployee(EmployeeDto.builder()
                                                        .id(id)
                                                        .build());
    }
}
