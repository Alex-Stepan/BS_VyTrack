Feature: Truck Driver From Dashboard page access the Vehicle Odometer page
  Background:
    Given Truck Driver on DashboardPage

  Scenario: Truck Driver access the Vehicle Odometer page
    When  Select Vehicle Odometer feature under Fleet module
    Then  navigates to VehicleOdometerPage