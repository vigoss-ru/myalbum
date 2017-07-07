package com.pieces.album.dao;

import com.pieces.album.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nghongquang on 05.07.17.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {

    List<User> findAll();

    User findByUserName(String userName);

    User findByUserId(Long userId);

    User save(User user);

}
