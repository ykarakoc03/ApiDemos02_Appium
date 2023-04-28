package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class CategoriesPage {

    ElementHelper elementHelper;

    By tabs = By.id("android:id/text1");

    By title = By.xpath("//*[@resource-id='android:id/action_bar']/android.widget.TextView");


    public CategoriesPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public void checkCategoriesPage(String tab) {
        elementHelper.clickElementWithText(tabs,tab);
    }
 public void checkCategories() {
        elementHelper.checkElement(title);
    }



}