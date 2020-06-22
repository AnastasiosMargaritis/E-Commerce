package com.ecommerce.bootstrap;

import com.ecommerce.domain.User;
import com.ecommerce.domain.UserRole;
import com.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User user1 = new User();
        user1.setFirstName("Anastasios");
        user1.setLastName("Margaritis");
        user1.setUsername("a");
        user1.setPassword("1234");
        user1.setEmail("anastasismargaritis@gmail.com");
        user1.setUserRoles(UserRole.USER);
        this.userRepository.save(user1);


        User user2 = new User();
        user2.setFirstName("Admin");
        user2.setLastName("Admin");
        user2.setUsername("Admin");
        user2.setPassword("12345");
        user2.setEmail("Admin@gmail.com");
        user2.setUserRoles(UserRole.ADMIN);
        this.userRepository.save(user2);

    }
}
