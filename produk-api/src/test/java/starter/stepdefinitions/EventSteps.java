package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.EventPage;

public class EventSteps {
    @Steps
    EventPage event;
    @Given("admin set up api endpoint login")
    public void adminSetUpApiEndpointLogin() {
        event.adminSetUpApiEndpointLogin();
    }
    @When("admin send a HTTP request login")
    public void adminSendSAHTTPRequestLogin(){
        event.adminSendSAHTTPRequestLogin();
    }
    @And("admin set the POST api endpoint event")
    public void adminSetThePOSTApiEndpointEvent(){
        event.adminSetThePOSTApiEndpointEvent();
    }
    @And("admin sent HTTP POST request post event")
    public void adminSentHTTPPOSTRequestPostEvent(){
        event.adminSentHTTPPOSTRequestPostEvent();
    }
    @Then("admin receive a valid login and event HTTP response code 200")
    public void adminReceiveAValidLoginAndEventHTTPResponseCode200(){
        event.adminReceiveAValidLoginAndEventHTTPResponseCode200();
    }
}
