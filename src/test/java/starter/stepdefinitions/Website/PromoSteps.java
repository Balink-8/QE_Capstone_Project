package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
API_ardha
import starter.pages.Website.promo;

public class PromoSteps {
    @Steps
    promo promo;
    @Given("admin set up api endpoint login in promo")
    public void adminSetUpApiEndpointLoginInPromo() {
        promo.adminSetUpApiEndpointLoginInPromo();
    }

    @When("admin send a HTTP request login in promo")
    public void adminSendAHTTPRequestLoginInPromo() {
        promo.adminSendAHTTPRequestLoginInPromo();
    }

    @And("admin set the POST api endpoint promo")
    public void adminSetThePOSTApiEndpointPromo() {
        promo.adminSetThePOSTApiEndpointPromo();
    }

    @And("admin sent HTTP POST request post promo")
    public void adminSentHTTPPOSTRequestPostPromo() {
        promo.adminSentHTTPPOSTRequestPostPromo();
    }

    @Then("admin receive a valid login and promo HTTP response code 200")
    public void adminReceiveAValidLoginAndPromoHTTPResponseCode200() {
        promo.adminReceiveAValidLoginAndPromoHTTPResponseCode200();
    }

    @And("admin received valid data for promo")
    public void adminReceivedValidDataForPromo() {
        promo.adminReceivedValidDataForPromo();
    }

    //========@TCPROMO02========
    @And("admin set the GET api endpoint promo")
    public void adminSetTheGETApiEndpointPromo() {
        promo.adminSetTheGETApiEndpointPromo();
    }

    @And("admin sent HTTP GET request get promo")
    public void adminSentHTTPGETRequestGetPromo() {
        promo.adminSentHTTPGETRequestGetPromo();
    }

    @And("admin receive valid data for all promo")
    public void adminReceiveValidDataForAllPromo() {
        promo.adminReceiveValidDataForAllPromo();
    }

    //========@TCPROMO03========
    @And("admin set the PUT api endpoint promo")
    public void adminSetThePUTApiEndpointPromo() {
        promo.adminSetThePUTApiEndpointPromo();
    }

    @And("admin sent HTTP PUT request get promo by ID")
    public void adminSentHTTPPUTRequestGetPromoByID() {
        promo.adminSentHTTPPUTRequestGetPromoByID();
    }

    @And("admin receive valid data for promo by ID")
    public void adminReceiveValidDataForPromoByID() {
        promo.adminReceiveValidDataForPromoByID();
    }

    //========@TCPROMO04========
    @And("admin set the DEL api endpoint promo")
    public void adminSetTheDELApiEndpointPromo() {
        promo.adminSetTheDELApiEndpointPromo();
    }

    @And("admin sent HTTP DEL request promo by ID")
    public void adminSentHTTPDELRequestPromoByID() {
        promo.adminSentHTTPDELRequestPromoByID();
    }

    @And("admin receive valid data for delete promo")
    public void adminReceiveValidDataForDeletePromo() {
        promo.adminReceiveValidDataForDeletePromo();
=======
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
API_Automation
    }
}
