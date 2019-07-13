package com.porollo.cars.util;

import com.porollo.cars.model.Car;
import com.porollo.cars.model.User;
import com.porollo.cars.repository.CarRepository;
import com.porollo.cars.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitialData implements ApplicationRunner {

    private final UserRepository userRepository;
    private final CarRepository carRepository;

    @Autowired
    public DatabaseInitialData(UserRepository userRepository, CarRepository carRepository) {
        this.userRepository = userRepository;
        this.carRepository = carRepository;
    }

    @Override
    public void run(ApplicationArguments args) {
        userRepository.deleteAll();
        userRepository.save(new User("d.porollo@gmail.com", "12345678", true, "12.07.2019"));
        carRepository.deleteAll();
        carRepository.save(new Car("Volvo", "S60", "Silver"));
    }
}
