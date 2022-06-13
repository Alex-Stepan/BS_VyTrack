package com.qa2.vytrack.pages;

import com.qa2.vytrack.utilities.Driver;
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

    @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span/i")
    public static WebElement FleetModule;

    @FindBy(linkText = "Vehicle Contracts")
    public static WebElement VehicleContractFeature;






    //------------------------------------------------------//


    /** 3. Methods: */





    /** Verify Title on Dashboard Page */
    public static void DashboardPage_TitleVerify(WebDriver driver) {
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
