package org.example.shoppingcenter.elevator;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
@Slf4j
public class ElevatorService {

    ElevatorRepository elevatorRepository;

    public ElevatorDto create(ElevatorDto elevator) {
        ElevatorEntity entity = ElevatorMapper.INSTANCE.toEntity(elevator);
        log.info("Creating elevator: {}", entity);
        return ElevatorMapper.INSTANCE.toDto(elevatorRepository.save(entity));
    }

    public ElevatorDto findById(Long id) {
        log.info("Finding elevator by id: {}", id);
        return ElevatorMapper.INSTANCE.toDto(elevatorRepository.findById(id).orElse(null));
    }

    public ElevatorDto update(ElevatorDto elevatorDto) {
        ElevatorEntity elevator = elevatorRepository.findById(elevatorDto.getId()).orElseThrow();
        ElevatorMapper.INSTANCE.updateToDto(elevator, elevatorDto);
        return ElevatorMapper.INSTANCE.toDto(elevatorRepository.save(elevator));
    }

    public void delete(Long id) {
        elevatorRepository.deleteById(id);
    }

    public List<ElevatorDto> findAll() {
        return ElevatorMapper.INSTANCE.listToDto(elevatorRepository.findAll());
    }
}
