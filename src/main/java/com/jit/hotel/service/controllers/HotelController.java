package com.jit.hotel.service.controllers;

import com.jit.hotel.service.entities.Hotel;
import com.jit.hotel.service.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    private HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    //to create a user
    @PostMapping
    public ResponseEntity<Hotel> crateHotel(@RequestBody Hotel hotel) {
        Hotel createdHotel = hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdHotel);
    }

    //to fetch a specific user
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId) {
        Hotel fetchedHotel = hotelService.getSpecificHotel(hotelId);
        return ResponseEntity.ok(fetchedHotel);
    }

    //to fetch all the users
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels() {
        List<Hotel> fetchedHotels = hotelService.getAllHotels();
        return ResponseEntity.ok(fetchedHotels);
    }
}
