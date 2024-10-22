package org.example.shoppingcenter.seller;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor
public class SellerService {

    SellerRepository sellerRepository;

    public SellerDto create(SellerDto seller) {
        SellerEntity entity = SellerMapper.INSTANCE.toEntity(seller);
        return SellerMapper.INSTANCE.toDto(sellerRepository.save(entity));
    }

    public SellerDto findById(Long id) {
        return SellerMapper.INSTANCE.toDto(sellerRepository.findById(id).orElse(null));
    }

    public SellerDto update(SellerDto sellerDto) {
        SellerEntity seller = sellerRepository.findById(sellerDto.getId()).orElseThrow();
        SellerMapper.INSTANCE.updateToDto(seller, sellerDto);
        return SellerMapper.INSTANCE.toDto(sellerRepository.save(seller));
    }

    public void delete(Long id) {
        sellerRepository.deleteById(id);
    }

    public List<SellerDto> findAll() {
        return SellerMapper.INSTANCE.listToDto(sellerRepository.findAll());
    }
}
