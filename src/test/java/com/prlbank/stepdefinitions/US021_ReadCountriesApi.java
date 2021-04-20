package com.prlbank.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prlbank.pojos.Country;
import com.prlbank.pojos.Customer;
import com.prlbank.utilities.ConfigurationReader;
import com.prlbank.utilities.ReadTxt;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.List;

import static com.prlbank.utilities.WriteToTxt.saveDataInFileWithCountrId;
import static io.restassured.RestAssured.*;


public class US021_ReadCountriesApi {

    Response response;
    String apiToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZWFtNDNhZG1pbiIsImF1dGgiOiJST0xFX0FETUlOIiwiZXhwIjoxNjE5MDI1ODA4fQ.98ZsU6pCKB9iQUahK9Fw38xbdbn9nflpL11Ism2f_mnaggFXyhe5LpSNmBkGvRK--STLOJvr59z1wcBsWMvPpw";
    Customer[] customer;
    String filePath = ConfigurationReader.getProperty("filePath_Customer_Ssn");
    Country[] country;
    String filePathCountryId = ConfigurationReader.getProperty("filePath_country_id");
    Response responseAll;

    @Given("user goes to API end point {string} and create countries {string}")
    public void userGoesToAPIEndPointAndCreateCountries(String countryEndPoint, String country) {

        String newCountry = "{\n" +
                "\"name\": \" "+ country + "\",\n" +
                "\"states\": null\n" +
                "}";


        response = given()
                .headers("Authorization",
                        "Bearer " + apiToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .contentType(ContentType.JSON)
                .body(newCountry)
                .post(countryEndPoint)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();

        response = given()
                .headers("Authorization",
                        "Bearer " + apiToken,
                        "Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .when()
                .contentType(ContentType.JSON)
                .get(countryEndPoint)
                .then()
                .extract()
                .response();
    }


    @Then("user validate countries from data set")
    public void userValidateCountriesFromDataSet() throws IOException {

        ObjectMapper obj = new ObjectMapper();
        country = obj.readValue(response.asString(), Country[].class);


        int lastCountryLength = country.length - 1;
        String expectedId = country[lastCountryLength].getId();

        saveDataInFileWithCountrId(filePathCountryId, country);

        List<String> actualIDs = ReadTxt.returnCountryIdList(filePathCountryId);

        Assert.assertTrue(actualIDs.contains(expectedId));



        SoftAssert softAssert = new SoftAssert();

        int count = 0;
        for (int i = 0; i < country.length; i++) {
            if (country[i].getId().equals(expectedId)) {
                count++;
            }
        }

        softAssert.assertTrue(count == 1);


        softAssert.assertAll();

    }



}



