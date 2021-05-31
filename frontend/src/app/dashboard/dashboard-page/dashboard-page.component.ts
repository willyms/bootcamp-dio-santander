import { DashboardService } from './../dashboard.service';
import { Stock } from './../../shared/models/stock.model';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard-page',
  templateUrl: './dashboard-page.component.html',
  styleUrls: ['./dashboard-page.component.scss']
})
export class DashboardPageComponent implements OnInit {

  stocks: Stock[] = [];

  constructor(private dashboardService: DashboardService) { }

  ngOnInit(): void { this.fetchStocks() }

  async fetchStocks(): Promise<void> {
    this.stocks = await this.dashboardService.getStocks();
  }


}
