package lk.zerocode.vehicle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private Type type;

    @OneToMany(mappedBy = "model")
    private List<Vehicle>vehicles;
}
