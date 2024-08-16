package nl.mfarr.supernova.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public abstract class UserEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String email;
    private String password;

    private String firstName;
    private String lastName;
    private String phoneNumber;

}
