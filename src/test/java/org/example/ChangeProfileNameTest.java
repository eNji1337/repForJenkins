package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class ChangeProfileNameTest extends BaseTest {
    @Description("Change profile name")
    @Test
    public void changeProfileName() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn()
                .profileNameInput()
                .saveBtnProfilePage();
    }
}