//package org.example.Handler;
//import lombok.AllArgsConstructor;
//import org.example.Entity.AppUser;
//import org.example.Entity.Employee;
//import org.example.Exception.ResourceNotFoundException;
//import org.example.Exception.ResourceRelatedException;
//import org.example.dto.AppUserDto;
//import org.example.mapper.UserMapper;
//import org.example.services.UserService;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//import java.util.Optional;
//
//@Component
//@AllArgsConstructor
//
//
//public class UserHandler {
//
//
//    private final UserMapper userMapper;
//    private final UserService userService;
//
//    public List<AppUserDto> getAll(){
//        List<AppUser> userList = userService.getAll();
//        List<AppUserDto> dtoList=userMapper.toDto(userList);
//        return dtoList;
//    }
//    public AppUserDto getById(Integer id) {
//        AppUser user= userService.getById(id).orElseThrow(() -> new ResourceNotFoundException(AppUser.class.getSimpleName(), id));
//        AppUserDto dto= userMapper.toDto(user);
//        return dto;
//    }
//    public void save(AppUserDto dto){
//        AppUser user =userMapper.toEntity(dto);
//        userService.save(user);
//    }
//
//    public void update(AppUserDto dto , Integer id) {
//        AppUser user= userService.getById(id).orElseThrow(() -> new ResourceNotFoundException(AppUser.class.getSimpleName(), id));
//        AppUser entity =userMapper.updateEntityFromDto(dto,user);
//        userService.save(entity);
//    }
//
//    public void delete( Integer id) {
//        AppUser user= userService.getById(id).orElseThrow(() -> new ResourceNotFoundException(AppUser.class.getSimpleName(), id));
//
//        try{
//        userService.delete(user);
//        }
//        catch(Exception e){
//            throw new ResourceRelatedException(AppUser.class.getSimpleName(),"id " ,id.toString());
//        }
//
//    }
//
//
//
//
//}
