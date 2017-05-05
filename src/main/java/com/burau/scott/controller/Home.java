package com.burau.scott.controller;

import com.burau.scott.annotations.HomeController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@HomeController
@RequestMapping(value="/home")
public class Home {

    @RequestMapping(value="abc")
    public ResponseEntity<String> home() throws Exception {
        throw new Exception("Home exception");
    }


}
