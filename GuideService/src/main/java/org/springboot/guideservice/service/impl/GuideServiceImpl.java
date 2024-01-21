package org.springboot.guideservice.service.impl;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springboot.guideservice.dto.GuideDTO;
import org.springboot.guideservice.entity.GuideEntity;
import org.springboot.guideservice.repo.GuideRepo;
import org.springboot.guideservice.service.GuideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional

public class GuideServiceImpl implements GuideService {
    @Autowired
    GuideRepo repo;
    ModelMapper mapper;
    @Override
    public void addGuide(GuideDTO guideDTO) {
        if (repo.existsById(guideDTO.getGuideId())){
            throw new RuntimeException("Guide ID: "+guideDTO.getGuideId()+" is Exist!!");
        }else{
            repo.save(mapper.map(guideDTO, GuideEntity.class));
        }
    }

    @Override
    public void deleteGuide(String guideId) {
        if (!repo.existsById(guideId)){
            throw new RuntimeException("Guide ID: "+guideId+" is Not Exist!!");
        }else{
            repo.save(mapper.map(guideId, GuideEntity.class));
        }
    }

    @Override
    public void updateGuide(GuideDTO guideDTO) {
        if (!repo.existsById(guideDTO.getGuideId())){
            throw new RuntimeException("Guide ID: "+guideDTO.getGuideId()+" is Not Exist!!");
        }else{
            repo.save(mapper.map(guideDTO, GuideEntity.class));
        }
    }

    @Override
    public ArrayList<GuideDTO> getAllGuides() {
        List<GuideEntity> list = repo.findAll();
        return mapper.map(list,new TypeToken<ArrayList<GuideDTO>>(){}.getType());
    }
}
