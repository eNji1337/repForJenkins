package org.example;

import driver.DriverFactory;
import logger.DefaultListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;
import pages.PropertyHelper;

public class BaseTest {
    WebDriver driver;

    static final String validlogin = PropertyHelper.getConf().valid_login();
    static final String validpass = PropertyHelper.getConf().valid_password();
    static final String startUrl = PropertyHelper.getConf().startUrl();

    @BeforeClass
    public void beforeClass() throws InterruptedException {
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
