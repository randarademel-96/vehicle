package lk.zerocode.vehicle.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "brand")
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;




    @OneToMany(mappedBy = "brand", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<Model>models;
}
