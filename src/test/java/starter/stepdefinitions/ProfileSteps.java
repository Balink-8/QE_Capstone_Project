package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.Login;
import starter.pages.Profile;

public class ProfileSteps {
    @Steps
    Login login;

    @Steps
    Profile profile;
    @Given("admin has logged in Dashboard page")
    public void adminHasLoggedInDashboardPage() {
        login.onLoginPage();
        login.inputEmail("ekaameliaputri17@gmail.com");
        login.inputPassword("ekaa123");
        login.clickLoginButton();
    }

    @When("admin click Profile button menu")
    public void adminClickButtonMenu() {
        profile.clickMenuProfile();
    }

    @Then("admin see profile details displayed")
    public void adminSeeProfileDetailsDisplayed() {
        System.out.println("Anda melihat data profil");
    }
}
