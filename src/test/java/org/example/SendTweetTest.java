package org.example;

import pages.MyAccountPage;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pages.MyAccountPage;

public class SendTweetTest extends BaseTest {

    @Description("Send Tweet's")
    @Test
    public void sendTweet() {
        new MyAccountPage(driver)
            .sendTweetBtn()
            .tweetMsgInput();
    }
}