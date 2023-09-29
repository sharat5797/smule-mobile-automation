package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Activity.ActivityLocators;
import smule.pages.Activity.ActivityScreen;
import smule.pages.Feed.FeedScreen;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.LoginOptions.LoginOptionsScreen;
import smule.pages.LoginOptions.LoginOptionsScreenActions;
import smule.pages.Message.MessageScreen;

import java.util.Map;

public class ActivityTest extends BaseTest {
    LoginScreen loginScreen;
    HomeScreen homeScreen;
    LoginOptionsScreen loginOptionsScreen;
    LoginOptionsScreenActions loginOptionsScreenActions;
    FeedScreen feedScreen;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @BeforeMethod
    public void setUpActivityScreen(){
        loginOptionsScreen = new LoginOptionsScreen();
        loginOptionsScreenActions = new LoginOptionsScreenActions();
        loginOptionsScreenActions.scrollLanguages();
        loginOptionsScreen.selectLanguage();
        loginOptionsScreen.confrimLanguage();
        loginScreen = loginOptionsScreen.signInWithEmail();
        loginScreen.enterEmail((String) credentials.get("email")).clickNextButton();
        homeScreen = loginScreen.enterPassword((String) credentials.get("password")).clickNextButton();
        homeScreen.clickLocationPermissionOk();
        homeScreen.clickWhileUsingTheApp();
        homeScreen.tap();
    }
    @Test(description = "Test Activity Screen")
    public void activityScreenTest() {
        ActivityScreen activityScreen = homeScreen.navigateToActivityScreen();
        activityScreen.tapSuggetionTab();
        new ActivityLocators();
        Assert.assertTrue(activityScreen.isInvitesNavigatorVisible());
    }
}
