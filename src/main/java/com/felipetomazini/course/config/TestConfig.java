package com.felipetomazini.course.config;

import com.felipetomazini.course.entities.User;
import com.felipetomazini.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.List;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(2l, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(1l, "Alex Green", "alex@gmail.com", "977777777", "123456");


        userRepository.saveAll(Arrays.asList(u1, u2));

    }

}
