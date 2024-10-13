package org.example.shoppingcenter.elevator;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElevatorRepository extends JpaRepository<ElevatorEntity, Long> {
}
