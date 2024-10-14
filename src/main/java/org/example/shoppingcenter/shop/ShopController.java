package org.example.shoppingcenter.shop;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shops")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShopController {
    ShopService shopService;

    @PostMapping("/create")
    public void create(@RequestBody ShopEntity shop){
        shopService.create(shop);
    }

    @GetMapping("/findById/{id}")
    public ShopEntity findById(@PathVariable Long id){
        return shopService.findById(id);
    }



}
