package com.wendrikycruz.hroauth.controllers;

import com.wendrikycruz.hroauth.entities.User;
import com.wendrikycruz.hroauth.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/oauth")
public class OauthController {

    @Autowired
    private UserService service;

    @GetMapping("/search")
    public ResponseEntity<User> findByEmail(@RequestParam String email) {
        return ResponseEntity.ok(this.service.findByEmail(email));
    }

}
