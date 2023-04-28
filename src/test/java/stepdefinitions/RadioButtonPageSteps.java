package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.RadioButtonPage;
import utils.DriverManager;

public class RadioButtonPageSteps {
    RadioButtonPage radioButtonPage = new RadioButtonPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());


    @Then("should see Title {string} on Radio Button Page")
    public void shouldSeeTitleOnRadioButtonPage(String title) {
        String currentTitle = radioButtonPage.getTitle();
        Assert.assertEquals(currentTitle, title);
    }

    @Given("user is on the Radio Button Page")
    public void userIsOnTheRadioButtonPage() {
        categoriesPage.checkCategoriesPage("Views");
        categoriesPage.checkCategoriesPage("Radio Group");
    }

    @Then("should see Radio Button {string} on Radio Button Page")
    public void shouldSeeRadioButtonOnRadioButtonPage(String radioButton) {
        radioButtonPage.checkRadioButtonElement(radioButton);
    }

    @Then("should see Clear Button {string} on Radio Button Page")
    public void shouldSeeClearButtonOnRadioButtonPage(String clearButton) {

        String currentTitle =  radioButtonPage.getClearButtonText();;
        Assert.assertEquals(currentTitle, clearButton);
    }

    @When("taps to Radio Button {string} on Radio Button Page")
    public void tapsToRadioButtonOnRadioButtonPage(String radioButton) {
        radioButtonPage.clickRadioButton(radioButton);
    }

    @Then("should see Selected Text {string} on Radio Button Page")
    public void shouldSeeSelectedTextOnRadioButtonPage(String selectedText) {

        String currentTitle =  radioButtonPage.getSelectedText();
        Assert.assertTrue(currentTitle.contains(selectedText));
    }
}
