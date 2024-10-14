package org.example.shoppingcenter.elevator;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elevators")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ElevatorController {

    ElevatorService elevatorService;

    @PostMapping("/create")
    public ResponseEntity<ElevatorDto> create(@RequestBody ElevatorDto elevatorDto) {
        return ResponseEntity.ok(elevatorService.create(elevatorDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<ElevatorDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(elevatorService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<ElevatorDto> update(@RequestBody ElevatorDto elevatorDto) {
        return ResponseEntity.ok(elevatorService.update(elevatorDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ElevatorDto> delete(@PathVariable Long id) {
        elevatorService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<ElevatorDto> loadAll() {
        return elevatorService.findAll();
    }


}
