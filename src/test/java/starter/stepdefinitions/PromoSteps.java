package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Promo;

public class PromoSteps {

    @Steps
    Login login;

    @Steps
    Promo promo;
    @Given("admin on dashboard page")
    public void adminOnDashboardPage() {
        login.onLoginPage();
        login.inputEmail("BalinkBarong@gmail.com");
        login.inputPassword("123456");
        login.clickLoginButton();
    }

    @When("admin click promo menu")
    public void adminClickPromoMenu() {
        promo.clickMenuPromo();
    }

    @Then("admin can see all promo data")
    public void adminCanSeeAllPromoData() {
        System.out.println("Admin melihat data promo");
    }
}
