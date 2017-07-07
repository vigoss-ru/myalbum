import {User} from '../models/user';
import {Injectable} from '@angular/core';
import {Photo} from '../models/photo';
import {Http, Headers} from '@angular/http';

@Injectable()
export class UserService {

  constructor (private http: Http) {}

  getUserByName (username: string) {
    const tokenUrl =  'http://localhost:8080/rest/user/userName';
    const headers = new Headers({'Content-Type': 'application/json', 'Authorization': 'Bearer ' + localStorage.getItem('token')});
    return this.http.post(tokenUrl, username, {headers: headers});
  }



}
