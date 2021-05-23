package com.practice.hellomodelmapper.company.service;

import com.practice.hellomodelmapper.company.dto.CompanyDto;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CompanyService {
    ResponseEntity<List<CompanyDto>> getCompanies(Pageable pageable);
    ResponseEntity<CompanyDto> getCompany(CompanyDto param);
}
