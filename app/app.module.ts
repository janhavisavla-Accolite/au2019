import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeDetailsComponentComponent } from './employee-details-component/employee-details-component.component';
import { HttpClientModule } from '@angular/common/http';
import { HttpModule } from '@angular/http';
import { DepartmentListComponent } from './department-list/department-list.component';
@NgModule({
  declarations: [
    AppComponent,
    EmployeelistComponent,
    EmployeeDetailsComponentComponent,
    DepartmentListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
