package org.example;

import io.qameta.allure.Description;
import logger.DefaultListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;


@Listeners(DefaultListener.class)
public class LoginTest extends BaseTest {
    @Description("Valid Login to Twitter")
    @Test
    public void validLogin() {
        new LoginPage(driver)
                .checkCorrectLogin();
    }
}
