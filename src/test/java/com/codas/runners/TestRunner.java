package com.codas.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/com/codas/features"},
        glue = {"com/codas/hooks", "com/codas/step_definitions"},
        publish = true
)

public class TestRunner {
}
