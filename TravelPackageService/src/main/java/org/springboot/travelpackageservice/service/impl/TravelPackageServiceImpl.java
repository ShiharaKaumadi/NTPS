package org.springboot.travelpackageservice.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springboot.travelpackageservice.dto.TravelPackageDTO;
import org.springboot.travelpackageservice.entity.TravelPackageEntity;
import org.springboot.travelpackageservice.repo.TravelPackageRepo;
import org.springboot.travelpackageservice.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class TravelPackageServiceImpl implements TravelPackageService {
    @Autowired
    TravelPackageRepo repo;
    ModelMapper mapper;
    @Override
    public void addTravelPackage(TravelPackageDTO travelPackageDTO) {
        if (repo.existsById(travelPackageDTO.getPackageID())){
            throw new RuntimeException("Travel Package ID: "+travelPackageDTO.getPackageID()+" is AlreadyExist!");
        }else{
            repo.save(mapper.map(travelPackageDTO, TravelPackageEntity.class));
        }
    }

    @Override
    public void deleteTravelPackage(String packageId) {
        if (!repo.existsById(packageId)){
            throw new RuntimeException("Travel Package ID: "+packageId+" is Not Exist!");
        }else{
            repo.delete(mapper.map(packageId, TravelPackageEntity.class));
        }
    }

    @Override
    public void updateTravelPackage(TravelPackageDTO travelPackageDTO) {
        if (!repo.existsById(travelPackageDTO.getPackageID())){
            throw new RuntimeException("Travel Package ID: "+travelPackageDTO.getPackageID()+" is Not Exist! Check Again!");
        }else{
            repo.save(mapper.map(travelPackageDTO, TravelPackageEntity.class));
        }
    }

    @Override
    public ArrayList<TravelPackageDTO> getAllTravelPackages() {
        List<TravelPackageEntity> list = repo.findAll();
        return mapper.map(list, new TypeToken<ArrayList<TravelPackageDTO>>(){}.getType());
    }
}
