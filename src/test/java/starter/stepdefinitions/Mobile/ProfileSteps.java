package starter.stepdefinitions.Mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Profile;

public class ProfileSteps {
    @Steps
    Profile Profile;
    @Given("admin set up api endpoint login in profile user")
    public void adminSetUpApiEndpointLoginInProfileUser() {
        Profile.adminSetUpApiEndpointLoginInProfileUser();
    }

    @When("admin send a HTTP request login in profile user")
    public void adminSendAHTTPRequestLoginInProfileUser() {
        Profile.adminSendAHTTPRequestLoginInProfileUser();
    }

    @And("admin set the GET api endpoint profile user")
    public void adminSetTheGETApiEndpointProfileUser() {
        Profile.adminSetTheGETApiEndpointProfileUser();
    }

    @And("admin sent HTTP GET request post profile user")
    public void adminSentHTTPGETRequestPostProfileUser() {
        Profile.adminSentHTTPGETRequestPostProfileUser();
    }

    @Then("admin receive a valid login and profile user HTTP response code 200")
    public void adminReceiveAValidLoginAndProfileUserHTTPResponseCode200() {
        Profile.adminReceiveAValidLoginAndProfileUserHTTPResponseCode200();
    }

    @And("admin received valid data for profile user")
    public void adminReceivedValidDataForProfileUser() {
        Profile.adminReceivedValidDataForProfileUser();
    }

    //======TCPROFILE04
    @And("admin set the PUT api endpoint profile user")
    public void adminSetThePUTApiEndpointProfileUser() {
        Profile.adminSetThePUTApiEndpointProfileUser();
    }

    @And("admin sent HTTP PUT request post profile user")
    public void adminSentHTTPPUTRequestPostProfileUser() {
        Profile.adminSentHTTPPUTRequestPostProfileUser();
    }

    @And("admin received valid data for profile user edit")
    public void adminReceivedValidDataForProfileUserEdit() {
        Profile.adminReceivedValidDataForProfileUserEdit();
    }

    //=======TCPROFILE05========
    @And("admin set the DEL api endpoint profile user")
    public void adminSetTheDELApiEndpointProfileUser() {
    }

    @And("admin sent HTTP DEL request post profile user")
    public void adminSentHTTPDELRequestPostProfileUser() {
    }

    @And("admin received valid data for profile user delete")
    public void adminReceivedValidDataForProfileUserDelete() {
    }
}
