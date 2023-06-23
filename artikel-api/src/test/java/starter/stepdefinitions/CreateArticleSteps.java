package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateArticlePage;

public class CreateArticleSteps {
    @Steps
    CreateArticlePage createArticle;
    @Given("user have endpoint auth for create a new article")
    public void userHaveEndpointAuthForCreateANewArticle() { createArticle.setEndpointAuth();
    }

    @When("user send request endpoint auth for create a new article")
    public void userSendRequestEndpointAuthForCreateANewArticle() { createArticle.sendReqToEndpointAuth();
    }

    @When("user has endpoint to get user create a new article")
    public void userHasEndpointToGetUserCreateANewArticle() { createArticle.setEndpointToCreateAticle();
    }

    @And("user send request to endpoint for create a new article")
    public void userSendRequestToEndpointForCreateANewArticle() { createArticle.sendReqToCreateArticle();
    }

    @And("article success to created with status code {int}")
    public void productSuccessToCreatedWithStatusCode(int arg0) { createArticle.validateWithStatusCode();
    }

    @Then("user validate data new article")
    public void userValidateDataNeArticle() { createArticle.validateDataNewArticle();
    }

    @When("user has invalid endpoint to get user create a new article")
    public void userHasInvalidEndpointToGetUserCreateANewArticle() { createArticle.setInvalidEndpointNewArtcile();
    }

    @And("user send request to invalid endpoint for create a new article")
    public void userSendRequestToInvalidEndpointForCreateANewArticle() { createArticle.sendeqToInvalidNewAticle();
    }

    @And("article cannot success to created with status code {int}")
    public void productCannotSuccessToCreatedWithStatusCode(int arg0) { createArticle.validateStatusCode();
    }

    @Then("user validate data pesan error")
    public void userValidateDataPesanError() { createArticle.validatePesanError();
    }
}
