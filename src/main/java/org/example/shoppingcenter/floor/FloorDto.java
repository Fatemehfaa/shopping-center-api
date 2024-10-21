package org.example.shoppingcenter.floor;

import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseDto;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class FloorDto extends BaseDto {
    Long floorNumber;
}
