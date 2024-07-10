package com.travel.booking.services;

import com.travel.booking.models.Flight;
import com.travel.booking.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight bookFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
