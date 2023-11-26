//package org.example.Controller;
//
//import lombok.AllArgsConstructor;
//import org.example.Handler.RoleHandler;
//
//import org.example.dto.RoleDto;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/user")
//@AllArgsConstructor
//
//
//public class RoleController {
//    private final RoleHandler roleHandler;
//
//    @GetMapping
//    public List<RoleDto> getAll(){
//        return roleHandler.getAll();
//    }
//    @GetMapping("/{id}")
//    public RoleDto getById(@PathVariable(value = "id") Integer id)
//    {
//        return roleHandler.getById(id);
//
//    }
//
//    @PostMapping()
//    public void save(@RequestBody RoleDto roleDto){
//        roleHandler.save(roleDto);
//    }
//
//
//}
