package com.travel.booking.services;

import com.travel.booking.models.Hotel;
import com.travel.booking.repositories.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelService {
    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    public Hotel bookHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}
