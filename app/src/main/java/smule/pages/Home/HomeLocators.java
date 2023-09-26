package smule.pages.Home;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import lombok.Getter;
import smule.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

@Getter
public class HomeLocators extends BasePage {

    public HomeLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @AndroidFindBy(id = "com.smule.singandroid:id/title")
    private WebElement locationTitle;

    @AndroidFindBy(id = "com.smule.singandroid:id/yesButton")
    private WebElement locationPermissionOk;
}
