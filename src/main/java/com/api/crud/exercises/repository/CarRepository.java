package com.api.crud.exercises.repository;

import com.api.crud.exercises.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {

}
