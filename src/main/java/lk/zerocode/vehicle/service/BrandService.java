package lk.zerocode.vehicle.service;

import lk.zerocode.vehicle.controller.request.BrandRequest;
import lk.zerocode.vehicle.exception.BrandNotFoundException;
import lk.zerocode.vehicle.model.Brand;

public interface BrandService {

    void create(BrandRequest brandRequest);

    Brand findById(Long id) throws BrandNotFoundException;



}
