package org.example.shoppingcenter.seller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sellers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SellerController {

    SellerService sellerService;

    @PostMapping("/create")
    public ResponseEntity<SellerDto> create(@RequestBody SellerDto sellerDto) {
        return ResponseEntity.ok(sellerService.create(sellerDto));
    }

    @GetMapping("/loadById/{id}")
    public ResponseEntity<SellerDto> loadById(@PathVariable Long id) {
        return ResponseEntity.ok(sellerService.findById(id));
    }

    @PutMapping("/update")
    public ResponseEntity<SellerDto> update(@RequestBody SellerDto sellerDto) {
        return ResponseEntity.ok(sellerService.update(sellerDto));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<SellerDto> delete(@PathVariable Long id) {
        sellerService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/loadAll")
    public List<SellerDto> loadAll() {
        return sellerService.findAll();
    }


}
