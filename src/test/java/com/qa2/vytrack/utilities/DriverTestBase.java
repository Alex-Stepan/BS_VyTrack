package com.qa2.vytrack.utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

    /**
     * This class is meant to be super class
     * to provide driver set up and closing browser
     * for it's subclasses
     *
     * // Now you can try to replace driver with
     * Driver.getDriver() so it can be same driver everywhere wherever you use
     */

    public class DriverTestBase {

        //1.
        protected WebDriver driver;

        //2.
        public void setupWebDriver() {
            driver = Driver.getDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get("https://qa2.vytrack.com/");
        }

        //3.
        public void closeBrowser() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }

    }

