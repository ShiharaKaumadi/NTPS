package org.springboot.vehicleservice.service;


import org.springboot.vehicleservice.dto.VehicleDTO;

import java.util.ArrayList;

public interface VehicleService {
    void addVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String vehicleId);
    void updateVehicle(VehicleDTO vehicleDTO);
    ArrayList<VehicleDTO> getAllVehicles();
}
