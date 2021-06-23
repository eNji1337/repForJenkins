package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class ProfileTests extends BaseTest {

    final String validLogin = "@Anton41505806";
    final String validPassword = "password12345";
    @Description("Change profile name")
    @Test
    public void ChangeProfileName() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn()
                .profileNameInput();
    }
}