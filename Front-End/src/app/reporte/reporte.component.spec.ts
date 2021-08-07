import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReporteTablasComponent } from './reporte.component';

describe('ReporteTablasComponent', () => {
  let component: ReporteTablasComponent;
  let fixture: ComponentFixture<ReporteTablasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReporteTablasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReporteTablasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
