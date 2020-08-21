package com.felipetomazini.course.resources;

import com.felipetomazini.course.entitires.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1l,"Felipe","felip@gmail.com", "51-98126-0253", "rinoceronteAmarelo6652!!");
        return ResponseEntity.ok().body(u);
    }

}
