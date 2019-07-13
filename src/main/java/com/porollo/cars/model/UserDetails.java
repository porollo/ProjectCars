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

    private String username;
    private String name;
    private String surname;
    private String country;
    private String region;
    private String city;
    private Integer postalCode;
    private String cellPhone;

    private UserDetails(){}

    public UserDetails (String username, String name, String surname, String country, String region, String city, Integer postalCode, String cellPhone) {
        this.username = username;
        this.name =  name;
        this.surname = surname;
        this.country = country;
        this.region = region;
        this.city = city;
        this.postalCode = postalCode;
        this.cellPhone = cellPhone;
    }
}