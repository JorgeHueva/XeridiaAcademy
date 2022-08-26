/* tslint:disable:no-unused-variable */
import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';
import { DebugElement } from '@angular/core';

import { Juego_dinosaurioComponent } from './juego_dinosaurio.component';

describe('Juego_dinosaurioComponent', () => {
  let component: Juego_dinosaurioComponent;
  let fixture: ComponentFixture<Juego_dinosaurioComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Juego_dinosaurioComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Juego_dinosaurioComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
