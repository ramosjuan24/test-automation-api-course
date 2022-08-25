package org.testing.example;

import cucumber.api.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features =
        "src/test/resources/features.distribuidor/productos.feature"
)
public class ProductosRunner extends AbstractTestNGCucumberTests {
}
