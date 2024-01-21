package org.springboot.guideservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class GuideDTO {
    private String guideId;
    private String name;
    private String address;
    private int age;
    private String gender;
    private String contactNumber;
    private String nic;
    private int experienceYears;
    private double manDayValue;
    private String remarks;

    public GuideDTO(String guideId){
        this.guideId = guideId;
    }
}