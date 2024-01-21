package org.springboot.guideservice.api;

import org.springboot.guideservice.dto.GuideDTO;
import org.springboot.guideservice.service.GuideService;
import org.springboot.guideservice.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/guide")
public class GuideController {
    @Autowired
    private GuideService service;

    @PostMapping
    public ResponseUtil saveGuide(@RequestBody GuideDTO guideDTO){
        service.addGuide(guideDTO);
        return new ResponseUtil("200","Successfully Added ","Guide:" +guideDTO);
    }
    @DeleteMapping(params="guideId")
    public ResponseUtil deleteGuide(String guideId){
        service.deleteGuide(guideId);
        return new ResponseUtil("200","Successfully Deleted ","Guide:" +guideId);
    }
    @PutMapping
    public ResponseUtil updateGuide(@RequestBody GuideDTO guideDTO){
        service.updateGuide(guideDTO);
        return new ResponseUtil("200","Successfully Updated ","Updated Guide Details:" +guideDTO);
    }
    @GetMapping
    public ResponseUtil getAllGuideList(){
        ArrayList<GuideDTO> allGuides = service.getAllGuides();
        return new ResponseUtil("200","Successfully Updated ","Updated Guide Details:" +allGuides);

    }
}
