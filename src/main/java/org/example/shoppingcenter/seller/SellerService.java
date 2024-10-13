package org.example.shoppingcenter.seller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE , makeFinal = true)
@RequiredArgsConstructor
public class SellerService {

    SellerRepository sellerRepository;

    public void createSeller(SellerEntity sellerEntity) {
        sellerRepository.save(sellerEntity);
    }
}
