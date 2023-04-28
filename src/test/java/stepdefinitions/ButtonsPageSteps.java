package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ButtonsPage;
import pages.CategoriesPage;
import utils.DriverManager;

public class ButtonsPageSteps {
    ButtonsPage buttonsPage = new ButtonsPage(DriverManager.getDriver());





    @Then("should see Title {string} Buttons Page")
    public void shouldSeeTitleButtonsPage(String title) {

        String actualTitle = buttonsPage.getTitle();
        Assert.assertEquals(actualTitle,title);

    }

    @Given("user is on the Buttons Page")
    public void userIsOnTheButtonsPage() {
        CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());
        categoriesPage.checkCategoriesPage("Views");
        categoriesPage.checkCategoriesPage("Buttons");
        shouldSeeTitleButtonsPage("Views/Buttons");
    }

    @Then("should Normal Button {string} on Buttons Page")
    public void shouldNormalButtonOnButtonsPage(String expectedText) {
        String actualtextButton = buttonsPage.getNormalButtonText();
        Assert.assertEquals(actualtextButton,expectedText);
    }

    @Then("should Small Button {string} on Buttons Page")
    public void shouldSmallButtonOnButtonsPage(String expectedText) {
        String actualtextButton = buttonsPage.getSmallButtonText();
        Assert.assertEquals(actualtextButton,expectedText);
    }

    @Then("should Switch Button {string} on Buttons Page")
    public void shouldSwitchButtonOnButtonsPage(String expectedText) {
        String actualtextButton = buttonsPage.getSwitchButtonText();
        Assert.assertEquals(actualtextButton,expectedText);
    }


    @When("taps Switch Button on Buttons Page")
    public void tapsSwitchButtonOnButtonsPage() {
    buttonsPage.clickSwitchButton();
    }
}
