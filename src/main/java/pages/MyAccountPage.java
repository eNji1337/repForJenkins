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

    @FindBy(xpath = "//*[@aria-label='Tweet text']")
    WebElement tweetMsgInput;

    @FindBy(name = "description")
    WebElement changeProfileBio;

    @FindBy(name = "location")
    WebElement changeProfileLocation;

    @FindBy(xpath = "//span[text()='Save']")
    WebElement saveBtnProfilePage;

    @Step("Enter data for Tweet's")
    public MyAccountPage tweetMsgInput() {
        logger.info("Enter Tweet message");
        tweetMsgInput.sendKeys("some tweets");
        return this;
    }
    @Step("Send Tweet button")
    public MyAccountPage sendTweetBtn() {
        logger.info("Click on the 'Send Tweet' button");
        sendTweetBtn.click();
        return this;
    }
    @Step("Enter Name")
    public MyAccountPage profileNameInput() {
        logger.info("Enter name in the Profile tab");
        profileNameInput.clear();
        profileNameInput.sendKeys("someKeys");
        return this;
    }
    @Step("Profile button")
    public MyAccountPage profileBtn() {
        logger.info("Click on the 'Profile button'");
        profilebtn.click();
        return this;
    }
    @Step("Edit profile button")
    public MyAccountPage profileEditBtn() {
        logger.info("Click on the 'Edit profile' button");
        editProfileBtn.click();
        return this;
    }

    @Step("Edit profile Bio")
    public MyAccountPage changeProfileBio(){
        changeProfileBio.clear();
        changeProfileBio.sendKeys("ggg.com");
        logger.info("Enter Bio in the profile tab");
        return this;
    }
    @Step("Edit profile Bio")
    public MyAccountPage changeProfileLocation(){
        changeProfileLocation.clear();
        changeProfileLocation.sendKeys("China");
        logger.info("Enter Location in the profile tab");
        return this;
    }
    @Step("Save profile")
    public MyAccountPage saveBtnProfilePage(){
        logger.info("Click on the Save button in the profile tab");
        saveBtnProfilePage.click();
        return this;
    }
}
