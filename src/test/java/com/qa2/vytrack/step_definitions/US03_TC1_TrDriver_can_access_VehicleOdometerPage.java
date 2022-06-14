package com.qa2.vytrack.step_definitions;

import com.qa2.vytrack.pages.DashboardPage;
import com.qa2.vytrack.pages.LoginPage;
import com.qa2.vytrack.pages.VehicleOdometerPage;
import com.qa2.vytrack.utilities.DriverTestBase;
import com.qa2.vytrack.utilities.DriverUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US03_TC1_TrDriver_can_access_VehicleOdometerPage extends DriverTestBase {


    @Given("Truck Driver on DashboardPage")
    public void truck_driver_on_dashboard_page() {
        //1. set up WebDriver & navigate to loginPage
        setupWebDriver();

        //2. verify if on Login page
        LoginPage.LoginPage_TitleVerify(driver);

        //3. Login as a Store Manager
        LoginPage.Login_as_TruckDriver(driver);

        //4. verify if on Dashboard page
        DashboardPage.DashboardPage_TitleVerify(driver);

    }

    @When("Select Vehicle Odometer feature under Fleet module")
    public void select_vehicle_odometer_feature_under_fleet_module() {
        //1. declaration
        Actions action = new Actions(driver);

        //2. select Fleet
        action.moveToElement(DashboardPage.FleetModule_TruckDriver).click().perform();
        DriverUtilities.waitFor(3);

        //3. select Vehicle Odometer
        action.moveToElement(DashboardPage.VehicleOdometerFeature).click().perform();
        DriverUtilities.waitFor(3);

    }


    @Then("navigates to VehicleOdometerPage")
    public void navigates_to_vehicle_odometer_page() {

        //1. title verification
        VehicleOdometerPage.VehicleOdometer_TitleVerify(driver);

        //2. note about completion
        System.out.println("Test is completed");
        System.out.println("------------------------------------------------------");

        //3.
        driver.quit();

    }

}
