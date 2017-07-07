package com.pieces.album.service;

import com.pieces.album.dao.UserDao;
import com.pieces.album.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nghongquang on 05.07.17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public User save(User user) {
        return userDao.save(user);
    }

    @Override
    public User findByUserName(String userName) {
        return userDao.findByUserName(userName);
    }

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }
}
