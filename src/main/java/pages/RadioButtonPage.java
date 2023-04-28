package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ElementHelper;

public class RadioButtonPage {

    ElementHelper elementHelper;

    By title = By.className("android.widget.TextView");
    By radioButtonElements = By.className("android.widget.RadioButton");
    By clearButton = By.id("io.appium.android.apis:id/clear");
    By selectedText = By.id("io.appium.android.apis:id/choice");

    public RadioButtonPage(WebDriver driver) {
        this.elementHelper = new ElementHelper(driver);
    }

    public String getTitle() {
        return elementHelper.getText(title);
    }

    public void checkRadioButtonElement(String text) {
        elementHelper.checkElementWithText(radioButtonElements, text);
    }

    public String getClearButtonText() {
        return elementHelper.getText(clearButton);
    }

    public void clickRadioButton(String radioButton) {
        elementHelper.clickElementWithText(radioButtonElements, radioButton);
    }

    public String getSelectedText() {
        return elementHelper.getText(selectedText);
    }

}