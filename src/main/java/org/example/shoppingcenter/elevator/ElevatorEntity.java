package org.example.shoppingcenter.elevator;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.floor.FloorEntity;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ElevatorEntity extends BaseEntity {

    @OneToOne
    FloorEntity floor;
}
