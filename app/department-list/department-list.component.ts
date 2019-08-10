import { Component, OnInit } from '@angular/core';
import {Employee} from '../employee'
import {EmployeeServiceService} from '../employee-service.service';

@Component({
  selector: 'app-department-list',
  templateUrl: './department-list.component.html',
  styleUrls: ['./department-list.component.css']
})
export class DepartmentListComponent implements OnInit {

  pageTitle : string = 'Employee List';
	employees: Employee[];
	Department: string;
	edit: boolean = false;
	GetEmployee(): void{
	this._employeeService.getEmployees().subscribe(employees => this.employees = employees);
	};

	constructor(private _employeeService : EmployeeServiceService){
	}
	
	ngOnInit() : void{
	this.GetEmployee();
  }
  
}