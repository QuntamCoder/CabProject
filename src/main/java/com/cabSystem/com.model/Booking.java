package com.cabSystem.com.model;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "start_location_id")
    private Location startLocation;

    @ManyToOne
    @JoinColumn(name = "end_location_id")
    private Location endLocation;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private double fare;

    @OneToOne(mappedBy = "booking")
    private Payment payment;

    @OneToMany(mappedBy = "booking")
    private List<Feedback> feedbacks;

}

