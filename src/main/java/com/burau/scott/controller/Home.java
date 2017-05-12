package com.burau.scott.controller;

import com.burau.scott.annotations.HomeAnnotation;
import com.burau.scott.exception.HomeException;
import com.burau.scott.exception.HomeRuntimeException;
import com.burau.scott.model.HomeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@HomeAnnotation
@RequestMapping(value="/home")
public class Home {

    @RequestMapping(value="")
    public ResponseEntity<HomeResponse> home() throws Exception {

        try {
            if (Math.random() % 2 == 0) {
                throw new RuntimeException("Home RuntimeException");
            } else {
                throw new Exception("Home Exception");
            }
        } catch (RuntimeException re) {
            throw new HomeRuntimeException(re);
        } catch (Exception e) {
            throw new HomeException(e);
        }
    }

}
