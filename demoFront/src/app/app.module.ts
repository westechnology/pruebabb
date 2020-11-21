import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponentsModule} from './components/components.module'
import { PagesModule } from './pages/pages.module';
import { PersonaService} from '../app/services/persona.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ComponentsModule,
    PagesModule,
    HttpClientModule
  ],
  providers: [PersonaService],
  bootstrap: [AppComponent]
})
export class AppModule { }
