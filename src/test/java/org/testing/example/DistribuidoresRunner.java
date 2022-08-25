package org.testing.example;


import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features =
        "src/test/resources/features.distribuidor/distribuidores.feature"
)
public class DistribuidoresRunner extends AbstractTestNGCucumberTests {
}
