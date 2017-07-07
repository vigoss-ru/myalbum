package com.pieces.album.dao;

import com.pieces.album.model.Photo;
import com.pieces.album.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nghongquang on 07.07.17.
 */
@Repository
public interface PhotoDao extends CrudRepository<Photo, Long> {

    Photo save(Photo photo);

    List<Photo> findByUser(User user);

    List<Photo> findAll();

    Photo findByPhotoId(Long photoId);

}
