//package org.example.Security;
//
//import lombok.AllArgsConstructor;
//import lombok.extern.log4j.Log4j2;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@AllArgsConstructor
//@Log4j2
//@Component
//
//public class TokenAuthenticationFilter extends OncePerRequestFilter {
//    private final TokenProvider tokenProvider;
//    private final SecurityUserService securityUserService;
//
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        try {
//            log.info("validate token");
//            String jwt = getJwtToken(request);
//            if (tokenProvider.validateToken(jwt)) {
//                log.info("token is valid ! ");
//                String username = tokenProvider.getUsernameFromToken(jwt);
//                UserDetails userDetails = securityUserService.loadUserByUsername(username);
//                UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
//                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(authentication);
//            }
//        } catch (Exception ex) {
//            log.error("error in validating token", ex);
//        }
//
//        filterChain.doFilter(request, response);
//    }
//
//    private String getJwtToken(HttpServletRequest request) {
//        String header = request.getHeader("Authorization");
//        if (header != null && header.startsWith("Bearer"))
//            return header.replace("Bearer ", "");
//        return null;
//    }
//}
