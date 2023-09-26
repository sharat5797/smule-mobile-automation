package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.LoginOptions.LoginOptionsScreen;
import smule.pages.LoginOptions.LoginOptionsScreenActions;

import java.util.Map;

public class LoginOptionsTest extends BaseTest {
    LoginScreen loginScreen;
    private LoginOptionsScreen loginOptionsScreen;
    private LoginOptionsScreenActions loginOptionsScreenActions;

    @Test(description = "Test login in App")
    public void testLoginOptionsScreen() {
        //Arrange
        loginOptionsScreen = new LoginOptionsScreen();
        loginOptionsScreenActions = new LoginOptionsScreenActions();
        //ACT
        loginOptionsScreenActions.scrollLanguages();
        loginOptionsScreen.selectLanguage();
        loginOptionsScreen.confrimLanguage();
        loginScreen = loginOptionsScreen.signInWithEmail();
        //Assert
        Assert.assertTrue(loginScreen.isHeaderPresent());
    }
}
