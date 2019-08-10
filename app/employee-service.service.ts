import {Injectable} from '@angular/core';
import {Http, Response, Headers, RequestOptions, RequestMethod} from '@angular/http';
import {Observable} from 'rxjs';
import {Employee, Address} from './Employee';
import  {map} from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
  public employeeListUrl = 'assets/employee.json';
  //public employeeDetailsUrl = 'http://localhost:52467/Employee/EmployeeDetails';
  //public employeeDetailsUrl = 'app/EmployeeList/address.json'
  //public employeeAddUrl = 'http://localhost:52467/Employee/EmployeeAdd'
  constructor(public _http: Http){
  
  }
  getEmployees():Observable<Employee[]>{
    return this._http.get(this.employeeListUrl)
    .pipe(map((response:Response) => <Employee[]> response.json()));
    }

    findEmployeeById(id):Observable<Employee[]>{
      //return this._http.get(this.employeeDetailsUrl + '/'+ id)
      //.map((response:Response) => <Address> response.json());
      return this._http.get(this.employeeListUrl + '/' + id)
      .pipe(map((response:Response) => <Employee[]> response.json()));
      
      }
  
  // DeleteEmployee(id){
  //   //return this._http.delete('http://localhost:4200/Employee/Delete/' + id);
  //   return this._http.delete<Employee[]>('http://localhost:4200/employeelist'); 
  //  }

}