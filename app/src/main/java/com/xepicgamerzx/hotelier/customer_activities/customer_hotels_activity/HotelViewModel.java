package com.xepicgamerzx.hotelier.customer_activities.customer_hotels_activity;

import com.xepicgamerzx.hotelier.objects.hotel_objects.Hotel;

import java.io.Serializable;
import java.math.BigDecimal;

public class HotelViewModel implements Serializable {
    private String name;
    private String address;
    private BigDecimal priceRange;
    private int numberOfRooms;
    boolean isSelected = false;
    private Hotel hotel;
//    private String image;

    public HotelViewModel(String name, String address, BigDecimal priceRange, int numberOfRooms, Hotel hotel) {
        this.name = name;
        this.address = address;
        this.priceRange = priceRange;
        this.numberOfRooms = numberOfRooms;
        this.hotel = hotel;
    }


    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPriceRange() {
        return priceRange;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }
}