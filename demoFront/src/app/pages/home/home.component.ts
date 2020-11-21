import { CompileShallowModuleMetadata } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { PersonaService } from '../../services/persona.service'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  showFormulario:boolean;
  showTable:boolean;
  personas:any[];
  
  constructor(private personaService:PersonaService) { 
    this.showFormulario = false;
    this.showTable = true;
    this.personas = [];
    this.listPersonas();
  }

  ngOnInit(): void {
  }

  showForm(){
    this.showFormulario = true;
    this.showTable = false;
  }

  addPersona(){}

  listPersonas(){
      
    console.log("listPersona");
    this.personaService.getPersonas().subscribe( (data) => {
      this.personas = data;
      console.log("DATA: "+JSON.stringify(this.personas));
    },(error) => {console.log(error)});
  
  }

}
