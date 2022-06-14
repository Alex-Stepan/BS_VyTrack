Feature: StoreManager From Dashboard page can NOT access the Vehicle Odometer page
  Background:
    Given Given  StoreManager on DashboardPage

  Scenario: StoreManager can NOT access the Vehicle Odometer page
    When  Select Vehicle Odometer feature under Fleet module
    Then  should appear message: You do not have permission to perform this action.