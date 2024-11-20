package com.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.Locale;

@RunWith(Cucumber.class)
@CucumberOptions (

        features = {"src/main/resources/features/"},
        glue = {"stepDef"},
        tags = "@reg",
        monochrome = true,
        plugin = {"pretty", "html: target/cucumberReport.html"},
        stepNotifications = true,
        publish = true

)






public class TestrunnerClass {
}
