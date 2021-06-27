package org.example;

import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class ChangeProfileLocationTest extends BaseTest {
    @Description("Change profile Location")
    @Test
    public void changeProfileLocation() {
        new MyAccountPage(driver)
                .profileBtn()
                .profileEditBtn()
                .changeProfileLocation()
                .saveBtnProfilePage();
    }
}
