package org.springboot.travelpackageservice.dto;

import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class TravelPackageDTO {
    private String packageID;
    private String packageCategory;
    private LocalDateTime travelDuration;
    private String travelArea;
    private int numberOfAdults;
    private int numberOfChildren18;
    private int totalHeadCount;
    private boolean petsAllowed;
    private double packageValue;
    private String userId;
    private String remarks;

    public TravelPackageDTO(String packageID){
        this.packageID = packageID;
    }
}
