package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.artikel;
public class artikelSteps {
    @Steps
    artikel artikel;
    @Given("admin set up api endpoint login in artikel in website")
    public void adminSetUpApiEndpointLoginInArtikelInWebsite() {
        artikel.adminSetUpApiEndpointLoginInArtikelInWebsite();
    }

    @When("admin send a HTTP request login in artikel in website")
    public void adminSendAHTTPRequestLoginInArtikelInWebsite() {
        artikel.adminSendAHTTPRequestLoginInArtikelInWebsite();
    }

    @And("admin set the POST api endpoint artikel")
    public void adminSetThePOSTApiEndpointArtikel() {
        artikel.adminSetThePOSTApiEndpointArtikel();
    }

    @And("admin sent HTTP POST request post artikel")
    public void adminSentHTTPPOSTRequestPostArtikel() {
        artikel.adminSentHTTPPOSTRequestPostArtikel();
    }

    @Then("admin receive a valid login and artikel HTTP response code {int}")
    public void adminReceiveAValidLoginAndArtikelHTTPResponseCode(int arg0) {
        artikel.adminReceiveAValidLoginAndArtikelHTTPResponseCode200();
    }
    @And("admin receives valid data to add Artikel data")
    public void adminReceivesValidDataToAddArtikelData() {
        artikel.adminReceivesValidDataToAddArtikelData();
    }

    @And("admin set the GET api endpoint artikel")
    public void adminSetTheGETApiEndpointArtikel() {
        artikel.adminSetTheGETApiEndpointArtikel();
    }

    @And("admin sent HTTP GET request get artikel by ID")
    public void adminSentHTTPGETRequestGetArtikelByID() {
        artikel.adminSentHTTPGETRequestGetArtikelByID();
    }
    @And("admin receive valid data for all artikel")
    public void adminReceiveValidDataForAllArtikel() {
        artikel.adminReceiveValidDataForAllArtikel();
    }

    @And("admin set the PUT api endpoint artikel")
    public void adminSetThePUTApiEndpointArtikel() {
        artikel.adminSetThePUTApiEndpointArtikel();
    }

    @And("admin sent HTTP PUT request artikel by ID")
    public void adminSentHTTPPUTRequestArtikelByID() {
        artikel.adminSentHTTPPUTRequestArtikelByID();
    }
    @And("admin receive valid data for Artikel by ID")
    public void adminReceiveValidDataForArtikelByID() {
        artikel.adminReceiveValidDataForArtikelByID();
    }

    @And("admin set the DELETE api endpoint artikel")
    public void adminSetTheDELETEApiEndpointArtikel() {
        artikel.adminSetTheDELETEApiEndpointArtikel();
    }

    @And("admin sent HTTP DELETE request artikel by ID")
    public void adminSentHTTPDELETERequestArtikelByID() {
        artikel.adminSentHTTPDELETERequestArtikelByID();
    }
    @And("admin receive valid data for delete artikel by ID")
    public void adminReceiveValidDataForDeleteartikelByID() {
        artikel.adminReceiveValidDataForDeleteArtikelByID();
    }
}
