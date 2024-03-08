package com.educandoweb.course.config;

import java.util.Arrays;

import org.hibernate.mapping.Array;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Luziano Farias", "luziano@gmail.com", "8965923211", "123456");
        User u2 = new User(null, "Matheus Leoncio", "matheus@gmail.com", "254681211", "987456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}