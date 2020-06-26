package com.ecommerce.controller;

import com.ecommerce.domain.AuthenticationRequest;
import com.ecommerce.domain.ValidationRequest;
import com.ecommerce.jwt.JwtUtil;
import com.ecommerce.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthenticationController {

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @PostMapping("/authenticate")
    public String generateToken(@RequestBody AuthenticationRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("invalid username/password");
        }

        return jwtUtil.generateToken(authRequest.getUsername());
    }

    @GetMapping("/validate")
    public Boolean checkTokenSession(String token){

        return jwtUtil.checkSession(token);
    }

    @PostMapping("/session")
    public Boolean checkSession(@RequestBody ValidationRequest validationRequest){
        String token = validationRequest.getToken();
        UserDetails userDetails = this.userDetailsService.loadUserByUsername(validationRequest.getUsername());

        return jwtUtil.validateToken(token, userDetails);
    }

}
