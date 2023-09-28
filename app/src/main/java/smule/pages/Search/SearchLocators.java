package smule.pages.Search;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import smule.pages.BasePage;

public class SearchLocators extends BasePage {
    public SearchLocators() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver),this);
    }
    @AndroidFindBy(id = "com.smule.singandroid:id/search_edit_text")
    WebElement searchBarLocator;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@index='0']/android.widget.RelativeLayout[@resource-id='com.smule.singandroid:id/history_layout' and @index='0']")
    WebElement searchResultLocator;
    @AndroidFindBy(id = "com.smule.singandroid:id/search_mix_result_listview")
    WebElement listOfSearchResultLocator;
}
