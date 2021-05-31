import { Stock } from './../shared/models/stock.model';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class DashboardService {

  readonly urlBase = 'http://localhost:8080/stock';

  constructor(private _http: HttpClient) { }

  async getStocks(): Promise<Stock[]> {
   return this._http.get<Stock[]>(`${this.urlBase}/today`).toPromise();
  }

}
