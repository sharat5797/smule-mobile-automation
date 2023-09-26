package smule.pages.LoginOptions;

import io.qameta.allure.Step;
import smule.pages.Home.HomeScreen;
import smule.pages.Login.LoginLocators;
import smule.pages.Login.LoginScreen;

public class LoginOptionsScreen extends LoginOptionsLocators{
    @Step("Selecting Language")
    public LoginOptionsScreen selectLanguage() {
        language.click();
        return this;
    }
    @Step("Confirm Language")
    public LoginOptionsScreen confrimLanguage() {
        ok.click();
        return this;
    }
    @Step("SignIn With Email")
    public LoginScreen signInWithEmail() {
        new LoginOptionsLocators().signInWithEmail.click();
        return new LoginScreen();
    }

//    @Step("click on login button")
//    public HomeScreen clickLoginButton() {
//        new LoginLocators().btnLogin.click();
//        return new HomeScreen();
//    }


}
