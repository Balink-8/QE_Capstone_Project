package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.DeleteProductPage;

public class DeleteProductSteps {
    @Steps
    DeleteProductPage deleteProduct;
    @Given("user have endpoint auth for delete product")
    public void userHaveEndpointAuthForDeleteProduct() { deleteProduct.setEndpointLoginUser();
    }

    @When("user send request endpoint auth for delete product")
    public void userSendRequestEndpointAuthForDeleteProduct() { deleteProduct.sendReqForLoginUser();
    }

    @When("user has endpoint for delete product")
    public void userHasEndpointForDeleteProduct() { deleteProduct.setEndpointForDeleteProduct();
    }

    @And("user send request to endpoint for delete product")
    public void userSendRequestToEndpointForDeleteProduct() { deleteProduct.sendRqForDeleteProduct();
    }

    @And("product success to delete product with status code {int}")
    public void productSuccessToDeleteProductWithStatusCode(int arg0) { deleteProduct.validateResponswCodeDelete();
    }

    @Then("user validate data delete product")
    public void userValidateDataDeleteProduct() { deleteProduct.validateMessageResponse();
    }

    @When("user has invalid endpoint for delete product")
    public void userHasInvalidEndpointForDeleteProduct() { deleteProduct.invalidEndpointForDeleteProduct();
    }

    @And("user send request to invalid endpoint for delete product")
    public void userSendRequestToInvalidEndpointForDeleteProduct() { deleteProduct.sendReqToInvalidEndpoint();
    }

    @And("product cannot to delete product with status code {int}")
    public void productCannotToDeleteProductWithStatusCode(int arg0) { deleteProduct.validateWithStatusResponseCode();
    }

    @Then("user validate data delete product with invalid endpoint")
    public void userValidateDataDeleteProductWithInvalidEndpoint() { deleteProduct.validateDataDeleteProductWithInvalidEndpoint();
    }
}
