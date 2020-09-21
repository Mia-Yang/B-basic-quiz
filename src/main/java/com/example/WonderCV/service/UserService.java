package com.example.WonderCV.service;

import com.example.WonderCV.domain.User;
import com.example.WonderCV.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(long id) {
        return userRepository.getUserById(id);
    }

    public String addUser(User newUser) {
       return userRepository.addUser(newUser);
    }
}
