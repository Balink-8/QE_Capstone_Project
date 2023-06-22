package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CreateProductPage;

public class CreateProductSteps {
    @Steps
    CreateProductPage createProduct;
    @Given("user have endpoint auth for create a new product")
    public void userHaveEndpointAuthForCreateANewProduct() { createProduct.setEndpointAuth();
    }

    @When("user send request endpoint auth for create a new product")
    public void userSendRequestEndpointAuthForCreateANewProduct() { createProduct.sendReqToEndpointAuth();
    }

    @When("user has endpoint to get user create a new product")
    public void userHasEndpointToGetUserCreateANewProduct() { createProduct.setEndpointToCreateProduct();
    }

    @And("user send request to endpoint for create a new product")
    public void userSendRequestToEndpointForCreateANewProduct() { createProduct.sendReqToCreateProduct();
    }

    @And("product success to created with status code {int}")
    public void productSuccessToCreatedWithStatusCode(int arg0) { createProduct.validateWithStatusCode();
    }

    @Then("user validate data new product")
    public void userValidateDataNewProduct() { createProduct.validateDataNewProduct();
    }

    @When("user has invalid endpoint to get user create a new product")
    public void userHasInvalidEndpointToGetUserCreateANewProduct() { createProduct.setInvalidEndpointNewProduct();
    }

    @And("user send request to invalid endpoint for create a new product")
    public void userSendRequestToInvalidEndpointForCreateANewProduct() { createProduct.sendeqToInvalidNewProduct();
    }

    @And("product cannot success to created with status code {int}")
    public void productCannotSuccessToCreatedWithStatusCode(int arg0) { createProduct.validateStatusCode();
    }

    @Then("user validate data pesan error")
    public void userValidateDataPesanError() { createProduct.validatePesanError();
    }
}
