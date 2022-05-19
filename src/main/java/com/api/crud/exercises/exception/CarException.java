package com.api.crud.exercises.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CarException extends Exception {

    private Integer id;


    public CarException(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
