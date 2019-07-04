package com.porollo.cars.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users_details")

public class UserDetails {

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private User user;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username; // UD
    private String name;//UD
    private String surname;//UD

    private UserDetails(){}

    public UserDetails (String username, String name, String surname) {
        this.username = username;
        this.name =  name;
        this.surname = surname;
    }
}