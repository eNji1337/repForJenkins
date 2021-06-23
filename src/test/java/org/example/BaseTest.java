package org.example;

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
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = DriverFactory.getDriver();
        //driver = new ChromeDriver();
        new HomePage(driver);
        driver.get(startUrl);

        /*ChromeOptions options = new ChromeOptions();
        RemoteWebDriver chromeDriver = new ChromeDriver(options);
        chromeDriver.setLogLevel(Level.INFO);
        driver = new EventFiringWebDriver(chromeDriver);*/
    }

    @AfterClass
    public void afterClass() {
        DriverFactory.tearDown();
    }
}
