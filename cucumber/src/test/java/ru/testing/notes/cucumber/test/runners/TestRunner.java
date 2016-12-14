package ru.testing.notes.cucumber.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

/**
 * Created by Gosh on 20.11.2016.
 */

@CucumberOptions(features = "src/test/resources/features/search.feature",
        format = {"json:target/cucumber.json"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
