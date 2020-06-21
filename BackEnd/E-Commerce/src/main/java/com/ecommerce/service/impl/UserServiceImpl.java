package com.ecommerce.service.impl;

import com.ecommerce.domain.security.User;
import com.ecommerce.domain.security.UserRole;
import com.ecommerce.repository.RoleRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);



    @Transactional
    public User createUser(User user, Set<UserRole> userRoles) {

        User localUser = this.userRepository.findByUsername(user.getUsername());

        if(localUser != null){
            LOG.info("User with username {} already exist. Nothing will be done. ", user.getUsername());
        }else {
            for(UserRole ur: userRoles){
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);

            localUser = this.userRepository.save(user);
        }

        return localUser;

    }
}
