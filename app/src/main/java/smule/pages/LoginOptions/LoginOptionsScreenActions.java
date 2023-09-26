package smule.pages.LoginOptions;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;
import smule.pages.BasePage;

public class LoginOptionsScreenActions extends BasePage {
    public void scrollLanguages() {
        WebElement element = (WebElement) androidDriver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))"
                        + ".scrollIntoView(new UiSelector().textContains(\"Español\"))"));
    }
}
