package com.banquemisr.challenge05.shopStore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.banquemisr.challenge05.shopStore.model.ERole;
import com.banquemisr.challenge05.shopStore.model.Role;
import com.banquemisr.challenge05.shopStore.model.User;
import com.banquemisr.challenge05.shopStore.repository.RoleRepository;
import com.banquemisr.challenge05.shopStore.repository.UserRepository;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder encoder;

    @Override
    public void run(String... args) throws Exception {
        // Roles
        Role userRole = new Role();
        userRole.setName(ERole.ROLE_USER);
        roleRepository.save(userRole);

        Role modRole = new Role();
        modRole.setName(ERole.ROLE_MODERATOR);
        roleRepository.save(modRole);

        Role adminRole = new Role();
        adminRole.setName(ERole.ROLE_ADMIN);
        roleRepository.save(adminRole);

        // Users
        User user = new User();
       user.setUsername("user");
        user.setEmail("user@example.com");
        user.setPassword(encoder.encode("password"));
        //user.setRoles(Set.of(userRole));
        userRepository.save(user);

       
    }
}
