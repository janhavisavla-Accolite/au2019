import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeDetailsComponentComponent } from './employee-details-component/employee-details-component.component';
import { DepartmentListComponent } from './department-list/department-list.component';


const routes: Routes =  [{
  path: "employeelist", component: EmployeelistComponent
}, {
  path: "employee/:id", component: EmployeeDetailsComponentComponent
},
{
  path: "departmentlist", component: DepartmentListComponent
} 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
