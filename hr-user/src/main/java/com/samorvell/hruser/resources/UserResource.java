package com.samorvell.hruser.resources;

import com.samorvell.hruser.entities.User;
import com.samorvell.hruser.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private static Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    private UserRepository workerRepository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {

        User user = workerRepository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {

        User user = workerRepository.findByEmail(email);
        return ResponseEntity.ok(user);
    }

}
