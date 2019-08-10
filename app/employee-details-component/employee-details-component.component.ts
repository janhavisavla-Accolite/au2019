import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import {EmployeeServiceService} from '../employee-service.service';
import { Observable } from 'rxjs';
import {Employee, Address} from '../Employee';

@Component({
  selector: 'app-employee-details-component',
  templateUrl: './employee-details-component.component.html',
  styleUrls: ['./employee-details-component.component.css']
})
export class EmployeeDetailsComponentComponent implements OnInit {

  private sub:any;
  private Address: Address;
  employees: Employee[];
	addEmployee: boolean = false;
	newEmployee: Employee = new Employee();
	EmployeeId: Number;
	Name: string;
	Department: string;
  edit: boolean = false;
  id : Number;
  constructor(private employeeService: EmployeeServiceService, private route: ActivatedRoute) {
  }

  GetEmployee(): void{
    this.employeeService.getEmployees().subscribe(employees => this.employees = employees);
    };

ngOnInit() {
      // Subscribe to route params
      this.sub = this.route.params.subscribe(params => {
        this.id = params['id'];
       
        this.GetEmployee();
    });
  }

}