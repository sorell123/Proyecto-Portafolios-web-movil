import { Injectable } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { AlertController, ToastController, LoadingController } from '@ionic/angular';
import { NativeStorage } from '@ionic-native/native-storage/ngx';
import { tap } from 'rxjs/operators';



import { Task } from './../interface/task'
import { Task2} from './../interface/task2'

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  
  //private api="http://localhost:3001/usuarios";
  //private api2="http://localhost:3001/asesoria";

  private api="http://localhost:8080/ApiRESTJAVA3/webresources/entity.usuarios";
  private api2="http://localhost:8080/ApiRESTJAVA3/webresources/entity.asesoria";
 

  constructor(public http: HttpClient,private storage: NativeStorage,
    ) { }

   getAllTasks(){
      const path = `${this.api}/`;
      return this.http.get<Task[]>(path);
   }


   getAllTasks2(){
    const path = `${this.api2}/`;
    return this.http.get<Task2[]>(path);
 }


   getTask(id: number) {
    const path = `${this.api}/${id}`;
    return this.http.get<Task>(path);
  }

  
  createTask(task: Task) {
    const path = `${this.api}/`;
    return this.http.post<Task>(path, task);
  }


    
  createTask2(task: Task) {
    const path = `${this.api2}/`;
    return this.http.post<Task>(path, task);
  }


  updateTask(task: Task) {
    const path = `${this.api}/${task.id}`;
    return this.http.put<Task>(path, task);
  }
 
  deleteTask(id: string) {
    const path = `${this.api}/${id}`;
    return this.http.delete(path);
  }

  
  deleteTask2(id: string) {
    const path = `${this.api2}/${id}`;
    return this.http.delete(path);
  }





}
