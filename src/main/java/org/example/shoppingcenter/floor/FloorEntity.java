package org.example.shoppingcenter.floor;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FloorEntity extends BaseEntity {

    Long floorNumber;

}
