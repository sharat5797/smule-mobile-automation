package smule.pages.Activity;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

public class ActivityLocators extends BasePage {
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Invites']")
    public WebElement invitesButton;
    @AndroidFindBy(id = "com.smule.singandroid:id/chat_tooltip_text")
    public WebElement suggestion;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='Notifications']")
    public WebElement notificationButton;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@index='0']/android.widget.TextView[@text='News']")
    public WebElement newsButton;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout")
    public WebElement notifications;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout")
    public WebElement invites;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='No news from Smule yet']")
    public WebElement news;
    public ActivityLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

}
