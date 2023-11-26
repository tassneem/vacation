//package org.example.Security;
//import lombok.AllArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.validation.Valid;
//
//
//@RestController
//@RequestMapping("/auth")
//@AllArgsConstructor
//@Log4j2
//
//
//public class AuthController {
//    private final AuthHandler authHandler;
//
//
//    @PostMapping("/login")
//    public ResponseEntity<?> login(@Valid @RequestBody AuthRequest authRequest)
//    {
//        return authHandler.login(authRequest);
//    }
//
//    @PostMapping("/refresh")
//    public ResponseEntity<?> login(@Valid @RequestBody RefreshTokenRequest refreshTokenRequest)
//    {
//        return authHandler.refresh(refreshTokenRequest.getRefreshToken());
//    }
//
//}
