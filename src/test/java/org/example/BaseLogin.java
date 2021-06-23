package org.example;

import pages.HomePage;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class BaseLogin extends   BaseTest {
    private String validLogin = "@Anton41505806";
    private String validPassword = "password12345";


    @BeforeTest
    public void login() {
        new HomePage(driver)
                .goToLoginPage()
                .enterEmail(validLogin)
                .enterPassword(validPassword)
                .loginBtn();
    }
}
