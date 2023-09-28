package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.LoginOptions.LoginOptionsScreen;
import smule.pages.LoginOptions.LoginOptionsScreenActions;

import java.util.Map;

public class HomeScreenTest extends BaseTest {
    LoginScreen loginScreen;
    HomeScreen homeScreen;
    LoginOptionsScreen loginOptionsScreen;
    LoginOptionsScreenActions loginOptionsScreenActions;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @BeforeMethod
    public void setupLogin(){
        loginOptionsScreen = new LoginOptionsScreen();
        loginOptionsScreenActions = new LoginOptionsScreenActions();
        loginOptionsScreenActions.scrollLanguages();
        loginOptionsScreen.selectLanguage();
        loginOptionsScreen.confrimLanguage();
        loginScreen = loginOptionsScreen.signInWithEmail();
        loginScreen.enterEmail((String) credentials.get("email")).clickNextButton();
        homeScreen = loginScreen.enterPassword((String) credentials.get("password")).clickNextButton();
    }
    @Test(description = "Test login in App")
    public void testLocationPermission() {
        //ACT
        homeScreen.clickLocationPermissionOk();
        homeScreen.clickWhileUsingTheApp();
        //Assert
        Assert.assertTrue(homeScreen.isToolBarPresent());
    }
}
