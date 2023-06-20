package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.AboutUs;

public class AboutSteps {
    @Steps
    AboutUs about;
    @Given("User on home page")
    public void userOnHomePage() {
        about.onBalinkPage();
    }

    @When("User click navbar aboutUs")
    public void userClickNavbarAboutUs() {
        about.clickNavbarAboutUs();
    }

    @Then("User successfully view the about us page")
    public void userSuccessfullyViewTheAboutUsPage() {
        System.out.println("Berhasil");
    }


}
