package com.cabSystem.com.model;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double latitude;
    private double longitude;
    private String address;

    @OneToMany(mappedBy = "startLocation")
    private List<Booking> startBookings;

    @OneToMany(mappedBy = "endLocation")
    private List<Booking> endBookings;

    // Constructors, getters, and setters
}

