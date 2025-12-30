package lk.zerocode.vehicle.repository;

import lk.zerocode.vehicle.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
