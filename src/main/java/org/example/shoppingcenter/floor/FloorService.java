package org.example.shoppingcenter.floor;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class FloorService {

    FloorRepository floorRepository;

    public void createFloor(FloorEntity floorEntity) {
        floorRepository.save(floorEntity);
    }
}
