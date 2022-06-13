package com.qa2.vytrack.pages;

import com.qa2.vytrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllVehicleContractPage {
    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public AllVehicleContractPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */

    @FindBy(partialLinkText = "Total of ")
    public static WebElement TotalOfRecords;


    //------------------------------------------------------//


    /** 3. Methods: */

    /** Verify Title on Login Page */
    public static void AllVehicleContractPage_TitleVerify(WebDriver driver) {
        String act_Title = driver.getTitle();
        String exp_Title = "All - Vehicle Contract - Entities - System - Car - Entities - System";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the AllVehicleContract page PASS");
        } else {
            System.out.println("Verification the AllVehicleContract page FAIL");
        }
        System.out.println("------------------------------------------------------");
    }

    /** Verify if Total of Records is more than One */
//    public static void TotalOfRecords(WebDriver driver){
//        String recordsOfResult = TotalOfRecords.getText();
//        String part1 = "Total of ";
//        String part2 = "";
//        String part3 = "records";
//
//
//    }



}
