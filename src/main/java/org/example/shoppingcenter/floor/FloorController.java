package org.example.shoppingcenter.floor;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/floors")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class FloorController {

    FloorService floorService;

    @PostMapping("/create")
    public ResponseEntity<FloorDto> create(@RequestBody FloorDto floorDto) {
        return ResponseEntity.ok(floorService.create(floorDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<FloorDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(floorService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<FloorDto> update(@RequestBody FloorDto floorDto) {
        return ResponseEntity.ok(floorService.update(floorDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<FloorDto> delete(@PathVariable Long id) {
        floorService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<FloorDto> loadAll() {
        return floorService.findAll();
    }


}
