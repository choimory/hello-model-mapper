package com.practice.hellomodelmapper.company;

import com.practice.hellomodelmapper.company.dto.CompanyDto;
import com.practice.hellomodelmapper.company.service.CompanyService;
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
@RequestMapping("/company")
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping({"", "/"})
    public ResponseEntity<List<CompanyDto>> getCompanies(Pageable pageable){
        return companyService.getCompanies(pageable);
    }

    @GetMapping({"/{id}"})
    public ResponseEntity<CompanyDto> getCompany(@PathVariable final Long id){
        return companyService.getCompany(CompanyDto.builder()
                                                    .id(id)
                                                    .build());
    }
}
