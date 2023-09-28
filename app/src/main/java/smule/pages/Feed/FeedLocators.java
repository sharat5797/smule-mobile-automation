package smule.pages.Feed;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

public class FeedLocators extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@resource-id = 'com.smule.singandroid:id/card_view' and @index='0']/android.widget.RelativeLayout[@index='0']")
    public WebElement feedCards;
    public FeedLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

}
