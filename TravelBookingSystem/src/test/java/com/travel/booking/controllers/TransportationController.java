package com.travel.booking.controllers;

import com.travel.booking.models.Transportation;
import com.travel.booking.services.TransportationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transportations")
public class TransportationController {
    @Autowired
    private TransportationService transportationService;

    @GetMapping
    public List<Transportation> getAllTransportations() {
        return transportationService.getAllTransportations();
    }

    @PostMapping("/book")
    public Transportation bookTransportation(@RequestBody Transportation transportation) {
        return transportationService.bookTransportation(transportation);
    }
}
