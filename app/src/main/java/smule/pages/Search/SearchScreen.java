package smule.pages.Search;

import io.qameta.allure.Step;

public class SearchScreen extends SearchLocators{
    @Step("Enter text to Search")
    public SearchScreen enterText(String text){
        searchBarLocator.sendKeys(text);
        return this;
    }
    @Step("Click on search result")
    public SearchScreen clickOnSearchResult(){
        searchResultLocator.click();
        return this;
    }

    public boolean isListOfSearchResultDisplayed(){
        return listOfSearchResultLocator.isDisplayed();
    }
}
