import { Component, OnInit } from '@angular/core';

import { TaskService } from '../service/task.service'
import { Task } from '../interface/task';

import { AlertController, ToastController, LoadingController } from '@ionic/angular';

@Component({
  selector: 'app-home',
  templateUrl: './home.page.html',
  styleUrls: ['./home.page.scss'],
})
export class HomePage implements OnInit {

  tasks: Task[] = [];

  constructor(private taskService: TaskService,private alertCtrl: AlertController,
    private toastCtrl: ToastController,
    private loadingCtrl: LoadingController) { }

  ngOnInit() {
  }

  createTask(
    apellidoMaterno: string,
    apellidoPaterno: string,
    id:number,
    nombre: string,
    password : string,
    tipoUsuario : string,
    username : string
    ){
    const task = {
      apellidoMaterno,
      apellidoPaterno,
      id,
      nombre,
      password,
      tipoUsuario,
      username,
      

    };
    this.taskService.createTask(task)
    .subscribe((newTask) => {
      this.tasks.unshift(newTask);
      this.presentToast('Usuario creado  correctamente');
    });
  }


  async openAlert2() {
    const alert = await this.alertCtrl.create({
      header: 'Nueva Cuenta',
      
      inputs: [
        {
          
          name: 'apellidoMaterno',
           placeholder: 'Apellido Materno'
          
        },
        {
          name: 'apellidoPaterno',
           placeholder: 'apellido Paterno'
          
        },
        {
          name: 'id',
           placeholder: 'ID'
          
        },
        {
          name: 'nombre',
           placeholder: 'Nombre'
          
        },
        {
          name: 'password',
           placeholder: 'password',
           type:'password'
          
        },
        {
          name: 'tipoUsuario',
           placeholder: 'tipo usuario'
          
        },
        {
          name: 'username',
           placeholder: 'usuario'
          
        },

      ],
      buttons: [
        {
          text: 'Cancelar',
          role: 'cancel',
          cssClass: 'secondary',
          handler: () => {
            console.log('Confirm Cancel');
          }
        }, {
          text: 'Crear',
          handler: (data) => {
            this.createTask(data.apellidoMaterno,data.apellidoPaterno,data.id,data.nombre,data.password,data.tipoUsuario,
              data.username);


          }
        }
      ]
    });
    await alert.present();
  }



  async presentToast(message: string) {
    const toast = await this.toastCtrl.create({
      message,
      duration: 3000
    });
    await toast.present();
  }
  
}
