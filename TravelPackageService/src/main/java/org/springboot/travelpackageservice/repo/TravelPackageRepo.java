package org.springboot.travelpackageservice.repo;


import org.springboot.travelpackageservice.entity.TravelPackageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelPackageRepo extends JpaRepository<TravelPackageEntity,String> {
}
