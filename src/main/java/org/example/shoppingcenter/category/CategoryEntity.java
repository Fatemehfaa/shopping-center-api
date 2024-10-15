package org.example.shoppingcenter.category;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.shoppingcenter.BaseEntity;
import org.example.shoppingcenter.product.ProductEntity;

import java.util.List;

@Entity
@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity extends BaseEntity {
    String name;

    @ManyToMany
    List<CategoryEntity> subCategories;
    @ManyToMany
    List<ProductEntity> products;


}
