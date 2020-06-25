package com.ecommerce.controller;

import com.ecommerce.domain.AuthenticationRequest;
import com.ecommerce.jwt.JwtUtil;
import com.ecommerce.service.impl.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
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
    public Boolean checkTokenSession(@RequestBody String token,
            @RequestBody AuthenticationRequest authReq){

        return jwtUtil.validateToken(token, this.userDetailsService.loadUserByUsername(authReq.getUsername()));

    }

}
