//package org.example.Security;
//
//
//import lombok.AllArgsConstructor;
//import org.example.Entity.AppUser;
//import org.example.model.UserRepository;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@AllArgsConstructor
//@Service
//
//public class SecurityUserService implements UserDetailsService{
//
//    private final UserRepository userRepository;
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//       AppUser user = userRepository.findUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("App_User Not Found with username: " + username));
//
//        List<GrantedAuthority> authorities = user.getRoles().stream()
//                .map(userRole -> new SimpleGrantedAuthority(userRole.getName()))
//                .collect(Collectors.toList());
//
//
//        return new
//                User(user.getUsername(), user.getPassword(), authorities);
//    }
//}
