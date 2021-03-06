package com.practice.hellomodelmapper.company.service;

import com.practice.hellomodelmapper.company.dto.CompanyDto;
import com.practice.hellomodelmapper.company.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepository companyRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<CompanyDto>> getCompanies(Pageable pageable) {
        return new ResponseEntity<>(companyRepository.findAll(pageable)
                                                    .stream()
                                                    .map(Company->modelMapper.map(Company, CompanyDto.class))
                                                    .collect(Collectors.toList()), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<CompanyDto> getCompany(CompanyDto param) {
        return new ResponseEntity<>(modelMapper.map(companyRepository.findById(param.getId())
                                                                    .orElse(null), CompanyDto.class), HttpStatus.OK);
    }
}
