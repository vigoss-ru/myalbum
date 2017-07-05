import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {routing} from './app.routing';

import { AppComponent } from './app.component';
import { HomeComponent } from './components/home.component';
import { PhotoListComponent } from './components/photo-list.component';
import { SidePanelComponent } from './components/side-panel.component';
import { NavBarComponent } from './components/nav-bar.component';
import { RegisterComponent } from './components/register.component';

import { PhotoService } from './services/photo.service';
import { RegisterService } from './services/register.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    PhotoListComponent,
    SidePanelComponent,
    NavBarComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    routing
  ],
  providers: [
    PhotoService,
    RegisterService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
