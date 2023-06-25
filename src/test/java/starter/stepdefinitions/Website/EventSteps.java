package starter.stepdefinitions.Website;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.event;


public class EventSteps {
    @Steps
    event event;

    @Given("admin set up api endpoint login in event")
    public void adminSetUpApiEndpointLoginEvent() {
        event.adminSetUpApiEndpointLoginEvent();

    }
    @When("admin send a HTTP request login in event")
    public void adminSendSAHTTPRequestLoginEvent(){
        event.adminSendSAHTTPRequestLoginEvent();

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
    @And("admin received valid data for event")
    public void adminReceivedValidDataForEvent(){
        event.adminReceivedValidDataForEvent();

    }

    //========@TCEVENT02========
    @And("admin set the GET api endpoint event")
    public void adminSetTheGETApiEndpointEvent() {
        event.adminSetTheGETApiEndpointEvent();
    }

    @And("admin sent HTTP GET request get event")
    public void adminSentHTTPGETRequestGetEvent() {
        event.adminSentHTTPGETRequestGetEvent();
    }

    @And("admin receive valid data for all event")
    public void adminReceiveValidDataForAllEvent() {
        event.adminReceiveValidDataForAllEvent();
    }

    //========@TCEVENT03========
    @And("admin set the PUT api endpoint event")
    public void adminSetThePUTApEndpointEvent() {
        event.adminSetThePUTApEndpointEvent();
    }

    @And("admin sent HTTP PUT request get event by ID")
    public void adminSentHTTPPUTRequestGetEventByID() {
        event.adminSentHTTPPUTRequestGetEventByID();
    }

    @And("admin receive valid data for event by ID")
    public void adminReceiveValidDataForEventByID() {
        event.adminReceiveValidDataForEventByID();
    }

    //========@TCEVENT04========
    @And("admin set the DEL api endpoint event")
    public void adminSetTheDELApiEndpointEvent() {
        event.adminSetTheDELApiEndpointEvent();
    }

    @And("admin sent HTTP DEL request event by ID")
    public void adminSentHTTPDELRequestEventByID() {
        event.adminSentHTTPDELRequestEventByID();
    }

    @And("admin receive valid data for delete event")
    public void adminReceiveValidDataForDeleteEvent() {
        event.adminReceiveValidDataForDeleteEvent();
    }
}
