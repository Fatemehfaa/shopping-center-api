package org.example.shoppingcenter.category;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @ManyToOne
    CategoryEntity parent;
    @ManyToMany
    List<CategoryEntity> subCategories;
    @OneToMany(mappedBy = "category")
    List<ProductEntity> products;


}
