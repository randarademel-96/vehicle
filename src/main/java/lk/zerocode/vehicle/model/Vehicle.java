package lk.zerocode.vehicle.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String color;
    private Double engCapacity;


    @ManyToOne
    private Model model;

}
