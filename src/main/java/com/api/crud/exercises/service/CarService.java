package com.api.crud.exercises.service;

import com.api.crud.exercises.exception.CarException;
import com.api.crud.exercises.repository.CarRepository;
import com.api.crud.exercises.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
    List<Car> car = new ArrayList<>();
    public List<Car> showAllCars() throws CarException {
        if (car == null){
            throw new CarException();
        }
        return car;
    }

    public Car findOneCar(Long id) throws CarException {

        if (id <= 0.0 ){
            throw new CarException();
        }
        return carRepository.findById(id).get();
    }
    public Car saveCar(Car car) throws CarException {
        if (car == null ){
            throw new CarException();
        }
        return carRepository.save(car);
    }

    public void deleteCar(Long id) throws CarException {
        if (id <= 0.0){
            throw new CarException();
        }
        carRepository.deleteById(id);
    }
}
