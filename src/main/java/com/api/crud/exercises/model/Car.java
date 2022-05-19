package com.api.crud.exercises.model;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String brand;
    private String model;
    private int year;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
