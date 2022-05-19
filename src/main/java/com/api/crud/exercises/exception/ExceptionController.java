package com.api.crud.exercises.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(CarException.class)
    public String optionNotFound(CarException carException){
        return String.format("Number or character invalid", carException.getId());
    }

}
