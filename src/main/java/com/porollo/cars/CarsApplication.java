package com.porollo.cars;

import com.porollo.cars.model.User;
import com.porollo.cars.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarsApplication.class, args);
    }
    /*@Bean
    CommandLineRunner init(UserRepository userRepository) {
        return args -> {
            Stream.of("d.porollo@gmail.com", "julie@domain.com", "jennifer@gmail.com").forEach(email -> {
                User user = new User(email);
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }*/
}
