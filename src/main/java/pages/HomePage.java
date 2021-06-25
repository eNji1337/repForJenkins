package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Войти']")
    public WebElement logInButton;



    @Step("Click on the 'Log in' button")
    public LoginPage goToLoginPage() {
        logInButton.click();
        return new LoginPage(driver);
    }

}
