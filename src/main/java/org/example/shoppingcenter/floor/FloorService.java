package org.example.shoppingcenter.floor;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class FloorService {

    FloorRepository floorRepository;

    public FloorDto create(FloorDto floor) {
        FloorEntity entity = FloorMapper.INSTANCE.toEntity(floor);
        return FloorMapper.INSTANCE.toDto(floorRepository.save(entity));
    }

    public FloorDto findById(Long id) {
        return FloorMapper.INSTANCE.toDto(floorRepository.findById(id).orElse(null));
    }

    public FloorDto update(FloorDto floorDto) {
        FloorEntity floor = floorRepository.findById(floorDto.getId()).orElseThrow();
        FloorMapper.INSTANCE.updateToDto(floor, floorDto);
        return FloorMapper.INSTANCE.toDto(floorRepository.save(floor));
    }

    public void delete(Long id) {
        floorRepository.deleteById(id);
    }

    public List<FloorDto> findAll() {
        return FloorMapper.INSTANCE.listToDto(floorRepository.findAll());
    }
}
