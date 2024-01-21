package org.springboot.hotelservice.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springboot.hotelservice.dto.HotelDTO;
import org.springboot.hotelservice.entity.HotelEntity;
import org.springboot.hotelservice.repo.HotelRepo;
import org.springboot.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service

public class HotelServiceImpl implements HotelService {
    @Autowired
    HotelRepo repo;

    ModelMapper mapper;
    @Override
    public void addHotel(HotelDTO hotelDTO) {
        if(repo.existsById(hotelDTO.getHotelId())){
            throw new RuntimeException("Hotel ID: "+hotelDTO.getHotelId()+" is Already Registered!");
        }else {
            repo.save(mapper.map(hotelDTO, HotelEntity.class));
        }
    }

    @Override
    public void deleteHotel(String hotelId) {
        if (!repo.existsById(hotelId)){
            throw new RuntimeException("Cannot Find Hotel ID: "+hotelId);
        }else{
            repo.delete(mapper.map(hotelId, HotelEntity.class));
        }
    }

    @Override
    public void updateHotel(HotelDTO hotelDTO) {
        if(!repo.existsById(hotelDTO.getHotelId())){
            throw new RuntimeException("Hotel ID: "+hotelDTO.getHotelId()+" is Not Registered!");
        }else {
            repo.save(mapper.map(hotelDTO, HotelEntity.class));
        }
    }

    @Override
    public ArrayList<HotelDTO> getAllHotels() {
        List<HotelEntity> list = repo.findAll();
        return mapper.map(list, new TypeToken<ArrayList<HotelDTO>>(){}.getType());
    }
}
