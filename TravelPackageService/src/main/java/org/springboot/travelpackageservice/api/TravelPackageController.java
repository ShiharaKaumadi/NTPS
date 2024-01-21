package org.springboot.travelpackageservice.api;

import org.springboot.travelpackageservice.dto.TravelPackageDTO;
import org.springboot.travelpackageservice.service.TravelPackageService;
import org.springboot.travelpackageservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/travel-package")
public class TravelPackageController {
    @Autowired
    TravelPackageService service;
    @PostMapping
    public ResponseUtil saveTravelPackage(@RequestBody TravelPackageDTO travelPackageDTO){
        service.addTravelPackage(travelPackageDTO);
        return new ResponseUtil("200","Successfully Added ","Travel Package: " +travelPackageDTO);
    }
    @DeleteMapping(params="packageId")
    public ResponseUtil deleteTravelPackage(String packageId){
        service.deleteTravelPackage(packageId);
        return new ResponseUtil("200","Successfully Deleted ","Travel Package: " +packageId);
    }
    @PutMapping
    public ResponseUtil updateTravelPackage(@RequestBody TravelPackageDTO travelPackageDTO){
        service.updateTravelPackage(travelPackageDTO);
        return new ResponseUtil("200","Successfully Updated ","Updated Travel Package Details:" +travelPackageDTO);
    }
    @GetMapping
    public ResponseUtil getAllTravelPackageList(){
        ArrayList<TravelPackageDTO> list = service.getAllTravelPackages();
        return new ResponseUtil("200","Successful ","List of Travel Package Details:" +list);

    }
}
