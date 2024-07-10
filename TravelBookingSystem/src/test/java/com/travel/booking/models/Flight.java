package com.travel.booking.models;

import javax.persistence.*;

@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String airline;
    private String departure;
    private String arrival;
    private String departureTime;
    private String arrivalTime;

    // Getters and Setters
}
