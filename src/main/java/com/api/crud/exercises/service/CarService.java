package com.api.crud.exercises.service;

import com.api.crud.exercises.exception.CarException;
import com.api.crud.exercises.repository.CarRepository;
import com.api.crud.exercises.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    Car car;
    @Autowired
    CarRepository carRepository;
    private List<Car> list = Arrays.asList(new Car(1, "Corsel", "Sport", 1997),
            new Car(2, "Mustang", "Sport", 2022),
            new Car(3, "Viper", "Sport", 1990),
            new Car(4, "Supra", "Sport", 2001),
            new Car(5, "Nissan Skyline", "Sport", 2007));

    public List<Car> showAllCars() throws CarException {
        if ( list == null){
            throw new CarException();
        }
        return list;
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


    public void updateCar(int id, Car car) throws CarException {

        if (id <= 0 ){
            throw new CarException();
        }
        Car cars;
        cars = list.get(id);
        cars.setId(car.getId());
        cars.setBrand(car.getBrand());
        cars.setModel(car.getModel());
        cars.setYear(car.getYear());
    }


    public void deleteCar(Long id) throws CarException {
        if (id <= 0.0){
            throw new CarException();
        }
        carRepository.deleteById(id);
    }

}
