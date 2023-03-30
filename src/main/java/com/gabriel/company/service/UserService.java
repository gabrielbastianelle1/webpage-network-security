package com.gabriel.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.company.model.User;
import com.gabriel.company.repository.UserRepository;

import lombok.Data;

@Service
@Data
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private User user;
    
    public void findByEmail(String email){
        this.user = userRepository.findByEmail(email).get();
    }
}
