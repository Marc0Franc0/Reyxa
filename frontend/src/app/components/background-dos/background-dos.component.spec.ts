import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BackgroundDosComponent } from './background-dos.component';

describe('BackgroundDosComponent', () => {
  let component: BackgroundDosComponent;
  let fixture: ComponentFixture<BackgroundDosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BackgroundDosComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BackgroundDosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
