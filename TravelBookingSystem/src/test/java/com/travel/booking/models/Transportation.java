package com.travel.booking.models;

import javax.persistence.*;

@Entity
public class Transportation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String company;
    private String pickupLocation;
    private String dropoffLocation;

    // Getters and Setters
}
