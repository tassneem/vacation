//package org.example.services;
//
//import org.example.Entity.Employee;
//import org.example.Entity.Role;
//import org.example.model.EmployeeRepository;
//import org.example.model.RoleRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class RoleService {
//    @Autowired
//    private RoleRepository roleRepository;
//
//    public List<Role> getAll()
//    {
//        List<Role> roleList=roleRepository.findAll();
//        return roleList;
//    }
//    public Optional<Role> getById(Integer id)
//    {
//        return roleRepository.findById(id);
//    }
//    public Role getReferenceById(Integer id)
//    {
//        return roleRepository.getReferenceById(id);
//    }
//    public void save(Role role)
//    {
//        roleRepository.save(role);
//    }
//    public void update(Role r,Integer id)
//    {
//
//        roleRepository.save(r);
//    }
//    public void delete(Role role)
//    {
//        roleRepository.delete(role);
//    }
//
//}
