package starter.stepdefinitions.Website;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.login;

public class LoginSteps {

    @Steps
    login Login;
    @Given("Admin has set endpoint login")
    public void adminHasSetEndpointLogin() {
        Login.setPostEndpointLogin();
    }

    @When("Admin send POST HTTP request login")
    public void adminSendPOSTHTTPRequestLogin() {
        Login.sendPostHttpRequestLogin();
    }

    @Then("Admin see response code login {int}")
    public void adminSeeResponseCodeLogin(int arg0) {
        Login.validateResponseCodeLogin();
    }
}
