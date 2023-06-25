package starter.stepdefinitions.Mobile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Register;

public class RegisterSteps {

    @Steps
    Register register;
    @Given("user has set endpoint register")
    public void userHasSetEndpointRegister() {
        register.setPostEndpointRegister();
    }

    @When("user send POST HTTP request register")
    public void userSendPOSTHTTPRequestRegister() {
        register.sendPostHttpRequestRegister();
    }

    @Then("user see response code register {int}")
    public void userSeeResponseCodeRegister(int arg0) {
        register.validateResponseCodeRegister();
    }
}
