package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import starter.pages.UpdateProductPage;

public class UpdateProductSteps {
    @Steps
    UpdateProductPage updateProduct;
    @Given("user have endpoint auth for update product")
    public void userHaveEndpointAuthForUpdateProduct() { updateProduct.setEndpointAuthForLogin();
    }

    @When("user send request endpoint auth for update product")
    public void userSendRequestEndpointAuthForUpdateProduct() { updateProduct.sendReqForLogin();
    }

    @When("user has endpoint for update product")
    public void userHasEndpointForUpdateProduct() { updateProduct.setEndpointForUpdateproduct();
    }

    @And("user send request to endpoint for update product")
    public void userSendRequestToEndpointForUpdateProduct() { updateProduct.sendReqForUpdateProduct();
    }

    @And("product success to update product with status code {int}")
    public void productSuccessToUpdateProductWithStatusCode(int arg0) { updateProduct.validateWithStatusCode();
    }

    @Then("user validate data update product")
    public void userValidateDataUpdateProduct() { updateProduct.validateDataUpdateProduct();
    }

    @When("user has invalid endpoint for update product")
    public void userHasInvalidEndpointForUpdateProduct() { updateProduct.setInvalidEndpointForUpdateProduct();
    }

    @And("user send request to endpoint invalid for update product")
    public void userSendRequestToEndpointInvalidForUpdateProduct() { updateProduct.sendReqToInvalidEndpoint();
    }

    @And("user validate response with code {int}")
    public void userValidateResponseWithCode(int arg0) { updateProduct.validateResponseWithCodeStatus();
    }

    @Then("user validate message error response")
    public void userValidateMessageErrorResponse() { updateProduct.validateMessageErrorResponse();
    }
}
