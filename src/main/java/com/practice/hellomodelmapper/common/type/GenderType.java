package com.practice.hellomodelmapper.common.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderType {
    MALE("남성")
    , FEMALE("여성");

    private String value;
}
