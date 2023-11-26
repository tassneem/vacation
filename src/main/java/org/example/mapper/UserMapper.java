//package org.example.mapper;
//
//import org.example.Entity.AppUser;
//import org.example.dto.AppUserDto;
//import org.example.utils.HibernateUtils;
//import org.mapstruct.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import java.util.List;
//
//@Mapper(componentModel = "spring")
//public abstract class UserMapper {
//    @Autowired
//    private RoleMapper roleMapper;
//
//    @Mappings({
//            @Mapping(source = "roles", target = "roles", ignore = true)
//    })
//    public abstract AppUserDto toDto(AppUser appUser);
//
//    public abstract List<AppUserDto> toDto(List<AppUser> entityList);
//
//    @AfterMapping
//    public void toDtoAfterMapping(AppUser entity, @MappingTarget AppUserDto dto) {
//        if (HibernateUtils.isConvertible(entity.getRoles())) {
//            dto.setRoles(roleMapper.toDto(entity.getRoles()));
//        }
//    }
//
//    public abstract List<AppUser> toEntity(List<AppUserDto> dtoList);
//
//    @InheritInverseConfiguration
//    public abstract AppUser toEntity(AppUserDto appUserDto);
//
//    @InheritInverseConfiguration
//    public abstract AppUser updateEntityFromDto(AppUserDto appUserDto, @MappingTarget AppUser appUser );
//}
