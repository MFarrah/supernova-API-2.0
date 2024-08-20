package nl.mfarr.supernova.entities;

import jakarta.persistence.Entity;
import nl.mfarr.supernova.enums.Role;

@Entity
public class AdminEntity extends UserEntity {

    public AdminEntity() {
        super();
        this.setRole(Role.ADMIN);
    }

    public AdminEntity(Long id, String email, String password, String firstName, String lastName, String phoneNumber) {
        super(id, email, password, firstName, lastName, phoneNumber, Role.ADMIN);
    }
}