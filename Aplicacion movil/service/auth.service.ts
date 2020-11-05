import { Injectable } from '@angular/core';

import { HttpClient,HttpHeaders } from '@angular/common/http';

import { HttpService } from './http.service';
import { StorageService } from './storage.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';
import { AuthConstants } from './../config/auth-constants';

import { Task } from './../interface/task'


@Injectable({
  providedIn: 'root'
})
export class AuthService {

  private api="http://localhost:8080/ApiRESTJAVA3/webresources/entity.usuarios";


  constructor(private httpService: HttpService,
    private storageService: StorageService,
    private router: Router,
    public http: HttpClient
   ) { }


   
   login(postData: any): Observable<any> {
    return this.httpService.post('', postData);
 
    }

     
      signup(postData: any): Observable<any> {
      return this.httpService.post('', postData);
      }
      
      logout() {
      this.storageService.removeStorageItem(AuthConstants.AUTH).then(res => {
      this.router.navigate(['/login']);
      });
      }
}


