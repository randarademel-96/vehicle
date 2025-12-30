package lk.zerocode.vehicle.controller;

import lk.zerocode.vehicle.controller.request.BrandRequest;
import lk.zerocode.vehicle.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping(value ="/brands", headers = "X-Api-Version=v2")
    public void create(@RequestBody BrandRequest brandRequest){


        brandService.create(brandRequest);
    }


}
