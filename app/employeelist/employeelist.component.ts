import { Component, OnInit } from '@angular/core';
import {Employee} from '../employee'
import {EmployeeServiceService} from '../employee-service.service';
// import { ROUTER_DIRECTIVES } from '@angular/router';
// import { FormsModule } from '@angular/forms';
// import {NgForm}    from 'angular2/common';

@Component({
  selector: 'app-employeelist',
  templateUrl: './employeelist.component.html',
  styleUrls: ['./employeelist.component.css']
})
export class EmployeelistComponent implements OnInit {
  pageTitle : string = 'Employee List';
	employees: Employee[];
	addEmployee: boolean = false;
	newEmployee: Employee = new Employee();
	EmployeeId: Number;
	Name: string;
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

	// AddEmployee(): void{
	// this.addEmployee = true;
	// }

	// SaveData(): void{
	// this.newEmployee.EmployeeId = this.EmployeeId;
	// this.newEmployee.Name = this.Name;
	// this.newEmployee.Department = this.Department;
	// this.newEmployee.Address.Street = "125 street";
	// this.newEmployee.Address.State = "Mah";
	// this.newEmployee.Address.Pincode = 123;
	// this.addEmployee = false;
	// console.log(this.newEmployee);
	// this._employeeService.AddEmployee(this.newEmployee).subscribe(success => {
  //        // refresh the list
	// 	 this.GetEmployee();
  //        return true;
  //      },
  //      error => {
  //        console.error("Error saving Employee!"+ error.Message);
  //      });
	
	// }

	DeleteEmployee(employee):void {
    // if (confirm("Are you sure you want to delete " + employee.Name + "?")) {
    //   this._employeeService.DeleteEmployee(employee.EmployeeId).subscribe(
    //      data => {
    //        // refresh the list
    //        this.GetEmployee();
    //        return true;
    //      },
    //      error => {
    //        console.error("Error deleting Employee!");
    //      }
    //   );
    //     }
    if (confirm("Are you sure you want to delete " + employee.Name + "?")) {
    this._employeeService.getEmployees()  
      .subscribe(data => {  
        this.employees = this.employees.filter(u => u !== employee); 
        return true;  
      },  error => {
               console.error("Error deleting Employee!");
              }) ;
            }

  }
}