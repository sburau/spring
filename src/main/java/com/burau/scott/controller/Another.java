package com.burau.scott.controller;

import com.burau.scott.annotations.AnotherAnnotation;
import com.burau.scott.exception.AnotherException;
import com.burau.scott.exception.AnotherRuntimeException;
import com.burau.scott.model.AnotherResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@AnotherAnnotation
@RequestMapping(value = "/another")
public class Another {

    @RequestMapping(value = "")
    public ResponseEntity<AnotherResponse> home() throws Exception {

        try {
            if (Math.random() % 2 == 0) {
                throw new RuntimeException("Another RuntimeException");
            } else {
                throw new Exception("Another Exception");
            }
        } catch (RuntimeException re) {
            throw new AnotherRuntimeException(re);
        } catch (Exception e) {
            throw new AnotherException(e);
        }

    }

}
