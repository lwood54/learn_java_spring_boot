package com.tutorial.learn.services.impl;

import com.tutorial.learn.beans.User;
import com.tutorial.learn.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUserDetails(final String username) {
        User user = new User();
        user.setAge(38);
        user.setName(username);
        return user;
    }
}
