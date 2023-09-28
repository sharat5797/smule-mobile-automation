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
    public WebElement locationTitle;

    @AndroidFindBy(id = "com.smule.singandroid:id/yesButton")
    public WebElement locationPermissionOk;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public WebElement whileUsingTheApp;

    @AndroidFindBy(id = "com.smule.singandroid:id/top_toolbar")
    public WebElement toolbar;

    @AndroidFindBy(accessibility = "Messages")
    public WebElement messageIconLocator;

    @AndroidFindBy(id = "com.smule.singandroid:id/sku_selection_title_text_view")
    public WebElement premiumHeader;

    @AndroidFindBy(id = "com.smule.singandroid:id/top_back_button")
    public WebElement goBackBtnPremiumAdd;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@index = '0']/android.widget.FrameLayout[@index='1']")
    public WebElement feedButton;

    @AndroidFindBy(id = "com.smule.singandroid:id/pre_search_left_button")
    public WebElement searchBtnLocator;
}
