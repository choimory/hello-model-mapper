package com.practice.hellomodelmapper.company.service;

import com.practice.hellomodelmapper.company.dto.CompanyDto;
import com.practice.hellomodelmapper.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<CompanyDto>> getCompanies(Pageable pageable) {
        return null;
    }

    @Override
    public ResponseEntity<CompanyDto> getCompany(CompanyDto param) {
        return null;
    }
}
