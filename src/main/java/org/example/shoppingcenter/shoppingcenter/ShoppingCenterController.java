package org.example.shoppingcenter.shoppingcenter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shoppingCenterping-centers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShoppingCenterController {

    ShoppingCenterService shoppingCenterService;

    @PostMapping("/create")
    public ResponseEntity<ShoppingCenterDto> create(@RequestBody ShoppingCenterDto shoppingCenterDto) {
        return ResponseEntity.ok(shoppingCenterService.create(shoppingCenterDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<ShoppingCenterDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(shoppingCenterService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<ShoppingCenterDto> update(@RequestBody ShoppingCenterDto shoppingCenterDto) {
        return ResponseEntity.ok(shoppingCenterService.update(shoppingCenterDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ShoppingCenterDto> delete(@PathVariable Long id) {
        shoppingCenterService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<ShoppingCenterDto> loadAll() {
        return shoppingCenterService.findAll();
    }


}
