package starter.stepdefinitions.Website;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Website.Product;

public class ProductSteps {

    @Steps
    Product product;
    @Given("admin set up api auth login")
    public void adminSetUpApiAuthLogin() {
        product.setPostEndpointAuth();
    }

    @When("admin send a HTTP Request login")
    public void adminSendAHTTPRequestLogin() {
        product.sendEndpointAuth();
    }

    @And("admin set the GET api endpoint Product")
    public void adminSetTheGETApiEndpointProduct() {
        product.setGETApiEndpointProduct();
    }

    @And("admin send HTTP GET request get Product")
    public void adminSendHTTPGETRequestGetProduct() {
        product.sendGetHttpRequestGetProduct();
    }

    @Then("admin receive a valid login and Product HTTP response code {int}")
    public void adminReceiveAValidLoginAndProductHTTPResponseCode(int arg0) {
        product.validateResponseCodeGetProduct();
    }

    @And("admin set the GET api endpoint product by ID")
    public void adminSetTheGETApiEndpointProductByID() {
        product.setGETApiEndpointProductByID();
    }

    @And("admin send HTTP GET request get product by ID")
    public void adminSendHTTPGETRequestGetProductByID() {
        product.sendGetHttpRequestGetProductByID();
    }

    @Then("admin receive a valid login and Get product HTTP response code {int}")
    public void adminReceiveAValidLoginAndGetProductHTTPResponseCode(int arg0) {
        product.validateResponseCodeGetProductByID();
    }

    @And("admin set the POST api endpoint Product")
    public void adminSetThePOSTApiEndpointProduct() {
        product.setPOSTApiEndpointProduct();
    }

    @And("admin send HTTP POST request post Product")
    public void adminSendHTTPPOSTRequestPostProduct() {
        product.sendPOSTHttpRequestProduct();
    }

    @Then("admin receive a valid login and Add New Product HTTP response code {int}")
    public void adminReceiveAValidLoginAndAddNewProductHTTPResponseCode(int arg0) {
        product.validateResponseCodePOSTProduct();
    }

    @And("admin set the PUT api endpoint Product")
    public void adminSetThePUTApiEndpointProduct() {
        product.adminSetThePUTApiEndpointProduct();
    }

    @And("admin send HTTP PUT request post Product")
    public void adminSendHTTPPUTRequestPostProduct() {
        product.adminSentHTTPPUTRequestGetProductByID();
    }

    @Then("admin receive a valid login and Update Product HTTP response code {int}")
    public void adminReceiveAValidLoginAndUpdateProductHTTPResponseCode(int arg0) {
        product.adminReceiveValidDataForProductByID();
    }

    @And("admin set the DEL api endpoint Product")
    public void adminSetTheDELApiEndpointProduct() {
        product.setApiEndpointDeleteProduct();
    }

    @And("admin send HTTP DEL request delete Product")
    public void adminSendHTTPDELRequestDeleteProduct() {
        product.sendDeleteHttpRequestGetProduct();
    }

    @Then("admin receive a valid login and delete Product HTTP response code {int}")
    public void adminReceiveAValidLoginAndDeleteProductHTTPResponseCode(int arg0) {
        product.validateResponseCodeDeleteProduct();
    }
}
