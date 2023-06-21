package starter.stepdefinitions.Mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Login;

public class LoginSteps {

    @Steps
    Login login;
    @Given("User has set endpoint login")
    public void userHasSetEndpointLogin() {
        login.setPostEndpointLogin();
    }

    @When("User send POST HTTP request login")
    public void userSendPOSTHTTPRequestLogin() {
        login.sendPostHttpRequestLogin();
    }

    @Then("User see response code login {int}")
    public void userSeeResponseCodeLogin(int arg0) {
        login.validateResponseCodeLogin();
    }
}
