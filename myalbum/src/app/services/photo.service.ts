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
}
