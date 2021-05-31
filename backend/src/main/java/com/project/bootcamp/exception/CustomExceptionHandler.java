package com.project.bootcamp.exception;


import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import org.springframework.web.servlet.mvc.method.annotation.*;

@ControllerAdvice
public class CustomExceptionHandler extends  ResponseEntityExceptionHandler {
    @ExceptionHandler(BusinessException.class)
    protected ResponseEntity<ExceptionResponse> handlerBusiness(BusinessException exception) {
        return  ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(ExceptionResponse.builder().message(exception.getMessage()).build());
    }

    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<ExceptionResponse> handlerNotFound(NotFoundException exception) {
        return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(ExceptionResponse.builder().message(exception.getMessage()).build());
    }
}
