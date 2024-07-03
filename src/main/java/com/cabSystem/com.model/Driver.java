package com.cabSystem.com.model;

@Entity
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String phone;

    @OneToOne(mappedBy = "driver")
    private Vehicle vehicle;

    @OneToMany(mappedBy = "driver")
    private List<Booking> bookings;

    @OneToMany(mappedBy = "driver")
    private List<Feedback> feedbacks;

}
