package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CategoriesPage;
import pages.SearchViewPage;
import utils.DriverManager;

public class SerchViewPageSteps {
    SearchViewPage searchViewPage = new SearchViewPage(DriverManager.getDriver());
    CategoriesPage categoriesPage = new CategoriesPage(DriverManager.getDriver());



    @Given("user is on the Search View Page")
    public void userIsOnTheSearchViewPage() {
        categoriesPage.checkCategoriesPage("Views");
        categoriesPage.checkCategoriesPage("Search View");
        categoriesPage.checkCategoriesPage("Action Bar");
    }

    @Then("should see Search Button on Search View Page")
    public void shouldSeeSearchButtonOnSearchViewPage() {
        searchViewPage.checkSearchButton();
    }

    @When("taps to Search Button on Search View Page")
    public void tapsToSearchButtonOnSearchViewPage() {
        searchViewPage.clickSearchButton();
    }

    @When("sendkeys to Search Area {string} on Search View Page")
    public void sendkeysToSearchAreaOnSearchViewPage(String text) {
        searchViewPage.sendkeysSearchArea(text);
    }

    @Then("should see Result {string} on Search View Page")
    public void shouldSeeResultOnSearchViewPage(String expectedText) {
        String currentTitle =  searchViewPage.getSearchText();
        Assert.assertTrue(currentTitle.contains(expectedText));
    }

    @Then("should see Title {string} on Search View Page")
    public void shouldSeeTitleOnSearchViewPage(String title) {
        String currentTitle =   searchViewPage.getTitle();
        Assert.assertTrue(currentTitle.contains(title));
    }
}
