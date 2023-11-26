package org.example.mapper;

import org.mapstruct.Mapper;

import java.util.List;
import java.util.Set;


public interface GeneralMapper<T,S> {

    T toEntity(S s);

    S toDto(T t);

    List<T> toEntity(List<S> dto);

    List<S> toDto(List<T> dto);

    Set<T> toEntity(Set<S> dto);

    Set<S> toDto(Set<T> dto);

}
