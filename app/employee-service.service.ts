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

  constructor(public _http: Http){
  
  }
  getEmployees():Observable<Employee[]>{
    return this._http.get(this.employeeListUrl)
    .pipe(map((response:Response) => <Employee[]> response.json()));
    }

    findEmployeeById(id):Observable<Employee[]>{
   
      return this._http.get(this.employeeListUrl + '/' + id)
      .pipe(map((response:Response) => <Employee[]> response.json()));
      
      }


}