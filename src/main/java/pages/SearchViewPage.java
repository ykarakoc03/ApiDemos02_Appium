package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class SearchViewPage {

    ElementHelper elementHelper;

    By title = By.className("android.widget.TextView");
    By searchButton = By.id("io.appium.android.apis:id/action_search");
    By serchView = By.id("android:id/search_src_text");
    By serchText = By.id("io.appium.android.apis:id/status_text");

    public SearchViewPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public String getSearchText() {
        return elementHelper.getText(serchText);
    }

    public String getTitle() {
        return elementHelper.getText(title);
    }

 public void checkSearchButton() {
        elementHelper.checkElement(searchButton);
    }

 public void clickSearchButton() {
        elementHelper.click(searchButton);
    }

 public void sendkeysSearchArea(String text) {
        elementHelper.sendKeys(serchView,text);
    }



}