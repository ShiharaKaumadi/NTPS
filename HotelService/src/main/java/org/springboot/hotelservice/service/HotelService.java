package org.springboot.hotelservice.service;


import org.springboot.hotelservice.dto.HotelDTO;

import java.util.ArrayList;

public interface HotelService {
    void addHotel(HotelDTO hotelDTO);
    void deleteHotel(String hotelId);
    void updateHotel(HotelDTO hotelDTO);
    ArrayList<HotelDTO> getAllHotels();
}