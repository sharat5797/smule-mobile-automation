package smule.pages.Feed;

import io.qameta.allure.Step;

public class FeedScreen extends FeedLocators{
    @Step("Is feed Cards are visible")
    public boolean isFeedCardsVisible(){
        return feedCards.isDisplayed();
    }
}
