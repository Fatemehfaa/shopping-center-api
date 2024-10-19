package org.example.shoppingcenter.parking;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.floor.FloorEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParkingEntity extends BaseEntity {

    @Column(nullable = false)
    Long numberParking;
    String type;

    @OneToOne
    FloorEntity floor;

}
