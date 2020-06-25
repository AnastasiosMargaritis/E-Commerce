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
        user1.setUsername("AnasMarg");
        user1.setPassword("1234");
        user1.setEmail("anastasismargaritis@gmail.com");
        user1.setUserRoles(UserRole.USER);
        this.userRepository.save(user1);

        User user2 = new User();
        user2.setFirstName("Anthi");
        user2.setLastName("Molozi");
        user2.setUsername("AnthiMl");
        user2.setPassword("1234");
        user2.setEmail("anthimolozi@gmail.com");
        user2.setUserRoles(UserRole.USER);
        this.userRepository.save(user2);

        User user3 = new User();
        user3.setFirstName("George");
        user3.setLastName("Margaritis");
        user3.setUsername("GeorgeMargar");
        user3.setPassword("1234");
        user3.setEmail("georgemargaritis@gmail.com");
        user3.setUserRoles(UserRole.USER);
        this.userRepository.save(user3);

        User user4 = new User();
        user4.setFirstName("Eleana");
        user4.setLastName("Margariti");
        user4.setUsername("ElMargar");
        user4.setPassword("1234");
        user4.setEmail("elmargar@gmail.com");
        user4.setUserRoles(UserRole.USER);
        this.userRepository.save(user4);

        User user5 = new User();
        user5.setFirstName("Alexandros");
        user5.setLastName("Margaritis");
        user5.setUsername("AlMargar");
        user5.setPassword("1234");
        user5.setEmail("alexmarg@gmail.com");
        user5.setUserRoles(UserRole.USER);
        this.userRepository.save(user5);


        User user6 = new User();
        user6.setFirstName("Admin");
        user6.setLastName("Admin");
        user6.setUsername("Admin");
        user6.setPassword("12345");
        user6.setEmail("Admin@gmail.com");
        user6.setUserRoles(UserRole.ADMIN);
        this.userRepository.save(user6);

    }
}
