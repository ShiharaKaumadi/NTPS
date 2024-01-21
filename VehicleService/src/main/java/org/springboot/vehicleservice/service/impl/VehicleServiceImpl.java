package org.springboot.vehicleservice.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springboot.vehicleservice.dto.VehicleDTO;
import org.springboot.vehicleservice.entity.VehicleEntity;
import org.springboot.vehicleservice.repo.VehicleRepo;
import org.springboot.vehicleservice.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class VehicleServiceImpl implements VehicleService {
    @Autowired
    private VehicleRepo repo;

    ModelMapper mapper;

    @Override
    public void addVehicle(VehicleDTO vehicleDTO) {
        if (repo.existsById(vehicleDTO.getVehicleId())){
            throw new RuntimeException("Vehicle ID: "+vehicleDTO.getVehicleId()+" is AlreadyExist!");
        }else{
            repo.save(mapper.map(vehicleDTO, VehicleEntity.class));
        }
    }

    @Override
    public void deleteVehicle(String vehicleId) {
        if (!repo.existsById(vehicleId)){
            throw new RuntimeException("Vehicle ID: "+vehicleId+" is Not Exist!");
        }else{
            repo.delete(mapper.map(vehicleId, VehicleEntity.class));
        }
    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {
        if (!repo.existsById(vehicleDTO.getVehicleId())){
            throw new RuntimeException("Vehicle ID: "+vehicleDTO.getVehicleId()+" is Not Exist! Please Check Vehicle ID");
        }else{
            repo.save(mapper.map(vehicleDTO, VehicleEntity.class));
        }
    }

    @Override
    public ArrayList<VehicleDTO> getAllVehicles() {
        List<VehicleEntity> list = repo.findAll();
        return mapper.map(list,new TypeToken<ArrayList<VehicleDTO>>(){}.getType());
    }
}
