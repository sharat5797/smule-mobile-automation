package smule.pages.Activity;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import smule.pages.Home.HomeScreen;

import java.time.Duration;

public class ActivityScreen extends ActivityLocators{
    @Step("click on invites Button")
    public ActivityScreen clickInvitesButton() {
        invitesButton.click();
        return this;
    }
    @Step("click on Notification Button")
    public ActivityScreen clickNotificationButton() {
        notificationButton.click();
        return this;
    }
    @Step("click on News Button")
    public ActivityScreen clickNewsButton() {
        newsButton.click();
        return this;
    }
    @Step("tap on suggetion tab")
    public ActivityScreen tapSuggetionTab() {
        suggestion.click();
        return this;
    }

    public boolean isInvitesNavigatorVisible(){
        return invitesButton.isDisplayed();
    }
    public boolean isNotificationsVisible(){
        return notifications.isDisplayed();
    }
    public boolean isInvitesVisible(){
        return invites.isDisplayed();
    }
    public boolean isNewsVisible(){
        return news.isDisplayed();
    }
    public void tap(){
        new TouchAction((PerformsTouchActions) androidDriver).press(PointOption.point(500, 1100))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
