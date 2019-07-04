package com.porollo.cars.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")

public class User {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String email;
    private String password;
    private boolean enable;
    private String recordCreated;

    public User(String email, String password, boolean enable, String recordCreated, UserDetails userDetails){}

    public User (String email, String password, boolean enable, String recordCreated) {
        this.email = email;
        this.password = password;
        this.enable = enable;
        this.recordCreated = recordCreated;
    }
/*    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private UserCars userCars;*/
}