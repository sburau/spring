package com.burau.scott.advice;

import com.burau.scott.annotations.AnotherController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice ( annotations = AnotherController.class )
public class AnotherControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<String> exception(Exception exception, WebRequest request) {
        return new ResponseEntity("AnotherControllerAdvice",HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
