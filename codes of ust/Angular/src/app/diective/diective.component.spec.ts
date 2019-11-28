import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DiectiveComponent } from './diective.component';

describe('DiectiveComponent', () => {
  let component: DiectiveComponent;
  let fixture: ComponentFixture<DiectiveComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DiectiveComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DiectiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
