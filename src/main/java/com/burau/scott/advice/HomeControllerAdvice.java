package com.burau.scott.advice;

import com.burau.scott.annotations.HomeController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice ( annotations = HomeController.class )
public class HomeControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseEntity<String> exception(Exception exception, WebRequest request) {
        return new ResponseEntity("HomeControllerAdvice",HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
