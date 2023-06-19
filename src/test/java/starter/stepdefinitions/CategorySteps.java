package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CategoryScreen;
import starter.pages.LoginScreen;

public class CategorySteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    CategoryScreen categoryScreen;
    @Given("user has logged in homepage")
    public void userHasLoggedInHomepage() {
        loginScreen.userOnTheLoginPage();
        loginScreen.inputEmail("dinybrilianti@gmail.com");
        loginScreen.inputPassword("diny1234");
        loginScreen.clickLoginButton();
    }

    @When("user click shop button menu")
    public void userClickShopButtonMenu() {
        categoryScreen.clickShopButton();
    }

    @And("user click clothing category button menu")
    public void userClickClothingCategoryButtonMenu() {
        categoryScreen.clickClothingButtonMenu();
    }

    @And("user click shirt endek product button menu")
    public void userClickShirtEndekProductButtonMenu() {
        categoryScreen.clickEndekShirt();
    }

    @Then("user see at the page detail shit endek product category is displayed")
    public void userSeeAtThePageDetailShitEndekProductCategoryIsDisplayed() {
        categoryScreen.userOnTheEndekShirtDetailProductPage();
    }

    @And("user click handycrafts category button menu")
    public void userClickHandycraftsCategoryButtonMenu() {
        categoryScreen.clickHandyCraftsButtonMenu();
    }

    @And("user click wall decoration product button menu")
    public void userClickWallDecorationProductButtonMenu() {
        categoryScreen.clickWallDecorationButtonMenu();
    }
    @Then("user see at the page detail wall decoration product category is displayed")
    public void userSeeAtThePageDetailWallDecorationProductCategoryIsDisplayed() {
        categoryScreen.userOnTheWallDecorationDetailProductPage();
    }
    @And("user click bag category button menu")
    public void userClickBagCategoryButtonMenu() {
        categoryScreen.clickBagsButtonMenu();
    }

    @And("user click Premium quality bag product button menu")
    public void userClickPremiumQualityBagProductButtonMenu() {
        categoryScreen.clickPremiumQualityBagButtonMenu();
    }
    @Then("user see at the page detail Premium quality bag product category is displayed")
    public void userSeeAtThePageDetailPremiumQualityBagProductCategoryIsDisplayed() {
        categoryScreen.userOnThePremiumQualityBagDetailProductPage();
    }
    @And("user click balinese mask category button menu")
    public void userClickBalineseMaskCategoryButtonMenu() {
        categoryScreen.clickBalineseMaskButtonMenu();
    }

    @And("user click balinese mask product button menu")
    public void userClickBalineseMaskProductButtonMenu() {
        categoryScreen.clickPremiumBalineseMaskButtonMenu();
    }
    @Then("user see at the page detail balinese mask product category is displayed")
    public void userSeeAtThePageDetailBalineseMaskProductCategoryIsDisplayed() {
        categoryScreen.userOnThePremiumBalineseMaskDetailProductPage();
    }
}
