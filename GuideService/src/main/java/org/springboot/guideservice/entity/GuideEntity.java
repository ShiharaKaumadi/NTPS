package org.springboot.guideservice.entity;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class GuideEntity {
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

    public GuideEntity(String guideId){
        this.guideId = guideId;
    }
}