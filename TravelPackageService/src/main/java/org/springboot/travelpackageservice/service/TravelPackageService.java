package org.springboot.travelpackageservice.service;


import org.springboot.travelpackageservice.dto.TravelPackageDTO;

import java.util.ArrayList;

public interface TravelPackageService {
    void addTravelPackage(TravelPackageDTO travelPackageDTO);
    void deleteTravelPackage(String packageId);
    void updateTravelPackage(TravelPackageDTO travelPackageDTO);
    ArrayList<TravelPackageDTO> getAllTravelPackages();
}
