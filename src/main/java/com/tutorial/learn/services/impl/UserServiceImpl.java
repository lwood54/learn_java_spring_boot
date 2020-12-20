package com.tutorial.learn.services.impl;

import com.tutorial.learn.beans.User;
import com.tutorial.learn.dao.UserDao;
import com.tutorial.learn.entities.UserEntity;
import com.tutorial.learn.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(final UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserDetails(final String username) {
        User user = new User();
        user.setAge(38);
        return user;
    }

    @Override
    public void createUser(final User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setAge(user.getAge());
        userEntity.setFirstName(user.getFirstName());
        userEntity.setLastName(user.getLastName());

        userDao.createUser(userEntity);
    }
}
