package lk.zerocode.vehicle.service.impl;

import lk.zerocode.vehicle.controller.request.BrandRequest;
import lk.zerocode.vehicle.model.Brand;
import lk.zerocode.vehicle.repository.BrandRepository;
import lk.zerocode.vehicle.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public void create(BrandRequest brandRequest) {
        Brand brand = new Brand();
        brand.setName(brandRequest.getName());

        brandRepository.save(brand);
    }
}
