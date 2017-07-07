package com.pieces.album.service;

import com.pieces.album.model.Photo;
import com.pieces.album.model.User;

import java.util.List;

/**
 * Created by Hong on 24.06.2017.
 */
public interface PhotoService {

    Photo save(Photo photo);

    List<Photo> findAll();

    List<Photo> findByUser(User user);

    Photo findByPhotoId(Long photoId);
}
