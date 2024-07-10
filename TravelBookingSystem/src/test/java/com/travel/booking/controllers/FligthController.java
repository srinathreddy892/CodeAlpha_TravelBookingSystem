package com.travel.booking.controllers;

import com.travel.booking.models.Flight;
import com.travel.booking.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping("/book")
    public Flight bookFlight(@RequestBody Flight flight) {
        return flightService.bookFlight(flight);
    }
}
