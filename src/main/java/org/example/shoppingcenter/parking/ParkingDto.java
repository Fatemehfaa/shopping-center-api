package org.example.shoppingcenter.parking;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseDto;
import org.example.shoppingcenter.floor.FloorDto;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ParkingDto extends BaseDto {

    Long numberParking;
    String type;
    FloorDto floor;
}
