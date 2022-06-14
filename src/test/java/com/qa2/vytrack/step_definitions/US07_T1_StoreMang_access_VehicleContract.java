package com.qa2.vytrack.step_definitions;

import com.qa2.vytrack.pages.AllVehicleContractPage;
import com.qa2.vytrack.pages.DashboardPage;
import com.qa2.vytrack.pages.LoginPage;
import com.qa2.vytrack.utilities.DriverTestBase;
import com.qa2.vytrack.utilities.DriverUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US07_T1_StoreMang_access_VehicleContract extends DriverTestBase {
        // use extends to DriverTestBase

    /**
     * Verify that only authorized user should be able to access Vehicle Contract
     * (Note: authorized users: store manager, sales manager)
     */

    @Given("StoreManager on DashboardPage")
    public void store_manager_on_dashboard_page() {
        //1. set up WebDriver & navigate to loginPage
        setupWebDriver();

        //2. verify if on Login page
        LoginPage.LoginPage_TitleVerify(driver);

        //3. Login as a Store Manager
        LoginPage.Login_as_StoreManager(driver);

        //4. verify if on Dashboard page
        DashboardPage.DashboardPage_TitleVerify(driver);
    }


    @When("select Contracts feature under Fleet Module")
    public void select_contracts_feature_under_fleet_module() {
        DashboardPage dashboard = new DashboardPage();
        Actions action = new Actions(driver);

        action.moveToElement(dashboard.FleetModule).perform();
        DriverUtilities.waitFor(3);

        action.moveToElement(dashboard.VehicleContractFeature).click().perform();
        DriverUtilities.waitFor(3);

    }


    @Then("should navigate to Vehicle Contract page")
    public void should_navigate_to_vehicle_contract_page() {

        AllVehicleContractPage.AllVehicleContractPage_TitleVerify(driver);

        System.out.println("Test is completed");
        System.out.println("------------------------------------------------------");


        driver.quit();


    }


}
