package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.PropertyHelper;
import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;

    static final String validlogin = PropertyHelper.getConf().valid_login();
    static final String validpass = PropertyHelper.getConf().valid_password();
    static final String startUrl = PropertyHelper.getConf().startUrl();


    @BeforeClass
    public void beforeClass() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get(startUrl);
        new HomePage(driver)
                .goToLoginPage()
                .enterEmail(validlogin)
                .enterPassword(validpass)
                .loginBtn();
    }

    @AfterClass
    public void afterClass() {
        DriverFactory.tearDown();
    }
}
