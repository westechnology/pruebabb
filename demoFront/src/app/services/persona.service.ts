import { Injectable } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http'
import { API_CONFIG } from '../config/apiconfig'
import { Observable,throwError} from 'rxjs'

@Injectable({
  providedIn: 'root'
})
export class PersonaService {

  constructor(private httpClien: HttpClient) { }


  getPersonas():Observable<any>{
     let url = `${API_CONFIG.url}/listPersona`;
     console.log(url);
     return this.httpClien.get<any>(url);
     
  }

  getPersonaByDocumento(tipoIde:string,numeroIde:string):Observable<any>{
    let url = `${API_CONFIG.url}/getPersona`+tipoIde+"/"+numeroIde;
    console.log(url);
    return this.httpClien.get<any>(url);
  }
}
