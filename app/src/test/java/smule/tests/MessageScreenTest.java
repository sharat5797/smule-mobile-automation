package smule.tests;

import common_utils.ConfigLoader;
import common_utils.FilePaths;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import smule.BaseTest;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginScreen;
import smule.pages.LoginOptions.LoginOptionsScreen;
import smule.pages.LoginOptions.LoginOptionsScreenActions;
import smule.pages.Message.MessageScreen;

import java.util.Map;

public class MessageScreenTest extends BaseTest {
    LoginScreen loginScreen;
    HomeScreen homeScreen;
    LoginOptionsScreen loginOptionsScreen;
    LoginOptionsScreenActions loginOptionsScreenActions;
    Map credentials = new ConfigLoader().getJSON(FilePaths.CREDENTIALS);
    @BeforeMethod
    public void setUpMessageScreen(){
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
    @Test
    public void shouldTestSendMessage() throws InterruptedException {
        //Arrange
        homeScreen.goBackFromPremiumAdd();
        MessageScreen messageScreen = homeScreen.navigateToMessageScreen();
        //Act
        messageScreen.clickNewChatIcon()
                .enterUserName("vineettv")
                .selectUserProfile().
                clickOnNextButton().sendMessage("down for the day");
        //Assert
        Assert.assertTrue(messageScreen.isSendMessageBtnClickAble());
    }
}
