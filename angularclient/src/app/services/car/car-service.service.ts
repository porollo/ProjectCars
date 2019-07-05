import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from "rxjs";
import {Car} from "../../models/car/car";

@Injectable()
export class CarService {

  private readonly usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/cars';
  }

  public findAll(): Observable<Car[]> {
    return this.http.get<Car[]>(this.usersUrl);
  }

  public save(car: Car) {
    return this.http.post<Car>(this.usersUrl, car);
  }
}
