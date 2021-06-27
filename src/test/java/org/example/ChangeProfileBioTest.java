package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class ChangeProfileBioTest extends BaseTest {
    @Description("Change profile Bio")
    @Test
    public void changeProfileBio() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn()
                .changeProfileBio()
                .saveBtnProfilePage();
    }
}
