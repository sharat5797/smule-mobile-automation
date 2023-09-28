package smule.pages.Message;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class MessageScreen extends MessageLocators {
    public MessageScreen clickNewChatIcon() throws InterruptedException {
        Thread.sleep(12000);
        new MessageLocators();
        newChatIconLocator.click();
        return this;
    }

    public MessageScreen enterUserName(String name){
        searchUserLocator.sendKeys(name);
        searchUserLocator.click();
//        searchUserLocator.sendKeys(Keys.ENTER);
        return this;
    }

    public MessageScreen selectUserProfile(){
        profileImageLocator.click();
        return this;
    }
    public MessageScreen clickOnNextButton(){
        nextBtnLocator.click();
        return this;
    }
    public void sendMessage(String message){
        messageInputLocator.sendKeys(message);
        sendMessageBtnLocator.click();
    }

    public boolean isSendMessageBtnClickAble(){
        return sendMessageBtnLocator.isEnabled();
    }

    public boolean isHeaderDisplayed() {
        return getHeaderLocator().isDisplayed();
    }

    public void tap(){
        new TouchAction((PerformsTouchActions) androidDriver).press(PointOption.point(1002, 375))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .release()
                .perform();
    }
}
