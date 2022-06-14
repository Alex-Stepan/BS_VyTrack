package com.qa2.vytrack.pages;

import com.qa2.vytrack.utilities.Driver;
import com.qa2.vytrack.utilities.DriverUtilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {
    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */








    //------------------------------------------------------//


    /** 3. Methods: */





    /** Verify Title on Dashboard Page */
    public static void VehicleOdometer_TitleVerify(WebDriver driver) {
        DriverUtilities.waitFor(3);

        String act_Title = driver.getTitle();
        String exp_Title = "Vehicle Odometer - Entities - System - Car - Entities - System";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the Vehicle Odometer page PASS");
        } else {
            System.out.println("Verification the Vehicle Odometer page FAIL");
        }
        System.out.println("------------------------------------------------------");
    }
}
