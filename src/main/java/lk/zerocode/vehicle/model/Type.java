package lk.zerocode.vehicle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    @OneToMany(mappedBy = "type")
    private List<Model>models;

}
