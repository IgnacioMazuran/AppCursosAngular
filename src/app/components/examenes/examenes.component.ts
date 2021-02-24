import { Component, OnInit } from '@angular/core';
import { Examen } from 'src/app/models/examen';
import { CommonListarComponent } from '../common-listar.component';
import { ExamenService } from 'src/app/services/examen.service';
@Component({
  selector: 'app-examenes',
  templateUrl: './examenes.component.html',
  styleUrls: ['./examenes.component.css']
})
export class ExamenesComponent 
extends CommonListarComponent<Examen, ExamenService> implements OnInit {

  constructor(service: ExamenService) {
    super(service);
    this.titulo = 'Listado de Examenes';
    this.nombreModel = Examen.name;
   }

  

}
