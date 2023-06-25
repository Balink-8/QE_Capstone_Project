package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.profile;

public class ProfileSteps {
    @Steps
    profile profile;
    @Given("admin set up api endpoint login in profile admin")
    public void adminSetUpApiEndpointLoginInProfileAdmin() {
        profile.adminSetUpApiEndpointLoginInProfileAdmin();
    }

    @When("admin send a HTTP request login in profile admin")
    public void adminSendAHTTPRequestLoginInProfileAdmin() {
        profile.adminSendAHTTPRequestLoginInProfileAdmin();
    }

    @And("admin set the GET api endpoint profile admin")
    public void adminSetTheGETApiEndpointProfileAdmin() {
        profile.adminSetTheGETApiEndpointProfileAdmin();
    }

    @And("admin sent HTTP GET request post profile admin")
    public void adminSentHTTPGETRequestPostProfileAdmin() {
        profile.adminSentHTTPGETRequestPostProfileAdmin();
    }

    @Then("admin receive a valid login and profile admin HTTP response code 200")
    public void adminReceiveAValidLoginAndProfileAdminHTTPResponseCode200() {
        profile.adminReceiveAValidLoginAndProfileAdminHTTPResponseCode200();
    }

    @And("admin received valid data for profile admin")
    public void adminReceivedValidDataForProfileAdmin() {
        profile.adminReceivedValidDataForProfileAdmin();
    }

    //======TCPROFILE02============
    @And("admin set the PUT api endpoint profile admin")
    public void adminSetThePUTApiEndpointProfileAdmin() {
        profile.adminSetThePUTApiEndpointProfileAdmin();
    }

    @And("admin sent HTTP PUT request post profile admin")
    public void adminSentHTTPPUTRequestPostProfileAdmin() {
        profile.adminSentHTTPPUTRequestPostProfileAdmin();
    }

    @And("admin received valid data for profile admin edit")
    public void adminReceivedValidDataForProfileAdminEdit() {
        profile.adminReceivedValidDataForProfileAdminEdit();
    }
}
