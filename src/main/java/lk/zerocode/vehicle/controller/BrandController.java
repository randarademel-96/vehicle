package lk.zerocode.vehicle.controller;

import lk.zerocode.vehicle.controller.request.BrandRequest;
import lk.zerocode.vehicle.controller.response.BrandResponse;
import lk.zerocode.vehicle.exception.BrandNotFoundException;
import lk.zerocode.vehicle.model.Brand;
import lk.zerocode.vehicle.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BrandController {

    @Autowired
    private BrandService brandService;

    @PostMapping(value ="/brands", headers = "X-Api-Version=v2")
    public void create(@RequestBody BrandRequest brandRequest){


        brandService.create(brandRequest);
    }

    @GetMapping(value = "/brands/{brand-id}",headers = "X-Api-Version=v2")
    public BrandResponse getById(@PathVariable("brand-id") Long id ) throws BrandNotFoundException {

        Brand brand = brandService.findById(id);
        BrandResponse brandResponse = new BrandResponse();
        brandResponse.setName(brand.getName());
        brandResponse.setId(brand.getId());

        return brandResponse;


    }



}
