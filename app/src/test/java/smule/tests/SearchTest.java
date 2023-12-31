package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Home.HomeLocators;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.LoginOptions.LoginOptionsScreen;
import smule.pages.LoginOptions.LoginOptionsScreenActions;
import smule.pages.Search.SearchScreen;

import java.util.Map;

public class SearchTest extends BaseTest {
    LoginScreen loginScreen;
    HomeScreen homeScreen;
    LoginOptionsScreen loginOptionsScreen;
    LoginOptionsScreenActions loginOptionsScreenActions;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @BeforeMethod(groups = {"full", "sanity"})
    public void setupLogin(){
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
        new HomeLocators();
    }
    @Test(description = "Test Search ", groups = {"full","sanity"})
    public void shouldTestSearch() {
        //Arrange
        SearchScreen searchScreen = homeScreen.clickOnSearchButton();
        String text = "Kannada";
        //Act
        searchScreen.enterText(text).clickOnSearchResult();
        //Assert
        Assert.assertTrue(searchScreen.isListOfSearchResultDisplayed());
    }
}
