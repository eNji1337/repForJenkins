package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class ProfileTest extends BaseTest {

    @Description("Change profile name")
    @Test
    public void ChangeProfileName() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn()
                .profileNameInput();
    }
}