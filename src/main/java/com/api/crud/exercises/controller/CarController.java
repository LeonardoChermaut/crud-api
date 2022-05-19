package com.api.crud.exercises.controller;

import com.api.crud.exercises.exception.CarException;
import com.api.crud.exercises.model.Car;
import com.api.crud.exercises.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public List<Car> getAllCars() throws CarException {
        return carService.showAllCars();
    }

    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id) throws CarException {
        return carService.findOneCar(id);
    }

    @PostMapping ("/cars")
    public Car saveCar(@RequestBody Car car) throws CarException {
        return carService.saveCar(car);
    }

    @DeleteMapping("/car/{id}")
    public void deleteCar(@PathVariable Long id) throws CarException {
        carService.deleteCar(id);
    }
}
