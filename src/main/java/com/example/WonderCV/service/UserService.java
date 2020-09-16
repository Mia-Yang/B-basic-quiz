package com.example.WonderCV.service;

import com.example.WonderCV.domain.User;
import com.example.WonderCV.exception.UserNotExistException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private List<User> users = new ArrayList<>();

    // GTB: 不需要默认数据
    public UserService() {
       User newUser = User.builder()
                .id(1)
                .name("KAMIL")
                .age(24)
                .avatar("https://inews.gtimg.com/newsapp_match/0/3581582328/0")
                .description("Lorem ipsum dolor sit amet, consectetur adipisicing elit. Repellendus, non, dolorem, cumque distinctio magni quam expedita velit laborum sunt amet facere tempora ut fuga aliquam ad asperiores voluptatem dolorum! Quasi.")
                .build();

       users.add(newUser);
    }

    public User getUserById(long id) {
        if (!users.stream().anyMatch(user -> user.getId() == id)) {
            throw new UserNotExistException("该用户不存在");
        }
        return users.get((int)id - 1);
    }

    public String addUser(User newUser) {
        long nextId = users.size() + 1;
        newUser.setId(nextId);
        users.add(newUser);
        return ("Your ID: " + newUser.getId());
    }
}
