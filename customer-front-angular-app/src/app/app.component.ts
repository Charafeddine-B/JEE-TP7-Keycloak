import {Component, OnInit} from '@angular/core';
import {SecurityService} from "./services/security.service";
import {KeycloakService} from "keycloak-angular";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  constructor(public secService : SecurityService, public kcService:KeycloakService) {
  }
  ngOnInit() {
  }

  title = 'customer-front-angular-app';

  async login()  {
    await this.kcService.login({
      redirectUri: window.location.origin
    });
  }
   logout() {
      this.kcService.logout(window.location.origin);
  }
}
