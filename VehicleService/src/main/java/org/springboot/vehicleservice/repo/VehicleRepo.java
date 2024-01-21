package org.springboot.vehicleservice.repo;


import org.springboot.vehicleservice.entity.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<VehicleEntity, String> {
}
