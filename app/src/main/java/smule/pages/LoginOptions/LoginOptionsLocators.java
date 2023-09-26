package smule.pages.LoginOptions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

public class LoginOptionsLocators extends BasePage {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='English' and @index='0']")
    public WebElement language;

    @AndroidFindBy(id = "com.smule.singandroid:id/yesButton")
    public WebElement ok;

    @AndroidFindBy(id = "com.smule.singandroid:id/email_button_view")
    public WebElement signInWithEmail;

    public LoginOptionsLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

}
