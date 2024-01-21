package org.springboot.guideservice.service;


import org.springboot.guideservice.dto.GuideDTO;

import java.util.ArrayList;

public interface GuideService {
    void addGuide(GuideDTO guideDTO);
    void deleteGuide(String guideId);
    void updateGuide(GuideDTO guideDTO);
    ArrayList<GuideDTO> getAllGuides();
}