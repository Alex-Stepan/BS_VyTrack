Feature: SalesManager From VehicleContract page access the Vehicle Contract
  Background:
    Given SalesManager on DashboardPage

  Scenario: VehicleContract page access the Vehicle Contract
    When select Contracts feature under Fleet Module
    Then should navigate to Vehicle Contract page