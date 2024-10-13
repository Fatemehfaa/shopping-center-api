package org.example.shoppingcenter.parking;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ParkingService {

    ParkingRepository parkingRepository;

    public void createParking(ParkingEntity parkingEntity){
        parkingRepository.save(parkingEntity);
    }
}
