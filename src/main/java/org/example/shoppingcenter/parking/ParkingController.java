package org.example.shoppingcenter.parking;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parkings")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ParkingController {

    ParkingService parkingService;

    @PostMapping("/create")
    public ResponseEntity<ParkingDto> create(@RequestBody ParkingDto parkingDto) {
        return ResponseEntity.ok(parkingService.create(parkingDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<ParkingDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(parkingService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<ParkingDto> update(@RequestBody ParkingDto parkingDto) {
        return ResponseEntity.ok(parkingService.update(parkingDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ParkingDto> delete(@PathVariable Long id) {
        parkingService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<ParkingDto> loadAll() {
        return parkingService.findAll();
    }


}
