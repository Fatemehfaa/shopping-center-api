package org.example.shoppingcenter.elevator;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.floor.FloorEntity;
import org.example.shoppingcenter.floor.FloorRepository;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ElevatorService {

    ElevatorRepository elevatorRepository;

    public void createElevator(ElevatorEntity elevatorEntity) {
        elevatorRepository.save(elevatorEntity);
    }
}
