package com.ecommerce.bootstrap;

import com.ecommerce.config.SecurityUtility;
import com.ecommerce.domain.security.Role;
import com.ecommerce.domain.security.User;
import com.ecommerce.domain.security.UserRole;
import com.ecommerce.repository.RoleRepository;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setFirstName("Anastasios");
        user1.setLastName("Margaritis");
        user1.setUsername("a");
        user1.setPassword(SecurityUtility.passwordEncoder().encode("1"));
        user1.setEmail("anastasismargaritis@gmail.com");
        this.userRepository.save(user1);


        Set<UserRole> userRoles = new HashSet<>();

        Role role1 = new Role();
        role1.setId(1L);
        role1.setName("ROLE_USER");
        this.roleRepository.save(role1);

        UserRole userRole = new UserRole(1L, user1, role1);
        this.userRoleRepository.save(userRole);

        user1.getUserRoles().add(userRole);

        System.out.println(user1.getUsername());

        userRoles.clear();

        User user2 = new User();
        user2.setFirstName("Admin");
        user2.setLastName("Admin");
        user2.setUsername("Admin");
        user2.setPassword(SecurityUtility.passwordEncoder().encode("12345"));
        user2.setEmail("Admin@gmail.com");

        Role role2 = new Role();
        role2.setId(0L);
        role2.setName("ROLE_ADMIN");
        userRoles.add(new UserRole(2L, user2, role2));

//        userService.createUser(user2, userRoles);

        userRoles.clear();
    }
}
