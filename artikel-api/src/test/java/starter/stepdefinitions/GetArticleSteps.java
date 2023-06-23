package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.GetArticlePage;

public class GetArticleSteps {
   @Steps
   GetArticlePage getArticle;
    @Given("user have endpoint auth for get data Article")
    public void userHaveEndpointAuthForGetDataProduct() { getArticle.setEndpointFoAuth();
    }

    @When("user send request endpoint auth for get data Article")
    public void userSendRequestEndpointAuthForGetDataProduct() { getArticle.sendReqForGetAuth();
    }

    @When("user has endpoint for get data Article")
    public void userHasEndpointForGetDataProduct() { getArticle.setEndpointForGetArticle();
    }

    @And("user send request to endpoint for get data Article")
    public void userSendRequestToEndpointForGetDataProduct() { getArticle.sendReqForGetDataArticle();
    }

    @And("Article success to get data Article with status code {int}")
    public void productSuccessToGetDataProductWithStatusCode(int arg0) { getArticle.ValidateDataWithStatusCode();
    }

    @Then("user validate data Article")
    public void userValidateDataProduct() {getArticle.validateDataArticle();
    }

 @When("user has endpoint for get data Article by id")
 public void userHasEndpointForGetDataProductById() { getArticle.setEndpointForGetArticleByID();
 }

 @And("user send request to endpoint for get data Article by id")
 public void userSendRequestToEndpointForGetDataProductById() { getArticle.sendReqToEndpointForGetArticleByID();
 }

 @And("Article success to get data Article by id with status code {int}")
 public void productSuccessToGetDataProductByIdWithStatusCode(int arg0) { getArticle.validatWithStatusCode();
 }

 @Then("user validate data Article by id")
 public void userValidateDataProductById() { getArticle.validateDataArticleByID();
 }

 @When("user has endpoint for get data Article invalid id")
 public void userHasEndpointForGetDataProductInvalidId() { getArticle.setEndpointWithInvalidID();
 }

 @And("user send request to endpoint for get data Article invalid id")
 public void userSendRequestToEndpointForGetDataProductInvalidId() { getArticle.sendReqToEndpointWithInvalidID();
 }

 @And("Article success to get data Article invalid id with status code {int}")
 public void productSuccessToGetDataProductInvalidIdWithStatusCode(int arg0) { getArticle.validateResponseCode();
 }

 @Then("user validate data Article invalid id")
 public void userValidateDataProductInvalidId() { getArticle.validateMessageResponse();
 }

 @When("user has invalid endpoint for get data Article")
 public void userHasInvalidEndpointForGetDataProduct() { getArticle.invalidEndpoint();
 }

 @And("user send request to invalid endpoint for get data Article")
 public void userSendRequestToInvalidEndpointForGetDataProduct() { getArticle.sendToInvalidEndpoint();
 }

 @And("user validate with status code {int}")
 public void userValidateWithStatusCode(int arg0) { getArticle.validateStatusCode();
 }

 @Then("user validate message response")
 public void userValidateMessageResponse() { getArticle.validateMessageError();
 }
}
