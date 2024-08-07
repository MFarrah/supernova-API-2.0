package nl.mfarr.supernova.repositories;

import nl.mfarr.supernova.entities.TimeFrameEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeFrameRepository extends JpaRepository<TimeFrameEntity, Long> {
}
