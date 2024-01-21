package org.springboot.hotelservice.repo;


import org.springboot.hotelservice.entity.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepo extends JpaRepository<HotelEntity,String> {
}
