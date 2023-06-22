package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.Account;

public class AccountSteps {

    @Steps
    Account account;
    @Given("admin set up api endpoint login")
    public void adminSetUpApiEndpointLogin() {
        account.setPostEndpointAuth();
    }

    @When("admin send a HTTP request login")
    public void adminSendAHTTPRequestLogin() {
        account.sendEndpointAuth();
    }

    @And("admin set the GET api endpoint account")
    public void adminSetTheGETApiEndpointAccount() {
        account.setGETApiEndpointAccount();
    }

    @And("admin send HTTP GET request get all account")
    public void adminSendHTTPGETRequestGetAllAccount() {
        account.sendGetHttpRequestGetAccount();
    }

    @Then("admin receive a valid login and account HTTP response code {int}")
    public void adminReceiveAValidLoginAndAccountHTTPResponseCode(int arg0) {
        account.validateResponseCodeGetAccount();
    }

//    @And("admin receive valid data for all account")
//    public void adminReceiveValidDataForAllAccount() {
//    }
}
