package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.pages.LoginOptions.LoginOptionsScreen;
import smule.pages.LoginOptions.LoginOptionsScreenActions;

import java.util.Map;

public class LoginTest extends BaseTest {
    LoginScreen loginScreen;
    HomeScreen homeScreen;
    LoginOptionsScreen loginOptionsScreen;
    LoginOptionsScreenActions loginOptionsScreenActions;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @BeforeMethod
    public void setupLanguage(){
        loginOptionsScreen = new LoginOptionsScreen();
        loginOptionsScreenActions = new LoginOptionsScreenActions();
        loginOptionsScreenActions.scrollLanguages();
        loginOptionsScreen.selectLanguage();
        loginOptionsScreen.confrimLanguage();
        loginScreen = loginOptionsScreen.signInWithEmail();
    }

    @Test(description = "Test Login Success")
    public void testLoginInApp() {
        //ACT
        loginScreen.enterEmail((String) credentials.get("email")).clickNextButton();
        homeScreen = loginScreen.enterPassword((String) credentials.get("password")).clickNextButton();
        //Assert
        Assert.assertTrue(homeScreen.isLocationTitlePresent());
        Assert.assertEquals(homeScreen.getLocationHeaderText(), "Music in my area");
    }
}
