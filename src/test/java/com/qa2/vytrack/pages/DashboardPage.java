package com.qa2.vytrack.pages;

import com.qa2.vytrack.utilities.Driver;
import com.qa2.vytrack.utilities.DriverUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */

    //FLEET Module
        @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
        public static WebElement FleetModule;

        //Vehicle Contract feature
            @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[6]/a/span")
            public static WebElement VehicleContractFeature;

        //Vehicle Odometer feature
            @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[4]/a/span")
            public static WebElement VehicleOdometerFeature;

    //Fleet for TruckDriver
    @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
                        //*[@id="main-menu"]/ul/li[1]/a/span
    public static WebElement FleetModule_TruckDriver;





    //------------------------------------------------------//


    /** 3. Methods: */

    /** Verify Title on Dashboard Page */
    public static void DashboardPage_TitleVerify(WebDriver driver) {
        DriverUtilities.waitFor(3);

        String act_Title = driver.getTitle();
        String exp_Title = "Dashboard";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the Dashboard page PASS");
        } else {
            System.out.println("Verification the Dashboard page FAIL");
        }
        System.out.println("------------------------------------------------------");
    }
}
