package org.springboot.hotelservice.api;


import org.springboot.hotelservice.dto.HotelDTO;
import org.springboot.hotelservice.service.HotelService;
import org.springboot.hotelservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelService service;

    @PostMapping
    public ResponseUtil saveHotel(@RequestBody HotelDTO hotelDTO) {
        service.addHotel(hotelDTO);
        return new ResponseUtil("200", "Successfully Added ", "Hotel: " + hotelDTO);
    }

    @DeleteMapping(params = "hotelId")
    public ResponseUtil deleteHotel(String hotelId) {
        service.deleteHotel(hotelId);
        return new ResponseUtil("200", "Successfully Deleted ", "Hotel Details: " + hotelId);
    }

    @PutMapping
    public ResponseUtil updateHotelDetails(@RequestBody HotelDTO hotelDTO) {
        service.updateHotel(hotelDTO);

        return new ResponseUtil("200", "Successfully Updated ", "Updated Hotel Details: " + hotelDTO);
    }

    @GetMapping
    public ResponseUtil getAllHotelList() {
        ArrayList<HotelDTO> list = service.getAllHotels();
        return new ResponseUtil("200", "Successful ", "Get All Hotel Details: " + list);
    }
}
