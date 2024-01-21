package org.springboot.vehicleservice.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class VehicleEntity {
    private String vehicleId;
    private String brand;
    private String category;
    private String fuelType;
    private boolean hybrid;
    private double fuelUsagePerKm;
    private int seatCapacity;
    private String vehicleType;
    private String transmissionType;
    private String driverName;
    private String contactNumber;
    private String licence;
    private String remarks;
}
