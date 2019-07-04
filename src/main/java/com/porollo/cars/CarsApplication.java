package com.porollo.cars;

import com.porollo.cars.model.User;
import com.porollo.cars.model.UserDetails;
import com.porollo.cars.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsApplication {



    public static void main(String[] args) {
        SpringApplication.run(CarsApplication.class, args);
    }


}
