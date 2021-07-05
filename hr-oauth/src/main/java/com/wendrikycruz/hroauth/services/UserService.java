package com.wendrikycruz.hroauth.services;

import com.wendrikycruz.hroauth.entities.User;
import com.wendrikycruz.hroauth.feignclients.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserFeignClient userFeignClient;

    public User findByEmail(String email){
        return this.userFeignClient.findByEmail(email).getBody();
    }
}
