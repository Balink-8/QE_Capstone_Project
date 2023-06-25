package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import starter.pages.Produk;

public class ProdukSteps {
    @Steps
    Produk produk;
    @When("the admin click on the Product menu")
    public void theAdminClickOnTheProductMenu() {
        produk.theAdminClickOnTheProductMenu();
    }

    @Then("admin can see all product")
    public void adminCanSeeAllProduct() {
        produk.adminCanSeeAllProduct();
    }

    //=========TCProduk02=========
    @And("admin on the Product page")
    public void adminOnTheProductPage() {
        produk.adminOnTheProductPage();
    }

    @And("admin click the add Product button")
    public void adminClickTheAddProductButton() {
        produk.adminClickTheAddProductButton();
    }

    @And("admin click the Product photo button")
    public void adminClickTheProductPhotoButton() {
        produk.adminClickTheProductPhotoButton();
    }

    @And("admin fill in the product name")
    public void adminFillInTheProductName() {
        produk.adminFillInTheProductName("Produk Baru");
    }

    @And("admin fill in then Product description")
    public void adminFillInThenProductDescription() {
        produk.adminFillInThenProductDescription("Produk ini merupakan produk terbaru");
    }

    @And("admin fill in the Product catagory")
    public void adminFillInTheProductCatagory() {
        produk.adminFillInTheProductCatagory();
    }

    @And("admin fill in then Product price")
    public void adminFillInThenProductPrice() {
        produk.adminFillInThenProductPrice("11.000");
    }

    @And("admin replenish product stock")
    public void adminReplenishProductStock() {
        produk.adminReplenishProductStock("3");
    }

    @And("admin click save button")
    public void adminClickSaveButton() {
        produk.adminClickSaveButton();
    }

    @Then("admin successfully add a new Product")
    public void adminSuccessfullyAddANewProduct() {
        produk.adminSuccessfullyAddANewProduct();
    }

    //=========TCProduk03=========
    @And("admin click edit on one of the produk data")
    public void adminClickEditOnOneOfTheProdukData() {
        produk.adminClickEditOnOneOfTheProdukData();
    }

    @And("admin change the produk title")
    public void adminChangeTheProdukTitle() {
        produk.adminChangeTheProdukTitle("Baru");
    }

    @And("admin click delete on the produk data that you want to delete")
    public void adminClickDeleteOnTheProdukDataThatYouWantToDelete() {
        produk.adminClickDeleteOnTheProdukDataThatYouWantToDelete();
    }
}
