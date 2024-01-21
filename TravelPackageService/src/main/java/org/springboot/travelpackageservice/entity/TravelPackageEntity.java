package org.springboot.travelpackageservice.entity;

import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class TravelPackageEntity {
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
}
