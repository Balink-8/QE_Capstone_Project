package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Category;
import starter.pages.Login;

public class CategorySteps {
    @Steps
    Login login;

    @Steps
    Category category;
    @Given("admin has logged in dashboard Page")
    public void adminHasLoggedInDashboardPage() {
        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
    }

    @When("admin click Kategori button menu")
    public void adminClickKategoriButtonMenu() {
        category.clickMenuCategory();
    }

    @Then("admin see kategori details displayed")
    public void adminSeeKategoriDetailsDisplayed() {
        System.out.println("Anda melihat data kategori");
    }
}
