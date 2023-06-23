package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteArticlePage;

public class DeleteArticleSteps {
    @Steps
    DeleteArticlePage deleteArticle;
    @Given("user have endpoint auth for delete Article")
    public void userHaveEndpointAuthForDeleteProduct() { deleteArticle.setEndpointLoginUser();
    }

    @When("user send request endpoint auth for delete Article")
    public void userSendRequestEndpointAuthForDeleteProduct() { deleteArticle.sendReqForLoginUser();
    }

    @When("user has endpoint for delete Article")
    public void userHasEndpointForDeleteProduct() { deleteArticle.setEndpointForDeleteArticle();
    }

    @And("user send request to endpoint for delete Article")
    public void userSendRequestToEndpointForDeleteProduct() { deleteArticle.sendRqForDeleteArticle();
    }

    @And("Article success to delete Article with status code {int}")
    public void productSuccessToDeleteProductWithStatusCode(int arg0) { deleteArticle.validateResponswCodeDelete();
    }

    @Then("user validate data delete Article")
    public void userValidateDataDeleteProduct() { deleteArticle.validateMessageResponse();
    }

    @When("user has invalid endpoint for delete Article")
    public void userHasInvalidEndpointForDeleteProduct() { deleteArticle.invalidEndpointForDeleteArticle();
    }

    @And("user send request to invalid endpoint for delete Article")
    public void userSendRequestToInvalidEndpointForDeleteProduct() { deleteArticle.sendReqToInvalidEndpoint();
    }

    @And("product cannot to delete Article with status code {int}")
    public void productCannotToDeleteProductWithStatusCode(int arg0) { deleteArticle.validateWithStatusResponseCode();
    }

    @Then("user validate data delete Article with invalid endpoint")
    public void userValidateDataDeleteProductWithInvalidEndpoint() { deleteArticle.validateDataDeleteProductWithInvalidEndpoint();
    }
}
