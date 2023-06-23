package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.UpdateArticlePage;

public class UpdateArticleSteps {
    @Steps
    UpdateArticlePage updateArticle;
    @Given("user have endpoint auth for update Article")
    public void userHaveEndpointAuthForUpdateProduct() { updateArticle.setEndpointAuthForLogin();
    }

    @When("user send request endpoint auth for update Article")
    public void userSendRequestEndpointAuthForUpdateProduct() { updateArticle.sendReqForLogin();
    }

    @When("user has endpoint for update Article")
    public void userHasEndpointForUpdateProduct() { updateArticle.setEndpointForUpdateArticle();
    }

    @And("user send request to endpoint for update Article")
    public void userSendRequestToEndpointForUpdateProduct() { updateArticle.sendReqForUpdateArticle();
    }

    @And("Article success to updated with status code {int}")
    public void productSuccessToUpdateProductWithStatusCode(int arg0) { updateArticle.validateWithStatusCode();
    }

    @Then("user validate data update Article")
    public void userValidateDataUpdateProduct() { updateArticle.validateDataUpdateArticle();
    }

    @When("user has invalid endpoint for update Article")
    public void userHasInvalidEndpointForUpdateProduct() { updateArticle.setInvalidEndpointForUpdateArticle();
    }

    @And("user send request to endpoint invalid for update Article")
    public void userSendRequestToEndpointInvalidForUpdateProduct() { updateArticle.sendReqToInvalidEndpoint();
    }

    @And("user validate response with code {int}")
    public void userValidateResponseWithCode(int arg0) { updateArticle.validateResponseWithCodeStatus();
    }

    @Then("user validate message error response")
    public void userValidateMessageErrorResponse() { updateArticle.validateMessageErrorResponse();
    }
}
