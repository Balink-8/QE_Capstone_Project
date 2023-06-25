package starter.stepdefinitions.Mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Artikel;

public class ArtikelSteps {
    @Steps
    Artikel Artikel;
    @Given("user set up api endpoint login in artikel in website")
    public void userSetUpApiEndpointLoginInArtikelInWebsite() {
        Artikel.userSetUpApiEndpointLoginInArtikelInWebsite();
    }

    @When("user send a HTTP request login in artikel in website")
    public void userSendAHTTPRequestLoginInArtikelInWebsite() {
        Artikel.userSendAHTTPRequestLoginInArtikelInWebsite();
    }

    @And("user set the POST api endpoint artikel")
    public void userSetThePOSTApiEndpointArtikel() {
        Artikel.userSetThePOSTApiEndpointArtikel();
    }

    @And("user sent HTTP POST request post artikel")
    public void userSentHTTPPOSTRequestPostArtikel() {
        Artikel.userSentHTTPPOSTRequestPostArtikel();
    }

    @Then("user receive a valid login and artikel HTTP response code {int}")
    public void userReceiveAValidLoginAndArtikelHTTPResponseCode(int arg0) {
        Artikel.userReceiveAValidLoginAndArtikelHTTPResponseCode200();
    }

    @And("user set the GET api endpoint artikel")
    public void userSetTheGETApiEndpointArtikel() {
        Artikel.userSetTheGETApiEndpointArtikel();
    }

    @And("user sent HTTP GET request get artikel by ID")
    public void userSentHTTPGETRequestGetArtikelByID() {
        Artikel.userSentHTTPGETRequestGetArtikelByID();
    }

    @And("user set the PUT api endpoint artikel")
    public void userSetThePUTApiEndpointArtikel() {
        Artikel.userSetThePUTApiEndpointArtikel();
    }

    @And("user sent HTTP PUT request artikel by ID")
    public void userSentHTTPPUTRequestArtikelByID() {
        Artikel.userSentHTTPPUTRequestArtikelByID();
    }

    @And("user set the DELETE api endpoint artikel")
    public void userSetTheDELETEApiEndpointArtikel() {
        Artikel.userSetTheDELETEApiEndpointArtikel();
    }

    @And("user sent HTTP DELETE request artikel by ID")
    public void userSentHTTPDELETERequestArtikelByID() {
        Artikel.userSentHTTPDELETERequestArtikelByID();
    }
}
