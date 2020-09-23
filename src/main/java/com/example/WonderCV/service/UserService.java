package com.example.WonderCV.service;

import com.example.WonderCV.domain.User;
import com.example.WonderCV.exception.UserNotExistException;
import com.example.WonderCV.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(long id) {
        Optional<User> user = userRepository.findById(id);
        if (!user.isPresent()){
            throw new UserNotExistException("该用户不存在");
        }
        return user.get();
    }

    public User addUser(User newUser) {
       return userRepository.save(newUser);
    }
}
