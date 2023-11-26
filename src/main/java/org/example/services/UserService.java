//package org.example.services;
//
//import org.example.Entity.AppUser;
//import org.example.Entity.Role;
//import org.example.model.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserService {
//    @Autowired
//    private UserRepository userRepository;
//
//    public List<AppUser> getAll()
//    {
//        List<AppUser> userList=userRepository.findAll();
//        return userList;
//    }
//    public Optional<AppUser> getById(Integer id)
//    {
//        return userRepository.findById(id);
//    }
//    public AppUser getReferenceById(Integer id)
//    {
//        return userRepository.getReferenceById(id);
//    }
//    public void save(AppUser user)
//    {
//        userRepository.save(user);
//    }
//    public void update(AppUser a,Integer id)
//    {
//
//        userRepository.save(a);
//    }
//    public void delete(AppUser user)
//    {
//        userRepository.delete(user);
//    }
//
//}
