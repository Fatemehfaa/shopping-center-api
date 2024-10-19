package org.example.shoppingcenter;
import org.mapstruct.MappingTarget;

import java.util.List;

public interface BaseMapper<T extends BaseEntity, D extends BaseDto> {
    void updateToDto(T entity , @MappingTarget D dto);
    D toDto(T entity);
    T toEntity(D dto);
    List<D> listToDto(List<T> entities);

}