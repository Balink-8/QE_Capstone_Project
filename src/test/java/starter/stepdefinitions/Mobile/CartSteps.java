package starter.stepdefinitions.Mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Cart;

public class CartSteps {
    @Steps
    Cart Cart;
    @Given("user set up api endpoint login in cart in website")
    public void userSetUpApiEndpointLoginInCartInWebsite() {
        Cart.userSetUpApiEndpointLoginInCartInWebsite();
    }

    @When("user send a HTTP request login in cart in website")
    public void userSendAHTTPRequestLoginInCartInWebsite() {
        Cart.userSendAHTTPRequestLoginInCartInWebsite();
    }

    @And("user set the POST api endpoint cart")
    public void userSetThePOSTApiEndpointCart() {
        Cart.userSetThePOSTApiEndpointCart();
    }

    @And("user sent HTTP POST request post cart")
    public void userSentHTTPPOSTRequestPostCart() {
        Cart.userSentHTTPPOSTRequestPostCart();
    }

    @Then("user receive a valid login and cart HTTP response code {int}")
    public void userReceiveAValidLoginAndCartHTTPResponseCode(int arg0) {
        Cart.userReceiveAValidLoginAndCartHTTPResponseCode200();
    }

    @And("user set the GET api endpoint cart")
    public void userSetTheGETApiEndpointCart() {
        Cart.userSetTheGETApiEndpointCart();
    }

    @And("user sent HTTP GET request get cart by ID")
    public void userSentHTTPGETRequestGetCartByID() {
        Cart.userSentHTTPGETRequestGetCartByID();
    }

    @And("user set the PUT api endpoint cart")
    public void userSetThePUTApiEndpointCart() {
        Cart.userSetThePUTApiEndpointCart();
    }

    @And("user sent HTTP PUT request cart by ID")
    public void userSentHTTPPUTRequestCartByID() {
        Cart.userSentHTTPPUTRequestCartByID();
    }

    @And("user set the DELETE api endpoint cart")
    public void userSetTheDELETEApiEndpointCart() {
        Cart.userSetTheDELETEApiEndpointCart();
    }

    @And("user sent HTTP DELETE request cart by ID")
    public void userSentHTTPDELETERequestCartByID() {
        Cart.userSentHTTPDELETERequestCartByID();
    }
}
