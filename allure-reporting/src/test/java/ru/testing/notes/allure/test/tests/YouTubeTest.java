package ru.testing.notes.allure.test.tests;


import org.testng.annotations.Test;
import ru.testing.notes.cucumber.pages.YouTubePage;
import ru.testing.notes.cucumber.pages.YouTubeSearchResultsPage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.assertFalse;

/**
 * Uses TestNG test framework
 */

@Features("Youtube search")
@Stories({"Search for one word"})
public class YouTubeTest {

    @Title("Search for Selenium")
    @Test(enabled = true)
    public void testSearch() {
        YouTubePage youTubePage = open("http://youtube.com", YouTubePage.class);
        youTubePage.insertSearchString("Selenium");
        YouTubeSearchResultsPage resultsPage = youTubePage.doSearch();
        assertFalse(resultsPage.hasResults(), "No results were found on results page");
    }
}
