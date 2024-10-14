package org.example.shoppingcenter.shoppingcenter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-centers")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class ShoppingCenterController {

    ShoppingCenterService shoppingCenterService;

    @PostMapping("/create")
    public void create(@RequestBody ShoppingCenterEntity shoppingCenter) {
        shoppingCenterService.create(shoppingCenter);
    }

    @GetMapping("/loadById/{id}")
    public ShoppingCenterEntity loadById(@PathVariable Long id) {
        return shoppingCenterService.findById(id);
    }


    @GetMapping("/loadAll")
    public List<ShoppingCenterEntity> loadAll() {
        return shoppingCenterService.loadAll();
    }


}
