package ru.testing.notes.cucumber.test.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.testing.notes.cucumber.pages.YouTubePage;
import ru.testing.notes.cucumber.pages.YouTubeSearchResultsPage;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertFalse;

/**
 * Created by Gosh on 20.11.2016.
 */
public class YouTubeSteps {
    private YouTubePage youTubePage;
    private YouTubeSearchResultsPage resultsPage;

    @Given("^navigate to the '(.*)'$")
    public void navigateToThePage(String pageUrl) {
        youTubePage = open(pageUrl, YouTubePage.class);
    }

    @When("^enter '(.*)'$")
    public void enterSelenium(String searchWord) {
        youTubePage.insertSearchString(searchWord);
    }

    @And("^click Search$")
    public void clickSearch() {
        resultsPage = youTubePage.doSearch();
    }

    @Then("^search results should not be false$")
    public void searchResultsShouldNotBeFalse() {
        assertFalse(resultsPage.hasResults(), "No results were found on results page");
    }
}
