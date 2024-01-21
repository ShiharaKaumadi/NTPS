package org.springboot.hotelservice.entity;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class HotelEntity {
    private String hotelId;
    private String hotelName;
    private String hotelCategory;
    private String location;
    private String locationCoordinates;
    private String hotelHotline1;
    private String hotelHotLine2;
    private boolean isPetsAllowed;
    private double hotelFee;
    private String cancellationCriteria;
    private String remarks;

    public HotelEntity(String hotelId){
        this.hotelId =hotelId;
    }
}
