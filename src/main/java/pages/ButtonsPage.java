package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ElementHelper;

public class ButtonsPage {

    ElementHelper elementHelper;


    By titles = By.xpath("//*[@resource-id='android:id/action_bar']/android.widget.TextView");
    By normalButton = By.id("io.appium.android.apis:id/button_normal");
    By smallButton = By.id("io.appium.android.apis:id/button_small");
    By switchButton = By.id("io.appium.android.apis:id/button_toggle");



    public ButtonsPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }


    public String getTitle() {
        return elementHelper.getText(titles);

    }

 public String getNormalButtonText() {
        return elementHelper.getText(normalButton);

    }

 public String getSmallButtonText() {
        return elementHelper.getText(smallButton);

    }

public String getSwitchButtonText() {
        return elementHelper.getText(switchButton);

    }

public void clickSwitchButton() {
        elementHelper.click(switchButton);

    }



}