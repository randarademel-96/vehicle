package lk.zerocode.vehicle.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor
public class BrandRequest {

    private Long id;
    private String name;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
