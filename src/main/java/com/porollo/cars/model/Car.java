package com.porollo.cars.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "cars")

public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String vendor;
    private String model;
    private String color;

    public Car (){}

    public Car (String vendor, String model, String color) {
        this.vendor = vendor;
        this.model = model;
        this.color = color;
    }
/*    @OneToMany(mappedBy = "cars", cascade = CascadeType.ALL)
    private UserCars userCars;*/
}