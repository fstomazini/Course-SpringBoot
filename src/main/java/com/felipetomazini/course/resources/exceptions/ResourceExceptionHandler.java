package com.felipetomazini.course.resources.exceptions;


import com.felipetomazini.course.service.exception.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;


@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
        String strError = "Resource not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(Instant.now(), status.value(), strError, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(error);

    }
}
