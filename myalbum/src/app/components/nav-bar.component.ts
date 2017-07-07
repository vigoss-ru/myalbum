import { Component } from '@angular/core';
import {LoginService} from '../services/login.service';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html'
})

export class NavBarComponent {

  constructor (private loginService: LoginService) {

  }

  onClick() {
    if (this.loginService.checkLogin()) {
      this.loginService.logout();
    }
  }

}

