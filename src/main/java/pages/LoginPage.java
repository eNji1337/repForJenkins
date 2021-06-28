package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "session[username_or_email]")
    public WebElement inputEmail;

    @FindBy(name = "session[password]")
    public WebElement inputPassword;

    @FindBy(xpath = "//span[text()='Войти']")
    public WebElement loginBtn;

    @FindBy(xpath = "//span[text()='@Anton41505806']")
    public WebElement checkCorrectLogin;

    @Step("Check correct login")
    public void checkCorrectLogin(){
        Assert.assertTrue(checkCorrectLogin.isDisplayed());
    }

    @Step("Log in after entering email and password")
    public LoginPage loginBtn(){
        logger.info("Click on the LogIn button after entering valid login and password");
        loginBtn.click();
        return this;
    }

    @Step("Enter email")
    public LoginPage enterEmail(String Login)  {
        logger.info("Enter valid email in the Email field");
        new WebDriverWait(driver, 10).
                until(ExpectedConditions.elementToBeClickable(inputEmail));
        inputEmail.sendKeys(Login);
        return this;
    }
    @Step("Enter password")
    public LoginPage enterPassword(String Password){
        logger.info("Enter valid password in the Password field");
        inputPassword.sendKeys(Password);
        return this;
    }
}
