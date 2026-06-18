import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Div } from './div';

describe('Div', () => {
  let component: Div;
  let fixture: ComponentFixture<Div>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Div],
    }).compileComponents();

    fixture = TestBed.createComponent(Div);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
