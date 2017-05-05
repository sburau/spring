package com.burau.scott.controller;

import com.burau.scott.annotations.AnotherController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@AnotherController
@RequestMapping(value="/another")
public class Another {


    @RequestMapping(value="def")
    public ResponseEntity<String> home() throws Exception {
        throw new Exception("Another exception");
    }

}
