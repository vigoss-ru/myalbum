import {Injectable} from '@angular/core';
import {Http, Headers} from '@angular/http';
import {Photo} from '../models/photo';
import {User} from '../models/user';

@Injectable()
export class PhotoService {

  constructor(private http: Http) {}

  getPhotos() {
    const url = 'http://127.0.0.1:8080/photo/allPhotos';
    return this.http.get(url);
  }

  getPhotoById(photoId: number) {

  }

  getPhotosByUser(user: User) {
    const tokenUrl1 = 'http://localhost:8080/rest/photo/user';
    const headers1 = new Headers({'Content-Type': 'application/json', 'Authorization': 'Bearer ' + localStorage.getItem('token')});
    return this.http.post(tokenUrl1, JSON.stringify(user), {headers: headers1});
  }

  updatePhoto(photo: Photo) {

  }

}
