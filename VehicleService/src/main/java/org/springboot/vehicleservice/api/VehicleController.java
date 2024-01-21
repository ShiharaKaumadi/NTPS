package org.springboot.vehicleservice.api;



import org.springboot.vehicleservice.dto.VehicleDTO;
import org.springboot.vehicleservice.service.VehicleService;
import org.springboot.vehicleservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    VehicleService service;

    @PostMapping
    public ResponseUtil saveVehicle(@RequestBody VehicleDTO vehicleDTO){
        service.addVehicle(vehicleDTO);
        return new ResponseUtil("200","Successfully Added ","Vehicle:" +vehicleDTO);
    }
    @DeleteMapping(params="vehicleId")
    public ResponseUtil deleteVehicleDetails(String vehicleId){
        service.deleteVehicle(vehicleId);
        return new ResponseUtil("200","Successfully Deleted ","Vehicle:" +vehicleId);
    }
    @PutMapping
    public ResponseUtil updateVehicleDetails(@RequestBody VehicleDTO vehicleDTO){
        service.updateVehicle(vehicleDTO);
        return new ResponseUtil("200","Successfully Updated ","Updated Vehicle Details:" +vehicleDTO);
    }
    @GetMapping
    public ResponseUtil getAllVehicleList(){
        ArrayList<VehicleDTO> list = service.getAllVehicles();
        return new ResponseUtil("200","Successful","List of Vehicle: "+list);
    }
}
