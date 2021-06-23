package pages;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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

    public void checkCorrectLogin(){
        Assert.assertTrue(checkCorrectLogin.isDisplayed());
    }

    @Step("Log in after entering email and password")
    public LoginPage loginBtn(){
        loginBtn.click();
        return this;
    }
    @Step("Enter email")
    public LoginPage enterEmail(String Login){
        inputEmail.sendKeys(Login);
        return this;
    }
    @Step("Enter password")
    public LoginPage enterPassword(String Password){
        inputPassword.sendKeys(Password);
        return this;
    }
}
