import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeeDetailsComponentComponent } from './employee-details-component.component';

describe('EmployeeDetailsComponentComponent', () => {
  let component: EmployeeDetailsComponentComponent;
  let fixture: ComponentFixture<EmployeeDetailsComponentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeeDetailsComponentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeeDetailsComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
