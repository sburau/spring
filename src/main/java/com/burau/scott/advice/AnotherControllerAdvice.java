package com.burau.scott.advice;

import com.burau.scott.exception.AnotherException;
import com.burau.scott.exception.AnotherRuntimeException;
import com.burau.scott.model.AnotherResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class AnotherControllerAdvice {

    @ExceptionHandler({AnotherRuntimeException.class, AnotherException.class})
    @ResponseBody
    public ResponseEntity<String> exception(Exception exception, WebRequest request) {
        return new ResponseEntity(new AnotherResponse("AnotherControllerAdvice"),HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
