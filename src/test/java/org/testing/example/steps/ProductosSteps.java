package org.testing.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ProductosSteps {

    @Given("Juan quiere conseguir un productos")
    public void juan_quiere_conseguir_un_productos() {
        given().contentType("application/json");
    }

    @When("busca el producto disponible")
    public void busca_el_producto_disponible() {

        when().get("https://jsonplaceholder.typicode.com");

    }

    @Then("debe ver que productos estan disponibles")
    public void debe_ver_que_productos_estan_disponibles() {

        Response response =
                given().filter(new AllureRestAssured())
                        .when().get("https://jsonplaceholder.typicode.com/albums")
                        .then().extract().response();
        Assert.assertEquals(response.statusCode(), 200);
    }
}
