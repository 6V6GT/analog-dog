package com.sandbox.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by User on 5/9/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target"},
        features = {"src/test/java/com/sandbox/cucumber/features/"}
)
public class CucumberRunner {
}


