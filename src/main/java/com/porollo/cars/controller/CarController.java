package com.porollo.cars.controller;

import com.porollo.cars.model.Car;
import com.porollo.cars.repository.CarRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getUsers() {
        return (List<Car>) carRepository.findAll();
    }

    @PostMapping("/cars")
    void addUser(@RequestBody Car car) {
        carRepository.save(car);
    }
}
