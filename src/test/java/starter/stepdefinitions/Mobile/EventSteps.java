package starter.stepdefinitions.Mobile;

import io.cucumber.java.an.E;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Event;

public class EventSteps {
    @Steps
    Event Event;

    @Given("user set up api endpoint login in event in mobile")
    public void adminSetUpApiEndpointLoginEventInMobile() {
        Event.adminSetUpApiEndpointLoginEventInMobile();
    }
    @When("user send a HTTP request login in event in mobile")
    public void adminSendSAHTTPRequestLoginEventInMobile(){
        Event.adminSendSAHTTPRequestLoginEventInMobile();
    }
    @And("user set the POST api endpoint event in mobile")
    public void adminSetThePOSTApiEndpointEventInMobile(){
        Event.adminSetThePOSTApiEndpointEventInMobile();
    }
    @And("user sent HTTP POST request post event in mobile")
    public void adminSentHTTPPOSTRequestPostEventInMobile(){
        Event.adminSentHTTPPOSTRequestPostEventInMobile();
    }
    @Then("user receive a valid login and event HTTP response code 200 in mobile")
    public void adminReceiveAValidLoginAndEventHTTPResponseCode200InMobile(){
        Event.adminReceiveAValidLoginAndEventHTTPResponseCode200InMobile();
    }
    @And("user received valid data for event in mobile")
    public void adminReceivedValidDataForEventInMobile(){
        Event.adminReceivedValidDataForEventInMobile();
    }

    //========@TCEVENT06========
    @And("user set the GET api endpoint event in mobile")
    public void adminSetTheGETApiEndpointEventInMobile() {
        Event.adminSetTheGETApiEndpointEventInMobile();
    }

    @And("user sent HTTP GET request get event in mobile")
    public void adminSentHTTPGETRequestGetEventInMobile() {
        Event.adminSentHTTPGETRequestGetEventInMobile();
    }

    @And("user receive valid data for all event in mobile")
    public void adminReceiveValidDataForAllEventInMobile() {
        Event.adminReceiveValidDataForAllEventInMobile();
    }

    //========@TCEVENT07========
    @And("user set the PUT api endpoint event in mobile")
    public void adminSetThePUTApiEndpointEventInMobile() {
        Event.adminSetThePUTApiEndpointEventInMobile();
    }

    @And("user sent HTTP PUT request get event by ID in mobile")
    public void adminSentHTTPPUTRequestGetEventByIDInMobile() {
        Event.adminSentHTTPPUTRequestGetEventByIDInMobile();
    }

    @And("user receive valid data for event by ID in mobile")
    public void adminReceiveValidDataForEventByIDInMobile() {
        Event.adminReceiveValidDataForEventByIDInMobile();
    }

    //========@TCEVENT08========
    @And("user set the DEL api endpoint event in mobile")
    public void adminSetTheDELApiEndpointEventInMobile() {
        Event.adminSetTheDELApiEndpointEventInMobile();
    }

    @And("user sent HTTP DEL request event by ID in mobile")
    public void adminSentHTTPDELRequestEventByIDInMobile() {
        Event.adminSentHTTPDELRequestEventByIDInMobile();
    }

    @And("user receive valid data for delete event in mobile")
    public void adminReceiveValidDataForDeleteEventInMobile() {
        Event.adminReceiveValidDataForDeleteEventInMobile();
    }
}
