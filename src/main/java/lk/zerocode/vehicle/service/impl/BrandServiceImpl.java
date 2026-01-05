package lk.zerocode.vehicle.service.impl;

import lk.zerocode.vehicle.controller.request.BrandRequest;
import lk.zerocode.vehicle.exception.BrandNotFoundException;
import lk.zerocode.vehicle.model.Brand;
import lk.zerocode.vehicle.repository.BrandRepository;
import lk.zerocode.vehicle.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

    @Override
    public Brand findById(Long id) throws BrandNotFoundException {

//       Optional<Brand> brandOptional = brandRepository.findById(id);
//
//       if(brandOptional.isPresent()){
//           Brand brand = brandOptional.get();
//
//           return brand;
//       }
//       else  {
//           throw new BrandNotFoundException("Brand not found");
//       }
       return brandRepository.findById(id).orElseThrow(
               ()->new BrandNotFoundException("Brand not found")
        );

    }


}
