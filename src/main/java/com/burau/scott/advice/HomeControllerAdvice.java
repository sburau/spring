package com.burau.scott.advice;

import com.burau.scott.exception.HomeException;
import com.burau.scott.exception.HomeRuntimeException;
import com.burau.scott.model.HomeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class HomeControllerAdvice {

    @ExceptionHandler({HomeRuntimeException.class,HomeException.class})
    @ResponseBody
    public ResponseEntity<String> exception(Exception exception, WebRequest request) {
        return new ResponseEntity(new HomeResponse("HomeControllerAdvice"),HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
