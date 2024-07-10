package com.travel.booking.services;

import com.travel.booking.models.Transportation;
import com.travel.booking.repositories.TransportationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransportationService {
    @Autowired
    private TransportationRepository transportationRepository;

    public List<Transportation> getAllTransportations() {
        return transportationRepository.findAll();
    }

    public Transportation bookTransportation(Transportation transportation) {
        return transportationRepository.save(transportation);
    }
}
