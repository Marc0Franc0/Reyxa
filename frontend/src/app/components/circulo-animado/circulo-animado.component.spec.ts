import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CirculoAnimadoComponent } from './circulo-animado.component';

describe('CirculoAnimadoComponent', () => {
  let component: CirculoAnimadoComponent;
  let fixture: ComponentFixture<CirculoAnimadoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CirculoAnimadoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CirculoAnimadoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
