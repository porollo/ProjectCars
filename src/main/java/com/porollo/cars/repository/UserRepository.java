package com.porollo.cars.repository;

import com.porollo.cars.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
