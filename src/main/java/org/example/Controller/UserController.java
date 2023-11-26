//package org.example.Controller;
//
//import lombok.AllArgsConstructor;
//import org.example.Handler.UserHandler;
//import org.example.dto.AppUserDto;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/user")
//@AllArgsConstructor
//
//
//public class UserController {
//    private final UserHandler userHandler;
//
//    @GetMapping
//    public List<AppUserDto> getAll(){
//        return userHandler.getAll();
//    }
//    @GetMapping("/{id}")
//    public AppUserDto getById(@PathVariable(value = "id") Integer id)
//    {
//        return userHandler.getById(id);
//
//    }
//
//    @PostMapping()
//    public void save(@RequestBody AppUserDto appUserDto){
//        userHandler.save(appUserDto);
//    }
//
//    @PutMapping("/{id}")
//    public void update (@RequestBody AppUserDto appUserDto,
//                        @PathVariable(value = "id") Integer id) {
//        userHandler.update(appUserDto,id);
//    }
//    @DeleteMapping( "/{id}")
//    public void delete (@PathVariable(value = "id") Integer id)
//    {
//        userHandler.delete(id);
//    }
//
//}
