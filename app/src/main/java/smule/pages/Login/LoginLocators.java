package smule.pages.Login;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import lombok.Getter;
import smule.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Getter
public class LoginLocators extends BasePage {
    @AndroidFindBy(id = "com.smule.singandroid:id/editField")
    public WebElement txtEmailId;
    @AndroidFindBy(id = "com.smule.singandroid:id/btn_next")
    public WebElement btnNext;
    @AndroidFindBy(id = "com.smule.singandroid:id/editField")
    public WebElement txtPassword;
    @AndroidFindBy(id = "com.smule.singandroid:id/txt_screen_title")
    public WebElement header;

    public LoginLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

}
