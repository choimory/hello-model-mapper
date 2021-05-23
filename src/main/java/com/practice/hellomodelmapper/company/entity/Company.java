package com.practice.hellomodelmapper.company.entity;

import com.practice.hellomodelmapper.company.type.BusinessType;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String name;
    @Column
    private String description;
    @Enumerated(EnumType.STRING)
    private BusinessType businessType;
    @Column
    private String address;
    @Column
    private LocalDateTime foundationDateTime;
}
