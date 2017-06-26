package com.pieces.album.service;

import com.pieces.album.model.Photo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hong on 24.06.2017.
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    @Override
    public List<Photo> findAll() {
        return setPhotos();
    }

    public List<Photo> setPhotos() {
        Photo photo1 = new Photo();
        photo1.setPhotoId(1);
        photo1.setImageName("https://static.pexels.com/photos/235459/pexels-photo-235459.jpeg");
        photo1.setTitle("Image 1 Title");
        photo1.setDescription("Image 1 Description");
        photo1.setLikes(4);

        // Image 2
        Photo photo2 = new Photo();
        photo2.setPhotoId(2);
        photo2.setImageName("https://static.pexels.com/photos/270188/pexels-photo-270188.jpeg");
        photo2.setTitle("Image 2 Title");
        photo2.setDescription("Image 2 Description");
        photo2.setLikes(5);

        // Image 2
        Photo photo3 = new Photo();
        photo3.setPhotoId(3);
        photo3.setImageName("https://static.pexels.com/photos/325963/pexels-photo-325963.jpeg");
        photo3.setTitle("Image 3 Title");
        photo3.setDescription("Image 3 Description");
        photo3.setLikes(2);

        List<Photo> list = new ArrayList<Photo>();
        list.add(photo1);
        list.add(photo2);
        list.add(photo3);
        return list;
    }
}
