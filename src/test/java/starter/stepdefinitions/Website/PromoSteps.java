package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
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
    }
}
