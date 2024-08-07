package nl.mfarr.supernova.repositories;

import nl.mfarr.supernova.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}