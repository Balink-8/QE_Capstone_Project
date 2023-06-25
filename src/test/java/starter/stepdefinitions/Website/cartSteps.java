package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.cart;
public class cartSteps {
    @Steps
    cart cart;
    @Given("admin set up api endpoint login in cart in website")
    public void adminSetUpApiEndpointLoginIncartInWebsite() {
        cart.adminSetUpApiEndpointLoginInCartInWebsite();
    }

    @When("admin send a HTTP request login in cart in website")
    public void adminSendAHTTPRequestLoginIncartInWebsite() {
        cart.adminSendAHTTPRequestLoginInCartInWebsite();
    }

    @And("admin set the POST api endpoint cart")
    public void adminSetThePOSTApiEndpointcart() {
        cart.adminSetThePOSTApiEndpointCart();
    }

    @And("admin sent HTTP POST request post cart")
    public void adminSentHTTPPOSTRequestPostcart() {
        cart.adminSentHTTPPOSTRequestPostCart();
    }

    @Then("admin receive a valid login and cart HTTP response code {int}")
    public void adminReceiveAValidLoginAndcartHTTPResponseCode(int arg0) {
        cart.adminReceiveAValidLoginAndCartHTTPResponseCode200();
    }
    @And("admin receives valid data to add cart data")
    public void adminReceivesValidDataToAddcartData() {
        cart.adminReceivesValidDataToAddCartData();
    }

    @And("admin set the GET api endpoint cart")
    public void adminSetTheGETApiEndpointcart() {
        cart.adminSetTheGETApiEndpointCart();
    }

    @And("admin sent HTTP GET request get cart by ID")
    public void adminSentHTTPGETRequestGetcartByID() {
        cart.adminSentHTTPGETRequestGetCartByID();
    }
    @And("admin receive valid data for all cart")
    public void adminReceiveValidDataForAllcart() {
        cart.adminReceiveValidDataForAllCart();
    }

    @And("admin set the PUT api endpoint cart")
    public void adminSetThePUTApiEndpointcart() {
        cart.adminSetThePUTApiEndpointCart();
    }

    @And("admin sent HTTP PUT request cart by ID")
    public void adminSentHTTPPUTRequestcartByID() {
        cart.adminSentHTTPPUTRequestCartByID();
    }
    @And("admin receive valid data for cart by ID")
    public void adminReceiveValidDataForcartByID() {
        cart.adminReceiveValidDataForCartByID();
    }

    @And("admin set the DELETE api endpoint cart")
    public void adminSetTheDELETEApiEndpointcart() {
        cart.adminSetTheDELETEApiEndpointCart();
    }

    @And("admin sent HTTP DELETE request cart by ID")
    public void adminSentHTTPDELETERequestcartByID() {
        cart.adminSentHTTPDELETERequestCartByID();
    }
    @And("admin receive valid data for delete cart by ID")
    public void adminReceiveValidDataForDeletecartByID() {
        cart.adminReceiveValidDataForDeleteCartByID();
    }
}
