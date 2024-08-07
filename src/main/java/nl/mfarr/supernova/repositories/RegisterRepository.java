package nl.mfarr.supernova.repositories;

import nl.mfarr.supernova.entities.RegisterEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisterRepository extends JpaRepository<RegisterEntity, Long> {
}
