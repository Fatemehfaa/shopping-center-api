package org.example.shoppingcenter.parking;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ParkingService {

    ParkingRepository parkingRepository;

    public ParkingDto create(ParkingDto parking) {
        ParkingEntity entity = ParkingMapper.INSTANCE.toEntity(parking);
        return ParkingMapper.INSTANCE.toDto(parkingRepository.save(entity));
    }

    public ParkingDto findById(Long id) {
        return ParkingMapper.INSTANCE.toDto(parkingRepository.findById(id).orElse(null));
    }

    public ParkingDto update(ParkingDto parkingDto) {
        ParkingEntity parking = parkingRepository.findById(parkingDto.getId()).orElseThrow();
        ParkingMapper.INSTANCE.updateToDto(parking, parkingDto);
        return ParkingMapper.INSTANCE.toDto(parkingRepository.save(parking));
    }

    public void delete(Long id) {
        parkingRepository.deleteById(id);
    }

    public List<ParkingDto> findAll() {
        return ParkingMapper.INSTANCE.listToDto(parkingRepository.findAll());
    }
}
