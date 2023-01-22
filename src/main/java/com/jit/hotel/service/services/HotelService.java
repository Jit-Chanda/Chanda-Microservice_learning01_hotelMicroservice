package com.jit.hotel.service.services;

import com.jit.hotel.service.entities.Hotel;

import java.util.List;

public interface HotelService {

    //to create user
    Hotel createHotel(Hotel hotel);

    //to get all user
    List<Hotel> getAllHotels();

    //get single user by specific userId
    Hotel getSpecificHotel(String id);
}
