package org.example;

import logger.DefaultListener;
import pages.HomePage;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(DefaultListener.class)
public class LoginTests extends BaseTest {
    /*    final String VALID_LOGIN = "@Anton41505806";
        final String VALID_PASSWORD = "password12345";*/
    @Description("Valid Login to Twitter")
    @Test
    public void validLogin() {
        new HomePage(driver)
                .goToLoginPage()
                .enterEmail(validlogin)
                .enterPassword(validpass)
                .loginBtn()
                .checkCorrectLogin();

    }
}
