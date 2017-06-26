import { Component } from '@angular/core';
import {Photo} from '../models/photo';
import {PhotoService} from '../services/photo.service';

@Component({
  selector: 'app-photo-list',
  templateUrl: './photo-list.component.html'
})
export class PhotoListComponent {
  photos: Photo[];
  selectedPhoto: Photo;

  constructor (private photoService: PhotoService) {
    this.photoService.getPhotos().subscribe(
      data => console.log(this.photos = JSON.parse(JSON.parse(JSON.stringify(data))._body)),
      error => console.log(error)
    );
  }
}
