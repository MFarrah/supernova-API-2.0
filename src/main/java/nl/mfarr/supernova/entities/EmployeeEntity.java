package nl.mfarr.supernova.entities;

import java.time.LocalDateTime;
import java.util.Set;

public class EmployeeEntity {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private Set orderQualifications;
    private Set bookings;
    private Set  availabilitySlots;
}
