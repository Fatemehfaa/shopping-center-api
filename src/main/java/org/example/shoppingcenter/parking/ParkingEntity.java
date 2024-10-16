package org.example.shoppingcenter.parking;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.floor.FloorEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ParkingEntity extends BaseEntity {

    Long numberParking;
    String type;

    @OneToOne
    FloorEntity floor;

}
