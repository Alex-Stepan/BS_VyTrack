package com.qa2.vytrack.step_definitions;

import com.qa2.vytrack.pages.AllVehicleContractPage;
import com.qa2.vytrack.pages.DashboardPage;
import com.qa2.vytrack.pages.LoginPage;
import com.qa2.vytrack.utilities.DriverTestBase;
import com.qa2.vytrack.utilities.DriverUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;

public class US07_T2_SalesMang_access_VehicleContract extends DriverTestBase {

    /**
     * Verify that only authorized user should be able to access Vehicle Contract
     * (Note: authorized users: store manager, sales manager)
     */

    @Given("SalesManager on DashboardPage")
    public void sales_manager_on_dashboard_page() {
        //1. set up WebDriver & navigate to loginPage
        setupWebDriver();

        //2. verify if on Login page
        LoginPage.LoginPage_TitleVerify(driver);

        //3. Login as a Store Manager
        LoginPage.Login_as_SalesManager(driver);

        //4. verify if on Dashboard page
        DashboardPage.DashboardPage_TitleVerify(driver);
    }

}
