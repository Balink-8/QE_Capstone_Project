package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.GetProductPage;

public class GetProductSteps {
   @Steps
   GetProductPage getProduct;
    @Given("user have endpoint auth for get data product")
    public void userHaveEndpointAuthForGetDataProduct() { getProduct.setEndpointFoAuth();
    }

    @When("user send request endpoint auth for get data product")
    public void userSendRequestEndpointAuthForGetDataProduct() { getProduct.sendReqForGetAuth();
    }

    @When("user has endpoint for get data product")
    public void userHasEndpointForGetDataProduct() { getProduct.setEndpointForGetProdcut();
    }

    @And("user send request to endpoint for get data product")
    public void userSendRequestToEndpointForGetDataProduct() { getProduct.sendReqForGetDataProduct();
    }

    @And("product success to get data product with status code {int}")
    public void productSuccessToGetDataProductWithStatusCode(int arg0) { getProduct.ValidateDataWithStatusCode();
    }

    @Then("user validate data product")
    public void userValidateDataProduct() {getProduct.validateDataProduct();
    }

 @When("user has endpoint for get data product by id")
 public void userHasEndpointForGetDataProductById() { getProduct.setEndpointForGetProdcutByID();
 }

 @And("user send request to endpoint for get data product by id")
 public void userSendRequestToEndpointForGetDataProductById() { getProduct.sendReqToEndpointForGetProdcutByID();
 }

 @And("product success to get data product by id with status code {int}")
 public void productSuccessToGetDataProductByIdWithStatusCode(int arg0) { getProduct.validatWithStatusCode();
 }

 @Then("user validate data product by id")
 public void userValidateDataProductById() { getProduct.validateDataproductByID();
 }

 @When("user has endpoint for get data product invalid id")
 public void userHasEndpointForGetDataProductInvalidId() { getProduct.setEndpointWithInvalidID();
 }

 @And("user send request to endpoint for get data product invalid id")
 public void userSendRequestToEndpointForGetDataProductInvalidId() { getProduct.sendReqToEndpointWithInvalidID();
 }

 @And("product success to get data product invalid id with status code {int}")
 public void productSuccessToGetDataProductInvalidIdWithStatusCode(int arg0) { getProduct.validateResponseCode();
 }

 @Then("user validate data product invalid id")
 public void userValidateDataProductInvalidId() { getProduct.validateMessageResponse();
 }

 @When("user has invalid endpoint for get data product")
 public void userHasInvalidEndpointForGetDataProduct() { getProduct.invalidEndpoint();
 }

 @And("user send request to invalid endpoint for get data product")
 public void userSendRequestToInvalidEndpointForGetDataProduct() { getProduct.sendToInvalidEndpoint();
 }

 @And("user validate with status code {int}")
 public void userValidateWithStatusCode(int arg0) { getProduct.validateStatusCode();
 }

 @Then("user validate message response")
 public void userValidateMessageResponse() { getProduct.validateMessageError();
 }
}
