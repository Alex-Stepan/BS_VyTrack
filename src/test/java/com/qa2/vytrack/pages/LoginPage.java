package com.qa2.vytrack.pages;

import com.qa2.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //------------------------------------------------------//

    /** 1. Initialization of the page: */
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //------------------------------------------------------//


    /** 2. WebElements: */


    //UsernameBox
    @FindBy(css = "input[id='prependedInput']")
    public WebElement UsernameBox;

    //PasswordBox
    @FindBy(css = "input[id='prependedInput2']")
    public WebElement PasswordBox;

    //LoginBtn
    @FindBy(css = "button[id='_submit']")
    public WebElement LoginBtn;


    //------------------------------------------------------//


    /** 3. Methods: */



    //------------------------------------------------------//


}
