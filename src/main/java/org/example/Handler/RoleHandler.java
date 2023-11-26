//package org.example.Handler;
//import lombok.AllArgsConstructor;
//import org.example.Entity.Employee;
//import org.example.Entity.Role;
//import org.example.Exception.ResourceNotFoundException;
//import org.example.dto.EmployeeDto;
//import org.example.dto.RoleDto;
//import org.example.mapper.RoleMapper;
//import org.example.services.RoleService;
//import org.springframework.data.domain.Page;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//
//import java.net.URI;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//@AllArgsConstructor
//
//public class RoleHandler {
//
//    private final RoleMapper roleMapper;
//    private final RoleService roleService;
//
//
//    public List<RoleDto> getAll(){
//        List<Role> roleList = roleService.getAll();
//        List<RoleDto> dtoList=roleMapper.toDto(roleList);
//        return dtoList;
//    }
//    public RoleDto getById(Integer id) {
//        Role role= roleService.getById(id).
//                orElseThrow(() -> new ResourceNotFoundException(Role.class.getSimpleName(), id));
//        RoleDto dto= roleMapper.toDto(role);
//        return dto;
//    }
//    public void save(RoleDto dto){
//        Role role =roleMapper.toEntity(dto);
//        roleService.save(role);
//    }
//
//
//
//
//
//}
