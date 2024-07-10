package com.travel.booking.controllers;

import com.travel.booking.models.Hotel;
import com.travel.booking.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping("/book")
    public Hotel bookHotel(@RequestBody Hotel hotel) {
        return hotelService.bookHotel(hotel);
    }
}
