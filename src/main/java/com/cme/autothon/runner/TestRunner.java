package com.cme.autothon.runner;


import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\cukeFeatures",
                glue="com.cme.autothon.runner",
                format = {"pretty", "html:target/cucumber"}
//                tags = {"@smoke"}
                )

public class TestRunner {
}
