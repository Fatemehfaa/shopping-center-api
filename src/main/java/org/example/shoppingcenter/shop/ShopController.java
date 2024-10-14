package org.example.shoppingcenter.shop;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shops")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShopController {

    ShopService shopService;

    @PostMapping("/create")
    public ResponseEntity<ShopDto> create(@RequestBody ShopDto shopDto) {
        return ResponseEntity.ok(shopService.create(shopDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<ShopDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(shopService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<ShopDto> update(@RequestBody ShopDto shopDto) {
        return ResponseEntity.ok(shopService.update(shopDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ShopDto> delete(@PathVariable Long id) {
        shopService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<ShopDto> loadAll() {
        return shopService.findAll();
    }


}
