package com.qa2.vytrack.step_definitions;

import com.qa2.vytrack.pages.DashboardPage;
import com.qa2.vytrack.pages.LoginPage;
import com.qa2.vytrack.utilities.DriverTestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US03_TC2_StoreMan_canNOT_access_VehicleOdometerPage extends DriverTestBase {
    @Given("Given  StoreManager on DashboardPage")
    public void given_store_manager_on_dashboard_page() {
        //1. set up WebDriver & navigate to loginPage
        setupWebDriver();

        //2. verify if on Login page
        LoginPage.LoginPage_TitleVerify(driver);

        //3. Login as a Store Manager
        LoginPage.Login_as_StoreManager(driver);

        //4. verify if on Dashboard page
        DashboardPage.DashboardPage_TitleVerify(driver);


    }
    @Then("should appear message: You do not have permission to perform this action.")
    public void should_appear_message_you_do_not_have_permission_to_perform_this_action() {

    }
}
