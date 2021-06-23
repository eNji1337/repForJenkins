package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Profile']")
    WebElement profilebtn;

    @FindBy(xpath = "//span[text()='Edit profile']")
    WebElement editProfileBtn;

    @FindBy(name = "displayName")
    WebElement profileNameInput;

    @FindBy(xpath = "//span[text()='Tweet']")
    WebElement sendTweetBtn;

    @FindBy(className = "DraftEditor-editorContainer")
    WebElement tweetMsgInput;

    @Step("Enter data for Tweet's")
    public MyAccountPage tweetMsgInput() {
        tweetMsgInput.sendKeys("some tweets");
        return this;
    }
    @Step("Send Tweet button")
    public MyAccountPage sendTweetBtn() {
        sendTweetBtn.click();
        return this;
    }
    @Step("Enter Name")
    public MyAccountPage profileNameInput() {
        profileNameInput.sendKeys("someKeys");
        return this;
    }
    @Step("Profile button")
    public MyAccountPage profileBtn() {
        profilebtn.click();
        return this;
    }
    @Step("Edit profile button")
    public MyAccountPage profileEditBtn() {
        editProfileBtn.click();
        return this;
    }

}
