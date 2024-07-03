@Entity
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String registrationNumber;
    private String model;

    @OneToOne
    @JoinColumn(name = "driver_id")
    private Driver driver;

}
