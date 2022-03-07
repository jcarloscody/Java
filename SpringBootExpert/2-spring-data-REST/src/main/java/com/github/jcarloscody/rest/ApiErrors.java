package com.github.jcarloscody.rest;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;


public class ApiErrors {

    @Getter
    private List<String> errrors;


    public ApiErrors(String errrors) {
        this.errrors = Arrays.asList(errrors);
    }
}
