package ru.testing.notes.cucumber.tests.tests;


import org.testng.annotations.Listeners;
import ru.testing.notes.cucumber.tests.listeners.ScreenShotOnFailListener;

/**
 * Created by Sidelnikov Mikhail on 30.07.15.
 * Uses TestNG test framework
 * Test demonstrates work with Selenide and Page Object Pattern(https://code.google.com/p/selenium/wiki/PageObjects)
 * For more information about Selenide visit <a href="http://selenide.org">Selenide</a>
 */
@Listeners({ScreenShotOnFailListener.class})
public class YouTubeTest {

//    @Test(enabled = false)
//    public void testSearch() {
//        YouTubePage youTubePage = open("http://youtube.com", YouTubePage.class);
//        youTubePage.insertSearchString("Selenium");
//        YouTubeSearchResultsPage resultsPage = youTubePage.doSearch();
//        assertFalse(resultsPage.hasResults(),"No results were found on results page" );
//    }
}
