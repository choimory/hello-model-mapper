package com.practice.hellomodelmapper.company.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BusinessType {
    IT("IT")
    , CONSTRUCT("공업")
    , SERVICE("서비스업")
    , FINANCE("금융업");

    private String value;
}
