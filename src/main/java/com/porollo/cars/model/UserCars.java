package com.porollo.cars.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users_cars")

public class UserCars {

    private @Id
    @GeneratedValue
    Long car_id;
    private String vendor;
    private String model;
    private String color;
    private String productionYear;

    private UserCars(){}

    public UserCars (String vendor, String model, String color, String productionYear) {
        this.vendor = vendor;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

/*    @OneToOne(mappedBy = "users_cars", cascade = CascadeType.ALL)
    private CarDetails carDetails;*/



}