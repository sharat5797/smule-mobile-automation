package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginTest extends BaseTest {

    LoginScreen loginScreen;
    HomeScreen homeScreen;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);

    @Test(description = "Test login in App")
    public void testLoginInApp() {
        //Arrange
        loginScreen = new LoginScreen();

        //ACT
        homeScreen = loginScreen.enterOrgName((String) credentials.get("username")).enterPassword((String) credentials.get("password")).clickLoginButton();

        //Assert
        Assert.assertTrue(homeScreen.isMenuPresent());
        Assert.assertEquals(homeScreen.getProductHeaderText(),"PRODUCTS");
    }
}
