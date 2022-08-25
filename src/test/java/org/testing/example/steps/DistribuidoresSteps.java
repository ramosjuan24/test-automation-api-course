package org.testing.example.steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import static io.restassured.RestAssured.*;


/**
 * @autor Juan C. Ramos P Inovabiz
 */
public class DistribuidoresSteps {

    @Dado("Juan quiere conseguir un distribuidor")
    public void juan_quiere_conseguir_un_distribuidor() {

        given().contentType("application/json");
    }

    @Cuando("busca el distribuidor disponible")
    public void busca_el_distribuidor_disponible() {

        when().get("https://swapi.co/api/");

    }

    @Entonces("debe ver que distribuidores estan disponibles")
    public void debe_ver_que_distribuidores_estan_disponibles() {

        Response response =
                given().filter(new AllureRestAssured())
                        .when().get("https://swapi.co/api/")
                        .then().extract().response();
        Assert.assertEquals(response.statusCode(), 200);
    }

}
