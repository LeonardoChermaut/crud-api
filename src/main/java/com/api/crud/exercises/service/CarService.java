package com.api.crud.exercises.service;

import com.api.crud.exercises.repository.CarRepository;
import com.api.crud.exercises.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;
    public List<Car> showAllCars() {
        return carRepository.findAll();
    }
    public Car findOneCar(Long id){
        return carRepository.findById(id).get();
    }
    public Car saveCar(Car car){
        return carRepository.save(car);
    }

    public void deleteCar(Long id){
        carRepository.deleteById(id);
    }
}
