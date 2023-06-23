package starter.stepdefinitions.Mobile;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Mobile.Category;

public class CategorySteps {
    @Steps
    Category Category;
    @Given("user set up api endpoint login in category in website")
    public void userSetUpApiEndpointLoginInCategoryInWebsite() {
        Category.userSetUpApiEndpointLoginInCategoryInWebsite();
    }

    @When("user send a HTTP request login in category in website")
    public void userSendAHTTPRequestLoginInCategoryInWebsite() {
        Category.userSendAHTTPRequestLoginInCategoryInWebsite();
    }

    @And("user set the POST api endpoint category")
    public void userSetThePOSTApiEndpointCategory() {
        Category.userSetThePOSTApiEndpointCategory();
    }

    @And("user sent HTTP POST request post category")
    public void userSentHTTPPOSTRequestPostCategory() {
        Category.userSentHTTPPOSTRequestPostCategory();
    }

    @Then("user receive a valid login and category HTTP response code {int}")
    public void userReceiveAValidLoginAndCategoryHTTPResponseCode(int arg0) {
        Category.userReceiveAValidLoginAndCategoryHTTPResponseCode200();
    }
    @And("user receives valid data to add category data")
    public void userReceivesValidDataToAddCategoryData() {
        Category.userReceivesValidDataToAddCategoryData();
    }
    //========@TCCATEGORY02========
    @And("user set the GET api endpoint category")
    public void userSetTheGETApiEndpointCategory() {
        Category.userSetTheGETApiEndpointCategory();
    }

    @And("user sent HTTP GET request get category by ID")
    public void userSentHTTPGETRequestGetCategoryByID() {
        Category.userSentHTTPGETRequestGetCategoryByID();
    }

    @And("user receive valid data for all category")
    public void userReceiveValidDataForAllCategory() {
        Category.userReceiveValidDataForAllCategory();
    }
    //========@TCCATEGORY03========
    @And("user set the PUT api endpoint category")
    public void userSetThePUTApiEndpointCategory() {
        Category.userSetThePUTApiEndpointCategory();
    }

    @And("user sent HTTP PUT request category by ID")
    public void userSentHTTPPUTRequestCategoryByID() {
        Category.userSentHTTPPUTRequestCategoryByID();
    }

    @And("user receive valid data for category by ID")
    public void userReceiveValidDataForCategoryByID() {
        Category.userReceiveValidDataForCategoryByID();
    }
    //========@TCCATEGORY04========
    @And("user set the DELETE api endpoint category")
    public void userSetTheDELETEApiEndpointCategory() {
        Category.userSetTheDELETEApiEndpointCategory();
    }
    @And("user sent HTTP DELETE request category by ID")
    public void userSentHTTPDELETERequestCategoryByID() {
        Category.userSentHTTPDELETERequestCategoryByID();
    }
    @And("user receive valid data for delete category by ID")
    public void userReceiveValidDataForDeleteCategoryByID() {
        Category.userReceiveValidDataForDeleteCategoryByID();
    }
}
