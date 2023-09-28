package smule.pages.Login;

import io.qameta.allure.Step;
import smule.pages.Home.HomeScreen;

public class LoginScreen extends LoginLocators {
    @Step("Entering EmailId")
    public LoginScreen enterEmail(String email) {
        txtEmailId.sendKeys(email);
        return this;
    }

    @Step("click on next button")
    public HomeScreen clickNextButton() {
        new LoginLocators().btnNext.click();
        return new HomeScreen();
    }

    @Step("Entering password")
    public LoginScreen enterPassword(String password) {
        new LoginLocators();
        txtPassword.sendKeys(password);
        return this;
    }

    public boolean isHeaderPresent() {
        return getHeader().isDisplayed();
    }
}
