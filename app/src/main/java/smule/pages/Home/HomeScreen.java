package smule.pages.Home;

public class HomeScreen extends HomeLocators {
    public boolean isLocationTitlePresent() {
        return getLocationTitle().isDisplayed();
    }

    public String getLocationHeaderText() {
        return getLocationTitle().getText();
    }
}
