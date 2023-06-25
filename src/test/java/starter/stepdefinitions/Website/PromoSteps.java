package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.Promo;

public class PromoSteps {

    @Steps
    Promo promo;
    @Given("Admin set up api endpoint login")
    public void adminSetUpApiEndpointLogin() {
        promo.setPostEndpointAuth();
    }

    @When("Admin send a HTTP request login")
    public void adminSendAHTTPRequestLogin() {
        promo.sendEndpointAuth();
    }

    @And("admin set the GET api endpoint promo")
    public void adminSetTheGETApiEndpointPromo() {
        promo.setGETApiEndpointPromo();
    }
    @And("admin sent HTTP GET request get all promo")
    public void adminSentHTTPGETRequestGetAllPromo() {
        promo.sendGetHttpRequestGetPromo();

    }

    @Then("admin receive a valid login and promo HTTP response code {int}")
    public void adminReceiveAValidLoginAndPromoHTTPResponseCode(int arg0) {
        promo.validateResponseCodeGetPromo();
    }


    @And("admin set the GET api endpoint promo by ID")
    public void adminSetTheGETApiEndpointPromoByID() {
        promo.setGETApiEndpointPromoByID();
    }


    @And("admin sent HTTP GET request get promo by ID")
    public void adminSentHTTPGETRequestGetPromoByID() {
        promo.sendGetHttpRequestGetPromoByID();
    }

    @Then("admin receive a valid login and Get promo HTTP response code {int}")
    public void adminReceiveAValidLoginAndGetPromoHTTPResponseCode(int arg0) {
        promo.validateResponseCodeGetPromoByID();
    }

    @And("admin set the POST api endpoint promo")
    public void adminSetThePOSTApiEndpointPromo() {
        promo.setPOSTApiEndpointPromo();
    }

    @And("admin sent HTTP POST request post promo")
    public void adminSentHTTPPOSTRequestPostPromo() {
        promo.sendPOSTHttpRequestPromo();
    }

    @Then("admin receive a valid login and Add New promo HTTP response code {int}")
    public void adminReceiveAValidLoginAndAddNewPromoHTTPResponseCode(int arg0) {
        promo.validateResponseCodePOSTPromo();
    }
}
