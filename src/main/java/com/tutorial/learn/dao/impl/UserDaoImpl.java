package com.tutorial.learn.dao.impl;

import com.tutorial.learn.dao.UserDao;
import com.tutorial.learn.entities.UserEntity;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;


@Repository
public class UserDaoImpl implements UserDao {
    private final EntityManager entityManager;

    public UserDaoImpl(final EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void createUser(UserEntity newUser) {
        Session session = entityManager.unwrap(Session.class);
        session.save(newUser);
    }
}
