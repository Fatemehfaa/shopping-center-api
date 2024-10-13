package org.example.shoppingcenter.shoppingcenter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCenterRepository extends JpaRepository<ShoppingCenterEntity, Long> {
}
