package com.pieces.album.service;

import com.pieces.album.model.User;

import java.util.List;

/**
 * Created by nghongquang on 05.07.17.
 */
public interface UserService {

    List<User> findAllUsers();

    User save(User user);

    User findByUserName(String userName);
}
