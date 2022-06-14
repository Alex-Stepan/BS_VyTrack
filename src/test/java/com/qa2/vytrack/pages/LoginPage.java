package com.qa2.vytrack.pages;

import com.qa2.vytrack.utilities.Driver;
import com.qa2.vytrack.utilities.DriverUtilities;
import com.qa2.vytrack.utilities.Login_Credentials;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    public static void LoginPage_TitleVerify(WebDriver driver) {
        String act_Title = driver.getTitle();
        String exp_Title = "Login";
        if (act_Title.equals(exp_Title)){
            System.out.println("Verification the Login page PASS");
        } else {
            System.out.println("Verification the Login page FAIL");
        }
        System.out.println("------------------------------------------------------");
    }

    //------------------------------------------------------//

    public static void Login_as_StoreManager(WebDriver driver){
        //1.
            LoginPage loginPage = new LoginPage();

            Actions action = new Actions(driver);

        //2. identify UsernameBox, clear and input username
            action.moveToElement(loginPage.UsernameBox).click();

            action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
            DriverUtilities.waitFor(1);

            action.sendKeys(Login_Credentials.getCorrUsernameList().get(4)).perform();

        //3. identify PasswordBox, clear and input password
            action.moveToElement(loginPage.PasswordBox).click();

            action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
            DriverUtilities.waitFor(1);

            action.sendKeys(Login_Credentials.getCorrPasswordList().get(0)).perform();

        //4.
            action.moveToElement(loginPage.LoginBtn).click().perform();
            DriverUtilities.waitFor(5);
    }


    public static void Login_as_SalesManager(WebDriver driver){

        //1.
        LoginPage loginPage = new LoginPage();

        Actions action = new Actions(driver);

        //2. identify UsernameBox, clear and input username
        action.moveToElement(loginPage.UsernameBox).click();

        action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        DriverUtilities.waitFor(1);

        action.sendKeys(Login_Credentials.getCorrUsernameList().get(7)).perform();

        //3. identify PasswordBox, clear and input password
        action.moveToElement(loginPage.PasswordBox).click();

        action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        DriverUtilities.waitFor(1);

        action.sendKeys(Login_Credentials.getCorrPasswordList().get(0)).perform();

        //4.
        action.moveToElement(loginPage.LoginBtn).click().perform();
        DriverUtilities.waitFor(3);


    }

    public static void Login_as_TruckDriver(WebDriver driver){
        //1.
        LoginPage loginPage = new LoginPage();

        Actions action = new Actions(driver);

        //2. identify UsernameBox, clear and input username
        action.moveToElement(loginPage.UsernameBox).click();

        action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        DriverUtilities.waitFor(1);

        action.sendKeys(Login_Credentials.getCorrUsernameList().get(1)).perform();

        //3. identify PasswordBox, clear and input password
        action.moveToElement(loginPage.PasswordBox).click();

        action.keyDown(Keys.CONTROL).sendKeys(Keys.chord("A")).keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        DriverUtilities.waitFor(1);

        action.sendKeys(Login_Credentials.getCorrPasswordList().get(0)).perform();

        //4.
        action.moveToElement(loginPage.LoginBtn).click().perform();
        DriverUtilities.waitFor(5);
    }


}
