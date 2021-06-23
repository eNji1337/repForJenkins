package pages;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(WebDriver driver) {
        PageFactory.initElements(DriverFactory.getDriver(), this);
    }
}
