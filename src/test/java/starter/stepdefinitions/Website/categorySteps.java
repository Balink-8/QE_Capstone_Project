package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.category;
public class categorySteps {
    @Steps
    category category;

    @Given("admin set up api endpoint login in category in website")
    public void adminSetUpApiEndpointLoginInCategoryInWebsite() {
        category.adminSetUpApiEndpointLoginInCategoryInWebsite();
    }

    @When("admin send a HTTP request login in category in website")
    public void adminSendAHTTPRequestLoginInCategoryInWebsite() {
        category.adminSendAHTTPRequestLoginInCategoryInWebsite();
    }

    @And("admin set the POST api endpoint category")
    public void adminSetThePOSTApiEndpointCategory() {
        category.adminSetThePOSTApiEndpointCategory();
    }

    @And("admin sent HTTP POST request post category")
    public void adminSentHTTPPOSTRequestPostCategory() {
        category.adminSentHTTPPOSTRequestPostCategory();
    }

    @Then("admin receive a valid login and category HTTP response code {int}")
    public void adminReceiveAValidLoginAndCategoryHTTPResponseCode(int arg0) {
        category.adminReceiveAValidLoginAndCategoryHTTPResponseCode200();
    }
    @And("admin receives valid data to add category data")
    public void adminReceivesValidDataToAddCategoryData() {
        category.adminReceivesValidDataToAddCategoryData();
    }
    //========@TCCATEGORY02========
    @And("admin set the GET api endpoint category")
    public void adminSetTheGETApiEndpointCategory() {
        category.adminSetTheGETApiEndpointCategory();
    }

    @And("admin sent HTTP GET request get category by ID")
    public void adminSentHTTPGETRequestGetCategoryByID() {
        category.adminSentHTTPGETRequestGetCategoryByID();
    }

    @And("admin receive valid data for all category")
    public void adminReceiveValidDataForAllCategory() {
        category.adminReceiveValidDataForAllCategory();
    }
    //========@TCCATEGORY03========
    @And("admin set the PUT api endpoint category")
    public void adminSetThePUTApiEndpointCategory() {
        category.adminSetThePUTApiEndpointCategory();
    }

    @And("admin sent HTTP PUT request category by ID")
    public void adminSentHTTPPUTRequestCategoryByID() {
        category.adminSentHTTPPUTRequestCategoryByID();
    }

    @And("admin receive valid data for category by ID")
    public void adminReceiveValidDataForCategoryByID() {
        category.adminReceiveValidDataForCategoryByID();
    }
    //========@TCCATEGORY04========
    @And("admin set the DELETE api endpoint category")
    public void adminSetTheDELETEApiEndpointCategory() {
        category.adminSetTheDELETEApiEndpointCategory();
    }

    @And("admin sent HTTP DELETE request category by ID")
    public void adminSentHTTPDELETERequestCategoryByID() {
        category.adminSentHTTPDELETERequestCategoryByID();
    }
    @And("admin receive valid data for delete category by ID")
    public void adminReceiveValidDataForDeleteCategoryByID() {
        category.adminReceiveValidDataForDeleteCategoryByID();
    }
}
