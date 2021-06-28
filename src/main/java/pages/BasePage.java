package pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BasePage {
    WebDriver driver;

    public static Logger logger = LoggerFactory.getLogger(WebDriver.class);

    public BasePage(WebDriver driver) {
        PageFactory.initElements(DriverFactory.getDriver(), this);
        this.driver = driver;
    }
}
