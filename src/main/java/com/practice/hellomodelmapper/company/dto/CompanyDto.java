package com.practice.hellomodelmapper.company.dto;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto {
    private Long id;
    private String name;
    private String description;
    private String businessType;
    private String address;
    private LocalDateTime foundationDateTime;
}
