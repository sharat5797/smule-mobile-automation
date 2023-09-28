package smule.pages.Home;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.qameta.allure.Step;
import smule.pages.Feed.FeedScreen;
import smule.pages.Login.LoginLocators;
import smule.pages.Login.LoginScreen;
import smule.pages.Message.MessageScreen;
import smule.pages.Search.SearchScreen;

import java.time.Duration;

public class HomeScreen extends HomeLocators {
    public boolean isLocationTitlePresent() {
        return getLocationTitle().isDisplayed();
    }
    public String getLocationHeaderText() {
        return getLocationTitle().getText();
    }
    @Step("click on locationPermissionOk")
    public HomeScreen clickLocationPermissionOk() {
        locationPermissionOk.click();
        return this;
    }
    @Step("click on whileUsingTheApp")
    public HomeScreen clickWhileUsingTheApp() {
        whileUsingTheApp.click();
        return this;
    }
    public boolean isToolBarPresent() {
        return toolbar.isDisplayed();
    }

    @Step("Navigate to Message Screen")
    public MessageScreen navigateToMessageScreen(){
        messageIconLocator.click();
        return new MessageScreen();
    }
    @Step("Navigate to Feed Screen")
    public FeedScreen navigateToFeedScreen(){
        feedButton.click();
        return new FeedScreen();
    }

    @Step("clicking on search button")
    public SearchScreen clickOnSearchButton() {
        searchBtnLocator.click();
        return new SearchScreen();
    }

    public HomeScreen goBackFromPremiumAdd(){
//        new HomeLocators();
//        System.out.println(premiumHeader.getText());
//        if(premiumHeader == null){
//            return this;
//        }else{
//            goBackBtnPremiumAdd.click();
//        }
        return this;
    }


    public void tap(){
        new TouchAction((PerformsTouchActions) androidDriver).press(PointOption.point(1002, 375))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
